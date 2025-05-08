package practice;

import java.util.Scanner;

public class practice27 {

	public static void main(String[] args) {

		/*
	야구 게임 (스크린 야구, 공격만)

	스크린 야구 게임을 제작하려고 합니다.
	해당 게임은 항상 공격만 하는 게임으로, 투수가 공을 던지는 것을 치기만 하면 됩니다.
	투수의 공은 컴퓨터이며, 타자는 사용자 입니다.
	(반복문, 조건문, 배열을 최대한 사용하시면 됩니다.)

	- 기본 문제
	투수가 매번 던지는 공은 1 ~ 10의 난수로 설정합니다.
	사용자의 입력도 1 ~10까지 이며,
	투수의 공과 사용자의 입력과 동일하면 안타로, 동일하지 않으면 아웃으로 간주합니다.
	해당 게임은 3아웃이면 종료됩니다.
		 */

		Scanner scan = new Scanner(System.in);

		int hitCount = 0; // 안타수
		int outCount = 0; // 아웃수

		System.out.println("===게임을 시작합니다===");
        System.out.println();
		while (true) {
			int pitchBall = (int) (Math.random() * 10) + 1; // 투수가 던지는 공

			System.out.print("공을 던져주세요 : ");
			int playerBall = scan.nextInt(); // 유저가 입력한 공

			// 입력한 공이 1~10을 벗어나면
			if (playerBall < 1 || playerBall > 10) {
				System.out.println("*공은 1~10까지 던질 수 있습니다.*");
			} else { // 1~10 사이로 잘 입력했으면

				// 투수공과 유저공이 같은면 안타수 증가
				if (pitchBall == playerBall) {
					hitCount++;
				} else { // 다르면 아웃수 증가
					outCount++;
				}

				System.out.printf("투수:%d 플레이어:%d 안타:%d 아웃:%d\n", 
                pitchBall, playerBall, hitCount, outCount);
                System.out.println();

				// 아웃 3번이 되면 반복문 종료
				if (outCount == 3) {
					System.out.println("===게임을 종료합니다===");
					break;
				}
			}

		}
		
	}
	
}


