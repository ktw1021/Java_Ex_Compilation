package com.javaex.practice;

public class Ex08 {

	public static void main(String[] args) {
		/*
		 * 가로: 2~9까지의 범위
		 * 세로: 1~9까지의 범위
		 * 각각 곱하며 숫자가 증가하는 루프를 생성
		 *\t를 이용하여 줄 맞추기
		  * 
		  */
		for (int a = 1; a <= 9; a++) {
			for (int b = 2; b <= 9; b++) {
				System.out.print(b+"*"+a+"="+a*b+"\t");
			}
			System.out.println("");
		}
		
	}

}
