package com.javaex.practice;

public class Ex03 {

	public static void main(String[] args) {
		/*
		 * 예상 결과:
		 * ***
		 * ***
		 * ***
		 * ***
		 */
		
		int x, y;
		for (x=0; x<4; x++) {
			for (y=2; y>=0; y--) {
				System.out.print("*");
				
			}
			System.out.println("");
			
			/*
			 * 예상 결과와 같음.
			 * y루프는 y=2, 1, 0로 돌고, "***"을 출력한 뒤, 
			 * x루프로 넘어가 x루프는 공백(줄 띄기)를 출력.
			 * x루프는 x=0, 1, 2, 3으로 돌아, 4차례 공백을 출력
			 * 따라서 결과는 예상 결과와 같았음.
			 */
			
		}
	}

}
