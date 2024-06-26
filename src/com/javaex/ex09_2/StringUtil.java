package com.javaex.ex09_2;

public class StringUtil {
    
    public static String concatString(String [] strArray){
         	
    	StringBuilder sb = new StringBuilder();
    	
    	for (String str: strArray) {
    		sb.append(str);
    	}
    	//메소드 내용작성
        return sb.toString();
    }

}
