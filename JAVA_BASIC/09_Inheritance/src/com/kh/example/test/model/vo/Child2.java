package com.kh.example.test.model.vo;

public class Child2 extends Parent{
	private String str;

	public Child2() {
		
		// this 생성자느
		// this 레퍼런스 변수는 
		
		// super생성자는 부모의 생성자를 불러오는것이고		
		// super 레퍼런스 변수는 부모의 주소값을 담고 있다.

		// public
		super.ch = 3;
		
		// private 
//		super.num = 4;
		
		// default
		super.dNum = 10;
		
		// 같은 패키지 , 후손
		super.bool = false;
	
	}
	
	// 
	//
	//
	//
	//

	
	public void setStr(String str) {
		this.str = str;
	}
	
	public String getStr() {
		return str;
	}	
	

	public void method1(int a, int b) {
		
		
		for(int i = 0; i < b; i++) {
			
		}
		if(b == 0) {
			
		}else {
			return;
		}
	}
		
}
