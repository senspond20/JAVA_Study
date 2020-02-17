package com.kh.example.chap04_filed_Controller;

public class A_kindsOfVariable1 { // <== 클래스 영역의 시작 {} 중괄호

	// 생성자
	public A_kindsOfVariable1() {

	}

	// 클래스 영역에 작성하는변수 : 필드
	// == 멤버 변수
	// == 멤버 필드
	// == 전역 변수

	private int globalNum;
	private static int globalNum2;

	// ↓ 매개 변수 : 메소드의 선언부 중 괄호 안에 선언하는 변수.
	public void method1(int num) { // <= 메소드 영역의 시작
		// 메소드 영역에서 작성하는 변수 : 지역변수
		
		// 지역변수는 반드시 초기화가 되어있어야 합니다.
		// The local variable localNum may not have been initialized
		int localNum;

		localNum = 10;

		System.out.println(localNum);

		// 매개변수 : 값을 받아오기에 초기화를 안해도 상관없다.
		System.out.println(num);

		// 매개변수 역시 지역변수의 일종으로 생각함

		System.out.println("");

	}// <== 메소드 영역의 끝

	public void method2() {
		// 이안에서 int num 을 사용할 수 없기에

		// 지역변수는 해당 지역 내에서만 사용 가능하다.
//		System.out.println(localNum);

		// 전역 변수는 클래스 영역내에서니까 사용이 가능하다.
		System.out.println(globalNum);
	}


}// <== 클래스 영역의 끝