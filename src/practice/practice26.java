package practice;

import java.util.Scanner;

public class practice26 {

	public static void main(String[] args) {
		/*
		엘리베이터

		스마트 엘리베이터 시스템을 제작하려고 합니다.
		해당 시스템이 적용되는 빌딩은 100층 짜리 빌딩이며, 사람들을 원하는 층으로 스마트하게 이동시켜 줍니다.
		해당 시스템은 사람들을 원하는 층으로 스마트하게 데려다 줍니다.
		(반복문, 조건문, 배열, 메소드를 최대한 사용하시면 됩니다. )

		- 기본 문제
		1층에서 사람들이 탑승하며, 각자 내릴 층에 버튼을 누릅니다.
		(2 ~ 100 이외의 수는 입력이 없을 거라고 가정)
		엘리베이터는 100층까지 올라가는 와중에 탑승 인원을 모두 내려주고 1층으로 내려오며,
		엘리베이터의 층수가 변경될 때마다 현재 층수를 출력합니다.
		참고로, 엘리베이터는 10층에서 5층으로 갔다가 11층으로 가지 않습니다. (오로지 한번에 100층까지 쭉)

		+ 탑승 인원을 입력받습니다.
		+ 탑승 인원 만큼, 사람들이 내릴 층(2층부터 100층까지)를 각각 입력 받습니다.
		 */

		Scanner scanner = new Scanner(System.in);

		System.out.println("탑승 인원 수 입력 : ");
		int personCount = scanner.nextInt();

		int[] destFloorArr = new int[personCount];
		
		System.out.println("목적지 층수 입력(2~100) : ");
		for(int i=0; i<destFloorArr.length; i++) {
			destFloorArr[i] = scanner.nextInt();
			//입력한 값이 2~100 이 아니면? ->
			
		}
		
			//1층~100층->목적지 층수에 멈추기
			
		for(int i=1; i<=100; i++) {
			System.out.println(i + "층");
			
			//내리는 층인지 확인
			for(int j=0; j<destFloorArr.length; j++) {
				if(i == destFloorArr[j]) {
					System.out.println("****도착****");
				}
			}
		}
		
			//100층 -> 1층
		
		for(int i=100; i>=1; i--) {
			System.out.println(i + "층");
		}

	}

}






