package com.kr.practice1.func;
import java.util.Scanner;

public class VariablePractice1 {
	
	public void variablePractice1() {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("�̸��� �Է� �ϼ��� : ");
	String name = sc.nextLine();
	System.out.print("������ �Է� �ϼ���(��/��) : ");
	char gender = sc.nextLine().charAt(0);
	
	System.out.print("���̸� �Է� �ϼ��� : ");
	int age = Integer.parseInt(sc.nextLine());
	
	System.out.print("Ű�� �Է� �ϼ��� : ");
	int height = Integer.parseInt(sc.nextLine());
	
	System.out.printf("Ű %dcm�� %d�� %c�� %s�� �ݰ����ϴ�.\n", height, age, gender, name);
	
	sc.close();
	
	}
}
