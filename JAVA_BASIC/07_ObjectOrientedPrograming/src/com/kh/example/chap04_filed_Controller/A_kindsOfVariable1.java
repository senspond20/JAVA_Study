package com.kh.example.chap04_filed_Controller;

public class A_kindsOfVariable1 { // <== Ŭ���� ������ ���� {} �߰�ȣ

	// ������
	public A_kindsOfVariable1() {

	}

	// Ŭ���� ������ �ۼ��ϴº��� : �ʵ�
	// == ��� ����
	// == ��� �ʵ�
	// == ���� ����

	private int globalNum;
	private static int globalNum2;

	// �� �Ű� ���� : �޼ҵ��� ����� �� ��ȣ �ȿ� �����ϴ� ����.
	public void method1(int num) { // <= �޼ҵ� ������ ����
		// �޼ҵ� �������� �ۼ��ϴ� ���� : ��������
		
		// ���������� �ݵ�� �ʱ�ȭ�� �Ǿ��־�� �մϴ�.
		// The local variable localNum may not have been initialized
		int localNum;

		localNum = 10;

		System.out.println(localNum);

		// �Ű����� : ���� �޾ƿ��⿡ �ʱ�ȭ�� ���ص� �������.
		System.out.println(num);

		// �Ű����� ���� ���������� �������� ������

		System.out.println("");

	}// <== �޼ҵ� ������ ��

	public void method2() {
		// �̾ȿ��� int num �� ����� �� ���⿡

		// ���������� �ش� ���� �������� ��� �����ϴ�.
//		System.out.println(localNum);

		// ���� ������ Ŭ���� �����������ϱ� ����� �����ϴ�.
		System.out.println(globalNum);
	}


}// <== Ŭ���� ������ ��