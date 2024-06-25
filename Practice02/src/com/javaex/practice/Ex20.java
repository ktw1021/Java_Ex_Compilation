package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("알파벳 1글자(소문자)를 입력하세요.");
		System.out.print("앞파벳: ");
		String alpab = sc.next();
		char al = alpab.charAt(0);
		if (al=='a'||al=='e'||al=='i'||al=='o'||al=='u') {
			System.out.println("모음입니다.");
		}
		else if (al=='b'||al=='c'||al=='d'||al=='f'||al=='g'||
				al=='h'||al=='j'||al=='k'||al=='l'||al=='m'||
				al=='n'||al=='p'||al=='q'||al=='r'||al=='s'||
				al=='t'||al=='v'||al=='w'||al=='x'||al=='y'||al=='z') {
			System.out.println("자음입니다.");
	}
		else {
			System.out.println("영문 소문자 이외의 값은 고려하지 않습니다.");
		}
		sc.close();
	}

}
