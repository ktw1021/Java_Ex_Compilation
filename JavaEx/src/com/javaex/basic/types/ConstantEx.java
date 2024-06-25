package com.javaex.basic.types;

import java.util.Calendar;

public class ConstantEx {

	public static void main(String[] args) {
		final double PI = 3.141592; 
		final int SPEED_LIMIT = 110;
		
		System.out.println(PI);
		System.out.println(SPEED_LIMIT);
		
		System.out.println("현재 제한 속도는 " + SPEED_LIMIT + "km입니다.");
		System.out.println("제한 속도 이하로 주행해주세요.");
		
		// 상수의 사용 목적
		// 1. 코드 가독성을 높인다.
		// 2. 특정 데이터를 한 곳에서 일괄 관리한다.
		// 3. 코드를 변경할 수 없다(불변성).
		
		System.out.println(Calendar.OCTOBER);
		
		//형 변환-자료유실(강제타입변환)
		
		int num1 = 2000000;
		float num2 = 1.2F;
		float multiply = (byte)num1 * (byte)num2;
		
		System.out.println(multiply);
	}

}
