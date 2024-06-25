package com.javaex.thread.ex01;

public class MainThread {

	public static void main(String[] args) throws InterruptedException {
		//	Working Thread 수행
		Thread thread = new DigitThread();
		thread.setName("DigitThread");
		//	thread 시작
		//	-> 반드시 .start() 메서드로 호출
		thread.start();
		//	MainThread 로직
		//	A ~ Z까지 차례대로 출력
		for (char ch = 'ㄱ'; ch <= 'ㅎ'; ch++) {
			System.out.println("MainThread: " + ch);
			try {
			Thread.sleep(1000);
			} catch(InterruptedException e) {
				System.err.println("방해됩니다.");
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		
		
		System.err.println("메인쓰레드 종료");
	}

}
