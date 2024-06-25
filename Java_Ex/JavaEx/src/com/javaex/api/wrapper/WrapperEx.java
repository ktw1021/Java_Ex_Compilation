package com.javaex.api.wrapper;

public class WrapperEx {

	public static void main(String[] args) {
		//	Wrapper 클래스:
		//	기본 타입을 포장하여 객체 형태로 저장하는 클래스(포장 클래스)
		
		//	생성
		Integer i = Integer.valueOf(10);
//		Integer i2 = new Integer(20); // -> Deprecated(더이상 사용되지 않는 방식)
		Character c = Character.valueOf('c');
		Float f = Float.valueOf(3.14f);
		Boolean b = Boolean.valueOf(true);
		//	기본 타입에 대응한 WrapperClass가 있다. 
		//	.valueOf static 메서드로 생성
		
		//	문자열로 된 데이터를 기본 데이터 타입으로 포장
		Integer i2 = Integer.valueOf("010");
		System.out.println(i2);
		Double d2 = Double.valueOf("3.141592");
		Boolean b2 = Boolean.valueOf("false");
		
		//	주의: 전달되는 파라미터의 문자열의 형태가 해당하는 기본형의 형태를 갖추어 한다. 
		
		//	auto boxing
		Integer i3 = 10; 	//	Integer i3 = Integer.valueOf(10);
		//	auto unboxing
		int result = i3 + 2;	// int result = i3.intValue()+2;
		System.out.println(result);	
		
		//	parse 계열 메서드: 문자열 이용, 특정 타입으로 변환, 다른 형태로 출력
		System.out.println(Integer.parseInt("-0123"));	// 문자열 -> 정수
		System.out.println(Integer.parseInt("10",16));	// 16진수 10 -> 정수
		System.out.println(Integer.toBinaryString(28));	// 10진수 28 -> 2진수 문자열
		
		//	형 변환
		System.out.println(i2.doubleValue());
		
		//	포장된 값의 비교
		Integer i4 = Integer.valueOf(2024);
		Integer i5 = Integer.valueOf(2024);
		System.out.println(i4.equals(i5));	//	값을 비교
		System.out.println(i4==i5);	//	다른 객체를 참조(참조 주소가 다름)
		
		//	언박싱 비교(내부 데이터의 비교)
		System.out.println();
		System.out.println(i4.intValue() == i5.intValue());
		System.out.println(i4.equals(i5));
		
	}

}
