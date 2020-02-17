package com.kh.practice.leap.controller;

import java.util.Calendar;
import java.util.Date;

public class LeapController {

//	������    �����̸�    true, ����̸� false ���� 
//	(����: ������    4��    ����̸鼭, 100��   �����    �ƴϰų�   400��   �� ����    �Ǵ�    ��)

	public boolean isLeapYear(int year) {
		boolean chk = false;
		if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
			chk = true;
		}
		return chk;
	}

//	1��   1��    1�Ϻ���    ���ñ�����   �� ��   ����   ��� 
//	1����� ���� �������� �� ������ �����̸� �� ������ 366����, �� ���̸� 365���� ���� 
//	�ش�    ����    ������    �����̸�   2���� 29�Ϸ�   ����̸�   28�Ϸ�   ���� ����    ��¥    ����    ���� 
//	(31��: 1, 3, 5, 7, 8, 10, 12��/ 
//	30��: 4, 6, 9, 11��)

	public long leapDate(Calendar c) {

		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH)+1;
		int date =  c.get(Calendar.DATE);
		long LeapSum = 0;  // �� �׾ư���
		int dateCount = 0; //�������� ��¥��
		
		// 1. 1����� ~ �۳���� ��¥��
		for (int i = 1; i < year; i++) {
			LeapSum += (isLeapYear(i) ? 366 : 365);
		}
		// 2. ���� ��¥��

		// 2-1) �������� ��¥�� �� �߰�
		
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
		// 2-2) �̹��� �ش��ϱ��� ��¥�� �� �߰�.
		LeapSum += date;
		
		return LeapSum;

	}

}
