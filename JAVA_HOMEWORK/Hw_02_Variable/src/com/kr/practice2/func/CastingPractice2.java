package com.kr.practice2.func;

import java.util.Scanner;


//�Ǽ������� ����, ����, ���� �� ������ ������ �Է� �޾� ������ ����� ����ϼ���.
//�� �� ������ ����� ���������� ó���ϼ���.

public class CastingPractice2 {
	public void castingPractice2(){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		float kor = sc.nextFloat();
		
		System.out.print("���� : ");
		float eng = sc.nextFloat();
		
		System.out.print("���� : ");
		float math = sc.nextFloat();
		
		int sum = (int)(kor + eng + math);
		int avr = (int)(sum/3);
		
		System.out.println("���� : " + sum);
		System.out.println("��� : " + avr);
		
		sc.close();
		

		
	}
}
