package com.javaex.practice;

import java.util.Scanner;

public class P {
		
	public static void main(String[] args) {
		 int answer;
	        
	        Scanner sc = new Scanner(System.in);
	        System.out.println("num을 입력해주세요.");
	        int num = sc.nextInt();
	        System.out.println("n을 입력해주세요.");
	        int n = sc.nextInt();
	        
	        if ((num<=100&&num>=2)&&(n<=9&&n>=2)) {
	            if (num%n==0) {
	            answer=1;
	            System.out.println(answer);            
	            }
	            else {
	            answer=0;
	            System.out.println(0);
	            }
	            sc.close();
	}
	

}
}