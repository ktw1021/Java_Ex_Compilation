package com.javaex.thread.ex01;

public class MultiThread {

	public static void main(String[] args) {
		
		
		Thread thread1 = new DigitThread();
		Thread thread2 = new DigitThread();
		AlphabetThread thread3 = new AlphabetThread();
		
		thread1.start();
		thread2.start();
		thread3.start();
	}
	
	
}
