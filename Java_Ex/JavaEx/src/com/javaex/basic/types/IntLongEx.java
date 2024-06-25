package com.javaex.basic.types;

public class IntLongEx {
	public static void main(String[] args) {
		
		/*
		int intVar1;
		intVar1 = 2024;
		intVar2 = 1234567890;		// out of range
		System.out.println(intVar1);
//		System.out.println(intVar2);	// 초기화 필요
		
		*/
		
		long longVar1;
		long longVar2;
		
		longVar1 = 2024;
		longVar2 = 1234567890123456789L;
		// long 형 데이터 뒤에는 L 써야
		
		System.out.println(longVar1);
		System.out.println(longVar2);
		
		long amount = 1_000_000_000_000_000_000L;
		System.out.println(amount);
		
		double d = 2.3e10;
		System.out.println(d);
		float a = 3.2f;
		System.out.println(a);
		
		// 진법 표기 : 2진수, 8진수, 16진수
		
		int bin, oct, hex;
		bin = 0b1100;	//	2진수; 0b
		oct = 072;		//	8진수; 0
		hex = 0XFF; 	//	16진수 0X
		System.out.println(bin);
		System.out.println(oct);
		System.out.println(hex);
		
		
	}
}
