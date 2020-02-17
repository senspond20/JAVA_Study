package com.kh.example.chap04_filed_Controller;

public class B_KindsOfVariable2 {
	
	// 명시적 초기화 -> 연산은 불가능.
	public static int statictestNum;      // static 변수(클래스 변수) -> (프로그램을 시작시에 static 메모리 영역에 올라감)
	public static int statictestNum2;
	public static int statictestSum;
	private int testNum = 10; 			  // instance 변수 -> (객체를 생성할때  heap 메모리 영역에 올라감, 객체 생성이 이루어져야지만 메모리에 올라간다.)
	
	// static 블럭(연산도 가능)
	static {
		statictestSum = statictestNum + statictestNum2;
	}
	
	// instanse 블럭(객체 생성시마다 초기화)
	{
		 testNum  += 1000;
	}
	
	
	// 
	public B_KindsOfVariable2() { // 생성자. 
		testNum++;
		System.out.printf("%s : %d\n", "testNum",  testNum);
		
		statictestNum++;
		System.out.printf("%s : %d\n", "staticNum", statictestNum);
	}
	
	
	public void method1() {
	
		
	}
	
}
