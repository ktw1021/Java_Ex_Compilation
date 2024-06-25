package com.javaex.basic.conditional;

import java.util.Scanner;

public class SwitchEx2_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("월을 입력하세요.");
		
		String message; 
		int m = scanner.nextInt();
		
		switch (m) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			message = "31일";
			break;
		case 2:
			message = "28일";
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			message = "30일";
			break;
			
			default:
			message = "잘못된 숫자";
			break;		
		}
		System.out.print(m+"월의 마지막 날은 "+ message +"입니다.");
		scanner.close();
				
	}

}
