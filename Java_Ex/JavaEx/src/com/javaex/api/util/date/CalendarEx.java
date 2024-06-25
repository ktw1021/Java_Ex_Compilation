package com.javaex.api.util.date;

import java.util.Calendar;

public class CalendarEx {

	public static void main(String[] args) {
		//	캘린더 불러오기: new(x), .getInstance()를 통해 확보 가능
		Calendar now = Calendar.getInstance();
		Calendar custom = Calendar.getInstance();
		
		//	시간 정보 수정
		custom.set(2012, 8, 24);	//	2012년 9월 24일(월 정보는 0부터 시작하기 때문)
//		System.out.println("NOW: "+ now);
//		System.out.println("CUSTOM: " + custom);
		
		//	상수를 이용한 날짜 정보 얻어오기
		int nowYear = now.get(Calendar.YEAR);
		System.out.print(nowYear);
		int nowMonth = now.get(Calendar.MONTH);
		System.out.print(nowMonth+1);
		int nowDate = now.get(Calendar.DATE);
		System.out.println(nowDate);
		
		System.out.printf("오늘은 %d년 %d월 %d일 입니다. %n",nowYear,nowMonth+1,nowDate);
		
		Calendar future = Calendar.getInstance();
		//	미래로 여행을 떠나 봅시다. 
		future.add(Calendar.YEAR, 10);	//	현재 날짜 정보에 10년을 더함.
		System.out.printf("10년 후, 오늘은 %d년 %d월 %d일 입니다. %n", 
				future.get(Calendar.YEAR),future.get(Calendar.MONTH)+1,future.get(Calendar.DATE));
		//	요일 정보 확인
		int dow = future.get(Calendar.DAY_OF_WEEK);	//	요일 정보 확인
		System.out.println(dow+", 일요일: 1, 토요일: 7, \n 고로, 2: 월요일");	
		
		
	}

}
