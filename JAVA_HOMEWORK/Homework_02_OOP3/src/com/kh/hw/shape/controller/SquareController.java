package com.kh.hw.shape.controller;

import com.kh.hw.shape.model.vo.Shape;

public class SquareController {

	private static final int TYPE_NUMBER = 4;

	Shape sp = null;// = new Shape();

	public SquareController() {	}

	public double calcPerimeter(double height, double width) {
		sp = new Shape(TYPE_NUMBER, height, width);
		double result = height * 2 + width * 2;

		return result;
	}

	public double calcArea(double height, double width) {

		double result = height * width;
		sp = new Shape(TYPE_NUMBER, height, width);

		return result;
	}

	public void paintColor(String color) {
		if (sp != null) {
			sp.setColor(color);
		}
	}

	public String print() {
		return "�簢�� " + sp.information();
	}

//	+calcPerimeter(height:double,
//			width:double) : double
//			��� Ÿ�� ��ȣ�� ����
//			�Ű������� �Ű����� ��
//			�� �����ڷ� �ʱ�ȭ ��Ų
//			�� �ѷ� ��ȯ
//			�ѷ�: �ʺ�*2 + ����*2
//			+calcArea(height:double,
//			width:double) : double
//			��� Ÿ�� ��ȣ�� ����
//			�Ű������� �Ű����� ��
//			�� �����ڷ� �ʱ�ȭ ��Ų
//			�� ���� ��ȯ
//			���� : �ʺ� * ����
//			+paintColor(color:String)
//			: void
//			setter�� �̿��� �޾ƿ�
//			�Ű������� �� ����
//			+print():String � ��������� Shape
//			�� information()�޼ҵ���
//			��ȯ �� ���� �Բ� ��ȯ
}
