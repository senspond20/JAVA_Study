package com.kh.example.test.model.vo;

public class Parent {
	
	// (private : 같은 클래스내)
	private int num;
	
	// (default : 같은 패키지내)
	double	dNum;
	// (protected : 같은 패키지내 + 파생된 클래스)
	protected boolean bool;
	
	// (public : 전체)
	public char ch;
	

	public void setNum(int num) {
		this.num = num;
	}
	
	
	public int getNum() {
		return num;
	}
	
	
}
