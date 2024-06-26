package com.javaex.ex08;

import java.util.Scanner;

public class BankApp {

	public static void main(String[] args) {

		Bank bk = new Bank();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("312-89562-123456"+" 계좌가 개설되었습니다.");
		
		int select = 0;
		
		do {
		
		System.out.println("----------------------------------");
		System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
		System.out.println("----------------------------------");
		System.out.print("선택>");
		select=sc.nextInt();
		
		if (select==1) {
			System.out.print("예금액>");
			bk.setDeposit(sc.nextInt());
		}
		
		else if (select==2) {
			System.out.print("출금액>");
			bk.setWithdrawl(sc.nextInt());
		}
		
		else if (select==3) {
			System.out.println("잔고액>");
			System.out.println(bk.getSum());
		}
		
		else if ( (select>4) && (select<1) ) {
			System.out.println("다시 입력해주세요.");
		}
		
		} while (select!=4);
		
		System.out.println("프로그램 종료.");
		
	sc.close();	
	}

}
