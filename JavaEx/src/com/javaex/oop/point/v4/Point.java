package com.javaex.oop.point.v4;

public class Point {
	protected int x;
	protected int y;
	
	public Point() {
		
	}
	
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x=x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y=y;
	}
	
	public void draw() {
		System.out.println("점[x="+x+", y="+y+"]을" +"그렸습니다.");
	}
	//	메서드 오버로딩
	//		boolean bDraw -> true면 그렸습니다. false면 지웠습니다. 
	public void draw(boolean bDraw) {
		String message = String.format("점[x=%d, y=%d]을 ",x,y);
		message += bDraw ? "그렸습니다." : "지웠습니다.";
		System.out.println(message);
	}
	
}
