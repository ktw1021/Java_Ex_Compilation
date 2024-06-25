package com.javaex.practice;

public class Ex01 {

	public static void main(String[] args) {
		// Array의 크기가 5로 설정되어있는데, for 루프의 i는 끊임없이 커짐.
		// result에 넣을 intArray[i]도 함께 커지므로, 5를 벗어나게 됨.
		// 따라서, i를 5 미만으로 반복하게끔 루프의 범위를 정해야 함.
		//
		
		int[] intArray = new int[5];
		intArray[0] = 3;
		intArray[1] = 7;
		intArray[2] = 12;
		
		int result = 0;
		
		for (int i= 0; (i <= intArray.length) && (i<5); i++) {
			result = result + intArray[i];
		}
		System.out.println(result);
	}

}
