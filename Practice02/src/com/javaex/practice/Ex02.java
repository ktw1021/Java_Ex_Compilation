package com.javaex.practice;

public class Ex02 {

	public static void main(String[] args) {
		/*
		 * 다음 중 switch 문에서 조건식에 넣을 수 있는 데이터 타입은?
	(1) boolean
	(2) char
	(3) byte
	(4) short
	(5) int
	(6) long
	(7) float
	(8) double
	(9) String
		 * 정답: 모두 가능한 것 같음.
		 실제 정답: 
		 * (2) char, (3) byte, (4) short, (5) int, (9) String
		 
		 * 나머지 (1) boolean, (6) long, (7) float, (8) double 타입은
		 * 자바에서 효율성을 위해 switch 문에서 기능 설정 자체를 하지 않았다고 함.
		 
		 * switch는 단일 조건값이 만족하는 경우의 수들마다, 해당하는 작업을 수행하도록 하는 구문.
		 * 몇 가지 경우의 수로 한정될 때 if-else 보다 유용하게 쓰일 수 있음.
		 * 예를 들어, 범위 조건처럼 수많은 경우의 수들이 있으면 if-else가 유용함.
		 * 그렇지 않은 경우는 자바에서 쓰지 못하게 구현해놨다고 함.
		 * 
		 * switch (조건값) {
		 * case (값):
		 * 수행할 작업
		 * break;
		 * .
		 * .
		 * default:
		 * 수행할 작업
		 * break;
		 * }
		 * 
		 * 1. if-else를 쓰는 게 더 자연스럽고 명확한 경우(단 두 가지 경우의 수, 너무 많은 경우의 수),
		 *  -> boolean, (long, float, double)  
		 * 2. 정밀도와 안정성이 떨어지는 경우(소수점), -> float, double
		 * 3. 성능 최적화를 위한 경우(큰 범위) -> long, float, double
		 */
	}

}
