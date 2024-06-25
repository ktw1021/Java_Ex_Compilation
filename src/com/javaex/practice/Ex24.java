package com.javaex.practice;

public class Ex24 {

	public static void main(String[] args) {
		double f = 80.0;
		System.out.println(5.0/9.0*(f-32.0));
		
		/*
		 * 5/9는 int 정수로 계산되어 0이 되니, 어떤 수를 곱해도 0.0이 나옴.
		 * 이를 5.0/9.0으로 수정하여, 제대로 된 값이 나오게 함. 
		 * 답: 26.666 어쩌구
		 */
		
	}

}
