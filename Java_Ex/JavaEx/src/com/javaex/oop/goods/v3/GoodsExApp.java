package com.javaex.oop.goods.v3;

public class GoodsExApp {

	public static void main(String[] args) {
		
		GoodsEx notebook = new GoodsEx();
		
		notebook.setName("LG그램");
		notebook.setPrice(900000);
		notebook.setAge(2);
		
		GoodsEx cup = new GoodsEx();
		
		cup.setName("머그컵");
		cup.setPrice(2000);
		cup.setAge(1);
		
		GoodsEx camera = new GoodsEx();
		
		camera.setName("니콘");
		camera.setPrice(400000);
		camera.setAge(3);
		
		
		
		System.out.printf("%s은 %,d원입니다. 나이는 %d세.%n",
				notebook.getName(),notebook.getPrice(),notebook.getAge());
		System.out.printf("%s은 %,d원입니다. 나이는 %d세.%n",
				cup.getName(),cup.getPrice(),cup.getAge());
		System.out.printf("%s은 %,d원입니다. 나이는 %d세.%n",
				camera.getName(),camera.getPrice(),camera.getAge());
		
		System.out.println("");
		
		camera.showInfo(camera.getName(),camera.getPrice(),camera.getAge());
		notebook.showInfo(notebook.getName(),notebook.getPrice(),notebook.getAge());
		cup.showInfo(cup.getName(),cup.getPrice(),cup.getAge());
		
		System.out.println("");
		
		GoodsEx s1 = new GoodsEx("고라니",9000000,3);
		s1.showInfo(s1.getName(), s1.getPrice(), s1.getAge());
		
	}
	

}
