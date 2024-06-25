package com.javaex.practice;

import java.util.Scanner;

public class Ex38 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("전체금액을 입력해주세요: ");
		int cost = sc.nextInt();
		System.out.println("실제지불금액은 " + (cost-cost%1000)+"원 입니다.");
		sc.close();
	}
}
