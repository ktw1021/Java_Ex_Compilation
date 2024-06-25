package com.javaex.oop.goods.v3;

//	v4. this
//	현재 자기 자신의 객체를 의미
//	this() : 현재 클래스 내부의 다른 생성자를 호출할 때 사용
public class GoodsEx {
	// 필드 선언
	// instance 영역
	private String name;	// 상품명 Setter -> instance 영역의 최종 할당 위치(필드)
	private int price;		// 가격
	private int age;		// 나이
	
	public GoodsEx() {
		
	}
	
	//	name 필드 생성자
	public GoodsEx(String name) {
		this.name = name;
		System.out.println("name 필드 초기화 생성자");
	}
	
	public GoodsEx(String name, int price) {
		this.name=name;
		this.price=price;
		System.out.println("name, price 필드 초기화 생성자");
	}
	//	전체 필드 생성자
	public GoodsEx(String name, int price, int age) {
		// name 필드 생성자를 출력
		this(name);
		this.price=price;
		this.age=age;
		System.out.println("전체 필드 초기화 생성자");
	}
	
	//	생성자를 하나도 선언하지 않을 경우
	//	자바 컴파일러가 기본 생성자를 추가
	// Getter Setter
	public String getName() {
		// 메서드 영역
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		if (price < 0) {
			this.price = 0;
		}
		else {
			this.price=price;
		}
			
		
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public void showInfo(String name, int price, int age) {
		System.out.printf("%s은 %,d원입니다. 나이는 %d세.%n",name,price,age);
		return;
	}

}
