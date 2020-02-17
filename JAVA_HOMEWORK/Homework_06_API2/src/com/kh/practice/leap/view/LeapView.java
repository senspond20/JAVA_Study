package com.kh.practice.leap.view;

import java.util.Calendar;
import java.util.GregorianCalendar;

import com.kh.practice.leap.controller.LeapController;

public class LeapView {
	
	LeapController lc = new LeapController();
	
	// 기본생성자로 이 안에 평년인지 윤년인지, 1년 1월 1일부터 지금 까지 며칠이 지났는지 모두 출력
	public LeapView() {
	
		String strLeap = String.format("%s", lc.isLeapYear(2020) ? "윤년" : "평년");
	
		// 기준일 2020년 1월 13일 *
	    // 부모클래스로 받을수 있다.
		Calendar gc = new GregorianCalendar(2020, 0, 13, 0, 0, 0);
		
		System.out.println("2020년은 " + strLeap + "입니다.");
		System.out.println("총 날짜 수 : " + lc.leapDate(gc));
		
//		System.out.printf(strLeap);
	}

}
