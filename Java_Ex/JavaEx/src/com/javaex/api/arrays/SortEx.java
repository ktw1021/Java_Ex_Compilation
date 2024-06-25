package com.javaex.api.arrays;

import java.util.Arrays;
import java.util.Collections;

//	사용자 정의 클래스를 Sort 하고자 할 때, Comparable 인터페이스를 구현해야 한다. 
class Member implements Comparable {
	String name;
	public Member(String name) {
		this.name=name;
	}
	@Override
	public String toString() {
		return "Member [name=" + name + "]";
	}
	@Override
	public int compareTo(Object o) {	//비교 대상(Member와 Object가 비교 가능한가?)
		//	두 객체의 선후 관계를 비교해서, 
		//	-1, 0, 1 - return
		//	두 객체의 순서가 같으면 0,
		//	비교 대상이 순서가 동일: 0
		//	작은 경우: -1
		//	큰 경우: 1
		if (o instanceof Member) {
			//	Member로 캐스팅 가능
			Member other = (Member)o;
			//	대소 관계의 비교는 name 필드로 비교
			return name.compareTo(other.name);
		}
		
		return 0;
	}
	
}
//	
public class SortEx {

	public static void main(String[] args) {
		//	1. 기본 소팅(정렬)
		
		basicSort();
		
		//	2. 역순 정렬
		
		basicDescSort();
		
		//	3. 사용자 정의 클래스 정렬
		
		customClassSort();
		
		customClassSearch();
		
	}
	
		public static void basicSort() {
			int [] scores = {80, 50, 30, 90, 75, 88, 77};
			System.out.println("배열 원본: "+Arrays.toString(scores));
			Arrays.sort(scores);
			System.out.println("기본 정렬: "+Arrays.toString(scores));
			
			System.out.println();
			
		}
		
		public static void basicDescSort() {
		
		Integer [] scores = {80, 50, 30, 90, 75, 88, 77};	
		//	'객체' 비교형(int는 primitive, 사용 불가)
		System.out.println("배열 원본: "+Arrays.toString(scores));
		
		//	내림차순
		Arrays.sort(scores, 			//	정렬할 배열
				Collections.reverseOrder());
		System.out.println("역순 정렬: "+Arrays.toString(scores));
		//	객체 내부의 Compararator로 객체의 선후 관계를 규정해야 하기 때문에, 
		//	primitive 타입은 역순정렬 될 수 없다. 
		System.out.println();
	}
		public static void customClassSort() {
			//	사용자 정의 클래스의 정렬
			Member[] members = {
					new Member("홍길동"), 
					new Member("고길동"),
					new Member("장길산"),
					new Member("임꺽정")
					};
			System.out.println("월본 배열: "+Arrays.toString(members));
			Arrays.sort(members);
			System.out.println("오름차순 정렬: "+Arrays.toString(members));
			Arrays.sort(members, Collections.reverseOrder());
			System.out.println("내림차순 정렬: "+Arrays.toString(members));
			
			}
		public static void customClassSearch() {
			Member m1 = new Member("홍길동");
			Member m2 =	new Member("고길동");
			Member m3 = new Member("임꺽정");
			Member m4 = new Member("장길산");
			Member [] members = {m1, m2, m3, m4};
			System.out.println();
						System.out.println("원본 배열: "+ Arrays.toString(members));
						//	binarySearch를 위한 정렬
						Arrays.sort(members);
						System.out.println("정렬된 배열: "+Arrays.toString(members));
						
						int index = Arrays.binarySearch(members, m4);
						System.out.println(m4+"의 인덱스: "+index);
			
		}
	}


