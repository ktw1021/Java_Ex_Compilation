package com.javaex.ex01;

public class Member {
	private String name;
	private int point;
	private String id;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		if (point<0) {
			System.out.println("음수 값은 입력이 불가합니다.");
		}
		this.point = point;
	}
	
	public Member(String id, String name, int point) {
		this.id=id;
		this.name=name;
		this.point=point;
	}

	
	public void showInfo() {
		System.out.printf("회원정보: %s(%s), %,d점%n", name, id, point);
	}

}
