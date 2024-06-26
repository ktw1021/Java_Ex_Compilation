package com.javaex.ex04;

/*
 * 문제에서 클래스를 제공한다는데 누락된 듯.
 * 그냥 혼자 만들어보겠음.
 * 4개 객체를 만들고 각각 다른 객체에서 값을 가져와서, 
 * 문제에 있는 값을 출력하는 것으로 하겠음.
 */

public class Base {
	
	private String lets;
	private String sleep;
	private String needTo;
	
	public String getLets() {
		return lets;
	}
	public void setLets(String lets) {
		this.lets=lets;
	}
	public String getSleep() {
		return sleep;
	}
	public void setSleep(String sleep) {
		this.sleep=sleep;
	}
	public String getNeedTo() {
		return needTo;
	}
	public void setNeedTo(String needTo) {
		this.needTo=needTo;
	}
	
	public void campaign(String lets, String sleep, String needTo) {
		System.out.printf("%s%n%s%n%s%n", lets, sleep, needTo);
		return;
	}
}
