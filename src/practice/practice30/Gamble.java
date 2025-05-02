package practice.practice30;

public class Gamble {

	public static void main(String[] args) {
		//획득 달러 계산
		double dollar = dice() + dice() + dice();
		//달러를 환전
		double won = exchange(dollar);
		System.out.printf("획득 금액: &%.2f(%.0f원)",dollar,won);
	}
		//1~6 사이의 정수 값 변환
		public static int dice() {
		//Math.random(): double 값중 반환 -> 0.00 ~ 0_99..
			
			
			int result = (int) (Math.random() * 6) + 1;
			
			return result;
		}
		
		public static double exchange(double dollar) {
			
			double result = dollar * 1082.25108; 
			return 0;
          
	}
		
}
	

	

		
	/*	
		Base 코드.
		public class Gamble {
		public static void main(String[] args) {
		double dollar = dice() + dice() + dice();
		double won = exchange(dollar);
		System.out.printf("획득 금액: $%.2f(%.0f원)", dollar, won);
		}
		public static int dice() {
		/* Math.random() 메소드를 활용하여 1~6 사이의 정수를 반환하도록 하
		시오 */
//		return 0;
	//	}
	//	public static double exchange(double dollar) {
		/* 입력받은 달러를 환전하여 반환 하시오 */
//		return 0;
//		}
//		}

		
		
	


