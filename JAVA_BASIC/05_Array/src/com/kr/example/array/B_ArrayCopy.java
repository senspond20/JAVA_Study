package com.kr.example.array;

import java.util.Arrays;

//import java.util.Arrays;

public class B_ArrayCopy {

	// ���� ���� : �迭�� �ּҸ� ����

	// ���� ���� : ������ ���ο� �迭�� �����Ͽ� ���� ���� �� ����
	// 1) for���� �̿��� 1:1 ����
	// 2) System.arraycopy() �̿��� ����
	// 3) Arrays.CopyOf() �̿��� ����
	// 4) clone() �̿��� ����
	// �ڹ� ��ť��Ʈ ������ ���� clone �޼ҵ�� �ظ��ϸ� �մ��� ����� ����� �ִ�.

	public void method1() {

		int[] originArr = { 1, 2, 3, 4, 5 };
		int[] copyArr = originArr; // ���� ����

		System.out.println("originArr�� �ּҰ� : " + originArr);
		System.out.println("copyArr�� �ּҰ� : " + copyArr);

		for (int i = 0; i < originArr.length; i++) {
			System.out.print(originArr[i] + " ");
		}
		System.out.println();

		for (int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");
		}
		System.out.println();

		// ���� �迭�� 0��° �ε����� 99�� ����
		originArr[0] = 99;

		for (int i = 0; i < originArr.length; i++) {
			System.out.print(originArr[i] + " ");
		}
		System.out.println();

		for (int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");
		}

		System.out.println();

//		System.out.println(Arrays.toString(originArr));	
	}

	public void method2() {
		// ���� ���� 1. for�� �̿�

		int[] originArr = { 1, 2, 3, 4, 5 };
		int[] copyArr = new int[5];

		for (int i = 0; i < originArr.length; i++) {
			copyArr[i] = originArr[i];
		}

//		originArr = null;
		System.out.println(originArr);
		System.out.println(copyArr);
		System.out.println();

		for (int i = 0; i < originArr.length; i++) {
			System.out.print(originArr[i] + " ");
		}
		System.out.println();

		for (int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");
		}
		System.out.println();

		System.out.println("=== originArr�� 0��° �ε����� 99�� ����");
		originArr[0] = 99;

		for (int i = 0; i < originArr.length; i++) {
			System.out.print(originArr[i] + " ");
		}
		System.out.println();

		for (int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");
		}
		System.out.println();

		// 2)

		// 3)

	}
	
	public void method3() {
		// ���� ���� 2: arrayCop() �̿�
		int[] originArr = {1,2,3,4,5};
		int[] copyArr = new int[10];

//							  ������ġ                   ����迭������ġ
//		System.arraycopy(src, srcPos, dest, destPos, length);
//					      �����迭 ,        ����迭                   ���� ����
//		originArr �� �迭�� ��� �����͸� copyArr �迭�� ���縦 �ϴµ�
//		copyArr �� 3 index ���� �ٿ��ְ� ����
		
		System.arraycopy(originArr, 0, copyArr, 3, originArr.length);
		// ��Ʈ�� Ŭ��
		// ��Ʈ�� ����Ʈ t
		
		for (int i = 0; i < originArr.length; i++) {
			System.out.print(originArr[i] + " ");
		}
		System.out.println();

		for (int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");
		}
		System.out.println();
		
//		System.out.println(Arrays.toString(originArr));
//		System.out.println(Arrays.toString(copyArr));
		
	}
	
	public void method4() {
//		 3) Arrays.CopyOf()
		int[] originArr = {1,2,3,4,5};
		int[] copyArr = new int[10];
		
//		double start = System.currentTimeMillis();
		
		System.out.println("====== ó�� =======");
		for(int i = 0; i < originArr.length; i++) {
			System.out.print(originArr[i] + " ");
		}
		System.out.println();
		
		for(int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");
		}
		System.out.println();
		
//		Arrays.copyOf(original, newLength)
//					  ���� �迭		������ ����
		
		// Arrays Ŭ����.( �迭�� ����ҋ� ���Ұ� ���� �޼ҵ带 ��ͳ��� Ŭ����)
		System.out.println(originArr);
		System.out.println(copyArr);
		copyArr = Arrays.copyOf(originArr, originArr.length);
		
		System.out.println("====== ó�� =======");
		for(int i = 0; i < originArr.length; i++) {
			System.out.print(originArr[i] + " ");
		}
		System.out.println();
		
		for(int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");
		}
		System.out.println();
				
		System.out.println(copyArr);
		
//		double end = System.currentTimeMillis();
//		System.out.println(end - start + "ms");
		
	}
	public void method5() {
		
		
		
	}
}
