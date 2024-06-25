package com.javaex.practice;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("키와 몸무게를 입력해 주십시오.");
		System.out.print("키: ");
		double key = sc.nextDouble();
		System.out.print("몸무게: ");
		double mom = sc.nextDouble();
		
		double BMI = mom / Math.pow(key/100,2);
		String Stat = null;
		if (BMI>=18.5 && BMI <= 24.9) {
			Stat = "정상체중";
		}
		else if (BMI<18.5 && BMI>0) {
			Stat = "저체중";
		}
		else if (BMI>24.9 && BMI < 100) {
			Stat = "과제충";
		}
		else {
			Stat = "비정상적인 작동";
		}
		System.out.println(Stat + "입니다.");
		System.out.println("BMI:"+BMI);
		sc.close();
	}

}
