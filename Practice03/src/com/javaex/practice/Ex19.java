package com.javaex.practice;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("");
		System.out.println("------------------------------");
		System.out.println("1.예금 | 2.출금 | 3. 잔고 | 4.종료");
		System.out.print("선택>");
		int sum = 0;
		int choice = 0;

		choice = sc.nextInt();

		while(choice!=4) {

		if (choice==1) {
			System.out.print("예금액>");
			int deposit = sc.nextInt();
			sum+=deposit;

		}
		else if (choice==2) {
			System.out.print("출금액>");
			int withdraw = sc.nextInt();
			sum-=withdraw;
			
		}
		else if (choice==3) {
			System.out.print("잔고액>");
			System.out.println(sum);

		}
		
		else {
			System.out.print("다시 입력해주세요.");
		}
		
		System.out.println("");
		System.out.println("------------------------------");
		System.out.println("1.예금 | 2.출금 | 3. 잔고 | 4.종료");
		System.out.print("선택>");
		choice = sc.nextInt();
		
		} 

		System.out.print("프로그램을 종료");
		sc.close();
		}
	}

