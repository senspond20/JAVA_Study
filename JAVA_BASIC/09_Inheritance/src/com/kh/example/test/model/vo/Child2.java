package com.kh.example.test.model.vo;

public class Child2 extends Parent{
	private String str;

	public Child2() {
		
		// this �����ڴ�
		// this ���۷��� ������ 
		
		// super�����ڴ� �θ��� �����ڸ� �ҷ����°��̰�		
		// super ���۷��� ������ �θ��� �ּҰ��� ��� �ִ�.

		// public
		super.ch = 3;
		
		// private 
//		super.num = 4;
		
		// default
		super.dNum = 10;
		
		// ���� ��Ű�� , �ļ�
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
