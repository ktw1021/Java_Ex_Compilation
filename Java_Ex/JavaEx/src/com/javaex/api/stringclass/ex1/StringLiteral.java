package com.javaex.api.stringclass.ex1;

public class StringLiteral {

	public static void main(String[] args) {
		//	문자열 기본
		stringBasic();
		//	문자열의 다양한 메서드
		}
		
	
		private static void stringBasic() {
		String s1 = "hello";
		String s2 = "hello";
		
		String s3 = new String("hello");
		String s4 = new String("hello");
				
		System.out.println(s1==s2);
		System.out.println(s3==s4);
		System.out.println(s2==s4);
		}
	}


