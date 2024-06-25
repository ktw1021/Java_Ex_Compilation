package com.javaex.basic.loop;

public class LoopPractice2 {

	public static void main(String[] args) {
		int a = 1;
		int b = 1;
		
		while (a<9) {
			b=1;
			a++;
			
			while (b<10) {
				System.out.println(a+"*"+b+" = " + a*b);
				b++;
			}
		}
	}
}
	


