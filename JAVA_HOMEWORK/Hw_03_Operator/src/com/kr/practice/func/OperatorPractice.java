package com.kr.practice.func;

import java.util.Scanner;

public class OperatorPractice {
//	Ű����� �Է� ���� �ϳ��� ������ ����̸� ������١�, ����� �ƴϸ� ������� �ƴϴ١��� ����ϼ���.
	public void practice1() {
		Scanner sc = new Scanner(System.in);

		System.out.print("���� �ϳ� �Է� : ");
		int num = sc.nextInt();
		System.out.printf("%s", num > 0 ? "����̴�." : "����� �ƴϴ�.");
		sc.close();
	}

	public void practice2() {
//	Ű����� �Է� ���� �ϳ��� ������ ����̸� ������١�,
//	����� �ƴ� ��� �߿��� 0�̸� ��0�̴١�, 0�� �ƴϸ� �������١��� ����ϼ���.
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ϳ� �Է�  : ");
		int num = sc.nextInt();

		String result = ((num > 0) ? "�����." : (num == 0) ? "0�̴�." : "������.");
		System.out.println(result);
		sc.close();
	}

	public void practice3() {
//	Ű����� �Է� ���� �ϳ��� ������ ¦���̸� ��¦���١�, ¦���� �ƴϸ� ��Ȧ���١��� ����ϼ���.
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ϳ� �Է�  : ");
		int num = sc.nextInt();
		System.out.println(num % 2 == 0 ? "¦����." : "Ȧ����.");
		sc.close();
	}

	public void practice4() {
//	��� ����� ������ ���� ������������ �Ѵ�. �ο� ���� ���� ������ Ű����� �Է� �ް�
//	1�δ� �����ϰ� �������� ���� ������ �����ְ� ���� ������ ������ ����ϼ���.
		Scanner sc = new Scanner(System.in);
		System.out.print("�ο� ��  : ");
		int num1 = Integer.parseInt(sc.nextLine());

		System.out.print("������ ��  : ");
		int num2 = sc.nextInt();

		System.out.println("1�δ� ���� ���� : " + num2 / num1);
		System.out.println("���� ���� ���� : " + num2 % num1);
		sc.close();
	}

	public void practice5() {
//	Ű����� �Է� ���� ������ ������ ����ϰ� ����� ���� ���� ȭ�鿡 ����Ͽ� Ȯ���ϼ���.
//	�� �� ������ ��M���̸� ���л�, ��M���� �ƴϸ� ���л����� ��� ó�� �ϼ���.
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		System.out.print("�г�(���ڸ�) : ");
		int grade = sc.nextInt();
		System.out.print("��(���ڸ�) : ");
		int ban = sc.nextInt();
		System.out.print("��ȣ(���ڸ�) : ");
		int id = sc.nextInt();

		sc.nextLine(); // �ٹٲ��� �������ֱ����� (�̰� ������ ��������.)
		System.out.print("����(M/F) : ");
		char ch = sc.nextLine().charAt(0);

		System.out.print("����(�Ҽ����Ʒ� ��°�ڸ�����) : ");
		float score = (float) sc.nextDouble();

		String str = "%d�г� %d�� %d�� %s %c�л��� ������ %.2f�̴�.";
		System.out.printf(str, grade, ban, id, name, (ch == 'M' ? '��' : '��'), score);
		sc.close();
	}

	public void practice6() {
//		���̸� Ű����� �Է� �޾� ���(13�� ����)����, û�ҳ�(13�� �ʰ� ~ 19�� ����)����,
//		����(19�� �ʰ�)���� ����ϼ���.		
		Scanner sc = new Scanner(System.in);
		System.out.print("���̸� �Է� : ");
		int num = sc.nextInt();

		if (num <= 13) {
			System.out.println("���");
		} else if (num > 19) {
			System.out.println("����");
		} else {
			System.out.println("û�ҳ�");
		}

		sc.close();
	}

	public void practice7() {
//	����, ����, ���п� ���� ������ Ű���带 �̿��� ������ �Է� �ް�,
//	�� ���� ���� �հ�(����+����+����)�� ���(�հ�/3.0)�� ���ϼ���.
//	�� ������ ������ ����� ������ �հ� ���θ� ó���ϴµ�
//	�� ���� ������ ���� 40�� �̻��̸鼭 ����� 60�� �̻��� �� �հ�, �ƴ϶�� ���հ��� ����ϼ���
		Scanner sc = new Scanner(System.in);

		System.out.print("���� : ");
		int kor = sc.nextInt();
		System.out.print("���� : ");
		int eng = sc.nextInt();
		System.out.print("���� : ");
		int math = sc.nextInt();

		double avg = (kor + eng + math) / 3.0;
		boolean check = (kor >= 40) && (eng >= 40) && (math >= 40) && (avg >= 60);

		System.out.println(check ? "�հ�" : "���հ�");
		sc.close();
	}

