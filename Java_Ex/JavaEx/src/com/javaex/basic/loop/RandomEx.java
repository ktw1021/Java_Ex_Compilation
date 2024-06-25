package com.javaex.basic.loop;

import java.util.Random;

public class RandomEx {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		for (int a = 1; a<=6; a++) {
			int r = random.nextInt(45)+1;
			System.out.print(r+"\t");
		}
		
		System.out.println("");
		
		
		int i = 0;
		while (i!=6) {
			i++;
			int num = (int)(Math.random()*45)+1;
			System.out.print(num+"\t");
		}
	}

}
