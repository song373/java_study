package practice.practice35;

public class ChineseRestaurant {

	public static void main(String[] args) {
		Menu jjajang = new Menu("짜장", 4900);
		Menu jjambbong = new Menu("짬뽕", 5900);
		Menu tangsook = new Menu("탕수육", 13900);
		// 메뉴를 조합하여 주문을 생성
		Menu[] menuArr = { jjajang, jjambbong, tangsook };
		Order order = new Order(123, menuArr);
		// 주문 결과 출력
		System.out.printf("주문 합계: %d원\n", order.totalPrice());
		
		Menu[] menuArr2 = {new Menu("짬뽕", 5900), new Menu("짜장",4900)};
		Order oder2 = new Order(124, menuArr2);
		
		

	}

}
