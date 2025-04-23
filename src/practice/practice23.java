package practice;

import java.util.Scanner;

public class practice23 {

	public static void main(String[] args) {


		/*
		Scanner scanner = new Scanner(System.in);
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
			int menu = scanner.nextInt();
			System.out.print("수량 선택 : ");
			int amount = scanner.nextInt();

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
				char plus = scanner.next().charAt(0);

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

				}
			}
			break;
		}
		 */

		Scanner scanner =new Scanner(System.in);

		/*
		String addOrder = "n";

		while( !addOrder.equals("n") ) {
		}
		 */

		int menu1Count =0; //각 메뉴 몇잔 시켰는지 갯수
		int menu2Count =0;
		int menu3Count =0;


		while(true) {

			System.out.println("======메뉴======");
			//			System.out.println("1. 아메리카노 3500원");
			//			System.out.println("2. 카페라떼 4100원");
			//			System.out.println("3. 바닐라라떼 4300원");
			System.out.printf("1.%-8s %5d원\n", "아메리카노", 3500);
			System.out.printf("2.%-8s %5d원\n", "카페라떼", 4100);
			System.out.printf("3.%-8s %5d원\n", "바닐라라떼", 4300);
			System.out.println("============");

			//메뉴 입력
			System.out.println("메뉴 선택 : ");
			int menu = scanner.nextInt();

			// menu < 1 || menu > 3
			if( ! (menu>=1 && menu <=3)) { //정사범위가 아니면!
				System.out.println("잘못입력하셨습니다. 다시 입력하세요!!!");
				continue; // 이코드 이후로 현재턴 실행 생략 -> 다음 턴
			}

			//수량 입력
			System.out.println("수량 선택 : ");
			int count = scanner.nextInt();

			//기록!! 무슨 메뉴를 몇잔 시켰나?
			//무슨메뉴? -> menu
			//몇잔? -> count

			if(menu == 1)
				menu1Count = menu1Count + count;
			else if (menu == 2)
				menu2Count += count;
			else 
				menu3Count += count;


			scanner.nextLine(); //clear

			String addOrder;


			while(true) {
				System.out.print("추가주문 하시겠습니까? (y/n) : ");
				addOrder = scanner.nextLine();

				//y/n 정상입력 여부 태그
				if( !(addOrder.equals("y") || addOrder.equals("n")) ) {
					System.out.println("잘못입력하셨습니다. 다시 입력하세요!!!");
				} else { //정상입력!! y n
					break;
				}

			}


			if(addOrder.equals("n")) {
				//최종 주문한 메뉴 목록 보여주고
				//총금액이 얼마다~
                int total = 0;
				
				System.out.println("============");
				if(menu1Count > 0) {
					System.out.printf("아메리카노 %d잔 : %d원\n", menu1Count, menu1Count * 3500);
					total = total + menu1Count * 3500;
				}
				if(menu2Count > 0)
					System.out.printf("카페라떼 %d잔 : %d원\n", menu2Count, menu2Count * 4100);
				total = total + menu2Count * 4100;
				if(menu3Count > 0)
					System.out.printf("바닐라라떼 %d잔 : %d원\n", menu3Count, menu3Count * 4300);
				total = total + menu3Count * 4300;
				System.out.println("============");
				//System.out.printf("총액 : %d원", menu1Count * 3500 + menu2Count * 4100 + menu3Count * 4300);
				System.out.printf("총액 : %d원", total);
				break;
				
			}

			/*
			//정상 메뉴 선택 여부! 1,2,3
			//if(menu == 1 || menu == 2 || menu ==3)
			if(menu>=1 && menu <=3) { //정상범위

			//수량 입력
			System.out.println("수량 선택 : ");
			int count = scanner.nextInt();

			scanner.nextLine(); //clear

			System.out.println("추가주문 하시겠습니까? (y/n) : ");
			String addOrder = scanner.nextLine();
			if(addOrder.equals("n")) {
				break;


			} else {
				System.out.println("잘못입력하셨습니다. 다시 입력하세요!!!");
			}
			 */

		}

	}
	//최종 주문한 메뉴 목록 보여주고
	//총금액이 얼마다~

	//End

}





