package com.kh.example.chap02_class.publicClass.controller.run;

import java.util.Date;

//import com.kh.example.chap02_class.publicClass.controller.publicClassTest;

public class Run {
	public static void main(String[] args) {
		
//		publicClassTest pct = new publicClassTest();
		
		com.kh.example.chap02_class.publicClass.controller.publicClassTest pct 
		= new com.kh.example.chap02_class.publicClass.controller.publicClassTest();
		
		pct.test();
		
		// ��Ű���� �ٸ��� �̸��� ���� Ŭ����. C+S+O �ΰ�
		Date date = new Date();
		
		// �ϳ��� import�ϰ�  
		java.sql.Date date2 = new java.sql.Date(232);
		
	}
}
