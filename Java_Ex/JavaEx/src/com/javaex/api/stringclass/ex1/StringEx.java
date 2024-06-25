package com.javaex.api.stringclass.ex1;

import java.util.Arrays;

public class StringEx {

	public static void main(String[] args) {
		
		//	문자열 기본
		stringBasic();
		//	문자열의 다양한 메서드
		usefulMethods();
		//	연습문제
		stringEx();
	}
		
		private static void usefulMethods() {
			System.out.println();
			
			String str = "Java Programming, OOP Programming";
			System.out.println("원본: "+ str);
			//	문자열 길이 확인: .length()
			System.out.println(".length():" + str.length());
			//	인덱스 범위 : 0~.length() =1
			
			//	변환 메서드
			System.out.println("toUpperCase: " +str.toUpperCase());
			System.out.println("toLowerCase: " +str.toLowerCase());
			
			//	검색
			System.out.println("charAt: " +str.charAt(5));	// 5번 인덱스의 글자
			int index = 0;	//	인덱스 저장 변수
			index = str.indexOf("Programming");	//	str 내 "Programming"의 위치 인덱스
			System.out.println("1st search: " + index);
			index += "Programming".length();//검색 시작 위치를 뒤로 이동
			index = str.indexOf("Programming",index);	//	새로운 시작 위치에서 검색
			System.out.println("2nd search: " +index);
			index += "Programming".length(); 	// 검색 시작 위치를 뒤로 이동
			index = str.indexOf("Programming",index);	//	새로운 시작 위치에서 검색
			System.out.println("3rd search: " + index);	//	더이상 검색할 것이 없으면 -1
			//	indexOf로 검색시 찾는 것이 없으면 -1을 반환한다.
			
			index = str.lastIndexOf("Programming");	//	검색을 뒤에서부터 찾기
			System.out.println("lastIndexOf: " + index);
			
			System.out.println("str: "+ str);
			//	부분 문자열 추출: substring
			System.out.println("substring1: "+ str.substring(0));
//			for (int i = 0; i<=str.length(); i++) {
//			System.out.println(str.substring(0,i));	
//			}
			System.out.println("substring2: "+ str.substring(5,22));
			
			//	치환: Replace
			System.out.println("replace: " + str.replace("Programming","Coding"));
			
			
			String str2 = "        Hello     ";
			String str3 = ", Java";
			//	Whitespace(공백, 개행, 탭문자) 지우기
			String str4 = str2.trim(); 		// 화이트 스페이스 지우기
			System.out.println(str4+str3);
			
			//	원본 출력
			System.out.println("원본: "+str);
			//	문자열 데이터는 불변(immutable)이다.
			//	여러 가지 메서드를 통해 변화가 발생했더라도 원본은 유지된다. 
			
			//	구분자로 붠리: split()
			String[] split = str.split(" ");
			//공백문자를 기준으로 문자열을 분리 -> 문자열 배열로 변환
			System.out.println(Arrays.toString(split));
			
			for (String data: split) {
				System.out.println("조각: "+data);
			}
			
			//	문자열 비교 메서드: compareTo
			//	문자열 Unicode 비교
			//	같으면 0, 작으면 음수(-1), 크면 양수(1)
			System.out.println("ABC".compareTo("ABD"));
			
		}
	
		private static void stringBasic() {
			String s1 = "Java"; //	리터럴
			String s2 = new String("Java");	//	메모리에 직접 객체 생성
			String s3 = "Java";	//	리터럴
			
			//	리터럴과 new 객체 생성이 다르게 작동
			System.out.println(s1==s2);	//주소 비교: Literal vs new
			System.out.println(s1==s3);	//Literal vs Literal
			//	리터럴의 경우, 데이터가 같으면 같은 객체로 취급
			
			//	배열을 이용한 String 생성자
			char[] letters = {'J','a','v','a'};
			String s4 = new String(letters);
			System.out.println(s4);
			
			//	.valueOf 메서드 -> 기본 타입을 문자열로 변환
			String s5 = String.valueOf(2024);	//	int -> String
			System.out.println(s5);
		}
		
		public static void stringEx() {
			System.out.println();
		//	1)
		System.out.print("1)");
		String str1 = new String ("aBc");
		String str2;
		str2 = str1.toLowerCase();
		String str3;
		str3 = str2.toUpperCase();
		String str5 = str3.replace("B","b");
		String str4 = str1+str5+str2+str3; 
		
		System.out.print(str1); System.out.print(str5); 
		System.out.print(str2);	System.out.println(str3);
		
		
		//	2) 
		System.out.print("2)");
		System.out.println(str4.charAt(2));
		
		//	3)
		System.out.print("3)");
		System.out.println(str4.indexOf(str2));
		
		//	4)
		System.out.print("4)");
		System.out.println(str4.length());
		//	5)
		System.out.print("5)");
		System.out.println(str4.replace("a", "R"));
		//	6)
		System.out.print("6)");
		System.out.println(str4.replace("abc","123"));
		//	7)
		System.out.print("7)");
		System.out.println(str4.substring(0,3));
		//	8)
		System.out.print("8)");
		System.out.println(str4.toUpperCase());
		}
		
	}

