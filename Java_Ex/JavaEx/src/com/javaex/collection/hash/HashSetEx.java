package com.javaex.collection.hash;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;

class Student {
	
	int id;	//	학생 id
	String name;	//	이름
	
	
	//	객체의 동등성 비교를 위한 두 개의 관문
	//	1. hashCode()
	//	2. equals()
	@Override
	public int hashCode() {
		//	해시 함수의 로직: 학번을 기준
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student other = (Student) obj;
			return id == other.id && Objects.equals(name, other.name);
		}
			return super.equals(obj);
		
	}

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
}

public class HashSetEx {

	public static void main(String[] args) {
		//	1. HashSet 사용법 (기본 타입)
		usingHashSet();
		//	2. 집합 연산
		setOperation();
		//	3. HashSet 사용법 (객체 자료형)
		usingHashSetWithCustom();
	}

	public static void usingHashSetWithCustom() {
		
		HashSet <Student> hs = new HashSet<>();
		
		Student s1 = new Student(10,"홍길동");
		Student s2 = new Student(20,"홍길동");
		Student s3 = new Student(30,"길동");
		Student s4 = new Student(30,"길동");
		//	s3와 s4가 이믈도 같고 학번도 같으니
		//	두 객체를 동등 객체로 판정하는 로직을 만들어라
		
		hs.add(s1); hs.add(s2); hs.add(s3); hs.add(s4);
		
		System.out.println("학생부: "+hs);
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		System.out.println(s3.equals(s4));
		
	}
	
	private static void setOperation() {
		//	집합 연산
		HashSet<Integer> numbers = 
			new HashSet <>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		System.out.println("전체집합: "+numbers);
		
		HashSet<Integer> odds = 
			new HashSet<>(Arrays.asList(1, 3, 5, 7, 9));
		System.out.println("홀수집합: "+odds);
		
		HashSet<Integer> evens = 
			new HashSet<>(Arrays.asList(2, 4, 6, 8, 10));
		System.out.println("짝수집합: "+evens);
		
		HashSet<Integer> mThree = 
			new HashSet<>(Arrays.asList(3, 6, 9));
		System.out.println("3의 배수 집합: "+ mThree );
		
		//	교집합: .retainAll
		//	원본 보호를 위해 복제해서 사용
		System.out.println("============= 교집합");
		HashSet<Integer> setA = (HashSet<Integer>)odds.clone();
		HashSet<Integer> setB = (HashSet<Integer>)mThree.clone();
		System.out.println("집합 A는 "+setA);
		System.out.println("집합 B는 "+setB);
		
		setA.retainAll(setB);	//	집합 A 교집합 B = {3, 9}
		System.out.println("교집합: "+ setA);
		System.out.println(setA.equals(new HashSet<Integer>(Arrays.asList(3,9))));
		
		//	합집합: addAll
		System.out.println("============= 합집합");
		setA = (HashSet<Integer>) odds.clone();
		setB = (HashSet<Integer>)evens.clone();
		System.out.println("집합A: "+setA);
		System.out.println("집합B: "+setB);
		
		setA.addAll(setB);	//	집합 A 합집합 집합B
		System.out.println("합집합: "+setA);
		System.out.println("그 합집합은 전체집합과 값이 같은가? "+setA.equals(numbers));
		
		//	차집합: removeAll
		System.out.println();
		System.out.println("============= 차집합");
		setA = (HashSet<Integer>)numbers.clone();
		setB = (HashSet<Integer>)odds.clone();
		System.out.println("전체집합: "+setA);
		System.out.println("홀수집합: "+setB);
		setA.removeAll(setB);	//	집합A - 집합B = 차집합
		System.out.println("차집합: "+setA);
		System.out.println("그 차집합은 짝수집합과 값이 같은가? "+setA.equals(evens));
		
		System.out.println();
		if (numbers.retainAll(odds)) {
			System.out.println("numbers는 " + "odds를 포함한다? "+true);
		}
		
	}
	
	private static void usingHashSet() {
		//	선언
		HashSet<String> hs = new HashSet<>();
		
		//	요소(객체) 추가
		hs.add("Java");
		hs.add("C");
		hs.add("C++");
		hs.add("Python");
		hs.add("Java");
		System.out.println("hs: "+hs);
		System.out.println("size: "+hs.size());
		
		//	특정 객체 포함 여부
		System.out.println("C++ 포함? "+hs.contains("C++"));
		System.out.println("Linux 포함? " + hs.contains("Linux"));
		
		System.out.println("hs: "+hs);
		
		//	순서가 없음: 객체로 삭제하는 방법만 제공
		//	객체 삭제
		hs.remove("C++");
		System.out.println("C++ removed hs: "+hs);
		System.out.println();
	}
}
