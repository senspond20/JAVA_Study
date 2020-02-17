package com.kh.example.chap01.condition;
import java.util.Scanner;
//import java.lang.*;  // <-- String �޼ҵ尡 �ִ°�

public class B_ifElse {
	// if-else��
	// if(���ǽ�){
	//		������ ����1;
	// }else{
	//		������ ����2;
	//}
	// �� �� �Ѱ��� �����ϴ� ���ǹ�
	// ���ǽ� ��� ���� ��(true)�̸� if���ȿ� �ִ� ������ ����1 ����
	// ���ǽ� ��� ���� ����(false)�̸� if���� �������� else�� �ȿ� �ִ� ������ ����2 ����

	public void method1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Ѱ��� �Է��ϼ��� : ");
		int num = sc.nextInt();	
		
		if 	(num % 2 == 0) { System.out.println("�Է��Ͻ� ���ڴ� ¦�� �Դϴ�."); }
		else 			   { System.out.println("�Է��Ͻ� ���ڴ� Ȧ�� �Դϴ�.");	}
		
		System.out.println("���α׷� ����")	;
		sc.close();		
	}
	public void method2() {
		// ����ڿ��� ����, ����, ���� ������ �Է� �޾Ƽ� ����  kor, eng, math ������ ����
		// �� ���� ������ 40�� �̻��̰� �� ���� ��� ������ 60�� �̻��϶� "���� ���"
		// �ϳ��� ���� �̴��϶� "���� �����" ���
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ����  : ");
		int kor = sc.nextInt();
		
		System.out.print("���� ����  : ");
		int eng = sc.nextInt();
		
		System.out.print("���� ����  : ");
		int math = sc.nextInt();
		
		double avg = ( kor + eng + math ) / 3.0;  // ����ȯ�� ���� 3�� �ƴ϶� 3.0���� �����ش�.
		
		if(kor >= 40 && eng >= 40 && math >= 40 && avg >= 60){
			System.out.println("���� ���");			
		} else {
			System.out.println("���� �����");
		}	
		sc.close();
	}
	public void method3() {
		// ���ڿ� ���ϱ� : String Ŭ���� �ȿ� �ִ� equals()
		// ����ڿ��� �̸��� �޴µ� ���� ������ �̸��� ������ "�����Դϴ�."
		// ���� ������ "������ �ƴմϴ�."
		// ���ڿ����� ���� ���Ҷ��� == ���� ���� ���� ����.
		// ��ſ�  equals ���ݽ���� �޽����� ����Ѵ�. 
		
		// boolean java.lang.String.equals(Object object);
				
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸��� �Է��ϼ���  : ");
		String name = sc.nextLine();
		
		if(name.equals("�ڽſ�")){
			System.out.println("�����Դϴ�.");
		}else {
			System.out.println("������ �ƴմϴ�.");
		}
		sc.close();
		 
	}
}

