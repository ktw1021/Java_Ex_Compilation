package com.javaex.api.objectclass.rectangle;

public class Rectangle {
	private int width;
	private int height;
		
	public Rectangle(int width, int height) {
		this.width=width;
		this.height=height;
	}
	
	public int getArea() {
		return width*height;
	}
	
	public boolean equals(Object obj) {
		if (obj instanceof Rectangle) {
			Rectangle other = (Rectangle) obj;
			return getArea()==other.getArea();
		}
		return super.equals(obj);
	}
}
