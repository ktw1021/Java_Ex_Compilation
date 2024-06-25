package com.javaex.api.objectclass.ex1;

//	모든 객체의 최상위 객체는 Object
//	Object 클래스는 객체가 개체로서의 기능을 수행하기 위한 기본적인 기능들을 구현
public class Point extends java.lang.Object {	// extends java.lang.Object 가 생략
	private int x;
	private int y;
	
	public Point (int x, int y) {
		this.x=x;
		this.y=y;
	}
	//	equals : 두 객체의 내부 데이터가 같음을 확인하는 메서드

	
}
