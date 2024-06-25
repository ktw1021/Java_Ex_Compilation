package com.javaex.oop.staticmember;

public class StaticExApp {

	public static void main(String[] args) {
		
		
		
		StaticEx s1 = new StaticEx();
		StaticEx s2 = new StaticEx();
		StaticEx s3 = new StaticEx();
		
		System.out.println(StaticEx.refCount);
		System.out.println();
		
		s3 = null; 	// 참조 해제	but, 가비지 컬렉터가 언제 삭제할지 모름.
		System.out.println("s3 해제");
		System.out.println(StaticEx.refCount);
		
		System.gc();
		try {
			Thread.sleep(5000);
			System.out.println("refCount: " + StaticEx.refCount);
			
		} catch (Exception e) {
			
		}
		
		
		
	}

}
