package com.javaex.basic.reftype;

public class StringEx {

	public static void main(String[] args) {
		Person person = new Person("john",30);
		
		String a = "john";
		String b = "john";
		if(person.name.equals(a)) {
			System.out.println("맞습니다.");
		}
		else {
			System.out.println("아닙니다.");
		}
		
		if(a.equals(b)) {
			System.out.println("맞습니다.");
		}
		else {
			System.out.println("아닙니다.");
		}
		System.out.println(person.name==a);
		
		}
}
	class Person {
		String name;
		int age;
		
		public Person(String name, int age) {
			this.name = name;
			this.age = age;
			
		}
}
	
