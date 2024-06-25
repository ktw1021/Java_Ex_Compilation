package com.javaex.practice;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("나이를 입력해주세요.");
		
		int age = scanner.nextInt();
		String group = null;
		
		if (age >= 19 && age < 65) {
			group = "1번 그룹";
		}
		else if ((age >= 0 && age < 19) || (age >= 65 && age <= 150)) {
			group = "2번 그룹";
		}
		else {
			group = "잘못된 입력";
		}
		System.out.println(group + " 입니다.");
		scanner.close();
		
	}

}
