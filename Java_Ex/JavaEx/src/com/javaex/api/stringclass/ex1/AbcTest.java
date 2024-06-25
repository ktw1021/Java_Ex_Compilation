package com.javaex.api.stringclass.ex1;

public class AbcTest {
	public static void main(String[] args) {
		String str1 = "abc";
		String str2;
		str2 = str1.toUpperCase();
		String str4 = str2.concat("??");
		String str5 = "!".concat(str2).concat("@");
		
				System.out.println("str1: " + str1);
				System.out.println("str2: " + str2);
				System.out.println("str4: " + str4);
				System.out.println("str5: " + str5);
	}
}
