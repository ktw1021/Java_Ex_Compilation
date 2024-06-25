package com.javaex.practice;

public class Ex06 {

	public static void main(String[] args) {
		
		for (int a = 1; a<=100; a++) {
			if (a%5 == 0 && a%7 == 0) {
				System.out.println(a);
			}
		}
		/*
		 * 목표: 1~100까지의 숫자 중, 5의 배수 && 7의 배수를 출력
		 * 1. 5의 배수&& 7의 배수를 조건으로 if 출력문 생성
		 * 2. 1~100까지의 숫자를 검사하도록 for 루프를 이용. 
		 */
	}

}
