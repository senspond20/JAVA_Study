package com.kh.example.chap02.loop;

import java.util.Scanner;

public class C_DoWhile {
	public void method1() {
		// Ű����� ���ڿ� ���� �Է� �޾� ��� �ݺ� ����
		// ��, exit �� ������ �ݺ� ����
		/*
		 * ���ڿ� �Է� : �ȳ��ϼ���. str : �ȳ��ϼ���
		 * 
		 * ���ڿ� �Է� : apple str : apple
		 * 
		 * ���ڿ� �Է� : exit str : exit
		 */

		Scanner sc = new Scanner(System.in);

//		String str ="";

		// 1. while��
		/*
		 * while(!str.equals("exit"))
		 * 
		 * // java.lang.NullPointerException // null �� ��� ���Ұ��� ���⶧���� ������ �� �� �ִ�. //
		 * String str = null -> String str ="";
		 * 
		 * // while(str !="exit") // ���ڿ��� ���ҋ��� �������̱⿡ == !=���� �����ڸ� ���� �ȵȴ�.
		 * 
		 * { System.out.print("���ڿ� �Է� : "); str = sc.nextLine();
		 * System.out.println("str : " + str); }
		 */

		// 2. do~ while��
		// String str = null; �� ������ �ȳ���.
		// (do �� �ּ� �ѹ��� ������ �����ϱ⿡ str�� null �� ������� �ʴ´�.)

		String str = null;
		do {
			System.out.print("���ڿ� �Է� : ");
			str = sc.nextLine();
			System.out.println("str : " + str);

		} while (!str.equals("exit"));

	}

	public void method2() {
		Scanner sc = new Scanner(System.in);
		int menuNum = 0;
		
		do {
			System.out.println("1. �׽�Ʈ1 ");
			System.out.println("2. �׽�Ʈ2 ");
			System.out.println("3. �׽�Ʈ3 ");
			System.out.println("9. ����");
	
			System.out.print("�޴� ���� : ");
	
			menuNum = sc.nextInt();
	
			switch (menuNum) {
			case 1: System.out.println(1);
				break;
			case 2: System.out.println(2);
				break;
			case 3: System.out.println(3);
				break;
			case 9: System.out.println("����");
				break;
			default: System.out.println("�߸� �Է��ϼ̽��ϴ�."); 
				break;
				}
		} while(menuNum != 9);
		
	}
	
	public void method3() {
		
	}
}
