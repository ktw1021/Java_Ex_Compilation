package com.javaex.oop.shape.v1;

public class Rectangle extends Shape {
	
	private double width;
	private double height;
	
	public Rectangle(int x, int y, double width, double height) {
		super(x, y);
		this.width=width;
		this.height=height;
	}
	
	@Override
	public void draw() {
		System.out.printf("사각형 [X=%d, y=%d, width=%.1f, height=%.1f, area=%.1f]을 그렸어요.%n", 
				x, y, width, height, area());
	}
	
	@Override
	public double area() {
		double area = width * height;
		System.out.println(area);
		return area;
	}
	
}
