package cond;

public class conditional03 {

	public static void main(String[] args) {
		// 조건문 스위치
		
		int dice =2;
		
		if (dice >= 1 && dice <= 3) {
		
		}
		
		dice = 1 ;
		
		switch (dice) {
		
		case 1:  //dice ==1
		System.out.println("dice 값이!!!!");
		System.out.println("1이다");
		case 2: // dice ==2
	    System.out.println("2이다");
		case 99: // dice ==99
		System.out.println("99이다");
		default: //else
		System.out.println("default 다 ");
		
		}

	}

}
