package com.javaex.ex09_2;

public class StringUtilApp {

    public static void main(String[] args) {

    	
        String[] strArray = {"SuperMan", "BatMan", "SpiderMan"};
        String resultStr = StringUtil2.concatString(strArray);
        // 두개 다 해봄. -> 가능
        System.out.println("결과 문자열:" + resultStr);
    }

}
