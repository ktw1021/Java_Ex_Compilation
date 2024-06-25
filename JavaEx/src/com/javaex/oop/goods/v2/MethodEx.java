package com.javaex.oop.goods.v2;

public class MethodEx {

	int i;
	int j;
	
	public MethodEx(int i, int j) {
		this.i=i;
		this.j=j;
		}
	
		public int getSum(int i, int j) {
		
		return i+j;
		}
	

	public static void main(String[] args) {
		MethodEx ai = new MethodEx(1, 2);
		int k = ai.getSum(1, 2);
		
		System.out.println(k);

	}

}
