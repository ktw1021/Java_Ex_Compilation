package com.javaex.basic.console;


import java.util.*;
public class ConsoleInputEx {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int age;
		
		System.out.print("나이는?:");
		age = scanner.nextInt();
		
		String name;
		
		System.out.print("이름은?:");
		name = scanner.next();
		
		System.out.print("안녕하세요, "+name + "님. " + age + "살이시네요. 반갑습니다.");
		
		if (age<23) {
			System.out.println("젊으시네요.");
		}
		else {
			System.out.println("틀딱이네.");
		}
		
		
		scanner.close();
		

	}

}
