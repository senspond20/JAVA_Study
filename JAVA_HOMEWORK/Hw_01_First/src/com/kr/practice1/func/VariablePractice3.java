package com.kr.practice1.func;

import java.util.Scanner;

public class VariablePractice3 {
	public void variablePractice3() {
		Scanner sc = new Scanner(System.in);
		double result;
		double result2;
		
		System.out.print("���� : ");
		double width = sc.nextDouble();
		sc.nextLine();
		
		System.out.print("���� : ");
		double height = sc.nextDouble();
		
//		��� ���� ) ���� : ���� * ����
//		�ѷ� : (���� + ����) * 2		
		result = width * height;
		result2 = (width + height) * 2;
		System.out.println("���� : " + result);
		System.out.println("�ѷ� : " + result2);
		
		sc.close();
	}
}
