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
		return "사각형 " + sp.information();
	}

//	+calcPerimeter(height:double,
//			width:double) : double
//			모양 타입 번호와 받은
//			매개변수를 매개변수 있
//			는 생성자로 초기화 시킨
//			후 둘레 반환
//			둘레: 너비*2 + 높이*2
//			+calcArea(height:double,
//			width:double) : double
//			모양 타입 번호와 받은
//			매개변수를 매개변수 있
//			는 생성자로 초기화 시킨
//			후 넓이 반환
//			넓이 : 너비 * 높이
//			+paintColor(color:String)
//			: void
//			setter를 이용해 받아온
//			매개변수로 값 변경
//			+print():String 어떤 모양인지와 Shape
//			의 information()메소드의
//			반환 값 합쳐 함께 반환
}
