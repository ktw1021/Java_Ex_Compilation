package com.javaex.basic.conditional;

import java.util.Scanner;

public class SwitchPractice2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("점수를 입력하세요 : ");
		double score = scanner.nextDouble();
		
		String degree = null;
		
		if (score >= 90 && score <= 100) {
			degree = "A등급";
		}
		else if (score < 90 
				&& score >=80 ) {
			degree = "B등급";
		}
		else if (score < 80 && score >= 70) {
			degree = "C등급";
		}
		else if (score < 70 && score >=60) {
			degree = "D등급";
		}
		else if (score < 60 && score >= 0) {
			degree = "F등급";
		}
		else {
			degree = "제대로 된 점수를 입력하시오.";
		}
		System.out.print(degree);
		scanner.close();
	}

}
