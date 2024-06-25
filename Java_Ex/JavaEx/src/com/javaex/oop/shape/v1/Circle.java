package com.javaex.oop.shape.v1;

public class Circle extends Shape {
	
	private double radius;
	
	public Circle(int x, int y, double radius) {
		//	부모 생성자 호출
		super(x, y);
		this.radius=radius;
		
	}
	
	//	부모가 선언한 추상 메서드는 반드시 구현해야 한다. 
	@Override
	public void draw() {
		System.out.printf("원 [X=%d, y=%d, r=%.1f, area=%.1f]을 그렸어요.%n", 
							x, y, radius, area());
	}
	
	@Override
	public double area() {
		double area = Math.PI * Math.pow(radius, 2);
		return area;
	}
	
	
}
