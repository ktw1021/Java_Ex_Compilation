package com.javaex.ex02;

public class Goods {
	
	/*
	 *  예상 결과:
	 *  String name의 setter가 private으로 되어있음. 수정해야.
	 */
	
	
	private String name;
	private int price;
	
	public Goods() {
		
	}
	
	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void showInfo() {
		System.out.println("상품명:"+name+", 가격:" + price);
	}

}
