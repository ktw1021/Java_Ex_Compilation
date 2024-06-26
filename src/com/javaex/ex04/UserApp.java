package com.javaex.ex04;

import java.util.ArrayList;
import java.util.Scanner;

public class UserApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		ArrayList <User> userList = new ArrayList<>();
		
		userList.add(new Customer("jws","j1234","정우성",1000));
		userList.add(new Customer("yjs","y2345","이효리",2000));
		userList.add(new Employee("master","m7788","운영자",500));
		
		
	  
		for (User user: userList) {
			user.showInfo();
			System.out.println();
		}
		System.out.printf("%s의 월급은 %d만원 입니다.%n",
				userList.get(2).getName(),((Employee)userList.get(2)).getSalary());
		System.out.println();
		System.out.println("추가로 사용자 정보를 입력하시겠습니까?");
		System.out.println("1. 입력\t 2. 종료");
		int select = sc.nextInt();
		

		
		for (; select==1 ;) {
		if (true) {
			
			System.out.println("입력할 사용자 유형을 입력하세요.");
			System.out.println("1.손님\t2.직원\t3.입력 종료");
			int userType = sc.nextInt();
			
			if (userType==3) {
				System.out.println("입력을 종료합니다.");
				break;
			}
			
			System.out.println("ID를 입력하세요.");
			String id = sc.next();
			System.out.println("비밀번호를 입력하세요.");
			String password = sc.next();
			System.out.println("이름을 입력하세요.");
			String name = sc.next();
			
			if (userType==1) {
				System.out.println("입력할 포인트(직원이 입력합니다.)");
				int point = sc.nextInt();
				userList.add(new Customer(id, password,name, point));
			}
			else if (userType==2) {
				System.out.println("월급: ");
				int salary = sc.nextInt();
				userList.add(new Employee(id, password, name, salary));
			}
			for (User user: userList ) {
				user.showInfo();
				System.out.println();
		}
			System.out.println();
	}
		
			
		}
		
	}
	

}
