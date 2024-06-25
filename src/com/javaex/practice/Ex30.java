package com.javaex.practice;

import java.util.Scanner;

public class Ex30 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("마일을 입력하세요: ");
		double MILE = sc.nextDouble();
		double kil = 1.609*MILE;
		System.out.println(MILE+"마일은 "+kil+"킬로미터 입니다.");
		sc.close();
		
	}

}
