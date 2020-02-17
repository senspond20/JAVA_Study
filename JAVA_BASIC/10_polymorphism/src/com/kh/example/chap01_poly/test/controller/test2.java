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
//	위에처럼 메소드는 StringFunction의 인스턴스에서 접근 가능합니다.

//	ref.takingMethod(new StringFunction() {
//	    public int func(String param) {
//	        // body
//	    }
//	});
//	호출은 이런식으로 하면됩니다.
//
//	또 java 8에서 람다식을 쓰시면
//	ref.takingMethod(매개변수 -> 처리);
//
//	출처: https://hashcode.tistory.com/entry/자바에서-함수포인터를-대체할만한건-뭔가요 [hashcode]*/
}
