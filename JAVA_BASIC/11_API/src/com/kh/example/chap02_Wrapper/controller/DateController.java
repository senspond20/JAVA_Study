package com.kh.example.chap02_Wrapper.controller;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateController {

	public void method1() {
		Date today = new Date();
		
		// 현재시간
		System.out.println(today);
		
		//Returns the number of milliseconds since January 1, 1970, 00:00:00 GMT represented by this Date object.
		System.out.println(today.getTime());
		
		// Long값을 이용해서 타임을 가져올수 있다.
		Date time = new Date(1578917314045L); 
		System.out.println(time);
		
		Date origin = new Date(0L);
		System.out.println(origin);
	
//		Date 생성자 : 1. 기본생성자. 2. long을 받는 생성자
//		Date date = new Date(2020,1,14);
		//The constructor Date(int, int, int) is deprecated		
	}
	public void method2() {
//		Calendar c = new Calendar();
		
		Calendar c = Calendar.getInstance(); // 1월인데 월이 0 이 나온다. -> Zero인덱스 기반
		System.out.println(c);
		
		int year = c.get(Calendar.YEAR);
		System.out.println(year);
		
		int month = c.get(Calendar.MONTH) + 1;
		System.out.println(month);
		
		int date = c.get(Calendar.DATE);
		System.out.println(date);
		
		int amPm = c.get(Calendar.AM_PM);
		System.out.println(amPm);  // 오전은 0, 오후는 1
		
		int hour = c.get(Calendar.HOUR);
		System.out.println(hour);
		
//		hour = c.get(Calendar.HOUR_OF_DAY);
//		System.out.println(hour);
		int min = c.get(Calendar.MINUTE);
		System.out.println(min);
		
		int sec = c.get(Calendar.SECOND);
		System.out.println(sec);	
	}
	
	public void method3() {
		// GregionCalendar 클래스는 특정 날짜 값을 입력하여 생성하는 기능 제공
		// 2020.6.17
		
		int year = 2020;
		int month = 5;
//		int month = 6;
//		Fri Jul 17 22:00:00 KST 2020
//	    Zero index기준이라		
		int date = 17;
		int hour = 22;
		int min = 0;
		int sec = 0;
		
		
		GregorianCalendar gc = new GregorianCalendar(year,month,date,hour,min,sec);
		long time = gc.getTimeInMillis();
	//	System.out.println(gc);
		
		Date endDate = new Date(time);
		System.out.println(endDate); 
		System.out.println(gc.get(Calendar.YEAR));
		System.out.println(gc.get(Calendar.MONTH) + 1);
		System.out.println(gc.get(Calendar.DATE));
		
		// SimpleDateFormat 클래스
		// 2020-06-17 수요일 오후 22시 00분 00초 
		SimpleDateFormat sft = new SimpleDateFormat("yyyy-MM-dd E요일  a HH시 mm분 ss초");
//		SimpleDateFormat sft = new SimpleDateFormat("yyyy-MM-dd ss초");
		
		String fmt = sft.format(endDate);
		System.out.println(fmt);
		
		
	
		
		
	}
	
	
}
