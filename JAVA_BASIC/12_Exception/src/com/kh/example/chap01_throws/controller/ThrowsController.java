package com.kh.example.chap01_throws.controller;


public class ThrowsController {
	public void method1() throws Exception{
		
		System.out.println("method1() ȣ���");
		method2();
		System.out.println("mehtod1() �����");
	}
	public void method2() throws Exception  /*throws Exception*/{
		System.out.println("method2() ȣ���");
		method3();
		//Unhandled exception type Exception
		System.out.println("mehtod2() �����");
	}
	
	public void method3() throws Exception{
		System.out.println("method3() ȣ���");
		throw new Exception(); // ���������� Exception �߻�
		//Unhandled exception type Exception
		//Unhandled => �ٷ����� �ʾҴ�.
		// Exception Ÿ���� ������ �ٷ����� �ʾҴ�. => throws IOException �߰�
		
		//System.out.println("mehtod3() �����");
		// + System.out.println("mehtod2() �����");
		// + System.out.println("mehtod1() �����");
		
		// Unreachable code ������ �� ���� �ڵ�.
		// ������ �߻��ϸ� ���������� ���⿡ ���� �ڵ带 �����ʱ⿡ 
		// (������ ����)
	}
	
	
	
}
