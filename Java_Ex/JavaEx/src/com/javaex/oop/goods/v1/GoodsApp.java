package com.javaex.oop.goods.v1;

public class GoodsApp {

	public static void main(String[] args) {
		Goods camera = new Goods("nikon",400000);
		//GoodsEx cider = new GoodsEx("나랑드",1000,6);
		System.out.printf("%s is %d", camera.name,camera.price );
		
	}

}
