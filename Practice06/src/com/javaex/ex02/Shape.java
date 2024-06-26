package com.javaex.ex02;

public class Shape {
	
	/*
	 * 예상 답안:(슈퍼가 없으면 기본생성자를 불러온다고)
	 * 슈퍼가 있으면 슈퍼로 한번 갔다옴. 
	 * 부모 클래스에 super에 맞는 게 있으면, 생략해도 작동함.
	 * 
	 * 생성자 Shape(2) 실행
	 * ===================
	 * 생성자 Triange(0) 실행
	 * ===================
	 * 생성자 Triange(2) 실행
	 * ===================
	 * 생성자 Triange(4) 실행
	 * ===================
	 * 
	 * 실제 정답:
	 * 생성자 Shape(2) 실행
	 * ===================
	 * 생성자 Shape(0) 실행
	 * 생성자 Triange(0) 실행
	 * ===================
	 * 생성자 Shape(2) 실행
	 * 생성자 Triange(2) 실행
	 * ===================
	 * 생성자 Shape(2) 실행
	 * 생성자 Triange(4) 실행
	 * ===================
	 */
	
	private String fillColor;
	private String lineColor;
	
	public Shape() {
		System.out.println("생성자 Shape(0) 실행");
	}
	
	public Shape(String fillColor, String lineColor) {
		this.fillColor=fillColor;
		this.lineColor=lineColor;
		System.out.println("생성자 Shape(2) 실행");
	}
	

}

