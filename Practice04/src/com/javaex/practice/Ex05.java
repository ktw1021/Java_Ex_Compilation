package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int [] numbers = new int[5];
		double sum = 0;
		
		System.out.println("입력");
		
		for (int i = 0; i< 5; i++) {
			numbers [i] = sc.nextInt();
			sum += numbers[i]; 
			}
		
		double aver = sum/5;
		
		System.out.printf("평균은 %.1f 입니다.",aver);
		sc.close();
		
	}

}
