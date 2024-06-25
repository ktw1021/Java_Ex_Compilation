package com.javaex.oop.point.v3;

public class PointApp {

	public static void main(String[] args) {
		
		Point p1 = new Point();
		Point p2 = new Point();
		
		p1.setX(5);
		p1.setY(5);
		
		p2.setX(10);
		p2.setY(23);
		
		//	일반 메서드 호출
		p1.draw();
		p2.draw();
		
		//	getter로 메서드 호출
		p1.draw(p1.getX(),p1.getY());
		p2.draw(p2.getX(),p2.getY());
		
		//	오버로딩된 메서드 호출
		boolean a = true;
		System.out.println("");
		p1.draw(!a);
		p2.draw(true);
		
	}

}
