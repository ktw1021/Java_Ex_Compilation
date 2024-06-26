package com.javaex.ex04;

public class BaseApp {

	public static void main(String[] args) {
		Base b1 = new Base();
		Base b2 = new Base();
		Base b3 = new Base();
		Base b4 = new Base();
		
		b1.setLets("낮에는 열심히 수업 듣자");
		b1.setSleep("낮에는 숙면");
		b1.setNeedTo("낮에도 공부");
		
		b2.setLets("밤에는 열심히 수업 듣자");
		b2.setSleep("밤에는 숙면");
		b2.setNeedTo("밤에도 공부");
		
		b3.setLets("오후도 열심히 수업 듣자");
		b3.setSleep("오후에는 숙면");
		b3.setNeedTo("오후도 낮과 마찬가지로 공부해야 합니다.");
		
		b4.campaign(b1.getLets(),b2.getSleep(),b3.getNeedTo());
		
	}

}
