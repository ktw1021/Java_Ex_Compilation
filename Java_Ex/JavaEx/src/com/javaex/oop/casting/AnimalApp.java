package com.javaex.oop.casting;

public class AnimalApp {

	public static void main(String[] args) {
		
		Animal dog1 = new Dog("Snoopy");
		// 업캐스팅: '부모 타입으로' 자손 객체 new Dog을 참조하는 것.
		//	부모의 것을 자동으로 캐스팅 가능
		//	참조 타입에 설계된 것만 사용할 수 있다. 
		
		dog1.eat();
		dog1.walk();
//		dog1.bark();
		//	설계도(Animal, 부모 타입)에 있는 것만 사용 가능하다.
		//	Animal이 Dog의 것을 자동으로 캐스팅하는 것은 X	
		
		Dog dog2 = new Dog("Doogy");
		dog2.eat();
		dog2.walk();
		dog2.bark();
		//	Dog 설계도에서 물려받은 2개, 자기 설계도 1개, 
		// 	모두 사용 가능함. 
		//	Downcasting : 명시적으로 타입을 지정
		//	dog1을 bark() 하도록 해보자.
		
		((Dog)(dog1)).bark();	//	Animal -> Dog로 캐스팅 후 실행
		
		{
			Dog pet = new Dog("Azi");
			pet.eat();
			pet.walk();
			pet.bark();
			
			pet = null;
			
//			pet = new Cat("아즈라엘");
			//	부모가 아닌 클래스(형제 등)에서는 참조 불가
			
		}
		
		{
			Animal pet = new Dog("Azi");
			pet.eat();
			pet.walk();
//			pet.bark();
			//	현재 pet이 어떤 클래스의 인스턴스인지 확인해야 함.-Animal	
			if (pet instanceof Dog) {	//	Dog의 인스턴스면,
				((Dog)pet).bark();
			}
			else if ( pet instanceof Cat) {	//	Cat이 인스턴스면,
				((Cat)pet).meow();
			}
			pet=null;
			
			pet = new Cat("아즈라엘");
			pet.eat();
			pet.walk();
//			pet.meow();
			if (pet instanceof Dog) {	//	Dog의 인스턴스면,
				((Dog)pet).bark();
			}
			else if ( pet instanceof Cat) {	//	Cat이 인스턴스면,
				((Cat)pet).meow();
			}	
		}
		
		
	}

}
