package com.javaex.oop.casting;

public class Dog extends Animal {
	//	Dog은 String name을 통해 Animal을 상속받음.
	public Dog(String name) {
		super(name);
	}
	
	public void bark() {
		System.out.println(name+": 멍멍~!");
	}
}
