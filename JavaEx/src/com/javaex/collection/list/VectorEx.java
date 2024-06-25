package com.javaex.collection.list;

import java.util.Enumeration;
import java.util.Vector;

public class VectorEx {
	
	
	public static void main(String[] args) {
		//	벡터 선언
		//	모든 객체 (Object)를 담을 수 있는 컬렉션 객체
		//	.elementAt 등 참조를 위해서는 실제 클래스로 Casting 해야
		
		Vector v = new Vector();	//	기본 벡터 버퍼 용량 10
		v.addElement(1);
		System.out.println(v);
		System.out.println("Size: "+ v.size() + ", Capacity: "+ v.capacity());
		//	허용량 초과
		for (int i = 0; i<13; i++) {
			//	요소 추가
			v.addElement(i);	// auto boxing 
		}
		System.out.println(v);
		System.out.println("Size: "+ v.size() + ", Capacity: "+ v.capacity());
		
		//	조회: elementAt
		int val = (Integer) v.elementAt(13);
		System.out.println("val[13]: "+ val);
		
		//	역참조(검색)
		//	객체의 인덱스 조회
		System.out.println("index of '5': "+v.indexOf(5));
		System.out.println("index of '20': "+v.indexOf(20));
		//	없는 객체: -1
		
		//	객체 포함 여부: .contains()
		System.out.println(".contains(7): "+v.contains(7));
		System.out.println(".contains(20): "+v.contains(20));
		
		//	객체 삭제: .removeElement()
		System.out.println(".removeElement(1): "+v.removeElement(1));
//		System.out.println(".removeElement(1): "+v.removeElement(1));
		//	한번 삭제할 때마다, 앞에서부터 하나씩만 삭제할 수 있음.
		//	두 개의 1을 삭제하기 위해서는 두 번 실행해야 함.
		System.out.println(v);
		System.out.println(v.size());
		
		for (int j = 0; j<v.size(); j++) {
			Integer item = (Integer)v.elementAt(j);
			System.out.print(item+" ");
		}
		//	컬렉션 프레임워크에서는 루프의 개선이 필요

		System.out.println();System.out.println();
		Enumeration e = v.elements();
		while(e.hasMoreElements()) {
			//	뒤쪽에 요소가 더 있는가?
			Integer item = (Integer) e.nextElement();
			System.out.print(item);
		}
		
		//	TODO: 루프 방식 개선
		System.out.println();
		
		System.out.println("Size: " + v.size() + ", Capacity: "+v.capacity());
		
		//	버퍼 비우기
		v.clear();
		System.out.println(v);
		System.out.println("Size: " + v.size() + ", Capacity: "+v.capacity());
		
		//	Generic을 사용하여 코드 개선 가능
		//	예) Number를 상속한 모든 객체를 담을 수 있는 Generic을 사용
		Vector<? super Number> v2 = new Vector<>();	//	Number 상속받을 클래스만 저장
		v2.addElement(Integer.valueOf(2024));
		v2.addElement(Float.valueOf(3.14159f));
//		v2.addElement("Vector"); 	//	Number만 받기에, String은 받을 수 없음.
		
		System.out.println();System.out.println();
		Enumeration<? super Number> e2 = v2.elements();
		while(e2.hasMoreElements()) {	// 뒤에 요소가 더 있는가?
			System.out.println(e2.nextElement());
		}
	}
	
}
