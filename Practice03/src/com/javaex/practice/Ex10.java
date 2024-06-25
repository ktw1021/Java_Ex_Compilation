package com.javaex.practice;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
		/*
		 * 1. a~e까지 5개 숫자를 입력받음
		 * 2. max 변수 생성
		 * 3. a가 가장 큰 수일 경우 -> b가 가장 큰 수일 경우 ~ e까지 검사 진행
		 * (a가 가장 큰 수면 뒤에는 a를 검사할 필요가 없음.)
		 * 4. max 출력
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		System.out.print("숫자: ");
		int a = sc.nextInt() ;
		System.out.print("숫자: ");
		int b = sc.nextInt() ;
		System.out.print("숫자: ");
		int c = sc.nextInt() ;
		System.out.print("숫자: ");
		int d = sc.nextInt() ;
		System.out.print("숫자: ");
		int e = sc.nextInt() ;
		
		int max;
		
		if (a>b && a>c && a>d && a>e) {
			max = a;
		}
		else if (b>c && b>d && b>e) {
			max = b;
		}
		else if (c>d && c>e) {
			max = c;
		}
		else if (d>e) {
			max = d;
		}
		else {
			max = e;
		}
		sc.close();
		System.out.print("최대값은 " + max + "입니다.");
		
		
		
	}

}
