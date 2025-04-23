package practice;

public class practice21 {

	public static void main(String[] args) {
		//2차원 배열과 인덱스 조정하기.
		//2차원 배열을 활용하여 다음 결과가 나오도록 코드를 작성하시오.
		//규칙을 찾아서 중첩된 반복문을 활용하여 값을 저장하고
		//아래와 같이 4*4 형태로 출력하시오.
		
		/*
		1.
		//1 2   3   4
		//5 6   7   8
		//9 10 11 12
		//13 14 15 16
		*/

		
		
		int[][] arr = new int[4][4];
		
		int num = 1;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = (4*i) + (j+i);
				//num++;
			}
		
			
			for(int i1=0; i1<arr.length; i1++) {
				for(int j=0; j<arr[i1].length; j++) {
					System.out.printf("%3d", arr[i1][j]);
			System.out.println();
		}
		
		}
			
		
		/*
		//2.
		//1 5  9  13
		//2 6 10 14
		//3 7 11 15
		//4 8 12 16
*/
			System.out.println();
			
			 num = 1;
			for(int i1=0; i1<arr.length; i1++) {
				for(int j=0; j<arr[i].length; j++) {
					arr[j][i] = num++;
					
				}
				
				for(int i11=0; i11<arr.length; i11++) {
					for(int j=0; j<arr[i11].length; j++) {
						System.out.printf("%3d", arr[i11][j]);
				System.out.println();
			}
			
			}
		
	
		
		
		/*
			
		
	//	3.
	//	16 15 14 13
	//	12 11 10 9
	//	8   7   6  5
	//	4   3   2  1

		*/	
			System.out.println();
			
			num = 16;
			for(int i11=0; i11<arr.length; i11++) {
				for(int j=0; j<arr[i11].length; j++) {
					arr[i11][j] = num--;
					
				}
			}
		
				
				
				for(int i11=0; i11<arr.length; i11++) {
					for(int j=0; j<arr[i11].length; j++) {
						System.out.printf("%3d", arr[i11][j]);
				}
			
				System.out.println();
	}
				
	}
			
	}
	

		
				/*
			
 
	//	4.
		//16 12 8 4
	//	15 11 7 3
	//	14 10 6 2
	//	13 9  5  1
*/
		System.out.println();
		num = 1;
		for(int i11=3; i11>=0;  i11--) {
			for(int j=3; j>=0; j--) {
				arr[j][i11] = num++;
				
			}
		}
		for(int i11=0; i11<arr.length; i11++) {
			for(int j=0; j<arr[i11].length; j++) {
				System.out.printf("%3d", arr[i11][j]);
		}
	
		System.out.println();
}
			}
		
	}


