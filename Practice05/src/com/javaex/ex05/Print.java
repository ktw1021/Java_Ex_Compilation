package com.javaex.ex05;

public class Print {
	
	private int i;
	private boolean t;
	private double d;
	private String n;
	
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i=i;
	}
	public boolean isT() {
		return t;
	}
	public void setT(boolean t) {
		this.t=t;
	}
	public double getD() {
		return d;
	}
	public void setD(double d) {
		this.d=d;
	}
	public String getN() {
		return n;
	}
	public void setN(String n) {
		this.n=n;
	}
	
	public void print(int i, boolean t, double d, String n) {
		System.out.printf("%d%n"
				+ "%b%n"
				+ "%.1f%n"
				+ "%s"
				, i, t, d, n);
		return;
	}
	
}
