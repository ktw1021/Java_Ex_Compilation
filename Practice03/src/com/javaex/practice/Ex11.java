package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		
		// 짝수든 홀수든 0이 되기 직전까지 2씩 줄어든다는 점을 이용.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		int spare = num;
		
			for (int a = num; a>0; a-=2) {
				num+=a;
			}
			sc.close();
			System.out.println("결과값: "+ (num - spare));
		}
	}

