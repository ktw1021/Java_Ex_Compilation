package com.javaex.practice;

public class Ex21 {

	public static void main(String[] args) {
		
		/*
		 * 예상 결과
		 * 11
		 * 1
		 * 예상 결과와 같음. 
		 * 이번에는 ++이 앞에 붙어서, 붙자마자 1이 더해짐, 
		 * 20번과 비교: 20번은 n값이 초기화되고 난 후, +1이 진행됨. 
		 */
		int i = 10;
		int n = ++i %2;
		
		System.out.println(i);
		System.out.println(n);
		
	}

}
