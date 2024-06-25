package com.javaex.practice;

public class Ex16 {

	public static void main(String[] args) {
		/*
		 * 예상 결과
		 * a=4
		 * b=2
		 * x=2
		 * y=2
		 * 예상 결과 맞음.
		 */
		
		int x = 1;
		int y = 1;
		
		int a = ++x *2;
		int b = y++ *2;
		
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		System.out.println("x=" + x);
		System.out.println("y=" + y);
	}

}
