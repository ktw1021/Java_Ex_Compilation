package com.javaex.ex04;

public class Customer extends User {
	protected int point;
	
	public Customer() {
		
	}
	
	public Customer(int point) {
		this.point=point;
	}
	
	public Customer(String id, String password, String name, int point) {
		super(id, password, name);
		this.point=point;
	}
	
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point=point;
	}
	@Override
	public void showInfo() {
		super.showInfo();
		System.out.printf(", #포인트:%d", point);
	}
	

}
