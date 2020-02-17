package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice {

	// ��
	public void practice1() {
		/*
		 * ����ڷκ��� �� ���� ���� �Է� �޾� 1���� �� ���ڱ����� ���ڵ��� ��� ����ϼ���. ��, �Է��� ���� 1���� ũ�ų� ���ƾ� �մϴ�. ����
		 * 1 �̸��� ���ڰ� �Էµƴٸ� ��1 �̻��� ���ڸ� �Է����ּ��䡰�� ����ϼ���.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("1 �̻��� ���ڸ� �Է��ϼ��� : ");

		int num = sc.nextInt();
//		int sum = 0;

		if (num < 1) {
			System.out.println("1�̻��� ���ڸ� �Է����ּ���");
			sc.close();
			return;
		}

		for (int i = 1; i <= num; i++) {
			// for���ȿ� ������ �ȵȴ�. �� �ΰ�.? -> for(int i = 1; i<=0; i++) ���� for�������ʱ⿡ if���� ������ �ȵ�
//			if (num < 1) {
//				System.out.println("1�̻��� ���ڸ� �Է����ּ���");
//				sc.close();
//				return;
//			}
			System.out.printf("%d ", i);
		}

//		System.out.printf("1���� %d������ �� : %d", num, sum);
		sc.close();

	}

	public void practice2() {
		/*
		 * �� ������ ��� ���� �����ϳ�, 1 �̸��� ���ڰ� �Էµƴٸ� ��1 �̻��� ���ڸ� �Է����ּ��䡱�� ��µǸ鼭 �ٽ� ����ڰ� ���� �Է��ϵ���
		 * �ϼ���.
		 */
		Scanner sc = new Scanner(System.in);

		int num = 0;
//		int sum = 0;

		do {
			System.out.print("1 �̻��� ���ڸ� �Է��ϼ��� : ");
			num = sc.nextInt();

			if (num < 1) {
				System.out.println("1�̻��� ���ڸ� �Է����ּ���");
			}

		} while (num < 1);

		for (int i = 1; i <= num; i++) {
			System.out.printf("%d ", i);
		}

		sc.close();
	}

	public void practice3() {
		// ����ڷκ��� �� ���� ���� �Է� �޾� 1���� �� ���ڱ����� ��� ���ڸ� �Ųٷ� ����ϼ���.
		// ��, �Է��� ���� 1���� ũ�ų� ���ƾ� �մϴ�.

		Scanner sc = new Scanner(System.in);

		System.out.print("�Ѱ��� �����Է� (��, �Է��� ���� 1���� ũ�ų� ���ƾ��մϴ�) : ");
		int num = sc.nextInt();

		if (num < 1) {
			System.out.println("1�̻��� ���ڸ� �Է��Ͽ� �ּ���");
			return;
		}
		System.out.println(num + "���� 1���� ��� ");

		for (int i = num; i >= 1; i--) {

			System.out.println(i);
		}
		sc.close();
	}

	// ��
	public void practice4() {
//	�� ������ ��� ���� �����ϳ�, 1 �̸��� ���ڰ� �Էµƴٸ�
//	��1 �̻��� ���ڸ� �Է����ּ��䡱�� ��µǸ鼭 �ٽ� ����ڰ� ���� �Է��ϵ��� �ϼ���.
		// System.out.println(num + "���� 1���� ��� ");

		Scanner sc = new Scanner(System.in);
		int num = 0;

		do {
			System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
			num = sc.nextInt();
			if (num < 1) {
				System.out.println("1�̻��� ���ڸ� �Է����ּ���.");
			}
		} while (num < 1);

		// System.out.println(num + "���� 1���� ��� ");
		for (int i = num; i >= 1; i--) {
			System.out.printf("%d ", i);
		}
		sc.close();
	}

	// ��
	public void practice5() {
		// 1���� ����ڿ��� �Է� ���� �������� �������� ���� ����ϼ���.
		Scanner sc = new Scanner(System.in);
		String str = "";
		// String str = null; //-> �ȵȴ�.

		System.out.print("������ �Է��ϼ��� : ");
		int num = sc.nextInt();
		int sum = 0;

		for (int i = 2; i <= num; i++) {
			sum += i;
			str = str + '+' + i;
		}

		sum = 1 + sum;
		str = 1 + str;

		System.out.println(str + "=" + sum);
		// System.out.println("1���� " + num + "������ ���� " + sum + "�Դϴ�.");
		sc.close();
	}

// ��
	public void practice6() {
//	����ڷκ��� �� ���� ���� �Է� �޾� �� ������ ���ڸ� ��� ����ϼ���.
//	���� 1 �̸��� ���ڰ� �Էµƴٸ� ��1 �̻��� ���ڸ� �Է����ּ��䡰�� ����ϼ���.

		Scanner sc = new Scanner(System.in);

		System.out.print("������ �Է�1 : ");
		int num1 = sc.nextInt();
		System.out.print("������ �Է�2 : ");
		int num2 = sc.nextInt();

		int min = 0;
		int max = 0;

		if (num1 < 1 || num2 < 1) {
			System.out.println("1�̻��� ���ڸ��Է����ּ���");
			sc.close();
			return;
		}

		if (num1 > num2) {
			max = num1;
			min = num2;
		} else {
			max = num2;
			min = num1;
		}
		for (int i = min; i <= max; i++) {
			System.out.printf("%d ", i);
		}

		sc.close();

	}

// ��
	public void practice7() {
//	�� ������ ��� ���� �����ϳ�, 1 �̸��� ���ڰ� �Էµƴٸ�
//	��1 �̻��� ���ڸ� �Է����ּ��䡱�� ��µǸ鼭 �ٽ� ����ڰ� ���� �Է��ϵ��� �ϼ���.
		int num1 = 0;
		int num2 = 0;
		int min = 0;
		int max = 0;

		boolean ck = false;

		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("������ �Է�1 : ");
			num1 = sc.nextInt();
			System.out.print("������ �Է�2 : ");
			num2 = sc.nextInt();

			ck = (num1 < 1) || (num2 < 1);

			if (ck) {
				System.out.println("1�̻��� ���ڸ��Է����ּ���");
				continue;
			}
			if (num1 > num2) {
				max = num1;
				min = num2;
			} else {
				max = num2;
				min = num1;
			}
			for (int i = min; i <= max; i++) {
				System.out.printf("%d ", i);
			}

		} while (ck);

		sc.close();

	}

	public void parctice7_1() {
		int num1 = 0;
		int num2 = 0;
		int min = 0;
		int max = 0;

		boolean ck = false;
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("������ �Է�1 : ");
			num1 = sc.nextInt();
			System.out.print("������ �Է�2 : ");
			num2 = sc.nextInt();

			if (num1 >= 1 && num2 >= 1) {
				max = Math.max(num1, num2);
				min = Math.min(num1, num2);

				for (int i = min; i <= max; i++) {
					System.out.println(i + " ");
				}
				break;
			} else {
				System.out.println("1�̻��� ���ڸ��Է����ּ���");
			}
		}
	}

