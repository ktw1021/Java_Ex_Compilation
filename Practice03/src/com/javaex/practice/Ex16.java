package com.javaex.practice;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();
		int sum = 0;
		int fiv = 0;
		
		for(int a = 1; a<=num; a++) {
			if (a%5==0) {
				sum+=a;
				fiv++;
			}
		}
		sc.close();
		System.out.println("5의 배수의 개수:\t"+fiv);
		System.out.println("5의 배수의 합:\t"+sum);
	}

}
