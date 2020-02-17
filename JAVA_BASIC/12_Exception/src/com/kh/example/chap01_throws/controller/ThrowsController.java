package com.kh.example.chap01_throws.controller;


public class ThrowsController {
	public void method1() throws Exception{
		
		System.out.println("method1() 호출됨");
		method2();
		System.out.println("mehtod1() 종료됨");
	}
	public void method2() throws Exception  /*throws Exception*/{
		System.out.println("method2() 호출됨");
		method3();
		//Unhandled exception type Exception
		System.out.println("mehtod2() 종료됨");
	}
	
	public void method3() throws Exception{
		System.out.println("method3() 호출됨");
		throw new Exception(); // 강제적으로 Exception 발생
		//Unhandled exception type Exception
		//Unhandled => 다뤄지지 않았다.
		// Exception 타입의 에러가 다뤄지지 않았다. => throws IOException 추가
		
		//System.out.println("mehtod3() 종료됨");
		// + System.out.println("mehtod2() 종료됨");
		// + System.out.println("mehtod1() 종료됨");
		
		// Unreachable code 도달할 수 없는 코드.
		// 에러가 발생하면 비정상종료 나기에 밑의 코드를 읽지않기에 
		// (컴파일 에러)
	}
	
	
	
}
