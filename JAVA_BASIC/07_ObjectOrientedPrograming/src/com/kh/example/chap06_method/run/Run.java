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
		
		// 심화 1.
		
		int[] resultArr = mt.method5();
		System.out.println("Run resultArr :" + resultArr);
		
		User us = mt.method6();
		System.out.println("Run  : " + us);
	
		
		Trainee tt = new Trainee("박신우");
		Trainee t = new Trainee("박신우",' ',-10);
		
//		t.setName("가영");
		tt.setScore(20);
		
		double score = tt.getScore();
		
		// 시험이 20점이네요
		// 가장 가까운 개강일이 12월 23일.
		// g반인데 등록하겠음ㅇ?
		// o o o o o o 등록함 -> G
		tt.setClassRoom('G');

//		System.out.println(t.getName());
		System.out.println(tt.inform());

	}
}
