package com.kh.example.chap06_method.run;

import com.kh.example.chap05_constructor.model.vo.User;
import com.kh.example.chap06_method.controller.MethodTest;
import com.kh.example.chap06_method.model.vo.Trainee;

public class Run {
	
	public static void main(String[] args) {
		MethodTest mt = new MethodTest();
//		mt.method1();
		
		int result = mt.method2();
		System.out.println(result);
		
		System.out.println(mt.method4(10, 30));
	
//		int[] arr = new int[1000000];
//		for(int i = 0 ; i < arr.length; i++){
//			arr[i] = (int) ( Math.random() * 1000000 + 1);
//		}
//		Arrays.sort(arr);
		//System.out.println(Arrays.toString(arr));
		
		// ��ȭ 1.
		
		int[] resultArr = mt.method5();
		System.out.println("Run resultArr :" + resultArr);
		
		User us = mt.method6();
		System.out.println("Run  : " + us);
	
		
		Trainee tt = new Trainee("�ڽſ�");
		Trainee t = new Trainee("�ڽſ�",' ',-10);
		
//		t.setName("����");
		tt.setScore(20);
		
		double score = tt.getScore();
		
		// ������ 20���̳׿�
		// ���� ����� �������� 12�� 23��.
		// g���ε� ����ϰ�����?
		// o o o o o o ����� -> G
		tt.setClassRoom('G');

//		System.out.println(t.getName());
		System.out.println(tt.inform());

	}
}
