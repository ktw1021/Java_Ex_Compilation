package com.javaex.practice;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 2개를 입력해주세요.");
		System.out.print("숫자1: ");
		int num1 = sc.nextInt();
		System.out.print("숫자2: ");
		int num2 = sc.nextInt();
		
		if (num1-num2>0) {
			System.out.println("큰수: " + num1 + "\t\t작은수: "+num2+"입니다.");
		}
		else {
			System.out.println("큰수: " + num2 + "\t\t작은수: "+num1+"입니다.");
		}
		sc.close();
	}

}
