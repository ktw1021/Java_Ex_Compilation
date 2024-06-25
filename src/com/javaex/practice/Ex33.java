package com.javaex.practice;

import java.util.Scanner;

public class Ex33 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("반지름: ");
		double radius = sc.nextDouble();
		double PI = 3.14;
		System.out.println("구의 부피는: " + Math.pow(radius,3.0) * (4.0/3.0) * PI );
		sc.close();
		
	}

}
