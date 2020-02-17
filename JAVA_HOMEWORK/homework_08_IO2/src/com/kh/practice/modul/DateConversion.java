package com.kh.practice.modul;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateConversion {

	private Calendar cal;
	private boolean  isCan;
	
	public DateConversion() {}
	
	SimpleDateFormat sft = new SimpleDateFormat("yyyy-MM-dd");

//  문자열 -> Calendar 변환
//	String str = "2020-01-14";
	public Calendar strToCal(String str) {

		Date date = null;
		Calendar cal = Calendar.getInstance();
		try {
			date = sft.parse(str);
			cal.setTime(date);
		} catch (ParseException e) {
			// e.printStackTrace();
			return null;
		}
		return cal;
	}

	// Calendar -> 문자열 변환
	public String calToStr(Calendar c) {
		long time = c.getTimeInMillis();
		Date endDate = new Date(time);
		String fmt = sft.format(endDate);

		return fmt;
	}
}
