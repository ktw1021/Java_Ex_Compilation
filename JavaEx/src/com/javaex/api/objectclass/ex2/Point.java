package com.javaex.api.objectclass.ex2;

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
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Point) {
//			전달받은 파라미터 obj가 Point 인지 확인
//			Object -> Point로 캐스팅
			Point other = (Point) obj;
			//	두 객체의 동등성:
			//	두 객체의 x 필드가 같고, 두 객체의 y필드가 같아야
			return (x == other.x) && (y == other.y);
		}
		// obj가 Point가 아님
		return super.equals(obj);
		
	}
	
}