//�Ϸ�
	public void practice8() {
//	����ڷκ��� �Է� ���� ������ ���� ����ϼ���.
//	ex.
//	���� : 4
//	===== 4�� =====
//	4 * 1 = 4
//	4 * 2 = 8
//	4 * 3 = 12
//	4 * 4 = 16
//	4 * 5 = 20
//	4 * 6 = 24
//	4 * 7 = 28
//	4 * 8 = 32
//	4 * 9 = 36

		Scanner sc = new Scanner(System.in);

		System.out.print("���� : ");
		int dan = sc.nextInt();

		System.out.println("===== " + dan + " ��=====");
		for (int j = 1; j <= 9; j++) {
			System.out.printf("%d * %d = %2d\n", dan, j, dan * j);
		}

		sc.close();

	}

	public void practice9() {
//	����ڷκ��� �Է� ���� ������ �ܺ��� 9�ܱ��� ����ϼ���.
//	��, 9�� �ʰ��ϴ� ���ڰ� ������ ��9 ������ ���ڸ� �Է����ּ��䡱�� ����ϼ���.

		Scanner sc = new Scanner(System.in);

		System.out.print("���� : ");
		int dan = sc.nextInt();

		if (dan > 9) {
			System.out.println("9������ ���ڸ� �Է����ּ���");
			sc.close();
			return;
		}

		for (int i = dan; i <= 9; i++) {
			System.out.println("===== " + i + " ��=====");
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d * %d = %2d\n", i, j, i * j);
			}
			System.out.println();
		}
		sc.close();
	}

	public void practice10() {
//		����ڷκ��� �Է� ���� ������ �ܺ��� 9�ܱ��� ����ϼ���.
//		��, 9�� �ʰ��ϴ� ���ڰ� ������ ��9 ������ ���ڸ� �Է����ּ��䡱�� ����ϼ���.

		Scanner sc = new Scanner(System.in);
		int dan = 0;
		do {
			System.out.print("���� : ");
			dan = sc.nextInt();

			if (dan > 9) {
				System.out.println("9������ ���ڸ� �Է����ּ���");
				continue;
			}

			for (int i = dan; i <= 9; i++) {
				System.out.println("===== " + i + " ��=====");
				for (int j = 1; j <= 9; j++) {
					System.out.printf("%d * %d = %2d\n", i, j, i * j);
				}
				System.out.println();
			}

		} while (dan > 9);
		sc.close();
	}

	public void pracitce10_1() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("���� : ");
			int num = sc.nextInt();

			if (num <= 9) {
				for (int i = num; i <= 9; i++) {
					System.out.println("===== " + i + " ��=====");
					for (int j = 1; j <= 9; j++) {
						System.out.printf("%d * %d = %2d\n", i, j, i * j);
					}
					System.out.println();
				}

				break;
			} else {
				System.out.println(" 9 ������ ���ڸ� �Է��� �ּ���.");
			}
		}

	}

	public void practice11() {
//	����ڷκ��� ���� ���ڿ� ������ �Է� �޾�
//	������ ������ ���ڰ� Ŀ���ų� �۾����� ���α׷��� �����ϼ���.
//	��, ��µǴ� ���ڴ� �� 10���Դϴ�.
//	* ���������� ���ڵ� ���̿��� ������ ������ ���� �����ϴ� ���� ���Ѵ�.
//	ex) 2, 7, 12, 17, 22 ��
//	5 5 5 5 => ���⼭ ������ 5
//	ex.
//	���� ���� : 4
//	���� : 3
//	4 7 10 13 16 19 22 25 28 31

		Scanner sc = new Scanner(System.in);

		System.out.print("���� ���� : ");
		int num1 = sc.nextInt();

		System.out.print("���� : ");
		int num2 = sc.nextInt();

		// ���1.
		int sum = num1;
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d ", sum);
			sum += num2;
		}

		System.out.println();
		// ���2.
		int count = 0;
		for (int i = num1;; i += num2) {
			System.out.print(i + " ");
			count++;
			if (count == 10) {
				break;
			}
		}
		// ���3.

		sc.close();
	}

	// �Ϸ�
	public void practice12() {
//	������(+, -, *, /, %) : +
//	����1 : 10
//	����2 : 4
//	10 + 4 = 14
//	������(+, -, *, /, %) : / ������(+, -, *, /, %) : /
//	����1 : 10 ����1 : 10
//	����2 : 4 ����2 : 0
//	10 / 4 = 2 0���� ���� �� �����ϴ�. �ٽ� �Է����ּ���.
//	������(+, -, *, /, %) : ^ ������(+, -, *, /, %) : exit
//	����1 : 10 ���α׷��� �����մϴ�.
//	����2 : 4
//	���� �������Դϴ�. �ٽ� �Է����ּ���.

		int result = 0;

		// int oper = sc.nextLine().charAt(0); //
		Scanner sc = new Scanner(System.in);
		String str = null;

		do {
			System.out.print("������(+,-,*,/,%) : ");
			str = sc.nextLine();

			if (str.equals("exit")) {
				break;
			}

			char oper = str.charAt(0);
			System.out.print("����1 : ");
			int num1 = sc.nextInt();

			System.out.print("����2 : ");
			int num2 = sc.nextInt();
			sc.nextLine();

			if ((oper == '/') && (num2 == 0)) {
				System.out.println("0���� ���� �� �����ϴ�. �ٽ� �Է����ּ���");
				continue;
			}

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
				result = num1 / num2;
				break;
			case '%':
				result = num1 % num2;
				break;
			default:
				System.out.println("���� �������Դϴ�. �ٽ� �Է����ּ���");
				str = "";
				continue;
			}
			System.out.printf("%d %c %d = %d\n", num1, oper, num2, result);

		} while (!str.equals("exit"));

		System.out.println(" ���α׷��� �����մϴ�.");
		sc.close();

	}

	// �Ϸ�
	public void practice13() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
		sc.close();
	}

	// �Ϸ�
	public void practice14() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();

		for (int i = num; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
		sc.close();
	}

	public void practice15() {
		// �Ҽ� �Ǻ�
		// �Ҽ��� 1~���� n���� ���������� ���������� ���� 1�� n���� ��.
		// ��, �Է��� ���� 2���� ���� ��� "�ߤ��� �Է��ϼ̽��ϴ�."; ����ϼ���.

		boolean check = false;
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();

		if (num < 2) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�. ");
			return;
		}

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				check = true;
			}
		}

		if (check) {
			System.out.println("�Ҽ��� �ƴմϴ�.");
		} else {
			System.out.println("�Ҽ��Դϴ�.");
		}

	}

	public void practice16() {

		boolean check = false;
		Scanner sc = new Scanner(System.in);
		int num = 0;

		while (true) {
			System.out.print("���� �Է� : ");
			num = sc.nextInt();

			if (num < 2) {
				System.out.println("�߸� �Է��ϼ̽��ϴ�. ");
				continue;
			} else {
				break;
			}
		}

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				check = true;
			}
		}

		if (check) {
			System.out.println("�Ҽ��� �ƴմϴ�.");
		} else {
			System.out.println("�Ҽ��Դϴ�.");
		}
	}

	public void practice17() {

		int count = 0;

		System.out.print("���� : ");

		Scanner sc = new Scanner(System.in);
		int inputNum = sc.nextInt();
		
		boolean check = false;

		if (inputNum < 2) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�. ");
			return;
		}

		for (int i = 2; i < inputNum; i++) {
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					check = true;
				}
			}
			if (!check) {
				count++;
			}
		}
		System.out.println("2���� " + inputNum + "���� �Ҽ��� ������ " + count + "���Դϴ�.");

	}

	public void practice18() {
// 1���� ����ڿ��� �Է� ���� ������ �߿���
// 1) 2�� 3�� ����� ��� ����ϰ�
// 2) 2�� 3�� ������� ������ ����ϼ���.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�ڿ��� �ϳ��� �Է��ϼ��� : ");
		int num = sc.nextInt();
		int count = 0;
		
		for(int i = 1; i <= num; i++)
		{
			if(i % 2 == 0 && i % 3 == 0)
			{
				count++;	
			}
			
			if(i % 2 == 0)
			{
				System.out.print(i + " ");
			}else if(i % 3 == 0)
			{
				System.out.print(i + " ");
			}
		}
		
		System.out.println();
		System.out.println("count : " + count);
		
		
	}

