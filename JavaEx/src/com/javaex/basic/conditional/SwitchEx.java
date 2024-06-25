package com.javaex.basic.conditional;

import java.util.Scanner;

public class SwitchEx {

	public static void main(String[] args) {
		
		// 1. 스캐너 열기
		Scanner scanner = new Scanner(System.in);
		System.out.println("과목을 선택하세요;");
		System.out.println("(1.자바  2.C  3.C++  4.파이썬)");
		System.out.print("과목번호: ");
		
		// 2. 과목번호 입력
		int code = scanner.nextInt();
		
		//3. 조건분기 (switch)
		switch (code) {
			case 1: //subj==1
			System.out.println("R101호 입니다.");	
			break;
			
			case 2: //subj==2
			System.out.println("R202호 입니다.");
			break;
			
			case 3: //subj==3
			System.out.println("R303호 입니다.");
			break;
			
			case 4: //subj==4
			System.out.println("R404호 입니다.");
			break;
			
			default: // else
			System.out.println("상담원에게 문의하세요.");
			break;
		}
		
		// 4. 스캐너 닫기
		scanner.close();
		
	}

}
