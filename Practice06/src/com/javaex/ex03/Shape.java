package com.javaex.ex03;

public class Shape {
	
	// 1. 필드값 참조하려면 protected로 바꿔줘야 함. 
	// 2. 기본 생성자 만들어줘야 부모님 뵐 수 있음. 
	
	protected String fillColor;
	protected String lineColor;
	

	public Shape() {
	
	}
	
	public Shape(String fillColor, String lineColor) {
		this.fillColor=fillColor;
		this.lineColor=lineColor;
	}
	
	public void setFillColor(String fillColor) {
		this.fillColor=fillColor;
	}
	public void setLineColor(String lineColor) {
		this.lineColor=lineColor;
	}
	
}

