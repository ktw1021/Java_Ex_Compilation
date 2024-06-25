package com.javaex.practice;

public class Ex20 {

	public static void main(String[] args) {
		
		/*
		 * 예상 결과
		 * 11
		 * 0
		 * 예상 결과와 같음. 
		 */
		int i = 10;
		int n = i++ %2;
		
		System.out.println(i);
		System.out.println(n);
		
	}

}
