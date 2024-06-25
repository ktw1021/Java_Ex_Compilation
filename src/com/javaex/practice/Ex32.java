package com.javaex.practice;

import java.util.Scanner;

public class Ex32 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("가로:\t");
		double horizon = sc.nextDouble();
		System.out.print("세로:\t");
		double vertic = sc.nextDouble();
		double extent = (horizon*vertic)/2;
		
		System.out.println("삼각형의 넓이는 " + extent + " 입니다.");
		sc.close();
	}

}
