package com.javaex.thread.ex02;

public class MainThread {

	public static void main(String[] args) throws InterruptedException {
		//	Working Thread 수행
		Thread thread1 = new DigitThread();
		thread1.setName("DigitThread");
		//	thread 시작
		//	-> 반드시 .start() 메서드로 호출
		//	쓰레드의 우선순위
		//	1 (MIN) ~ 5 (NORMAL) ~ 10 (MAX)
		thread1.setPriority(Thread.MAX_PRIORITY);
//		thread1.start();
//		//	MainThread 로직
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
		
		
		//	Runnable 활용 쓰레드
		Thread thread2 = new Thread(new AlphabetRunnable());
		thread2.setName("AlphabetRunnable");
		thread2.setPriority(Thread.MIN_PRIORITY);
		thread1.start();
		thread2.start();
		
		//	thread와 runnableThread의 흐름을 main 쓰레드의 흐름 합류
		
		try {
		thread1.join();
		thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.err.println("메인쓰레드 종료");
	}

}
