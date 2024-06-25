package com.javaex.practice;

public class Ex03 {

	public static void main(String[] args) {
		/*
		 * 예상 결과:
		 * if (0<a<18) -> 성립하지 않아 오류가 날 것. 다중조건 형식이 맞지 않음.
		 * (a>0 && a<18) 이렇게 수정해야 함.
		 * 수정하니 잘 작동함. 
		 * 예상 결과가 맞음.
		 */
		int age = 15;
		
		//age가 0살 초과이고 18살 미만이면
		if(0<age && age<18) {
			System.out.println("청소년 입니다.");
			
		}
	}

}
