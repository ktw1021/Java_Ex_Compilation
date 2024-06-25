package com.javaex.oop.methods;

import java.util.Scanner;

public class MethodPractice {
		
	class Arr {
		int numm;
		
		public Arr(int numm) {
			this.numm = numm;
			
		}

	}
	public static void main(String[] args) {
		
		//문제 1.
		printHelloMethod();
		
		//문제 2.
		printNumbers();
		
		//문제 3.
		System.out.println(getRandomNumber());
		
		//문제 4.
		int sum = getSum();
		System.out.println(sum);
		
		//문제 5.
		System.out.println("");
		System.out.println("문제 5. 숫자를 입력하시오.");
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		printOddOrEven(r);
		
		//문제 6.
		System.out.println("");
		System.out.println("문제 6. 문자열을 입력하시오.");
		String s = sc.next();
		printStringLength(s);
		
		//문제 7.
		System.out.println("");
		System.out.println("문제 7. 숫자 2개를 입력하시오.");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int largenum = getLargeNumber(num1,num2);
		System.out.println(largenum);
		
		//문제 8.
		System.out.println("");
		System.out.println("문제 8. 두 개의 문자열을 입력하시오.");
		String str1 = sc.next();
		String str2 = sc.next();
		String sumStr = concatenateStrings(str1, str2);
		System.out.println(sumStr);
		
		//문제 9.
		System.out.println("");
		System.out.println("문제 9. 숫자를 입력하시오.(종료시 0을 입력)");
		
		/*
		int [] arr = new int [] {};
		for (int o = 0; o<10; o++) {
			int [o] arr = new int [("John"+o)];
		}
		
		for (int o = 0; button!=1; o++) {
			
			int numm
			
			if (myarr[o]==0) {
				button = 1;
				break;
			}
		} */
		System.out.println(sumAll(1, 2, 3, 4, 5, 6, 7, 8, 9));
		
		
		//문제 10.
		System.out.println("");
		System.out.println("문제 10. 문자열을 마음껏 입력하시오.(종료시 \"종료\"를 입력)");
		
		
		
		concatenateStrings2();
		
		
		
		sc.close();
		
	}
	
	public static void printHelloMethod() {
		System.out.println("문제 1.");
		System.out.println("Hello Method!");
	}
	public static void printNumbers() {
		System.out.println("");
		System.out.println("문제 2.");
		for (int i = 1; i<11; i++) {
			System.out.print(i+" ");
		}
	}
	public static int getRandomNumber() {
		System.out.println("");
		System.out.println("");
		System.out.println("문제 3.");
		return (int)(Math.random()*100)+1;
	}
	public static int getSum() {
		System.out.println("");
		System.out.println("문제 4.");
		int sum = 0;
		for(int i = 0; i<=10; i++) {
			sum+=i;
		}
		return sum;
	}
	public static void printOddOrEven(int r) {
		
		if (r==0) {
			System.out.println("0입니다.");
			}
		
		else if (r%2==0) {
		System.out.println("짝수입니다.");
		}
		else if (r%2==1) {
		System.out.println("홀수입니다.");
		}
	}
	public static void printStringLength(String s) {
		int sLength=s.length();
		System.out.println(sLength);
	}
	
	public static int getLargeNumber(int num1, int num2) {
		if (num1>num2) {
			return num1;
		}
		else {
			return num2;
		}
	}
	public static String concatenateStrings(String str1, String str2) {
		return str1 + str2;
	}
	public static int sumAll(int ... values) {
		
		int sumPro = 0;
		
		for (int val: values) {
			sumPro += val;
			if (val==0) {
				break;
			}
		}
		
		return sumPro;
	}
	public static String concatenateStrings2(String ... values) {
		
		String st = "";
		for (String stVal: values) {
			st+=stVal;
			if (stVal == "종료") {
				break;
			}
		}
		return st;
	}
}
