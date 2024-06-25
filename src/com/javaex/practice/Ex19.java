package com.javaex.practice;

public class Ex19 {
	public static void main(String[] args) {
	
		/* 
		 * 예상 결과 
		 * 91
		 * 41
		 * 51
		 * 예상 결과와 같음. 
		 */
		
	int num01 = 40;
	int num02 = 50;
	int result = (num01++) + (++num02);
	
	System.out.println(result);
	System.out.println(num01);
	System.out.println(num02);
	}
}
