package com.javaex.ex10;

public class Book {

	private int bookNo;
	private String title;
	private String author;
	private int stateCode;
	
	public Book(int bookNo, String title, String author) {
		this.bookNo=bookNo;
		this.title=title;
		this.author=author;
		stateCode=1;
	}
	
	public int getBookNo() {
		return bookNo;
	}
	public void setBookNo(int bookNo) {
		this.bookNo=bookNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title=title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author=author;
	}
	public void setStateCode(int stateCode) {
		this.stateCode=stateCode;
		stateCode=1;
	}
	public int getStateCode() {
		return stateCode;
	}
	
	public void rent() {
		
		if (stateCode==0) {
			System.out.println("이미 대여된 책입니다.");
			System.out.println();
		}
		else {
		stateCode=0;
		System.out.printf("<%s>이(가) 대여됐습니다.%n",title);
		System.out.println();
		}
	}
	public void rturn() {
		if (stateCode==1) {
			System.out.println("이미 재고가 있는 책입니다.");
			System.out.println();
		}
		else {
			stateCode=1;
			System.out.printf(" <%s>이(가) 반납되었습니다.%n", title);
			System.out.println();
		}
	}
	
	
	public void print() {
		System.out.printf("(%d) 책 제목:<%s> / 작가: %s - 대여 가능:",
						bookNo,title,author);
		if (stateCode==1) {
			System.out.println("O");
			return;
		}
		else if (stateCode==0) {
			System.out.println("X");
			return;
		}
	}
	
}
