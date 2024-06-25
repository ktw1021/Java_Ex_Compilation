package com.javaex.practice;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int star = sc.nextInt();
		
		for (int b = star; b>0; b--) {
		for (int a = star; a>0; a--) {
			System.out.print("*");
		}
		System.out.println("");
		star--;
		}
		sc.close();
	}

}
