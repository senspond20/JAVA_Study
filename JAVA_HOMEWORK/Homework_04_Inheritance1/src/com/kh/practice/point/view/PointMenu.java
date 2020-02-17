package com.kh.practice.point.view;

import java.util.Scanner;

import com.kh.practice.point.controller.CircleController;
import com.kh.practice.point.controller.RectangleController;

import com.kh.practice.point.controller.CircleController;
import com.kh.practice.point.controller.RectangleController;

public class PointMenu {

	Scanner sc = new Scanner(System.in);
	CircleController cc = new CircleController();
	RectangleController rc = new RectangleController();

	public PointMenu() {
	}

	// ==== 메인 메뉴 ====
	public void mainMenu() {
		int menuNum;

		while (true) {
			System.out.println("===== 메뉴 =====");
			System.out.println("1. 원 "); //  circleMenu()
			System.out.println("2. 사각형"); // rectangleMenu()
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");

			menuNum = sc.nextInt();
			sc.nextLine();

			if (menuNum == 9) {
				return;
			} else if (menuNum == 1) {
				circleMenu();
			} else if (menuNum == 2) {
				rectangleMenu();
			}
		}

	}
	// ==== 원 메뉴 ====
	public void circleMenu() {
		System.out.println("===== 원 메뉴 =====");

		System.out.println("1. 원 둘레"); //  calcCircum()
		System.out.println("2. 원 넓이"); // calcCircleArea()
		System.out.println("9. 메인으로");
		System.out.print("메뉴 번호 : ");
		
		int sNum = sc.nextInt();
		sc.nextLine();
		
		if(sNum == 9) {
			return;
		}else if(sNum == 1) {
			calcCircum();
		}else if(sNum == 2) {
			calcCircleArea();
		}else {
			
		}
	}
	// ==== 사각형 메뉴 ====
	public void rectangleMenu() {
		System.out.println("===== 사각형 메뉴 =====");
		System.out.println("1. 사각형 둘레 "); // calcPerimeter()
		System.out.println("2. 사각형 넓이 "); // calcRectArea()
		System.out.println("3. 메인으로");
		System.out.print("메뉴 번호 : ");
		
		int sNum = sc.nextInt();
		sc.nextLine();
		
		if(sNum == 9) {
			return;
		}else if(sNum == 1) {
			calcPerimeter();
		}else if(sNum == 2) {
			calcRectArea();
		}else {
			
		}
	}

	public void calcCircum() {
		System.out.print("x 좌표 : ");
		int x = sc.nextInt();
		System.out.print("y 좌표 : ");
		int y = sc.nextInt();

		System.out.print("반지름 : ");
		int radius = sc.nextInt();
		sc.nextLine();

		String result = cc.calcCircum(x, y, radius);
		System.out.println(result);

		// 데이터를 CircleController(cc)의 calcCircum()의 매개변수로 보내 반환 값 출력

	}

	public void calcCircleArea() {
		System.out.print("x 좌표 : ");
		int x = sc.nextInt();
		System.out.print("y 좌표 : ");
		int y = sc.nextInt();

		System.out.print("반지름 : ");
		int radius = sc.nextInt();
		sc.nextLine();

		String result = cc.calcArea(x, y, radius);
		System.out.println(result);
		
		// 데이터를 CircleController(cc)의 calcArea()의 매개변수로 보내 반환 값 출력
	}

	public void calcPerimeter() {
		System.out.print("x 좌표 : ");
		int x = sc.nextInt();
		System.out.print("y 좌표 : ");
		int y = sc.nextInt();

		System.out.print("높이 : ");
		int height = sc.nextInt();

		System.out.print("너비 : ");
		int width = sc.nextInt();
		sc.nextLine();

		String result = rc.calcPerimeter(x, y, height, width);
		System.out.println(result);

		// 데이터를 RectangleController(rc) calcPerimeter()의 매개변수로 보내 반환값 출력
	}

	public void calcRectArea() {
		System.out.print("x 좌표 : ");
		int x = sc.nextInt();
		System.out.print("y 좌표 : ");
		int y = sc.nextInt();

		System.out.print("높이 : ");
		int height = sc.nextInt();

		System.out.print("너비 : ");
		int width = sc.nextInt();
		sc.nextLine();

		String result = rc.calcArea(x, y, height, width);
		System.out.println(result);

		// 데이터를 RectangleController(rc) calcArea()의 매개변수로 보내 반환값 출력
	}

}
