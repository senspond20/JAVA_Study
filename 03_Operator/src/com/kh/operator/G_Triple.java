package com.kh.operator;
import java.util.Scanner;

public class G_Triple {
	public void method1() {
	// ���� ������
	// (���ǽ� ?) ��1(��) : ��2(����)
	// �Է��� ������ ������� �ƴ��� �Ǻ�
	// '���� �ϳ� �Է�  : ' �̶�� �ȳ��� ��� �� �Է��� ������ num�� ����
	// ����� "�����" ����� �ƴϸ� "����� �ƴϴ�."
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ϳ� �Է�  : ");
		int num = sc.nextInt();
		
//		System.out.print("������� Ȯ�� : " + ((num >= 0) ? true : false));
//		0�� ����� ������ �ƴѵ�,
		
//		String result = (num > 0) ? "�����." : "����� �ƴϴ�.";
//		��ø ���� ������.
		
		String result = ((num > 0) ? "�����." : (num ==0) ? "0�̴�." : "������.");
		
//		System.out.println(num + " ���ڴ� " + result);
		System.out.printf("%d ���ڴ� %s",num,result);
		sc.close();
	}
	
	public void method2() {
		// �Է��� ������ ¦������ Ȧ������ �Ǻ�;
		// Ȧ���� "Ȧ���Դϴ�." ¦���� "¦���Դϴ�."
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �ϳ� �Է� : ");
		int num = sc.nextInt();
	// 1. �ѹ��� ��ġ��
//		String result = (num % 2 == 1) ? "Ȧ���Դϴ�." : "¦���Դϴ�.";
//		String result = (num % 2 != 0) ? "Ȧ���Դϴ�." : "¦���Դϴ�.";
	// 2. ���ǽĸ� ���λ���
//		boolean bool = num % 2 == 0;	
//		String result = bool ? "¦���Դϴ�." : "Ȧ���Դϴ�.";

// 3. ���ĸ� ���� ����
		int mod = num %2;
		String result = (mod==0)? "¦���Դϴ�." : "Ȧ���Դϴ�.";
		
		System.out.println(result);
		
		System.out.printf("0x%h",0x01|0x20);
		sc.close();
	}
}
