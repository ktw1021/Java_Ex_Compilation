package com.javaex.practice;

import java.util.Scanner;

public class Ex27 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("반지름을 입력하세요: ");
		double radius = sc.nextDouble();
		double PI = 3.14;
		double result = Math.pow(radius, 2) * PI;
		System.out.println(result);
		sc.close();
	}

}
