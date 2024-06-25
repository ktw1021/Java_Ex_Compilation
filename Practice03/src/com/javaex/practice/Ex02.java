package com.javaex.practice;

public class Ex02 {

	public static void main(String[] args) {
		/*
		 * 예상 결과:
		 * **
		 * 
		 * 
		 * 
		 */
		
		int x, y;
		for(x=0; x<4; x++) {
			for(y=0; y<2; y++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		/*
		 * 실제 결과:
		 * **
		 * **
		 * **
		 * **
		 * 오답 원인: y값이 for 내에서 y=0으로 다시 초기화된다는 점을 간과함.
		 * 풀이: 
		 * 1. y는 공백으로, 줄 띄는 역할을 함.
		 * x=0인 루프에서 y루프는 두 차례 "*"을 출력,
		 * x=1인 루프에서 y루프는 y=0으로 값이 초기화되며, 다시 "*"을 두 차례 출력.
		 * .
		 * x=3이 될 때까지 총 네 차례 줄을 띄며, **을 출력 
		 * 따라서, 출력되는 값은 다음과 같음. 
		 * **
		 * **
		 * **
		 * **
		 */
	}

}
