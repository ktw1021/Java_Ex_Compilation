package com.javaex.api.util.date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
//		java.sql.Date와 혼동하지 않게 주의.

public class DateEx {

	public static void main(String[] args) {
		//	날짜, 시간 데이터를 표현하는 객체
		//	날짜 관련 기능은 Calander 객체
		Date now = new Date();	//	현재 날짜와 시간
		System.out.println(now);
		
		//	기본 출력
		//	DateFormat 클래스로 기본적인 출력 형식을 맞출 수 있음
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);	//	FULL
		System.out.println("FULL: "+df.format(now));
		DateFormat df2 = DateFormat.getDateInstance(DateFormat.LONG);	//	LONG
		System.out.println("LONG: "+df2.format(now));
		df = DateFormat.getDateInstance(DateFormat.MEDIUM);				//	MEDIUM
		System.out.println("MEDIUM: "+df.format(now));
		df = DateFormat.getDateInstance(DateFormat.SHORT);				//	SHORT
		System.out.println("SHORT: "+df.format(now));
		
		//	Date Format과 Time Format을 이용, 날짜와 시간을 표기
		//	SimpleDateFormat
		SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd / HH:mm:ss");
		System.out.println(sdf.format(now));
	}

}
