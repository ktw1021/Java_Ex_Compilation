package com.javaex.practice;

public class Ex05 {

	public static void main(String[] args) {
		/*
		 * 예상 결과:
		 * 1
		 * 2
		 * 3
		 * 4
		 * 5
		 * 
		 */
		int i=1;
		boolean flag = true;
		
		while(flag) {
			if(i>=5) {
				flag = false;
			}
			System.out.println(i);
			i=i+1;
			
			/*
			 * while 루프는 flag가 false가 될 때까지 루프를 반복하며,
			 * i를 출력, 1부터 시작해, 5가 될 때까지,
			 * i=5가 되면 flag는 false가 되며, 루프가 종료
			 * 마지막 출력물을 5이고, 줄띄기까지
			 */
		}
	}

}
