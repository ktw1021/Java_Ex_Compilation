package com.javaex.practice;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();
		
		for (int a = num-1; a>0; a--) {
			num+=a;
		}
		sc.close();
		System.out.println("합계: "+num);
	}

}
