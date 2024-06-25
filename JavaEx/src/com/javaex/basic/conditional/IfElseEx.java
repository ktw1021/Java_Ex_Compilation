package com.javaex.basic.conditional;

import java.util.Scanner;

//Tip: ctrl + space (자동 임포트)
//		ctrl + shift + o (모두 자동 임포트-organize imports)

public class IfElseEx {

	public static void main(String[] args) {
		// 점수 입력, 60점 이상이면 합격입니다 출력
		// 1. 스캐너 열기.
		Scanner scanner = new Scanner(System.in);
		// 2. 점수 입력 받기
		System.out.println("점수를 입력해주세요.");
		int score = scanner.nextInt();
		// 3. 점수 비교
		if (score >= 60 && score <= 100) {
			System.out.println("합격입니다.");
			System.out.println("숫자를 입력해주세요.");		// 2. 숫자 입력
		}
		else if (score < 60 && score >= 0) {
			System.out.println("불합격입니다.");
			System.out.println("숫자를 입력해주세요.");		// 2. 숫자 입력
		}
		else {
			System.out.println("잘못된 점수입니다.");
			System.out.println("숫자를 입력해주세요.");		// 2. 숫자 입력
		}

		double num = scanner.nextDouble();

		if (num > 0) {
			System.out.println("양수입니다.");			// 3. 양수일 경우, 출력
		}
		else if(num < 0) {
			System.out.println("음수입니다.");			// 4. 음수일 경우, 출력
		}
		else if(num==0) {
			System.out.println("0입니다.");			// 5. 0일 경우, 출력
		}
		else {
			System.out.println("정수를 입력해주세요.");	// 6. 그 외일 경우, 출력
		}
		scanner.close();
	}

}
