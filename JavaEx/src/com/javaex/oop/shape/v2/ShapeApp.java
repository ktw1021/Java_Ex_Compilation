package com.javaex.oop.shape.v2;

public class ShapeApp {

	public static void main(String[] args) {
//		Shape s = new Shape();	//	추상 클래스의 직접 객체화는 불가능함. 
		Shape s = new Rectangle(10, 20, 40, 50);
		Circle s1 = new Circle(20, 50, 25);
		Rectangle s2 = new Rectangle(90, 20, 40, 80);
//		Shape p = new Point(5, 10);	-> 불가, 관계 없음.
		Point p = new Point(5, 10);
		
		s.draw();
		
		s1.draw();
		
		s2.draw();
		
		
		System.out.println();
		System.out.println();
		p.draw();
		
		//	Circle, Rectangle => Shape의 서브클래스
		//	Point -> Shape의 서브클래스가 아님(관계가 없다.)
		//	Circle, Rectangle, Point -> Drawable 공통된 인터페이스를 지니고 있다.

		System.out.println();
		System.out.println();
		Drawable objs[] = new Drawable[] {
				s1, s2, p
		};
		
		for (Drawable obj: objs) {
			if (obj instanceof Drawable) {
				//	특정 인스턴스가 Drawable 인터페이스의 구현인가?
				obj.draw();
			}
		}
	}

}
