package com.javaex.practice;

import java.util.Scanner;

public class Ex28 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);;
		System.out.print("환전할 원화를 입력하세요: ");
		int won = sc.nextInt();
		double DOLLAR = won/1230.95;
		System.out.println("받으실 달러는 "+DOLLAR);
		sc.close();
	}

}
