package practice;

public class practice12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < 5; i++) {
            System.out.println("12345");
        }

		for (int i = 1; i <= 5; i++) { // 행 (row)
            for (int j = 1; j <= 5; j++) { // 열 (column)
                System.out.print(i); // 각 열에 해당하는 숫자 출력 (1, 2, 3, 4, 5)
            }
            System.out.println(); // 다음 행으로 넘어감
        }
	}

}
