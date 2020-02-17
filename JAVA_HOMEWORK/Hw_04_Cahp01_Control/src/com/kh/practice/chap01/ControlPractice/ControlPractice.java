package com.kh.practice.chap01.ControlPractice;
import java.util.Scanner;

public class ControlPractice {

	public void practice1() {
//	�Ʒ� ���ÿ� ���� �޴��� ����ϰ� �޴� ��ȣ�� ������ ��OO�޴��Դϴ١���,
//	���� ��ȣ�� ������ �����α׷��� ����˴ϴ�.���� ����ϼ���.
		Scanner sc = new Scanner(System.in);
		System.out.println("1. �Է�");
		System.out.println("2. ����");
		System.out.println("3. ��ȸ");
		System.out.println("4. ����");
		System.out.println("7. ����");

		System.out.print("�޴� ��ȣ�� �Է��ϼ��� : ");

		int num = sc.nextInt();
		switch (num) {
		case 1:
			System.out.println("�Է� �޴��Դϴ�.");
			break;
		case 2:
			System.out.println("���� �޴��Դϴ�.");
			break;
		case 3:
			System.out.println("��ȸ �޴��Դϴ�.");
			break;
		case 4:
			System.out.println("���� �޴��Դϴ�.");
			break;
		case 7:
			System.out.println("���α׷��� ����˴ϴ�.");
			break;
		default:
		}
		sc.close();
	}

	public void practice2() {
//	Ű����� ������ �Է� ���� ������ ����̸鼭 ¦���� ���� ��¦���١��� ����ϰ�
//	¦���� �ƴϸ� ��Ȧ���١��� ����ϼ���.
//	����� �ƴϸ� ������� �Է����ּ���.���� ����ϼ���.
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();

		if (num > 0) {
			if (num % 2 == 0) {
				System.out.println("¦����.");
			} else {
				System.out.println("Ȧ����.");
			}
		} else {
			System.out.println("����� �Է��ϼ���.");
		}
		sc.close();
	}

	public void practice3() {
//	 ����, ����, ���� �� ������ ������ Ű����� �Է� �ް� �հ�� ����� ����ϰ�
//	 �հ�� ����� �̿��Ͽ� �հ� / ���հ� ó���ϴ� ����� �����ϼ���.
//	 (�հ� ���� : �� ������ ������ ���� 40�� �̻��̸鼭 ����� 60�� �̻��� ���)
//	 �հ� ���� ��� ���� �� ������ �հ�, ���, �������մϴ�, �հ��Դϴ�!���� ����ϰ�
//	 ���հ��� ��쿡�� �����հ��Դϴ�.���� ����ϼ���.

		Scanner sc = new Scanner(System.in);
		System.out.print("���� ���� : ");
		int kor = sc.nextInt();
		System.out.print("���� ���� : ");
		int eng = sc.nextInt();
		System.out.print("���� ���� : ");
		int math = sc.nextInt();

		int sum = (kor + eng + math);
		double avg = sum / 3.0;
		boolean pass = (kor >= 40) && (eng >= 40) && (math >= 40) && (avg >= 60);

		System.out.println("���� : " + kor);
		System.out.println("���� : " + eng);
		System.out.println("���� : " + math);
		System.out.println("�հ� : " + sum);
		System.out.println("��� : " + avg);
		System.out.println(pass);

		sc.close();
	}

	public void practice4() {
// �����ڷ�(7page)���� if������ �Ǿ��ִ� ��, ����, ����, �ܿ� ������ switch������ �ٲ㼭 ����ϼ���.
//		if(month == 1 || month == 2 || month == 12) { 
//			season = "�ܿ�"; 
//			} else if(month >= 3 && month <= 5) { 
//			season = "��"; 
//			} else if(month >= 6 && month <= 8) { 
//			season = "����"; 
//			} else if(month >= 9 && month <= 11) { 
//			season = "����"; 
//			} else { 
//			season = "�ش��ϴ�    ������    �����ϴ�."; 
//			}
		Scanner sc = new Scanner(System.in);

//		String season = "";
		System.out.print("1~12 ������ ���� �Է� : ");
		int month = sc.nextInt();

//		int month = Integer.parseInt(sc.nextLine());
//		System.out.println(month);
//      ���ڿ� ���� season ���� �޾Ƽ��� �־ȵ���?

		switch (month) {
		case 1:
		case 2:
		case 12:
			System.out.println("�ܿ�");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("��");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("����");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("����");
			break;
		default:
			System.out.println(month + "�� �߸��� ���Դϴ�.");

		}
		sc.close();

	}

