package com.javaex.basic.loop;

import java.util.Scanner;

public class WhilePractice1 {

	public static void main(String[] args) {
		
		//	1. 스캐너 열기
		Scanner sc = new Scanner(System.in);
		
		//	2. 단 입력받기
		System.out.println("단을 입력해주세요");
		int dan = sc.nextInt();
		int num = 1;
		
		// 3. 1~9까지 while loop
		// 		단 * num 출력
		System.out.println("단 : " + dan);
		while (num<10) {
			System.out.println(dan+" * "+ num + " = " + dan*num);
			num++;
		}
		
		// 4. 스캐너 닫기
		sc.close();
	}

}
