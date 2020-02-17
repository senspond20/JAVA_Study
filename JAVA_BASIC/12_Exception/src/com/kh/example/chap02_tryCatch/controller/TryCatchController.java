package com.kh.example.chap02_tryCatch.controller;
import java.io.IOException;

public class TryCatchController {
	
	public void method1() {
		System.out.println("method1() 호출됨...");
		try {
			method2();
			System.out.println("예외 발생 시에 출력 될까? ㄴㄴ 출력 안되던데 ㅎ method2에서 예외 발생하니까 catch로 넘어갔음");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();		
			System.out.println(e.getMessage());
			
		} catch (Exception e) { // 혹시라도 발생할 수 있는 Exception
			//e.printStackTrace();
			System.out.println("Exception 으로 잡음");
		} finally { // 
			System.out.println("finally : 예외 발생 여부와 상관없이 무조건 수행됨");
		}
		System.out.println("method1() 종료됨...");
	}
	
	public void method2() throws IOException {
		System.out.println("method2() 호출됨...");
		method3();
		System.out.println("mehtod3() 종료됨...");
	}
	
	public void method3() throws IOException{
		System.out.println("method3() 호출됨 ...");
		throw new IOException("IOException 을 강제로 발생시켰습니다.");
		// 그냥 Exception 은 패키지가 java.lang에 있기에 
		// 별도로 import를 하지 않아도 되지만
		// IOException은 Java.io 안에 있다.
//		System.out.println("method3() 종료됨 ...");	
	}
	
}
