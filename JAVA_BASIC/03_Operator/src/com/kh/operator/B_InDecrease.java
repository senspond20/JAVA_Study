package com.kh.operator;

public class B_InDecrease {
	// ���� ������ : ++, --
	// ++ : 1�� ����
	
	// -- : 1�� ����
	
	// ��++, ��-- : ���� ������  -> �ٸ� �����ں��� ����Ŀ� �� ���.
	// ++��, --��  : ���� ������  -> ������ ����ϰ� �ٸ� ������ ���.
	public void metho1() {
		// ���� ���� ������ �׽�Ʈ
		int num1 = 10;
		System.out.println("���� ���� ������ ���� ��: " + num1);   			//10
		System.out.println("++num1�� 1ȸ ���� �� ��� : "+ (++num1));  	//11
		System.out.println("++num1�� 2ȸ ���� �� ��� : " + (++num1)); 	//12
		System.out.println("++num1�� 3ȸ ���� �� ��� : " + (++num1)); 	//13
		System.out.println("++num1�� 4ȸ ���� �� ��� : " + (++num1)); 	//14
		System.out.println("++num1�� 5ȸ ���� �� ��� : " + (++num1)); 	//15
		System.out.println("���� ���� ���� ���� �� num1�� �� : "+ num1);  		//15
		System.out.println();
		
		// ���� ���� ������ �׽�Ʈ
		int num2 = 10;
		System.out.println("���� ���� ������ ���� ��:" + num2);				//10
		System.out.println("num2++�� 1ȸ ���� �� ��� : " + (num2++));		//10
		System.out.println("num2++�� 2ȸ ���� �� ��� : " + (num2++));		//11
		System.out.println("num2++�� 3ȸ ���� �� ��� : "+ (num2++));		//12
		System.out.println("num2++�� 4ȸ ���� �� ��� : "+ (num2++));		//13
		System.out.println("num2++�� 5ȸ ���� �� ��� : "+ (num2++));		//14
		System.out.println("���� ���� ���� ���� �� num2�� �� : "+ num2);		//15
	}
	
	public void method2() {
		int age = 20;
		
		System.out.println("���� ���̴� ?" + age);  		// 20
		System.out.println("++age��?" + ++age); 		// 21
		System.out.println("age++��?" + age++); 		// 21 --> 22
		System.out.println("--age��?"+ --age);  		// 21
		System.out.println("age--��?"+ age--);  		// 21 --> 20
		System.out.println("���� ���̴�?" + age);  		// 20
	} 
	public void method3() {
		int num1 = 20;
		int result = num1++ *3;  					// 20 * 3 = 60, 20->21
		System.out.println("result :" + result); 	// 60
		System.out.println("num1 :" + num1);        // 21
		
		int num2 = 20;
		int result2 = ++num2 * 3;					// 21 * 3 = 63
		System.out.println("result2 :" + result2);  // 63
		System.out.println("num2 : " + num2);		// 21
	
	}
	
	public void method4() {
		int a = 10;
		int b = 20;
		int c = 30;
		System.out.println(a++);					// 10 , a: 11
		System.out.println((++a) + (b++));  		// 32, 12 + 20, a : 12  b:21
		System.out.println((a++) + (--b)+(--c));	// 61, 12 + 20 + 29 , a: 13, c : 29
		System.out.println("a =" +a);				// 13
		System.out.println("b =" +b);				// 21
		System.out.println("c =" +c);				// 29
	
	}
}
