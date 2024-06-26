package com.javaex.ex05;

public class PrintApp {

	public static void main(String[] args) {
		Print answer1 = new Print();
		Print answer2 = new Print();
		Print answer3 = new Print();
		Print answer4 = new Print();
		Print answer5 = new Print();
		
		answer1.setI(1);
		answer1.setT(true);
		answer1.setD(1.0);
		answer1.setN("김태원");
		
		answer2.setI(1);
		answer2.setT(true);
		answer2.setD(5.7);
		answer2.setN("최기제");
		
		answer3.setI(5);
		answer3.setT(false);
		answer3.setD(7.8);
		answer3.setN("홍길동");
		
		answer4.setI(10);
		answer4.setT(true);
		answer4.setD(10.7);
		answer4.setN("민경은");
		
		
		answer5.print(answer4.getI(),answer1.isT(),answer2.getD(),answer3.getN());
		
	}

}