// ���� �Է� : 4
//	   *
//	  **
//	 ***
//	****
	public void practice19() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			for (int s = i; s < num - 1; s++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		sc.close();
	}

//	���� �Է� : 3
//	*
//	**
//	***
//	**
//	*

	public void practice20() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		int count = 0;
		int maxLine = num * 2 - 1;

		for (int i = 0; i < maxLine; i++) {
			if (i < num) {

				count++;

				for (int j = 0; j < count; j++) {
					System.out.print('*');
				}
				System.out.println();

			} else {

				count--;

				for (int j = 0; j < count; j++) {
					System.out.print('*');
				}
				System.out.println();
			}
		}

	}

// ���� �Է� : 4
//    *
//   ***
//  *****
// *******
	public void practice21() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		sc.close();
		for (int i = 0; i < num; i++) {
			for (int s = 0; s < num - 1 - i; s++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * i + 1; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}

// ���� �Է� : 4
//  *******
//   *****
//    ***
//     *
	public void practice21_1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			for (int s = 0; s < i; s++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * (num - 1 - i) + 1; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
		sc.close();
	}

//	���� �Է� : 5
//	*****
//	*   *
//	*   *
//	*   *
//	*****
	public void practice22() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if (i == 0 || i == num - 1) {
					System.out.print("*");
				} else if (j == 0 || j == num - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}

			System.out.println();
		}
		sc.close();
	}
}
