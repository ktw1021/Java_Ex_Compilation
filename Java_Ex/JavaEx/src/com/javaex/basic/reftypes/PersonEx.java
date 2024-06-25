package com.javaex.basic.reftypes;


public class PersonEx {

	public static void main(String[] args) {
		Person person = new Person("John", 11);
		
		System.out.println(person.name);
		System.out.println(person.age);
		
		Person [] personArray = new Person[10];
		
		int a = 0;
		
		for (int i = 0; i<10; i++) {
			personArray[i] = new Person("John"+i,(int)(Math.random()*10)+1);
			
		do {
				a = 1;
				
					for(int k = 0; k<i; k++) {
						if (personArray[i]==personArray[k]) {
							a = 0;
							break;
							}
					}
				
			} while (a!=1);	// 탈출 조건(a=1이 아닐 때, 즉 a=0일 때)
			System.out.printf("%s... 이 녀석은.. %d살...%n",personArray[i].name,personArray[i].age);
		}
		
		int o = 0;
		
		for (int j = 0; j<personArray.length; j++) {
		
				if (personArray[j].age==1) {
				System.out.printf("%n!? 찾았다. %s.%n",personArray[j].name);
				j=personArray.length;
				o = 1;
				break;
				}
				
				if (o==1) {
				j=personArray.length;
				break;
				}
				
		}
		
		
	}
}
class Person {
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
