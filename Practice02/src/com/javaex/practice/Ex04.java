package com.javaex.practice;

public class Ex04 {

	public static void main(String[] args) {
		
		/*
		 * 예상 결과: 
		 * if (x=0) -> 초기화하는 게 아니라, 계산하는 거니까, ==으로 표현해야 됨.
		 * 예상 결과가 맞음. 
		 * 수정하니 잘 작동함.
		 */
		
		int x = 0;
		
		//x가 0과 같으면
		if (x==0) {
			System.out.println("x는 0이다.");
		}
		
	}

}
