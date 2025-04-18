package practice;

public class practice09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//반복문 샘플 연습
		// 출력은 반복되는 숫자(i) 를 출력
		/*
		
		1) i가 0~10으로 11번 반복
		for
		2) i가 1~9로 9번 반복
		3) i가 10 ~ 100 으로 10번 반복
		4) i가 25 50 75 100 해서 4번 반복

		while.
		5) i가 50 ~ 55로 6번 반복
		6) i가 10 ~ 1로 10번 반복
		7) i가 30 ~ 0으로 5씩 감소하면서 7번 반복
		8) i가 30 ~ 5으로 5씩 감소하면서 6번 반복
		9) i가 25 ~ 0으로 5씩 감소하면서 6번 반복
		*/
		
		
		//1) i가 0~10으로 11번 반복
		for(int i =0; i <11; i++) {
			System.out.println(i + "");
		}
		//2) i가 1~9로 9번 반복
		for (int i =1; i <=9; i++) {
			System.out.println(i + " ");
		}
		System.out.println();
	
		//3) i가 10 ~ 100 으로 10번 반복
		for(int i =10; i <=100; i=i+10) {
			//i: 10 20 30 40 50 60 70 80 90 100
			System.out.println(i + " ");
		}
		System.out.println();
		//4) i가 25 50 75 100 해서 4번 반복
		for (int i =25; i <=100; i+= 25) {
			System.out.println(i + " ");
		}
		System.out.println();
		
		//5) i가 50 ~ 55로 6번 반복
		int i =50; 
		while(i <=55) {
			System.out.println(i + " ");
			i++;
		}
		System.out.println();
		//6) i가 10 ~ 1로 10번 반복
		i=10;
		while(i >=1) {
			System.out.println(i + " ");
			i--;
		}
		System.out.println();
		//7) i가 30 ~ 0으로 5씩 감소하면서 7번 반복
		 i =30; 
		while(i >=0) {
			System.out.println(i + "");
			i=i-5;
		}
		System.out.println();
		//8) i가 30 ~ 5으로 5씩 감소하면서 6번 반복
		 i =30; 
		while(i >=5) {
			System.out.println(i + "");
			i=i-5;
		}
		//9) i가 25 ~ 0으로 5씩 감소하면서 6번 반복
		 i =25; 
		while(i >=0) {
			System.out.println(i + "");
			i=i -5;
		}
		System.out.println();
	}

}
