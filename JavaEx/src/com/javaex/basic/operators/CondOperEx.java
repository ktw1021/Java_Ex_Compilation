package com.javaex.basic.operators;

public class CondOperEx {

	public static void main(String[] args) {
		int a = 10;
		
		//	a가 짝수면, true, 홀수면 false 출력
		boolean result = a%2==0;
		System.out.println(result);
		String result2 = a%2==0?"짝수":"홀수";
		System.out.println(result2);
		System.out.println(a%2==0?"짝수":"홀수");
		
		int score = 70;
		
		/* score가 80점 이상: GOOD
		   score가 50~80점 : PASS
		   score가 50점 미만: Fail
		*/
		
		String result3 = score >= 80 ? "GOOD" : score >=50 ? "PASS" : "FAIL";
		System.out.println(result3);
		 
		
	}

}
