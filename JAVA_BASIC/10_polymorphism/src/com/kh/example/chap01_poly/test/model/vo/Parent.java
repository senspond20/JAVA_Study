package com.kh.example.chap01_poly.test.model.vo;

public class Parent {
	
	// - x : Int
	// - y : Int
	
	private int x;
	private int y;
	
	public Parent() {}
	public Parent(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}

	public void printParent() {
		System.out.println("�� �θ��");
	}
	
	public void print() {
		System.out.println("�� �θ�� !!!");
	}
	// + Parent()
	// + Paret(x:int ,y :int)
	// + getter / setter
	
}
