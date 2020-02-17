package com.kr.practice1.func;

import java.util.Scanner;

public class VariablePractice2 {
	public void variablePractice2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수 : ");
		int sNum = Integer.parseInt(sc.nextLine());
		
		System.out.print("두번째 정수 : ");
		int eNum = Integer.parseInt(sc.nextLine());
		
		
		System.out.println("더하기 결과 : " + (sNum + eNum));
		System.out.println("빼기 결과 : " +  (sNum - eNum));
		System.out.println("곱하기 결과 : " + (sNum * eNum));
		System.out.println("나누기 몫 결과 : " + (sNum / eNum));
		
		sc.close();
	}
}
