package com.javaex.thread.ex01;

public class AlphabetThread extends Thread {
	
	
	public void run() {
	for (char i = 'a'; i<='z'; i++) {
		System.out.println(i);
		
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
}
}
}
