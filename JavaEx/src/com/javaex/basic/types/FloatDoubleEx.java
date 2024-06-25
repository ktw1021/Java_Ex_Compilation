package com.javaex.basic.types;

public class FloatDoubleEx {

	public static void main(String[] args) {
		float floatVar;
		double doubleVar;
		
		// 정밀도 체크
		
		floatVar = 0.12345678901234567890F;
		doubleVar = 12345678901234567890123467890.12345678901234567890123456780;
		System.out.println(floatVar);
		System.out.println(doubleVar);
		
		int intVar;
		intVar = 300_000_000;
		floatVar = 3E9F;
		doubleVar = 3E-9;
	
		System.out.println(intVar);
		System.out.println(floatVar);
		System.out.println(doubleVar);
		
		System.out.println(0.1 * 3);
		
	}

}
