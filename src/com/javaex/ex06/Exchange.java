package com.javaex.ex06;

public class Exchange {
	
	private static double rate;
	protected double won;
	protected double dolr;
	
	public static void setRate(double rate) {
		Exchange.rate=rate;
	}
	
	public static void WonToDollor(double won) {
		if (won<0) {
			won=0;
		}
		System.out.printf("%,.1f원은 %,.1f달러입니다.%n",won,won/rate);
		
	}
	
	public static void DollorToWon(double dolr) {
		if (dolr<0) {
			dolr=0;
		}
		System.out.printf("%,.1f달러는 %,.1f원입니다.%n",dolr,dolr*rate);
		
	}
	
}
