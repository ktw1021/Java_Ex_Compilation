package com.javaex.basic.operators;

public class BitOperEx {

	public static void main(String[] args) {
		// 비트 연산자 연습
		bitOperTest();
		// 비트 시프트 연산자
		bitShiftTest();
	}
	public static void bitOperTest() {
		// 비트 연산자
		byte b1 = 0b1101;
		byte b2 = 0b0111;
		int result = b1 & b2;	// 비트 논리곱
		System.out.println(result);
			System.out.println(Integer.toBinaryString(result));
		result = b1 | b2;		// 비트 논리합
			System.out.println(Integer.toBinaryString(result));
		result = b1 ^ b2;		// 비트 XOR
			System.out.println(Integer.toBinaryString(result));
		result = ~b1;			// 비트 NOT 
			System.out.println(Integer.toBinaryString(result));
			System.out.println("---------------");
	}
	public static void bitShiftTest() {
		int va1 = 1;
		System.out.println(va1);
		
		// 왼쪽으로 1비트 이동
		System.out.println(Integer.toBinaryString(va1<<1));
		// 왼쪽으로 4비트 이동
		System.out.println(Integer.toBinaryString(va1<<4));
		
		int va2 = 0b1010101;
		System.out.println(Integer.toBinaryString(va2));
		
		// 오른쪽으로 1비트 이동
		System.out.println(Integer.toBinaryString(va2>>1));
		// 오른쪽으로 2비트 이동
		System.out.println(Integer.toBinaryString(va2>>2));
		// 오른쪽으로 3비트 이동
		System.out.println(Integer.toBinaryString(va2>>3));		
	}
}
