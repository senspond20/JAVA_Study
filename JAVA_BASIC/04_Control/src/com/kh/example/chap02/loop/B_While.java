package com.kh.example.chap02.loop;

import java.util.Scanner;

public class B_While {
	/*
	 * while (���ǽ�){ ���๮��; [������ or �б⹮;] // [] �ǹ̴� ������ �� �ִ�. }
	 * 
	 * ���ǽ� Ȯ�� -> (���ǽ� true�϶� ) ���๮�� ���� -> ���ǽ� -> (�ݺ�) ���ǽ� ����� fasle �϶� ����.
	 * 
	 */
	public void method1() {
		// 1���� 5���� ���
		int num = 1;

		while (num <= 5) {
			System.out.println(num + "��° �ݺ��� ����");
			num++;
		}

	}

	public void method2() {
		int i = 1;
		while (i <= 5) {
			System.out.println("�� �̸��� �ڽſ��");
			i++;
		}
	}

	public void method2_1() {
		int i = 5;
		while (i > 0) {
			System.out.println(i + "���");
			i--;
		}
	}

	public void method3() {
		// 1���� 10������ Ȧ���� ���
		int i = 1;
		while (i < 10) {
			if (i % 2 != 0) {
				System.out.println(i + "���");
			}
			i++;
		}
	}

	public void method4() {
		// ���� �ΰ��� �Է� �޾� �� ���� ���� ���
		// ���� �ΰ��� �Է��ϼ���.
		// ��, ù���� ���ڰ� �ι�° ���ں��� �۰� �Է��ϼ���
		// ù��° ���� :
		// �ι�° ���� :
		int max;
		int min;
		Scanner sc = new Scanner(System.in);

		System.out.println("���� �ΰ��� �Է��ϼ���.(��, ù��° ���ڰ� �ι�° ���ں��� �۰� �Է�)");

		System.out.print("ù��° ���� : ");
		int fNum = sc.nextInt();
		System.out.print("�ι�° ���� : ");
		int sNum = sc.nextInt();

//		max = Math.max(sNum, fNum);
//		min = Math.min(sNum, fNum);

		if (fNum < sNum) {
			max = sNum;
			min = fNum;
		} else {
			max = fNum;
			min = sNum;
		}

		while (min <= max) {
			System.out.println(min);
			min++;
		}
	}

	public void method4_1() {
		// ������ �ϳ� �Է� �޾� �� ���� 1~9 ���̚� �� �϶��� �� ���� ������ ���
		// ������ ���� ������ 1~9 ������ ����� �Է��Ͽ��� �մϴ�. ���
		Scanner sc = new Scanner(System.in);
		System.out.print("1 ~ 9 ������ ������ �Է��ϼ���  : ");
		int dan = sc.nextInt();
		int su = 1;

		if (0 < dan && dan < 10) {
			while (su <= 9) {
				System.out.printf("%d * %d = %2d\n", dan, su, dan * su);
				su++;
			}
		} else {
			System.out.println("1~9 ������ ����� �Է��ϼ���");
		}
	}

	public void method5() {
		// 1���� 10������ ������ ������ ���� 1���� ���������� �հ� ���

		int random = (int) (Math.random() * 10 + 1);
		int sNum = 1;
		int sum = 0;

		while (sNum <= random) {
			sum += sNum;
			sNum++;
		}
		System.out.println("1���� " + random + "������ �հ� : " + sum);
	}

	public void method6() {
		// ����ڿ��� ���ڿ��� �Է� �޾� �ε��� ���� ���� ���
		// ���ڿ� �Է� : apple
		// 0 : a
		// 1 : p
		// 2 : p
		// 3 : l
		// 4 : e

		Scanner sc = new Scanner(System.in);
		System.out.print("���ڿ� �Է� : ");
		String str = sc.nextLine();

		// ���ڿ��� ���̸� ��ȯ�ϴ� �޼ҵ� : length()

		int length = str.length();

		// for
		System.out.println("for������");
		for (int index = 0; index < length; index++) {
			System.out.println(index + " : " + str.charAt(index));
		}

		// while
		System.out.println("\nwhile������");
		int i = 0;
		while (i < length) {
			System.out.println(i + " : " + str.charAt(i));
			i++;
		}

		sc.close();
	}

	public void method7() {
		// 2�ܺ��� 9�ܱ��� ���
		int dan = 2;
		int su = 1;

		System.out.println("- 2 ~ 9�ܱ��� ��� -");
		while (dan <= 9) {
			while (su <= 9) {
				System.out.printf("| %d * %d = %2d |\n", dan, su, dan * su);
				su++;
			}
			System.out.println();
			dan++;
			su = 1;
		}
	}

	public void method7_1() {
		int dan = 2;

		System.out.println("- 2 ~ 9�ܱ��� ��� -");
		while (dan <= 9) {
			int su = 1;
			while (su <= 9) {
				System.out.printf("| %d * %d = %2d |\n", dan, su, dan * su);
				su++;
			}
			System.out.println();
			dan++;

		}
	}

	public void method8() {
		// �Ƴ��α� �ð�
		int hour = 0;
		int minute = 0;

		while (hour < 24) {
			minute = 0;

			while (minute < 60) {
				System.out.printf("| %02d��:%02d�� |\n", hour, minute);
				minute++;
			}

			hour++;
		}

	}

	public void method9() {

		int menuNum = 0; //@ 
		Scanner sc = new Scanner(System.in);

		//@
		while (menuNum != 9) { // menuNum �� 0���� �߱⿡. ���� 0������ �ϸ� ������ �ȵȴ�. �׷��� -> do while��
	
			System.out.println("1. 1~5 ���� ���");
			System.out.println("2. 5~1 ���� ���");
			System.out.println("3. 1~10������ Ȧ�� ���");
			System.out.println("9. ����");

			System.out.print("�޴� ���� : ");
			//@
			menuNum = sc.nextInt();
			
			System.out.println();
			
			switch (menuNum) {
			case 1:
				method1();
				break;
			case 2:
				method2();
				break;
			case 3:
				method3();
				break;
			case 9:
				System.out.println("�����մϴ�.");
				break;
			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				break;
			}
			
		}
		
		sc.close();
	}
}
