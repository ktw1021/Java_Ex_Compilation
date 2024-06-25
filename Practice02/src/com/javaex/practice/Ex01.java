package com.javaex.practice;

public class Ex01 {
	
	public static void main(String[] args) {
	
/*
 * 다음 중 에러가 발생하는 문장은
(1) If ( i=0 ) {....}
(2) If ( j<10 ) {...}
(3) switch( 'A' ){....}
(4) switch( 100 ){...}
(5) switch( "A" ){...}
(6) if ( name == "홍길동" )
 */
		/*
		 * 예상 결과:
		 * 1, 2
		 * (1) -> If가 대문자로 되어있음, 초기화하는 것이 아니라 연산이므로, =가 아니라 ==을 써줘야 함.  
		 * (2) -> If가 대문자로 되어있음.
		 */
		String name = "홍길동";
		if (name=="홍길동") {
			System.out.println(name);
			
		}
		
		
}
}
