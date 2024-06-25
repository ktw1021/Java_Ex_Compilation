package com.javaex.practice;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("출력되는 내용을 입력하세요.");
		System.out.print("기호: ");
		String str = sc.next();
		char logo = str.charAt(0);
		System.out.print("숫자1: ");
		double num1 = sc.nextDouble();
		System.out.print("숫자2: ");
		double num2 = sc.nextDouble();
		
		if (num2==0) {
			System.out.println("계산할 수 없습니다.");
		}
		else {
		switch (logo) {
		case '+':
			System.out.println(num1+num2);
			break;
		case '-':
			System.out.println(num1-num2);
			break;
		case '*':
			System.out.println(num1*num2);
			break;
		case '/':
			System.out.println(num1/num2);
			break;
			
		default:
			System.out.println("계산할 수 없는 기호입니다.");
			break;
			}
		}
		sc.close();
	}
}

