package com.javaex.oop.person.v1;

public class Person {
	
	static int count;
	protected String name;
	protected int age;
	
	public Person() {
		
	}
	public Person(String name, int age) {
		this.name=name;
		this.age=age;
		count++;
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
		count++;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age=age;
		count++;
	}
	
	public void showInfo() {
		System.out.printf("%s은(는) %d살의 학생입니다.%n", name, age);
		System.out.println("Person은 "+ count + "명입니다.");
	}
	
}
