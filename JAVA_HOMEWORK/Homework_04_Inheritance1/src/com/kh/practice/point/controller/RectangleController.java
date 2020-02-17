package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Rectangle;

public class RectangleController {

	Rectangle r = new Rectangle();

	public RectangleController() {}

	private void insertR(int x, int y, int height, int width) {
		r.setX(x);
		r.setY(y);
		r.setHeight(height);
		r.setWidth(width);
	}
	public String calcArea(int x, int y, int height, int width) {
	
		insertR(x,y,height,width);
		
		int result = width * height;
		// 면적 : 너비 * 높이
		
		return "면적 :" + r.toString() + " /" + Integer.toString(result);
	}
	
	public String calcPerimeter(int x, int y, int height, int width) {
		insertR(x,y,height,width);
		
		// 둘레 : 2 * (너비 + 높이)
		
		int result = 2 * (width + height);
		
		return "둘레 :" + r.toString() + " /" + Integer.toString(result);
	}
			
}
