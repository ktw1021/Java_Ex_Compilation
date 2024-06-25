package com.javaex.practice;

public class Ex04 {

	public static void main(String[] args) {
		int [] data = {1, 3, 5, 8, 9, 11, 15, 19, 18, 20, 30, 33, 31 };
		//주어진 배열에서 3의 배수의 개수 =>6
		//주어진 배열에서 3의 배수의 개수 =>108
		
		int thir = 0;
		int sum = 0;
		
		for (int i = 0; i<data.length; i++) {
			if (data[i]%3==0) {
				thir++;
				sum+=data[i];
			}
		}
		System.out.printf("주어진 배열에서 3의 배수의 개수=>%d%n",thir);
		System.out.printf("주어진 배열에서 3의 배수의 합=>%d",sum);
		
		
	}

}
