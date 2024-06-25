package com.javaex.practice;

public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(13/5);				// 첫번째 : 2
		System.out.println((double)(13/5));		// 마지막 : 2.0
		/*
		 * 첫번째, 마지막 결과가 다르게 나옴.
		 * 첫번째의 경우, 정수 나누기 정수이기 때문에 나머지를 제외한 정수인 2만 출력되고,
		 * 마지막읙 경우, 첫번째와 같이 2가 나온 결과를 실수로 강제변형시킨 것이기 때문에 2.0임.
		 * 나머지는 모두 둘 중 한 숫자가 실수라는 실마리가 있기 때문에, 결과도 실수로 냄.
		 */
		
	}

}
