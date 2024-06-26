package com.javaex.ex04_2;

public class Base {
   
    public void service(String state) {
        if (state=="낮") {
        	day();
        }
        if (state=="밤") {
        	night();
        }
        if (state=="오후") {
        	afternoon();
        }
        //코드작성할것
    }

    public void day() {
        System.out.println("낮에는 열심히 수업듣자");
    }

    public void night() {
    	System.out.println("밤에는 숙면");
    	//코드작성할것
    }
    
    public void afternoon(){
        System.out.println("오후도 낮과 마찬가지로 공부해야 합니다.");
    }
}

