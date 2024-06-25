package com.javaex.practice;

public class Ex25 {

	public static void main(String[] args) {
		
		/*
		 * 예상결과
		 * false
		 * true
		 * false
		 * true
		 * 모르겠음 -> ||연산자 우선이기 때문에 참( t && f || t ) = ( f || t) = t 
		 */
		
		
		int a = 13;
		
		System.out.println( (a>13) && (a>=13) );
		System.out.println( (a>13) || (a>=13) );
		System.out.println( (a/3==4) && (a%3==2) );
		System.out.println( (a/3==4) || (a%3==2) );
		System.out.println( (a/3==4) && (a%3==2) || (a/3==4) );
		
	}

}
