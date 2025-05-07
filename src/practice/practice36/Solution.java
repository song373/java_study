package practice.practice36;

import java.util.HashMap;

public class Solution {

	public int solutionMap(int [] array) {


		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		//
		for(int n : array) {
			
			//
			if(map.containsKey(n)) {
				//
				int newCount =	map.get(n) + 1;

			} else {
               //
				map.put(n, 1);
			}

		}
		
		for(int key : map.keySet()) {
			System.out.printf("key:%d value:%d\n", key, map.get(key));
		}

		return 0;
	}

	public int solution(int[] array) {
		int maxIndex = 0;
		int max = 0;

		int[] count = new int[1000];

		for(int i : array) {
			count[i]++;
			if(count[i] > max) {
				max = count[i];
				maxIndex = i;

			}
		}

		int answer =maxIndex;
		for(int i=0; i<count .length; i++) {
			if(i !=maxIndex && count[i] == max) {
				answer = -1;
				break;
			}

		}
		
//		for(int i=0; i<count.length; i++) {
//			System.out.printf("숫자:%d 갯수:%d\n",i, count[i]);
//		}
		
		
		return answer;
		
		
	}

}
