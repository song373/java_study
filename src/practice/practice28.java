package practice;

import java.util.Scanner;

public class practice28 {

	public static void main(String[] args) {

		/*
 레벨 1
 1회부터 3회까지만 진행합니다.
 각 회는 3아웃 마다 회가 넘어가며, 회가 시작 할때마다 0아웃으로 시작합니다.
		 */

		Scanner scan = new Scanner(System.in);

		int hitCount = 0; //안타수
		int outCount = 0; //아웃수
		int totalRound = 3; // 총횟수

		System.out.println("====1단계 게임을 시작합니다====");

		for(int i =1; i <= totalRound; i++) {
			System.out.printf("***%d회차\n",i);
			System.out.println();

			while (true) {
				int pitchBall = (int) (Math.random() * 10) + 1; // 투수가 던지는 공

				System.out.println("공을 던져주세요 : ");
				int playerBall = scan.nextInt(); // 유저가 입력한 공

				if(playerBall < 1 || playerBall > 10) {
					System.out.println("*공은 1~10까지 던질 수 있습니다.*");
				} else { // 1~10
					//투수공과 플레이어 공이 같으면 안타수 증가
					if(pitchBall == playerBall) {
						hitCount++;
					} else { //다르면 아웃수 증가
						outCount++;
					}
					System.out.printf("[투수:%d 플레이어:%d 안타:%d 아웃:%d]\n",pitchBall, playerBall, hitCount, outCount);
					System.out.println();

					//아웃 3번되면 종료
					if(outCount == 3) {
						System.out.printf("===%d회차를 종료합니다===\n",i);
					}
					break;
				}
			}
		}

		outCount = 0; //다음 회차 떄 안타 초기화
	
	System.out.println("===게임을 종료합니다===");

	}
}
