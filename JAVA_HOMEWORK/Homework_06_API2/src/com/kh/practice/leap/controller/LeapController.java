package com.kh.practice.leap.controller;

import java.util.Calendar;
import java.util.Date;

public class LeapController {

//	연도가    윤년이면    true, 평년이면 false 리턴 
//	(윤년: 연도가    4의    배수이면서, 100의   배수가    아니거나   400의   배 수가    되는    해)

	public boolean isLeapYear(int year) {
		boolean chk = false;
		if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
			chk = true;
		}
		return chk;
	}

//	1년   1월    1일부터    오늘까지의   총 날   수를   계산 
//	1년부터 현재 연도까지 각 연도가 윤년이면 총 날수에 366일을, 평 년이면 365일을 더함 
//	해당    현재    연도가    윤년이면   2월을 29일로   평년이면   28일로   더함 월의    날짜    수를    더함 
//	(31일: 1, 3, 5, 7, 8, 10, 12월/ 
//	30일: 4, 6, 9, 11월)

	public long leapDate(Calendar c) {

		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH)+1;
		int date =  c.get(Calendar.DATE);
		long LeapSum = 0;  // 합 쌓아갈것
		int dateCount = 0; //전월까지 날짜수
		
		// 1. 1년부터 ~ 작년까지 날짜수
		for (int i = 1; i < year; i++) {
			LeapSum += (isLeapYear(i) ? 366 : 365);
		}
		// 2. 올해 날짜수

		// 2-1) 전월까지 날짜수 합 추가
		
		for (int i = 1; i < month; i++) {
			switch (i) {
			case 1:	case 3:	case 5:	case 7:	case 8:	case 10: case 12:
				dateCount = 31; break;
			case 4: case 6:	case 9:	case 11:
				dateCount = 30;	break;
			case 2:	dateCount = isLeapYear(year) ? 29 : 28;
				break;
			}
			LeapSum += dateCount;
		}
		// 2-2) 이번월 해당일까지 날짜수 합 추가.
		LeapSum += date;
		
		return LeapSum;

	}

}
