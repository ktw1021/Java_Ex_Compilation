package com.javaex.practice;

public class Ex15 {

	public static void main(String[] args) {
		/*
		 * 예상값
		 * -1
		 * 6
		 * 3
		 * 11
		 * 4.0 -> 6.5
		 * 4
		 * 3.0 -> 3.5
		 */
		System.out.println(12/5-3);
		System.out.println(5+19%3);
		System.out.println(2+2/2);
		System.out.println(29%3+29/3);
		System.out.println(29%3+18.0/4);	// 소수는 나누기 소수 부분까지 되는 것 고려 못해서 틀림
		System.out.println((14+7/2)/4);
		System.out.println((14+7/2.0)/5);	// 소수는 나누기 소수 부분까지 되는 것 고려 못해서 틀림
	}
	

}
