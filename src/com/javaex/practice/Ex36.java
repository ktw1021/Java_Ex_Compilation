package com.javaex.practice;

import java.util.Scanner;

public class Ex36 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("500원 개수: ");
		int fivhun = sc.nextInt();
		System.out.print("100원 개수: ");
		int hun = sc.nextInt();
		System.out.print("50원 개수: ");
		int fif = sc.nextInt();
		System.out.print("10원 개수: ");
		int ten = sc.nextInt();
		System.out.print("동전의 총합은 ");
		System.out.print(500*fivhun+100*hun+50*fif+10*ten);
		System.out.print("원 입니다.");
		sc.close();
		
				
	}

}
