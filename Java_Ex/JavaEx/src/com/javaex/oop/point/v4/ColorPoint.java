package com.javaex.oop.point.v4;

public class ColorPoint extends Point {
	
	private String color;
	

	//	생성자
	public ColorPoint(String color) {
		//	생성자 내에서 부모 생성자를 호출하지 않으면 오류가 남.
		super(0,0);	// 부모 생성자 호출
		this.color=color;
	}
	public ColorPoint(int x, int y, String color) {
		super(x,y);	// 부모 생성자 호출
		this.color=color;
	}
	
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color=color;
	}
	
	@Override	// 현재 메서드가 Override인지 확인
	public void draw() {
		System.out.println(color + " 점[x="+ super.getX() +", y=" + getY() + "]을 그렸습니다.");
	}
	@Override
	public void draw(boolean bDraw) {
		String message = String.format("%s 색 [x=%d, y=%d]을 ",color,x,y);
		message += bDraw ? "그렸습니다." : "지웠습니다.";
		System.out.println(message);
	}
}
