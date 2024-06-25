package com.javaex.practice;

import java.util.Scanner;

public class Ex22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자3개를 입력해주세요.");
		System.out.print("숫자1: ");
		int num1 = sc.nextInt();
		System.out.print("숫자2: ");
		int num2 = sc.nextInt();
		System.out.print("숫자3: ");
		int num3 = sc.nextInt();
		
		int big;
		
		if (num1>num2 && num1>num3) {
			big = num1;
		}
		else if (num2>num3) {
			big = num2;
		}
		else {
			big = num3;
		}
		System.out.println("가장 큰수는 " + big + " 입니다.");
		sc.close();
		}

}