	public void practice5() {
//	 ���̵�, ��й�ȣ�� ���صΰ� �α��� ����� �ۼ��ϼ���.
//	 �α��� ���� �� ���α��� ������,
//	 ���̵� Ʋ���� �� �����̵� Ʋ�Ƚ��ϴ�.��,
//	 ��й�ȣ�� Ʋ���� �� ����й�ȣ�� Ʋ�Ƚ��ϴ�.���� ����ϼ���.
		String id = "myId";
		String pw = "myPassword12";

		Scanner sc = new Scanner(System.in);

		System.out.print("���̵� : ");
		String inid = sc.nextLine();
		System.out.print("��й�ȣ : ");
		String inpw = sc.nextLine();

//		 boolean ck = inid.equals(id) && inpw.equals(pw);

		if (inid.equals(id) && inpw.equals(pw)) {
			System.out.println("�α��� ����");
		} else {
			if (inid.equals(id)) {
				System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
			}

			if (inpw.equals(pw)) {
				System.out.println("���̵� Ʋ�Ƚ��ϴ�.");
			}
			System.out.println("���/���̵� ��� Ʋ�Ƚ��ϴ�.");
		}

		sc.close();
	}

	public void practice6() {
//	 ����ڿ��� ������, ȸ��, ��ȸ�� �� �ϳ��� �Է� �޾� �� ����� ���� �� �ִ� ������ ����ϼ���.
//	 ��, �����ڴ� ȸ������, �Խñ� ����, �Խñ� �ۼ�, �Խñ� ��ȸ, ��� �ۼ��� �����ϰ�
//	 ȸ���� �Խñ� �ۼ�, �Խñ� ��ȸ, ��� �ۼ��� �����ϰ�
//	 ��ȸ���� �Խñ� ��ȸ�� �����մϴ�.
		Scanner sc = new Scanner(System.in);

		System.out.print("������, ȸ��, ��ȸ�� �� �ϳ��� �Է��ϼ��� : ");
		String str = sc.nextLine();

		if (str.equals("������")) {
			System.out.println("ȸ�� ����, �Խñ� ����, �Խñ� �ۼ�, �Խñ� ��ȸ, ��� �ۼ�");
		} else if (str.equals("ȸ��")) {
			System.out.println("�Խñ� �ۼ�, �Խñ� ��ȸ, ��� �ۼ�");
		} else if (str.equals("��ȸ��")) {
			System.out.println("��ȸ���� �Խñ� ��ȸ�� �����մϴ�.");
		} else {
			System.out.println("�߸� �����ϼ̽��ϴ�.");
		}
		sc.close();

	}

	public void practice7() {
//	 Ű, �����Ը� double�� �Է� �ް� BMI������ ����Ͽ� ��� ����� ����
//	 ��ü��/����ü��/��ü��/���� ����ϼ���.
//	 BMI = ������ / (Ű(m) * Ű(m))
//	 BMI�� 18.5�̸��� ��� ��ü�� / 18.5�̻� 23�̸��� ��� ����ü��
//	 BMI�� 23�̻� 25�̸��� ��� ��ü�� / 25�̻� 30�̸��� ��� ��
//	 BMI�� 30�̻��� ��� �� ��

		Scanner sc = new Scanner(System.in);

		System.out.print("Ű(m)�� �Է��� �ּ��� : ");
		double height = sc.nextDouble();
		System.out.print("������(kg)�� �Է��� �ּ��� : ");
		double weight = sc.nextDouble();

		double BMI = weight / (height * height);
		String str = null;

		if (BMI < 18.5) {
			str = "��ü��";
		} else if (BMI < 23) {
			str = "����ü��";
		} else if (BMI < 25) {
			str = "��ü��";
		} else if (BMI < 30) {
			str = "��";
		} else {
			str = "����";
		}
		System.out.println("BMI ���� : " + BMI);
		System.out.println(str);

		sc.close();
	}

	public void practice8() {
//	 Ű����� �� ���� ������ ���� ��ȣ�� �Է� �޾� ���� ��ȣ�� ���� ���� ����� ����ϼ���.
//	 (��, �� ���� ���� ��� ����� ���� �۵��ϸ� ���� ���� ��ȣ�� �Է� ���� ��
//	 ���߸� �Է��ϼ̽��ϴ�. ���α׷��� �����մϴ�.�� ���)
		Scanner sc = new Scanner(System.in);

		double result = 0;
		boolean ck = false;

		System.out.print("�ǿ����� �Է�1 : ");
		int num1 = sc.nextInt();

		System.out.print("�ǿ����� �Է�2 : ");
		int num2 = sc.nextInt();
		sc.nextLine();

		System.out.print("�����ڸ� �Է� (+,-,*,/,%) : ");
		char oper = sc.nextLine().charAt(0);

		if (num1 > 0 && num2 > 0) {

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
				ck = true;
				break;
			case '%':
				result = num1 % num2;
				break;
			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�. ���α׷��� �����մϴ�.");
				sc.close();
				return;
			}
		} else {
			System.out.println("������� �Է����ּ���.���α׷��� �����ϼ���.");
		}

