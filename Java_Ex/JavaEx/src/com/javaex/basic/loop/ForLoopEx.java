package com.javaex.basic.loop;

import java.util.Scanner;

public class ForLoopEx {
	//	단을 입력
	//	for 루프로 1~9까지 반복
	//	단 * i = 
	
	public static void main(String[] args) {
		//	변수 초기화
		//	스캐너 열기
		//	단 입력
		//	1~9 반복
		//	결과 출력
		//	스캐너 닫기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("단을 입력해주세요.");
		int dan = sc.nextInt();
		System.out.println("단 : "+ dan);
		
		for (int i=1; i<10; i++) {
			System.out.println(dan+" * " + i+ " = " + dan*i);
		}
		sc.close();
	}

}
