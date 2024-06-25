package com.javaex.practice;

import java.util.Random;
import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String yes="a";
		
		do {
		
		
		Random random = new Random();
		int answer = random.nextInt(100)+1;
		
		System.out.println("=============================");
		System.out.println("    "+"[숫자맞추기게임 시작]"+"    ");
		System.out.println("=============================");
		System.out.print(">>");
		

		int a = 0;
		
		while (a==0) {
		
		int num1 = sc.nextInt();
		
		if (answer < num1) {
			System.out.println("더 낮게");
			System.out.print(">>");
		}
		else if (answer > num1) {
			System.out.println("더 높게");
			System.out.print(">>");		
		}
		else if(answer == num1) {
			System.out.println("맞았습니다.");
			a = 1;
		}
	}
		System.out.print("게임을 종료하시겠습니까?(y/n) >>");
		yes = sc.next();

} while (!yes.equals("y"));
		
		System.out.println("=============================");
		System.out.println("    "+"[숫자맞추기게임 종료]"+"    ");
		System.out.println("=============================");
		sc.close();
		
	}
}
