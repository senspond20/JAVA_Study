package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Circle;

public class CircleController {
	
	Circle c = new Circle();
	
	public CircleController() { }
	
	private void insertC(int x, int y, int radius) {
		c.setX(x);
		c.setY(y);
		c.setRadius(radius);
	}
	
	public String calcArea(int x, int y, int radius) {
		insertC(x,y,radius);
//		c.setX(x);
//		c.setY(y);
//		c.setRadius(radius);
		
		int result = x * y * radius * radius;	
		// 면적 : PI * 반지름 * 반지름
		return "면적 : " + c.toString() + " /" + Integer.toString(result);
	}
	
	public String calcCircum(int x, int y, int radius) {
		insertC(x,y,radius);
//		c.setX(x);
//		c.setY(y);
//		c.setRadius(radius);
		int result = x * y * radius * 2;
		return "둘레 : " + c.toString() + " /" + Integer.toString(result);	
		// 둘레 : PI * 반지름 * 2
	}

}
