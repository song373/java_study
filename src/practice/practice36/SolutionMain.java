package practice.practice36;

public class SolutionMain {

	public static void main(String[] args) {
		
		Solution so1 = new Solution();
		
		
		
		int[] testCase1 = {1,2,3,3,3,4};
		int testCase1Answer = 3;
		
		Solution so2 = new Solution();
		
		
		int[] testCase2 = {1,1,2,2};
		int testCase2Answer = -1;
		
		System.out.println(so1.solution(testCase1) == testCase1Answer);
		System.out.println(so2.solution(testCase2) == testCase2Answer);
		System.out.println(so1.solution(testCase1) == testCase1Answer);
		System.out.println(so2.solution(testCase2) == testCase2Answer);

	}

}
