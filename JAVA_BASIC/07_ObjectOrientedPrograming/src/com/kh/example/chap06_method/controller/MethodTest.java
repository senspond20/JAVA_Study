package com.kh.example.chap06_method.controller;

import com.kh.example.chap05_constructor.model.vo.User;

public class MethodTest {
	// �Ű������� ������ ��ȯ �� ������ ���� ����
	// 1. �Ű����� ���� ��ȯ �� ���� �޼ҵ�
	// 2. �Ű����� ���� ��ȯ �� ���� �޼ҵ�
	// 3. �Ű����� �ְ� ��ȯ �� ���� �޼ҵ�
	// 4. �Ű����� �ְ� ��ȯ �� ���� �޼ҵ�
	
	
	//1. �Ű����� ���� ��ȯ �� ���� �޼ҵ�
	public void method1() {
	// ��ȯ �� X.		�Ű����� X
		System.out.println("�Ű������� ��ȯ �� �Ѵ� ���� �޼ҵ��Դϴ�.");
		return;
	}
	
	
	//2.�Ű����� ���� ��ȯ �� �ִ� �޼ҵ�
	public int method2() {
//This method must return a result of type int	
// ��ȯ���� �ݵ�� int�� �̿��� �Ѵ�.		

	
//		return 0;	
		int i = 10;
		return i;
		
	}
	//3 . �Ű������� �ְ� ��ȯ �� ���� �޼ҵ�
	public void method3(int num1, int num2) {
		// ��ȯ�� X  // ��ȯ��O
		
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		
		int sum = num1 + num2;
//		return;	
	}
	//4 �Ű����� �ְ� ��ȯ �� �ִ� �޼ҵ�
	public int method4(int num1, int num2) {
		return num1 + num2;
	}
	// ��ȭ1. ��ȯ ���� �迭�� ���
	public int[] method5() {
		int[] iArr = {1,2,3,4,5};
		
		for(int i = 0; i < iArr.length;i++) {
			iArr[i] *= 10;
		}
		
		System.out.println("MethodTest iArr: " + iArr);
		return iArr;	
	}
	// ��ȭ2. ��ȯ ���� Ŭ������ ���
	public User method6() {
		User user = new User("user01", "pass01", "�ڽſ�");
		
		System.out.println("MethodTest user : " + user);
		
		return user;
	}
	
	public void compare(int num) {
		{
			
		}
	}
	
	

}
