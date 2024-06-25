package com.javaex.practice;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int star = sc.nextInt();
		int spare = star;
		for (int b = star; b>0; b--) {
		for (int a = star; a>0; a--) {
			System.out.print("*");
		}
		System.out.println("");
		star--;
		}
		
		if (star==0) { star+=2;
			for (int d = 2; d <= spare; d++) {
			for (int c = 1; c <= star; c++) {
				System.out.print("*");
			}
			System.out.println("");
			star++;
			}
		}
		sc.close();
	}
}