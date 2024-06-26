package com.javaex.ex09_2;

public class StringUtil2 {
    
    public static String concatString(String [] strArray){
         	
    	StringBuilder sb = new StringBuilder();
    	
    	for (int i = 0; i<strArray.length; i++) {
    		sb.append(strArray[i]);
    	}
    	//메소드 내용작성
        return sb.toString();
    }

}
