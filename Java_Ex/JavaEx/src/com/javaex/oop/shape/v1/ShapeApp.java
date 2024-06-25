package com.javaex.oop.shape.v1;

public class ShapeApp {

	public static void main(String[] args) {
//		Shape s = new Shape();	//	추상 클래스의 직접 객체화는 불가능함. 
		Shape s = new Rectangle(10, 20, 40, 50);
		Shape s1 = new Circle(20, 50, 25);
		Shape s2 = new Rectangle(90, 20, 40, 80);
		
		s.draw();
		s.area();
		s1.draw();
		s1.area();
		s2.draw();
		s2.area();
		
	}

}
