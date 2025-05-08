package study.start;

public class review {

	public static void main(String[] args) {

		// 변수

		//데이터(값) 저장 하는 공간

		/*
		   int    :정수형 92398287
		   double :실수형 (소수점) 12123.123 535.4635
		   boolean :논리형 true 'false
		   String  :문자형  "어떤" "12093" "hi hello"
		 */

		int age = 22; 

		System.out.println(age); //내용 출력후 줄바꿈
		System.out.print(age);   //내용 출력만 줄바꿈xx
		System.out.printf("내 나이는 %d살 입니다.\n",age);  //특정 형식에 맞춰서
		//정수 %d 실수 %f 문자열 %s
		// \n줄바꿈(엔터)

		String weather = "맑음"; //자바 문자열 표현 "문자" 감싸서

		System.out.println("오늘의 날씨는" + weather);
		System.out.print("오늘의 날씨는" + weather);
		System.out.println(); //줄바꿈
		System.out.printf("오늘의 날씨는 %s\n" , weather);
		
		boolean tired = true; //참 거짓
		
		System.out.println(tired);
		tired = false;
		System.out.println(tired);
		
		int n1 = 10;
		int n2 = 20;
		//n1 + n2;
		
		int n3 = n1 + n1 * n1 + n1 -n1 + n2;
		
		System.out.println(n1 + n2); //숫자를(연산이가능한 연산 -> 연산 결과
		// + 연산 숫자와 문자열이 만나면 -> 그냥 앞뒤로 이어붙히기
		System.out.println(n1 + "20");
		System.out.println(" n1:" + n1 + " n2:" + n2 + " n3:" + n3);
		
		int total =3;
		total = total + 2;
		total = total + 5;
		
		int order1 = 3;
		int order2 = 2;
		int order3 = 5;
		
		String name = "가나다라마바사";
		String name1 = "가";
	    String name2 = "나";
	    String name3 = "다";
	    String name4 = "라";
	    ///..
	    
	    //배열 : 같은 타입의 데이터 여러개를 붙여서 한번에 관리 저장 공간
        System.out.println(name1+"님");
        System.out.println(name2+"님");
        System.out.println(name3+"님");
        System.out.println(name4+"님");
        
        String[] names = {"가", "나", "다", "라", "마", "바", "사"};
        		
        

	}

}
