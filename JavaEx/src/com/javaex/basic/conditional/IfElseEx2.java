package com.javaex.basic.conditional;

import java.util.Scanner;

public class IfElseEx2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double num = scanner.nextDouble();
		System.out.println("숫자를 입력하세요.");
		
		if (num>0) {
			System.out.println("양수입니다.");
		}
		else if (num<0) {
			System.out.println("음수입니다.");
		}
		else if (num==0) {
			System.out.println("0입니다.");
		}
		else {
			System.out.println("제대로 된 숫자를 입력하세요.");
		}
		
		scanner.close();
	}
}
