package com.kh.variable;

public class A_Variable { // Ŭ����
	public void declareVariable() { // �żҵ�
		// ���� ���� �ʱ�ȭ
		// A. ���� ���� : �ڷ��� ������ ;
		// 1. ����
		boolean isTrue;
		// 2. ������
		// 2-1.����
		char ch;
		// 2-2.���ڿ�
		String str;		
		// 3. ������
		// 3-1. ����
		byte bNum;
		short sNum;
		int   iNum;
		long  lNum;
		// 3-2. �Ǽ�
		float fNum;
		double dNum;
		
		// B. �ʱ�ȭ : ������ = ��; ( = ���� ������)
		isTrue = true;

//		����
	    bNum = 1;   // ����Ʈ ũ�⸸ŭ
		sNum = 2;
		iNum = 4;
		lNum = 8L;  // 8�� ���� int������ �ν��� �� �ֱ⿡ �ִ� �����̴ٰ� L
		
		// fNum = 4.0;
		// Type mismatch: cannot convert from double to float
		//: 4.0 �� �Ǽ��ε� �⺻������ �Ǽ��� double�� �⺻���̱� ������
		//  4.0�� float�� �ƴ� double���� ���� ����
		//  �ٵ� fNum�� �ڷ����� float(4byte)�ε� �ְ����ϴ� ���� 8byte�� double���̱� ������
		//  ū ���� ���� ������ ������� �� ���ٸ鼭 ������ ����
		fNum = 4.0f;  
		dNum = 8.0;  //dNum = 8.0d;
			
		ch = 'A';  // ' �̱� �����̼�
		str = "A"; // " ���� �����̼� (�ѱ��� �̻�)
		
	//	ch = 'adfd';
	//	Invalid character constant
	//  
		System.out.println("========================");
		System.out.println("isTrue�� �� :" + isTrue);
		System.out.println("bNum�� �� :" + bNum);
		System.out.println("sNum�� �� :" + sNum);
		System.out.println("iNum�� �� :" + iNum);
		System.out.println("lNum�� �� :" + lNum);
		System.out.println("fNum�� �� :" + fNum);
		System.out.println("dNum�� �� :" + dNum);
		
		System.out.println("ch�� �� :" + ch);
		System.out.println("str�� ��:" + str);
		System.out.println("=========================");		
	}

	public void initVarialbe()
	{// ���� ����� ���ÿ� �ʱ�ȭ
     // 1. ����
		boolean isTrue = false;
	 // 2. ������
	 // 2-1. ����
		char ch = '��';
	 // 2-2. ���ڿ�
		String str = "KH����������";
	 // 3. ������
	// 3-1. ����	
		byte bNum = 1;
		short sNum = 2;
		int iNum = 4;
		long lNum = 8L;
	// 3-2. �Ǽ�
		float fNum = 4.0f;
		double dNum = 8.0d;			
		
		System.out.println("========================");
		System.out.println("isTrue�� �� : " + isTrue);
		System.out.println("ch�� �� : "+ ch);
		System.out.println("str�� �� :" + str);
		System.out.println("bNum�� �� :" + bNum);
		System.out.println("sNum�� �� :" + sNum);
		System.out.println("iNum�� �� :" + iNum);
		System.out.println("lNum�� �� :" + lNum);
		System.out.println("fNum�� �� :" + fNum);
		System.out.println("dNum�� ��:" + dNum);
		System.out.println("========================");
	
	}
	
	
}
