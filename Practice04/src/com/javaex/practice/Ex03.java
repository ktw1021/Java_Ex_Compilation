package com.javaex.practice;

public class Ex03 {

	public static void main(String[] args) {
		
		/*
		 *  예상 결과:
		 *  20
		 *  6
		 *  10
		 *  예상 결과와 같음. 
		 */
		
		int[] intA = { 3, 6, 9 };
		
		int[] intB;
		intB = intA;
		intB[0]=20;
		intB[2]=10;
		
		for (int i=0; i<intA.length; i++) {
			System.out.println(intA[i]);
		}
		
	}

}
