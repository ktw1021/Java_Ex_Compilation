package com.javaex.oop.casting;

public class Animal {
	
	protected String name;
	
	public Animal(String name) {
		this.name=name;
	}
	
	//	메서드
	public void eat() {
		System.out.println(name+"이 먹고 있다.");
	}
	public void walk() {
		System.out.println(name+"은 산책중...");
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
}
