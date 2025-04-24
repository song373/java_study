package practice;

import java.util.Scanner;

public class practice23 {

	public static void main(String[] args) {
			
			
		
		
		
		
	
	// 문제 5 카페 주문 프로그램
	
			Scanner sc = new Scanner(System.in);
			int ameri = 0;
			int latte = 0;
			int vanilla = 0;

			Loop: while (true) {
				System.out.println("======== 메뉴 ========");
				System.out.println("1. 아메리카노	3500원");
				System.out.println("2. 카페라떼	4100원");
				System.out.println("3. 바닐라라떼	4300원");
				System.out.println("=====================");

				System.out.print("메뉴 선택 : ");
				int menu = sc.nextInt();
				System.out.print("수량 선택 : ");
				int amount = sc.nextInt();

				switch (menu) {
				case 1:
					ameri += amount;
					break;
				case 2:
					latte += amount;
					break;
				case 3:
					vanilla += amount;
					break;
				default:
					System.out.println("잘못 선택하셨습니다. 다시 선택해주세요.");
					continue;
				}

				while (true) {
					System.out.print("추가 주문하시겠습니까? (y/n) : ");
					char plus = sc.next().charAt(0);

					if (plus == 'Y' || plus == 'y')
						continue Loop;
					else if (plus == 'N' || plus == 'n') {
						System.out.println("=====================");

						if (ameri != 0)
							System.out.println("아메리카노 " + ameri + "잔 : " + ameri * 3500 + "원");
						if (latte != 0)
							System.out.println("카페라떼 " + latte + "잔 : " + latte * 4100 + "원");
						if (vanilla != 0)
							System.out.println("바닐라라떼 " + vanilla + "잔 : " + vanilla * 4300 + "원");

						System.out.println("=====================");
						
						int price = (ameri * 3500 + latte * 4100 + vanilla * 4300);
						System.out.println("총액 : " + price + "원");
						break;
						
					} else {
						System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
						continue;
					}
				}
				break;
			}
			sc.close();
		}
	}