package com.kr.practice1.func;

import java.util.Scanner;

public class VariablePractice2 {
	public void variablePractice2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù��° ���� : ");
		int sNum = Integer.parseInt(sc.nextLine());
		
		System.out.print("�ι�° ���� : ");
		int eNum = Integer.parseInt(sc.nextLine());
		
		
		System.out.println("���ϱ� ��� : " + (sNum + eNum));
		System.out.println("���� ��� : " +  (sNum - eNum));
		System.out.println("���ϱ� ��� : " + (sNum * eNum));
		System.out.println("������ �� ��� : " + (sNum / eNum));
		
		sc.close();
	}
}
