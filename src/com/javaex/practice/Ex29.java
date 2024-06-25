package com.javaex.practice;

import java.util.Scanner;

public class Ex29 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("너비를 입력하세요:");
		double width = sc.nextDouble();
		System.out.print("높이를 입력하세요:");
		double height = sc.nextDouble();
		double perimeter = 2*width+2*height;
		double extent = width*height;
		System.out.println("사각형의 둘레는 "+perimeter);
		System.out.println("사각형의 넓이는 "+extent);
		sc.close();
	}

}
