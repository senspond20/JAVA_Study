package com.kr.example.array;

import java.util.Arrays;

public class C_ArraySort {
	
	public void method1() {
		// ������ �� �� �����ϱ�
		
		int num1 = 10;
		int num2 = 20;
		
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		System.out.println();
		
		num1 = num2; // num1 �� 20�� �ǹ��� ���¿���
		num2 = num1; // num2 �� 20�� ��������ϱ�
		
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		System.out.println();
		
		num1 = 10;
		num2 = 20;
		
		int temp = 0; // �ӽ÷� ������ ���� ����.
		temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		System.out.println();
		
		int[] arr = {2, 1, 3};
		
		int temp2;
		if(arr[0] > arr[1])
		{
			temp2 = arr[0];
			arr[0] = arr[1];
			arr[1] = temp2;
		}
	}
	
	public void method2() {
		int[] iArr = {2,5,4,6,1,3};
		
		for(int i = 0; i <iArr.length; i++) {
			System.out.print(iArr[i] + " ");
		}System.out.println();
		
		Arrays.sort(iArr);
		
		for(int i = 0; i <iArr.length; i++) {
			System.out.print(iArr[i] + " ");
		}System.out.println();
	}
}
