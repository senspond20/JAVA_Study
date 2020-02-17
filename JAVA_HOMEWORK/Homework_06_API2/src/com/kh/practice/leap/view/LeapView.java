package com.kh.practice.leap.view;

import java.util.Calendar;
import java.util.GregorianCalendar;

import com.kh.practice.leap.controller.LeapController;

public class LeapView {
	
	LeapController lc = new LeapController();
	
	// �⺻�����ڷ� �� �ȿ� ������� ��������, 1�� 1�� 1�Ϻ��� ���� ���� ��ĥ�� �������� ��� ���
	public LeapView() {
	
		String strLeap = String.format("%s", lc.isLeapYear(2020) ? "����" : "���");
	
		// ������ 2020�� 1�� 13�� *
	    // �θ�Ŭ������ ������ �ִ�.
		Calendar gc = new GregorianCalendar(2020, 0, 13, 0, 0, 0);
		
		System.out.println("2020���� " + strLeap + "�Դϴ�.");
		System.out.println("�� ��¥ �� : " + lc.leapDate(gc));
		
//		System.out.printf(strLeap);
	}

}