		if (ck = true)
			System.out.printf("%.6f", result);
		else {
			System.out.printf("%d", result);
		}
		sc.close();
	}

	public void practice9() {
//	 �߰����, �⸻���, ��������, �⼮ȸ���� �Է��ϰ� Pass �Ǵ� Fail�� ����ϼ���.
//	 �� ������ �߰���� 20%, �⸻��� 30%, ���� 30%, �⼮ 20%�� �̷���� �ְ�
//	 �� ��, �⼮ ������ �⼮ ȸ���� �� ���� ȸ�� 20ȸ �߿��� �⼮�� ���� ���� ������ ����ϼ���.
//	 70�� �̻��� ��� Pass, 70�� �̸��̰ų� ��ü ���ǿ� 30% �̻� �Ἦ �� Fail�� ����ϼ���
		Scanner sc = new Scanner(System.in);

		System.out.print("�߰� ��� ���� : ");
		int score1 = sc.nextInt();

		System.out.print("�⸻ ��� ���� : ");
		int score2 = sc.nextInt();

		System.out.print("���� ���� : ");
		int score3 = sc.nextInt();

		System.out.print("�⼮ ȸ�� : ");
		int score4 = sc.nextInt();

		double sc1 = (double) score1 * 0.2;
		double sc2 = (double) score2 * 0.3;
		double sc3 = (double) score3 * 0.3;

		double sum = sc1 + sc2 + sc3 + score4;

		System.out.println("================= ��� =================");

		if ((double) score4 < 20 * 0.7) {
			System.out.printf("Fail [�⼮ ȸ������ (%d/20)]\n", score4);
		} else {

			System.out.println("�߰� ��� ����(20) :" + sc1);
			System.out.println("�⸻ ��� ����(30) :" + sc2);
			System.out.println("���� ���� (30) : " + sc3);
			System.out.println("�⼮ ���� (20) : " + score4);
			System.out.println("���� : " + sum);

			if (sum < 70) {
				System.out.println("Fail [���� �̴�]");
			} else {
				System.out.println("pass");
			}
		}
		sc.close();
	}

	public void practice10() {
//	 �տ� ������ �ǽ������� �����Ͽ� ������ �� �ִ� �޴�ȭ���� �����ϼ���.

		Scanner sc = new Scanner(System.in);

		System.out.println("������ ����� �����ϼ���.");
		System.out.println("1. �޴� ���");
		System.out.println("2. ¦��/Ȧ��");
		System.out.println("3. �հ�/���հ�");
		System.out.println("4. ����");
		System.out.println("5. �α���");
		System.out.println("6. ���� Ȯ��");
		System.out.println("7. BMI");
		System.out.println("8. ����");
		System.out.println("9. P/F");

		System.out.print("���� : ");
		int index = sc.nextInt();

		switch (index) {
		case 1:
			practice1();
			break;
		case 2:
			practice2();
			break;
		case 3:
			practice3();
			break;
		case 4:
			practice4();
			break;
		case 5:
			practice5();
			break;
		case 6:
			practice6();
			break;
		case 7:
			practice7();
			break;
		case 8:
			practice8();
			break;
		case 9:
			practice9();
			break;
		default:
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			break;
		}
		sc.close();

	}

	public void practice11() {

		// ������ �̿��ؼ� 4�ڸ� ��й�ȣ�� ������� �ϴµ�
		// �ߺ� ���� ������ '�ߺ� �� ����'
		// �ڸ����� �� ������ ' �ڸ� �� �� ���� '
		// ��, ���� ���ڸ� ���� ���� 1~9���� ����

		Scanner sc = new Scanner(System.in);

		String password = "";
		boolean check = false;
		
		while (true) {
			
			check = false;
			System.out.print("��� ��ȣ �Է�(1000~9999) : ");
			password = sc.nextLine();

			if (password.length() != 4) {
				System.out.println("�ڸ��� �ȸ���");
				check = true;
				continue;
			}
			
			for(int i = 0; i < password.length(); i++)
			{
				for(int j = 0; j <i; j++)
				{
					if(password.charAt(i) == password.charAt(j))
					{
						System.out.println("�ߺ� �� ����");
						check = true;
						break;
					}
				}
			}
			
			if(check){
				continue;
			}else {
				System.out.println("����");
				break;
			}		

		}
	}
}
