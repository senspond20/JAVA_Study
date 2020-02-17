package com.kh.hw.shape.controller;

import com.kh.hw.shape.model.vo.Shape;

public class TriangleController {
	// ��� ����
	private static final int TYPE_NUMBER = 3;

	Shape sp = null;// = new Shape();

	public double calcArea(double height, double width) {
		// �Ű������� �Ѿ�� ���� Shape�� �Ű����� �ִ� �����ڿ� �־�
		// Shape�� �ʵ�� �ʱ�ȭ�ϰ� ���� ������ ���� ���� �� ��ȯ

		double result = height * width;
		sp = new Shape(TYPE_NUMBER, height, width);
		return result;
	}

	public void paintColor(String color) {
		// setter�� ���� �Ű������� �Ѿ�� ������ ����

		if (sp != null) {
			sp.setColor(color);
		}
	}

	public String print() {
		// ���ﰢ���� + s.information()���� �ﰢ���� ���� ����

		return "�ﰢ��" + sp.information();
	}
}