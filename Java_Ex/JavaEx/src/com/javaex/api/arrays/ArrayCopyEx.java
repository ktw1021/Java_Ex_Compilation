package com.javaex.api.arrays;

import java.util.Arrays;

public class ArrayCopyEx {
	
	
	//	배열 복제
	public static void main(String[] args) {
		char [] src = "Java Programming".toCharArray();
		System.out.println("length: "+src.length+" , index: 0~15\n");
		System.out.println(src);
		System.out.println(Arrays.toString(src));	//	배열의 내용을 출력
		//	System을 이용한 Copy
		char target[] = new char[src.length];
		System.arraycopy(src,	//	원본 배열
				0, 				//	복사 시작 인덱스
				target,			//	타겟 배열
				0,				//	타겟 배열의 복사 시작위치
				src.length);	//	복사할 길이
		System.out.println(target);
		System.out.println(Arrays.toString(target));
		
		System.out.println();
		//	Arrays.copyOf를 이용한 Copy
		System.out.println(Arrays.copyOf(target,target.length));
		System.out.println(Arrays.toString(Arrays.copyOf(target,target.length)));
		System.out.println();
		
		//	Arrays.copyOfRange: 범위 복제
		target = Arrays.copyOfRange(src,	//	복사할 원본 배열 
				5,	//	복사 시작 인덱스
				12);	//	복사할 길이
		
		System.out.println(target);
		System.out.println(Arrays.toString(target));
	}

}
