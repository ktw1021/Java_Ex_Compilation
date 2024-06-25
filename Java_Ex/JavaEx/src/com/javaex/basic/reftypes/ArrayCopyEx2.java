package com.javaex.basic.reftypes;

import java.util.Arrays;

public class ArrayCopyEx2 {
		//	배열은 크기 변경 불가
		//	공간을 늘리고자 한다면 새 배열 생성 후 복사
		
	public static void main(String[] args) {
		//	for 문을 이용한 배열 복사
			arrayCopyByFor();
		//	System을 이용한 배열 복사
		//arrayCopyBySystem();
	}
	
	public static void arrayCopyByFor() {
		int score [][] = {
				{1, 2, 3},
				{4, 5, 6,}};
			//	.length == 3
		
		for (int i = 0; i<score.length; i++) {
			for (int k = 0; k < score[i].length; k++) {
				System.out.print(score[i][k]+"\t");
			}
			System.out.println();
		}

			int target[][] = new int[10][8];
			for (int a = 0; a < score.length; a++) {
				for (int b = 0; b<score[a].length; b++) {
					target[a][b] = score[a][b]+1;
				}
				System.out.println("");
			}
			
			System.out.println("target: "+Arrays.toString(target));
			
			/**
			for (int c = 0; c <target.length; c++) {
				for (int d = 0; d< target[c].length; d++) {
					System.out.print(target[c][d]+"\t");
				}
				System.out.println();
			}
			**/
	}
	public static void arrayCopyBySystem() {
		int source [] = {1, 2, 3,};
		int target [] = new int[10];
		
		System.out.println("source: "+ Arrays.toString(source));
		
		//	배열 복제
		System.arraycopy(source, 	// 원본 배열
				0,	// 복사 시작 인덱스(원본)
				target,	// 복사 대상 배열
				0,	// 대상 배열의 시작 인덱스
				source.length	// 복사할 길이
				);
		System.out.println("target: "+Arrays.toString(target));
	}

}
