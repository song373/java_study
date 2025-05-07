package practice.practice35;

import java.util.ArrayList;

public class ChineseRestaurant {

	public static void main(String[] args) {
		Menu jjajang = new Menu("짜장", 4900);
		Menu jjambbong = new Menu("짬뽕", 5900);
		Menu tangsook = new Menu("탕수육", 13900);
		// 메뉴를 조합하여 주문을 생성
		Menu[] menuArr = { jjajang, jjambbong, tangsook };
		
		ArrayList<Menu> menuList = new ArrayList<Menu>();
		menuList.add(jjajang);
		menuList.add(jjambbong);
		menuList.add(tangsook);
		
		Order order = new Order(123, menuList);
		// 주문 결과 출력
		System.out.printf("주문 합계: %d원\n", order.totalPrice());
		
//		Menu[] menuArr2 = {new Menu("짬뽕", 5900), new Menu("짜장",4900)
//				,new Menu("탕수육",13900), new Menu("탕수육",13900)};
	
		

	}

}
