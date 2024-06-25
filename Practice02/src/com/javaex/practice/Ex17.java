package com.javaex.practice;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("수익을 입력해 주세요.(단위: 만원)");
		System.out.print("금액: ");
		int mon = sc.nextInt();
		double tax;
		if (mon>=0 && mon<=1000) {
			tax = 0.09*mon;
			System.out.println("소득세는 " +tax+" 입니다.");
		}
		else if (mon>1000&&mon<=4000) {
			tax = 1000*0.09+0.18*(mon-1000);
			System.out.println("소득세는 " +tax+" 입니다.");
		}
		else if (mon>4000&&mon<8000) {
			tax = 1000*0.09 + 3000*0.18 + 0.27*(mon-4000);
			System.out.println("소득세는 " +tax+" 입니다.");
		}
		else if (mon>=8000) {
			tax = 1000*0.09 + 3000*0.18 + 4000*0.27+0.36*(mon-8000);
			System.out.println("소득세는 " +tax+" 입니다.");
		}
		else {
			System.out.println("잘못 입력했습니다.");
			}
		sc.close();
	}
}
