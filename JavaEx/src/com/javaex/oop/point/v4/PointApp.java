package com.javaex.oop.point.v4;


public class PointApp {

	public static void main(String[] args) {
		Point p = new Point(4,4);
		Point p2 = new Point(10,23);
		
		p.draw();
		p2.draw();
		
		ColorPoint cp1 = new ColorPoint("red");
		cp1.draw();
		ColorPoint cp2 = new ColorPoint(10, 10, "blue");
		cp2.draw(false);
	}

}
