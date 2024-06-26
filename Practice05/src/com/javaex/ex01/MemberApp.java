package com.javaex.ex01;

public class MemberApp {

public static void main(String[] args) {
		
		Member member1 = new Member("jws","정우성",50000);
		Member member2 = new Member("yjs","유재석",30000);
		Member member3 = new Member("lhl","이효리",40000);
		member1.showInfo();
		member2.showInfo();
		member3.showInfo();
	}
}

