package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("나이를 입력해주세요.");
		System.out.println("나이: ");
		
		double age = scanner.nextDouble();
		String cost = null;
		
		
		if (age >= 0 && age <=7) {
			cost = "취학전아동/무료";
		}
		else if (age >= 8 && age <= 13) {
			cost = "초등학생/2000원";
		}
		else if (age >= 14 && age <= 16) {
			cost = "중학생/3000원";
		}
		else if (age >= 17 && age <= 19) {
			cost = "고등학생/4000원";
		}
		else if (age >= 20 && age <= 64) {
			cost = "성인/5000원";
		}
		else if (age >= 65 && age <= 150 ) {
			cost = "경로우대/무료";
		}
		else {
			cost = "잘못된 입력";
		}
		System.out.println(cost + "입니다.");
		scanner.close();
		
	}
	

}
