package com.javaex.api.wrapper;

public class WrapperEx2 {

	public static void main(String[] args) {
		Integer i = Integer.valueOf(10);
		Character c = Character.valueOf('4');
		Double d = 3.1234566;
		System.out.println(Character.toLowerCase('A'));	//	대문자 A를 소문자로 변환
		
		if(Character.isDigit(c)) {	//문자 c가 숫자를 나타내면
			System.out.println(Character.getNumericValue(c));	//	문자를 숫자로 변
		}
	}

}
