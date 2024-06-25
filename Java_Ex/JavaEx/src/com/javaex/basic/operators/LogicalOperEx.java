package com.javaex.basic.operators;

public class LogicalOperEx {

	public static void main(String[] args) {
		int a = 7;
		int b = 3;
		
		
		//	비교 연산자	:	>=, <=, >, <, ==, !=
		
		System.out.println(a > b);
		System.out.println(a == b);
		System.out.println(a != b);
		//	->	boolean 반환
		
		/*	논리연산자
			논리곱(AND: &&)
			논리합(OR: \\)
			논리부정(NOT: !)
		*/
		int n1 = 7;
		// c는 0 초과, 10미만의 값?
		// 조건1: c > 0
		// 조건2: c < 10
		// 결과 조건 1 and 조건 2
		System.out.println( n1 > 0 && n1 < 10 );
		boolean r1 = n1 > 0;	// 조건1
		boolean r2 = n1 < 10;	// 조건2
		boolean result = r1 && r2;
		System.out.println(result);
		
		//	c가 0 이하이거나 10 이상인가?
		// 조건1: c <= 0
		// 조건2: c >= 10
		// 결과 조건 1 or 조건 2
		r1 = n1 <= 0;
		r2 = n1 >= 10;
		result = r1 || r2;
		
		//	문제 1의 논리 부정
		result = !(n1>0&&n1<10);
		//	-> c <=0 \\ c>= 10) 논리 
		//	문제 2의 논리 부정
		result = !(r1||r2);
		
	}

}
