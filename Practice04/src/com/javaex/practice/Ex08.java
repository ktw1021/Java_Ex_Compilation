package com.javaex.practice;

public class Ex08 {

	public static void main(String[] args) {
		int a [] = new int [5];
		
		int t;
		
		for (int i = 0; i<a.length; i++) {
			
			do {
				a [i] = (int)(Math.random()*45)+1;
				t=1;
				
				for (int j=0; j<i; j++) {
				
				if (a[i]==a[j]) {
				t=0;
				break;
				}
			}
		} while (t!=1);
	}	
		
		for (int k = 0; k < a.length; k++) {
			System.out.printf("%d\t",a[k]);
		}
	}
}

