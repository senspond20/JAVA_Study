package com.kh.example.test.model.vo;

public class Parent {
	
	// (private : ���� Ŭ������)
	private int num;
	
	// (default : ���� ��Ű����)
	double	dNum;
	// (protected : ���� ��Ű���� + �Ļ��� Ŭ����)
	protected boolean bool;
	
	// (public : ��ü)
	public char ch;
	

	public void setNum(int num) {
		this.num = num;
	}
	
	
	public int getNum() {
		return num;
	}
	
	
}
