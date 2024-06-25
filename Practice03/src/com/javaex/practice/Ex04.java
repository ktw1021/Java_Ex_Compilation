package com.javaex.practice;

public class Ex04 {

	public static void main(String[] args) {
		/*
		 * 예상 결과:
		 * 1
		 * 2
		 * 3
		 * 4
		 * ============
		 * 10
		 * 8
		 * 6
		 * 4
		 * 2
		 * 
		 */
		
		for (int i = 1; i<5; i++) {
			System.out.println(i);
		}
		System.out.println("===========");
		for (int i = 10; i>0; i=i-2) {
			System.out.println(i);
			
			/*
			 * 예상 결과와 같았음.
			 * 첫번째 for 루프에서는 i=1로 시작해, 
			 * i의 값을 출력하고 줄을 띄는 것을 i=4가 될 때까지 반복.
			 * 두번째 for 루프에서는 i=10으로 시작해,
			 * i의 값을 출력하고 줄을 띄는 것을 i=2가 될 때까지 반복.
			 * 마지막 i=2를 출력한 후, 줄을 띄었기 때문에 공백 하나가 남아있음.
			 */
			
		}
	}

}
