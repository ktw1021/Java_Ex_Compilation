package com.javaex.practice;

import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("태어난 년도를 입력해 주세요.");
		System.out.print("년도: ");
		int year = sc.nextInt();
		int age = 2024-year;
		System.out.println("올해: "+"2024");
		System.out.println("태어난해: "+year);
		System.out.println("나이: "+age);
		System.out.println("===========================");
		String GW = null;	//홀짝
		String canc = null;	//암검사 여부
		
		if (age>=20 && age<=150) {
			System.out.println("20살 이상");
			
			if (age%2==0) {
				GW = "건강검진 해";
			}
			else {
				GW = "건강검진 해 아님";
				
			}
			if (age>=40) {
				canc = "암검사 해";
			}
			else {
				canc = "암검사 X";
			}
		}
		
		else if (age>=0&&age<20) {
			System.out.println("20살 미만 건강검진 대상이 아님");
		}
		
		else {
			System.out.println("잘못된 정보입니다.");
		}
		System.out.println(GW!=null?GW:"");
		System.out.println(canc!=null?canc:"");
		sc.close();
	}

}
