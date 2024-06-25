package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		/*
		 * 예상 결과:
		 * (1) 15일 때 결과: 
		 * \'2번그룹'\
		 * (2) 19일 때 결과:
		 * \'2번그룹'\
		 * (3) 20일 때 결과:
		 * \'2번그룹'\
		 * (4) 21일 때 결과:
		 * "1번 그룹"
		 * (5) 100일 때 결과:
		 * "1번 그룹"
		 * 예상 결과와 일치함.
		 */
		
		int age;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이를 입력해주세요.");
		System.out.print("나이: ");
		age = sc.nextInt();
		
		if(age>20) {
			System.out.println("\"1번그룹\"");
		}
		else {
			System.out.println("\'2번그룹\'");
		}
		System.out.println("입니다.");
		sc.close();		
	}

}
