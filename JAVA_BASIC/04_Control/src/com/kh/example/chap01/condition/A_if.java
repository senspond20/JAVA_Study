package com.kh.example.chap01.condition;

import java.util.Scanner;

public class A_if {
		/*
		 * �ܵ� if ��
		 * if(���ǽ�){
		 * 		������ ����;
		 * }
		 * 
		 * ���ǽ��� ��� ���� ��(true)�̸� {} �ȿ� �ִ� �ڵ� ����.
		 * ���ǽ��� ��� ���� ����(false)�̸� {} �ȿ� �ִ� �ڵ�� �����ϰ� �Ѿ.
		 */
	public void method1() {
		// Ű����� �Է��� ���ڰ� ������� �������� ����ϱ�.
		Scanner sc = new Scanner(System.in);

		System.out.print("�����Է� : ");
		int num = sc.nextInt();
	
		if(num  > 0 )			{ System.out.println("����Դϴ�.");  }
		if(num == 0 )			{ System.out.println("0�Դϴ�.");    }
		if(num  < 0 )			{ System.out.println("�����Դϴ�.");  }
		
		System.out.println("���α׷� ����");
		
//		if(num > 0) {
//			System.out.println("����Դϴ�.");
//		}else if(num == 0) {
//			System.out.println("0�Դϴ�.");
//		}else {
//			System.out.println("�����Դϴ�.");
//		}
		
		sc.close();
	}
	
	public void method2() {
		// Ű����� �Է��� ���ڰ� ¦������ Ȧ������ ���
		// '���� �Ѱ��� �Է��ϼ��� : ' �ȳ� ���� ��� �� num������ ������ ����
		// ¦���̸� "�Է��Ͻ� ���ڴ� ¦���Դϴ�.", Ȧ���̸� "�Է��Ͻ� ���ڴ� Ȧ���Դϴ�." ���
		// ���α׷��� ���� �� "���α׷� ����"���� ��� �� ���α׷� ����
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Ѱ��� �Է��ϼ��� : ");
		int num = sc.nextInt();	
		if (num % 2 == 0) {
			System.out.println("�Է��Ͻ� ���ڴ� ¦�� �Դϴ�.");
		}
		
		if (num % 2 == 1) {
			System.out.println("�Է��Ͻ� ���ڴ� Ȧ���Դϴ�.");
		}
		System.out.println("���α׷� ����")	;

		
	}
	public void method12() {
		// Ű����� �Է��� ���ڰ� ������� �������� ����ϱ�.
		Scanner sc = new Scanner(System.in);

		System.out.print("�����Է� : ");
		int num = sc.nextInt();
	
		if		(num  > 0 )		{ System.out.println("����Դϴ�.");  }
		else if (num == 0 )		{ System.out.println("0�Դϴ�.");    }
		else					{ System.out.println("�����Դϴ�.");  }
		
		System.out.println("���α׷� ����");
		
//		if(num > 0) {
//			System.out.println("����Դϴ�.");
//		}else if(num == 0) {
//			System.out.println("0�Դϴ�.");
//		}else {
//			System.out.println("�����Դϴ�.");
//		}
		
		sc.close();
		
		
	}
}
