package com.javaex.oop.casting;

public class Cat extends Animal {
	//	생성자
	//	'Cat은 String name을 통해 super 생성자에 상속 세팅 
	public Cat(String name) {
		super(name);
	}

	public void meow() {
		System.out.println(name+": 야옹~~!!");
	}
	
}
