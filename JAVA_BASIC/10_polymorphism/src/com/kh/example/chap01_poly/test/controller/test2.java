package com.kh.example.chap01_poly.test.controller;

import com.kh.example.chap01_poly.test.controller.test.StringFunction;

public class test2 {

	
	public void TT() {
		test tt = new test();
//		int i = 14;
//		tt.takingMethod(new StringFunction()->i);
		
		tt.takingMethod(new StringFunction() {
		    public int func(String param) {
				
		    	return 114;
		        // body
		    }
		});
	}
//	����ó�� �޼ҵ�� StringFunction�� �ν��Ͻ����� ���� �����մϴ�.

//	ref.takingMethod(new StringFunction() {
//	    public int func(String param) {
//	        // body
//	    }
//	});
//	ȣ���� �̷������� �ϸ�˴ϴ�.
//
//	�� java 8���� ���ٽ��� ���ø�
//	ref.takingMethod(�Ű����� -> ó��);
//
//	��ó: https://hashcode.tistory.com/entry/�ڹٿ���-�Լ������͸�-��ü�Ҹ��Ѱ�-������ [hashcode]*/
}
