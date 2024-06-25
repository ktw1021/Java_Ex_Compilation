package com.javaex.practice;

public class Ex22 {

	public static void main(String[] args) {
		
		/*
		 * 예상 결과
		 * False
		 * True
		 * False
		 * True
		 * False
		 * True
		 * True
		 * 대문자로 출력되는 줄 알았음. 정답은 소문자. 
		 */
		
		System.out.println(17 < 17);
		System.out.println(17 <= 17);
		System.out.println(5 >= 17);
		System.out.println(5 >= 5);
		System.out.println(5 == 17);
		System.out.println(5 != 17);
		System.out.println(!(5 == 17));
	}

}
