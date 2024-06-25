package com.javaex.thread.ex02;

public class DigitThread extends Thread {

		//	쓰레드의 로직 구현
		//	주의: 이 메서드는 절대 직접 실행하지 말자.
		//	start()를 통해 우회 실행
		@Override
		public void run() {
			//	Working Logic: 0~30까지 숫자를 출력
			
			for (int i = 0; i<=30; i++) {
				System.out.printf("%s:%d%n",getName(), i); //	쓰레드 이름
				
				//	쓰레드 지연
				try {
					Thread.sleep(500); 	// 0.5초 대기
				} catch (InterruptedException e) {
					e.printStackTrace();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			System.err.println();
			System.err.println(getName()+": 쓰레드 종료");
			
		}
		
	}
