package com.kh.variable;

public class C_Overflow {  
	public void overflow(){
	   // �����÷ο�
	   byte bNum = 127;
	   bNum = (byte)(bNum + 1);        //bNum+=1;
	   //bNum = bNum + 1 . ����.   
	   System.out.println("bNum : " + bNum);
		/*   // ����÷ο�  
	   byte b = -128;
	   b-=1;  
	   System.out.println(b);*/
	}  
	
	public void calc(){
		int num1 = 1000000;
		int num2 = 700000;
	
		// ���ϱ⸦ �ϴ� ��� �����÷ο찡 �����Ͼ �� �ִ�.
		// int �� ���� �� �ִ� ������ �Ѿ��.
	    //	int result = num1 * num2;
		long result = (long)num1 * num2; // ����ȯ
		              // long�� * int => long��
		System.out.println("��� ��� :" + result);
		//
	}
}
