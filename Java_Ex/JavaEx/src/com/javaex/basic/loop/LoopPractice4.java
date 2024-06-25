package com.javaex.basic.loop;

public class LoopPractice4 {
		public static void main(String[] args) {
			int a = 1;
			int b = 1;
			
			while (a<7) {
				a++;
				while (b<a) {
					b++;
					System.out.print("*");
				}
				System.out.println("");
				b=1;
			}
		}
}
