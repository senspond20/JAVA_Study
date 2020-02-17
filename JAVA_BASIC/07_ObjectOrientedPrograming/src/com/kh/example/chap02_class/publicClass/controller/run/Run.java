package com.kh.example.chap02_class.publicClass.controller.run;

import java.util.Date;

//import com.kh.example.chap02_class.publicClass.controller.publicClassTest;

public class Run {
	public static void main(String[] args) {
		
//		publicClassTest pct = new publicClassTest();
		
		com.kh.example.chap02_class.publicClass.controller.publicClassTest pct 
		= new com.kh.example.chap02_class.publicClass.controller.publicClassTest();
		
		pct.test();
		
		// 패키지는 다른데 이름이 같은 클래스. C+S+O 두개
		Date date = new Date();
		
		// 하나를 import하고  
		java.sql.Date date2 = new java.sql.Date(232);
		
	}
}
