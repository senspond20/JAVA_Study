package com.kh.example.chap02_Wrapper.controller;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateController {

	public void method1() {
		Date today = new Date();
		
		// ����ð�
		System.out.println(today);
		
		//Returns the number of milliseconds since January 1, 1970, 00:00:00 GMT represented by this Date object.
		System.out.println(today.getTime());
		
		// Long���� �̿��ؼ� Ÿ���� �����ü� �ִ�.
		Date time = new Date(1578917314045L); 
		System.out.println(time);
		
		Date origin = new Date(0L);
		System.out.println(origin);
	
//		Date ������ : 1. �⺻������. 2. long�� �޴� ������
//		Date date = new Date(2020,1,14);
		//The constructor Date(int, int, int) is deprecated		
	}
	public void method2() {
//		Calendar c = new Calendar();
		
		Calendar c = Calendar.getInstance(); // 1���ε� ���� 0 �� ���´�. -> Zero�ε��� ���
		System.out.println(c);
		
		int year = c.get(Calendar.YEAR);
		System.out.println(year);
		
		int month = c.get(Calendar.MONTH) + 1;
		System.out.println(month);
		
		int date = c.get(Calendar.DATE);
		System.out.println(date);
		
		int amPm = c.get(Calendar.AM_PM);
		System.out.println(amPm);  // ������ 0, ���Ĵ� 1
		
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
		// GregionCalendar Ŭ������ Ư�� ��¥ ���� �Է��Ͽ� �����ϴ� ��� ����
		// 2020.6.17
		
		int year = 2020;
		int month = 5;
//		int month = 6;
//		Fri Jul 17 22:00:00 KST 2020
//	    Zero index�����̶�		
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
		
		// SimpleDateFormat Ŭ����
		// 2020-06-17 ������ ���� 22�� 00�� 00�� 
		SimpleDateFormat sft = new SimpleDateFormat("yyyy-MM-dd E����  a HH�� mm�� ss��");
//		SimpleDateFormat sft = new SimpleDateFormat("yyyy-MM-dd ss��");
		
		String fmt = sft.format(endDate);
		System.out.println(fmt);
		
		
	
		
		
	}
	
	
}
