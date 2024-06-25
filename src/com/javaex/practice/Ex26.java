package com.javaex.practice;

import java.util.Scanner;

public class Ex26 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("월급을 입력하세요:");
		int a = scanner.nextInt();
		System.out.println("10년 동안 최대 저축액은 " + a*12 + "만원 입니다.");
		scanner.close();
	}

}