	public void practice8() {
//	�ֹι�ȣ�� �̿��Ͽ� �������� �������� �����Ͽ� ����ϼ���.
		Scanner sc = new Scanner(System.in);
		System.out.print("�ֹι�ȣ�� �Է��ϼ��� (-����): ");
		// 970435-124590
		String str = sc.nextLine();
		char check = str.charAt(7);

		System.out.printf("%s\n", check == '1' || check == '3' ? "����" : "����");
		
		if(check == '1' || check == '3' ) {
			
			System.out.println("����");
		}
		else {
			System.out.println("����");
		}
		sc.close();
	}

	public void practice9() {
//	Ű����� ���� �� ���� �Է� �޾� ���� ����(num1, num2)�� �����ϼ���.
//	�׸��� �� �ٸ� ������ �Է� �޾� �� ���� num1 ���ϰų� num2 �ʰ��̸� true�� ����ϰ�
//	�ƴϸ� false�� ����ϼ���.
//	(��, num1�� num2���� �۾ƾ� ��)

		Scanner sc = new Scanner(System.in);
		System.out.print("����1: ");
		int num1 = sc.nextInt();
		System.out.print("����2: ");
		int num2 = sc.nextInt();
		System.out.print("�Է�: ");
		int num = sc.nextInt();

		boolean check = (num <= num1) || (num > num2);
		System.out.println(check);

		sc.close();
	}

	public void practice10() {
//	3���� ���� Ű����� �Է� �޾� �Է� ���� ���� ��� ������ true, �ƴϸ� false�� ����ϼ���.	
		Scanner sc = new Scanner(System.in);
		System.out.print("�Է�1: ");
		int num1 = sc.nextInt();
		System.out.print("�Է�2: ");
		int num2 = sc.nextInt();
		System.out.print("�Է�3: ");
		int num3 = sc.nextInt();

		boolean check = (num1 == num2) && (num2 == num3) && (num1 == num3);
		System.out.println(check);
		sc.close();
	}

	public void practice11() {
//	A, B, C ����� ������ �Է� �ް� �� ����� ������ �μ�Ƽ�긦 ������ ������ ����Ͽ� ����ϰ�
//	�μ�Ƽ�� ���� �޿��� 3000���� �̻��̸� ��3000 �̻�, �̸��̸� ��3000 �̸����� ����ϼ���.
//	(A ����� �μ�Ƽ��� 0.4, B ����� �μ�Ƽ��� ������, C ����� �μ�Ƽ��� 0.15)
		Scanner sc = new Scanner(System.in);

		System.out.print("A����� ����: ");
		int payA = sc.nextInt();
		System.out.print("B����� ����: ");
		int payB = sc.nextInt();
		System.out.print("C����� ����: ");
		int payC = sc.nextInt();

		double totalA = payA * 1.4;
		double totalB = payB;
		
//		double totalC = payC * 1.15;
		double totalC = payC + payC * 1.15;
		
		System.out.println("A����� ����/���� +a :" + payA + "/" + totalA);
		System.out.println(totalA >= 3000 ? "3000 �̻�" : "3000 �̸�");

		System.out.println("B����� ����/���� +a :" + payB + "/" + totalB);
		System.out.println(totalB >= 3000 ? "3000 �̻�" : "3000 �̸�");

		System.out.println("C����� ����/���� +a :" + payC + "/" + totalC);
		System.out.println(totalC >= 3000 ? "3000 �̻�" : "3000 �̸�");

				
		// �Ҽ��� 2������ �ٲٴ� �ε��Ҽ��� ����� �ϱ� ������ (
		// *1.15�� ����� ����� * 0.15 ����� ���̰� �ִ�.
		// 
		
//		char[] people = {'A','B','C'};
//		int[] pay = {0,0,0};
//		double[] tbonus = {1.4, 1, 1.15};
//		double total;
//		Scanner sc = new Scanner(System.in);
//		
//		for(int index = 0 ; index <3 ; index++) {
//			System.out.print(people[index] + "����� ����: ");
//			pay[index] = sc.nextInt();
//		}
//
//		for(int i = 0 ; i <3 ; i++) {	
//			total = pay[i]*tbonus[i];
//			System.out.println(people[i] + "����� ����/���� +a :" + pay[i] +"/" + total);
//			System.out.println(total >= 3000 ? "3000 �̻�" : "3000 �̸�");
//		}
//		
		sc.close();
	}
}