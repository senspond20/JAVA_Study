package com.kh.variable;

public class D_Cast {
	public void rule1() {
//		boolean flag  = true; 
		
//		boolean flag2 = 100;
//		boolean �ڷ����� ������ true,false�� �� �� ����(����ȯ ����)
		
//		�����ڵ� 0~65000 
		int num = 'A';
		System.out.println("num : " + num);
		
		char ch = 97;  // ��, ���ͷ� �� ��ü�� ������
		System.out.println("ch : " + ch);
		
//		char ch2 = num; // ����, ������ �������� ������ ũ�⸸ �� ���ִ�.
		
		//char ch = 97, char ch2 = num;
		// �Ȱ��� char�� int������������� �ٸ���.	
		
//		Type mismatch: cannot convert from int to char
//		
		// ���� ����ȯ �ʿ�.
		char ch2 = (char) num;
		System.out.println("ch2 : " + ch2);
		
		int num2 = -97;
		char ch3 = (char)num2;
		System.out.println("ch3 : " + ch3);
		// char�� ����� ������ �� �ֱ� ������
		// ������ ���� ��(����)���� ?�� ���.	
	}
	
	public void rule2() {
		int iNum = 10;
		long lNum = 100;
		
		// int result = iNum + lNum;
		// iNum + lNum -> long �� �Ǵ°ǵ� int���� ����ְڴ� �ϱ⶧���� ����������.
		
		//t) ������ ū �ڷ������� �ڵ� ����ȯ�� �� �� ����ó���� �Ǳ� ������
		//   iNum + lNum �� ����� long�� �� ����
		
		// iNum + lNum �� int result �� ���� �� �� �ִ� ���
		// ��� 1. ���� ����� int�� ���� ����ȯ
		int result = (int)(iNum + lNum);

		// ��� 2. long���� int�� ���� ����ȯ
		int result2 = iNum + (int)lNum;
		
		// ����. ������� �����ϴ� result�� long������ �޴� ���
		long result3 = iNum + lNum;
		
		System.out.println("result : " + result);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
	}
	
	public void rule3() {
		int iNum = 290;
	
		// ������ �ս�

		// 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 | 0 1 0 1 0 0 0   =>
		// 										     0 1 0 1 0 0 0 
		
		// => 0 0 1 0 1 0 0 0
		
		byte bNum = (byte)iNum; 
		
		System.out.println("bNum : " + bNum);
	}
	
}
