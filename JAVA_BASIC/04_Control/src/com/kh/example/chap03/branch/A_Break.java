package com.kh.example.chap03.branch;

import java.util.Scanner;

//https://hashcode.co.kr/code_runners

public class A_Break {
	// break���� �ڱ��ڽ��� ������ ���� ����� �ݺ����� ����

	// continue ��
	public void method1() {
		// ���ڿ��� �Է¹޾� ���� ������ ����ϴ� �ݺ� ���α׷�
		// ��, end�� �ԷµǸ� �ݺ� ����
		// do~while ���

		String str = null;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("==== ���ڿ��� �Է¹޾� ���� ������ ����մϴ�. ====");
			System.out.print("���ڿ� �Է� : ");		
			
			str = sc.nextLine();
			if(str.equals("end")){
				System.out.println("���α׷��� �����մϴ�.");
				break;  // break �� �巡���ؼ� Ŀ���� ������ ��� � �ݺ����� ������������ �˷��ش�.
			}
			System.out.println("[" + str + "]" + " ���ڿ��� ���� : " + str.length());
			System.out.println();
			
		} while (true);

	}
	public void method2() {
		// 1���� ����ڿ��� �Է� ���� ���ڱ����� �� ���
		// for�� ���

		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ��� : ");
		int fNum = sc.nextInt();
		
		for(int i = 1 ;/*i <= fNum*/; i++) {
			if(i >= fNum) {
				break;
			}
			sum += i;
		}
		System.out.printf("1���� %d������ �� : %d\n", fNum, sum);
	}
	public void method3() {
		
		
	}
}
