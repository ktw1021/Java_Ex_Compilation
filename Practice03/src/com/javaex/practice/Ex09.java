package com.javaex.practice;

public class Ex09 {

	public static void main(String[] args) {
		
		/*
		 * 1. a+b를 10번 출력하도록 하는 루프를 구성
		 * 2. \t를 사용해 간격 조절
		 * 3. 10번 출력하면, 
		 * 	  외부 루프로 돌아와 줄 띄기 및 a+1을 하도록 구성
		 * 4. a가 10이 될 때까지(위 과정을 10번 할 때까지) 진행
		 */
		
		for (int a = 0; a<=9; a++) {
			for (int b = 1; b<=10; b++) {
				System.out.print(a+b + "\t");
			}
			System.out.println("");
		}
	}

}
