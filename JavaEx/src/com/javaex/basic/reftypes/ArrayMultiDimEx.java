package com.javaex.basic.reftypes;

public class ArrayMultiDimEx {

    public static void main(String[] args) {
        
    	
        int[][] table = {
            {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
            {2, 3, 4, 5, 6, 7, 8, 9, 10, 1},
            {3, 4, 5, 6, 7, 8, 9, 10, 1, 2},
            {4, 5, 6, 7, 8, 9, 10, 1, 2, 3},
            {5, 6, 7, 8, 9, 10, 1, 2, 3, 4}
        };	// 5행 10열 배열
        
        System.out.println(table);
        
        System.out.println("table.length: " + table.length);
        System.out.println("table[0].length: " +
        									table[0].length);
        
        int sum =1 ;	// 내부 데이터 합산
        //	행 루프
        for (int row = 0; row < table.length; row++) {
        	//	열 루프
        	for (int col = 0; col < table[row].length; col++) {
        		table[row][col]+=sum;
            	System.out.print(table[row][col] + "\t");
        		}
        		System.out.println();
        }
        for (int k = 0; k<table.length; k++) {
        	for (int l = 0; l<table[k].length; l++) {
        if (table[k][l]==11) {
        	System.out.println("("+k+","+l+")");
        }
        
        }
        
        }
        // 예시: 모든 요소에 1을 더함
        int [][] a = new int [4][13];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
               
            	System.out.print(a[i][j]); 
            }
            System.out.println("");
        }
        System.out.println(a[1][1]);
        }
    }
