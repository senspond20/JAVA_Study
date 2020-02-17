package com.kh.example.chap01.condition;

//import java.io.BufferedReader;
//import java.io.InputStream;
//import java.io.InputStreamReader;
//import java.io.Reader;

import java.util.Scanner;

public class D_Switch {
	// ���ǽ��� ������� case���� ã�� ����� �����ϴ� ���ǹ�
	// �ش��ϴ� ���� case�� ���� ��쿡�� default�� ��ɹ� ����

	// case �� ���๮ ���̿��� �ݷ�(;)�� ����ϸ�
	// break �� ������ ������ �ʰ� ��� ������
	public void method1() {
		// ���� �ΰ��� ���� ��ȣ ���� 1���� �Է� �޾Ƽ�
		// �����ȣ ���ڿ� �ش��ϴ� ����� �����ϰ� ����ϼ���.
		/*
		 * ù��° �� : �ι�° ��: ������(+,-,*,/) :
		 */
		Scanner sc = new Scanner(System.in);
//	BufferedReader rd = new BufferedReader(InputStreamReader(System.in));

		System.out.print("ù��° �� : ");
		int num1 = sc.nextInt();
//		int num1 = Integer.parseInt(sc.nextLine());
		System.out.print("�ι�° �� : ");
		int num2 = sc.nextInt();
		sc.nextLine();

		// �ٹٲ��� �ִ� ���¿��� nextLine���� �ٹٲ��� �������� \n�� �о����⿡
//		int num2 = Integer.parseInt(sc.nextLine());
		System.out.print("������(+,-,*,/) :");
		char oper = sc.nextLine().charAt(0);

		double result = 0.0; // ���� ����� �����س��� ����.
		switch (oper) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			result = (double) num1 / num2;
			break;
		default:
			System.out.println("Error! : �߸��� ���� �Է�");
		}
		System.out.printf("%.2f", result);

	}

	public void method2() {
		// ������ �Է��Ͽ� ����� 1000, �ٳ����� 3000, �����ƴ� 2000, Ű���� 5000
		// ���ϰ��Կ� ���� ������ �Է��������� " �߸� �Է��ϼ̽��ϴ� " ����ϰ� �Ͽ���.
		// ���� �̸��� �Է��ϼ���.
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� : ");
		String fruit = sc.nextLine();

		int price = 0;
		switch (fruit) {
		case "���":
			price = 1000;
			break;
		case "�ٳ���":
			price = 3000;
			break;
		case "������":
			price = 2000;
			break;
		case "Ű��":
			price = 5000;
			break;
		default:
			System.out.println("�߸� �Է��ϼ˽��ϴ�");
			return; // ���� ȣ���� �޼ҵ忡�� ���ư��� ���.
					// �̶� ���� ������ ���ư� �� �ְ�, �ƹ��͵� ���� ���ư� �� ����.
		}
		System.out.println(fruit + " ������" + price + "�� �Դϴ�.");
	}

	public void method3() {
		// ����ڰ� �Է��� �޴� ��ȣ�� ���� �޴��� ��µǰ� �Ͻÿ�.
		/*
		 * 1. ȸ����� 2. ȸ������ 3. ȸ������ �޴� ��ȣ�� �Է��ϼ��� :
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("1. ȸ����� ");
		System.out.println("2. ȸ������  ");
		System.out.println("3. ȸ������  ");
		System.out.print("�޴� ��ȣ�� �Է� �ϼ��� : ");
		int index = sc.nextInt();
		String msg = null;

		switch (index) {
		case 1:
			msg = "ȸ�� ��� �޴��Դϴ�.";
			break;
		case 2:
			msg = "ȸ�� ���� �޴��Դϴ�.";
			break;
		case 3:
			msg = "ȸ�� ���� �޴��Դϴ�.";
			break;
		default:
			System.out.println("�߸� �Է��ϼ̽��ϴ�");
			return;
		}
		System.out.println(msg);
	}

	public void method4() {
		// 1�� ���� 12������ �Է� �޾� �ش��ϴ� ���� ������ ��¥�� ����ϼ���.
		Scanner sc = new Scanner(System.in);
		System.out.print("1~12�� �� �ϳ��� �Է��ϼ��� (����): ");
		int month = sc.nextInt();
		int result;
		switch (month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			result = 31;
			break;
		
		case 2:
			result = 28;
			break;

		case 4: case 6: case 9: case 11: 
			result = 30;
			break;
		default:
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			return;
		}		
		System.out.println("�Է��ϴ� ���� ������ ��¥�� " + result + "�Դϴ�.");
	}
	
	public void method5() {
		// 1�� ���� 12������ �Է� �޾� �ش��ϴ� ���� ������ ��¥�� ����ϼ���.
		int[] monthArray = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("1~12�� �� �ϳ��� �Է��ϼ��� (����): ");
		int month = sc.nextInt();

		try 
		{
			int result = monthArray[month-1];
			System.out.println("�Է��ϴ� ���� ������ ��¥�� " + result + "�Դϴ�.");
		}
		catch(Exception e)
		{
			System.out.println("�߸� �Է��ϼ̽��ϴ�." + e);
		}
	}
}
