package com.javaex.practice;

public class Ex01 {

	public static void main(String[] args) {
		/*
		 * 예상 결과:
		 * while문
		 * index=0
		 * index=0
		 * index=1
		 * index=2
		 * for문
		 * order=0
		 * order=1
		 * order=2
		 */
		System.out.println("while문");
		int index = 0;
		while( index < 3 ) {
			System.out.println("index=" + index);
			index++;
		}
		
		System.out.println("for문");
		for(int order=0; order<3; order++) {
			System.out.println("order=" + order);
		}
		/*
		 * 예상 결과와 실제 결과가 다름.
		 * while 문에서 index++ 계산 실수.
		 * index = 0 이 조건을 만족했기 때문에, 
		 * 0 출력 후 ++이 이뤄져서, 
		 * index 값은 1이 되어 그대로 출력된 것임.
		 */
	}

}
