package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		System.out.println("숫자 3개를 입력해주세요.");
		System.out.print("숫자1: ");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		System.out.print("숫자2: ");
		int num2 = sc.nextInt();
		System.out.print("숫자3: ");
		int num3 = sc.nextInt();
		
		int few;
		
		if (num1<num2 && num1<num3) {
			few = num1;
		}
		else if (num2<num3) {
			few = num2;
		}
		else {
			few = num3;
		}
		System.out.println("가장 작은수는 " + few + " 입니다.");
		sc.close();
		}

}
