package practice;

import java.util.Scanner;

public class practice29 {

	public static void main(String[] args) {
		
		/*
		레벨2
		9명의 타자(선수)를 등록합니다.
		각 타자가 타격하기 위해 타석에 등장시, 타순 및 타자명이 출력됩니다.
		9번 타자 다음 순서는 1번 타자로 9명이 로테이션 됩니다.
		
		1회차가 끝나는 기준이 3아웃입니다.
		타자(선수)는 1아웃이면 다음 선수로 넘어갑니다.
		타자가 안타를 쳐도, 출루 했다고 가정하고 다음 선수로 넘어갑니다.
		*/

		Scanner scan = new Scanner(System.in);

		int hitCount = 0; //안타수
		int outCount = 0; //아웃수
		int totalRound = 3; // 총횟수
		int playerIndex = 0; //타자 순서 인덱스
		
		System.out.println("===2단계 게임을 시작합니다===");

		for(int i =1; i <= totalRound; i++) {
			System.out.printf("***%d회차\n",i);
			System.out.println();
			
			while (true) {
				//선수 입장
				System.out.printf(">>>%d번 타자 '%s선수' 입장 !\n");
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
		
	


