package com.kh.example.chap02.loop;

import java.util.Scanner;

public class A_For {

	/*
	 * For(�ʱ��; ���ǽ�; ������){ ���� ����; } �ʱ�� -> ���ǽ� -> (���ǽ��� true�϶�)���๮�� -> ������ -> ���ǽ� ->
	 * (���ǽ��� true�϶�)���๮�� -> ������ -> ���ǽ� -> (�ݺ� : ���ǽ� ����� false�϶� ����)
	 * 
	 * ������ - �ݺ����� ������ ���� ��ġ��� �� �� �ִ�. (�������� ������ ���ǽ��� ���̶�� ��� ����Ǳ⶧��)
	 * 
	 * for���ȿ� �ִ� �ʱ��,���ǽ�,������ ��� ������ ���� ������ ��� ���������� �ݺ����� �������� ���� ������ for�� ���̳� �ۿ��ٰ�
	 * �ʱ���� �������� ������ �������� ������ �󸶳� �ɰ������� ��� ǥ���ؾ���.
	 */
	public void method1() {
		// 1���� 5���� ���

		// for(int i = 1; i < 6; i++)
		for (int i = 1; i <= 5; i++) {
			System.out.println(i + "��° �ݺ��� ����");
		}
	}

	public void method1_1() {
		// �ڱ�Ұ� �ټ��� �ϱ� : �� �̸��� �ڽſ��

		for (int i = 0; i < 5; i++) {
			System.out.println("���̸��� �ڽſ��");
		}
	}

	public void method1_2() {

		// ������ 2��~9��;
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + "*" + j + "=" + i * j);
			}
		}
	}

	public void method2() {
		// 5���� 1���� ���
		for (int i = 5; i > 0; i--) {
			System.out.println(i + "���");
		}
	}

	public void method2_1() {
		// 8���� 3���� ���
		for (int i = 8; i > 2; i--) {
			System.out.println(i + "���");
		}

	}

	public void method3() {
		// 1���� 10������ Ȧ���� ���.

		// ���1.
		/*
		 * for(int i = 1; i<10; i++){ if(i%2 !=0) { System.out.println(i +"���"); } }
		 */
		// ���2. += ���մ��� ������.
		for (int i = 1; i < 10; i += 2) {
			System.out.println(i + "���");
		}

		// ���3.
//		for(int i = 1; i < 10; i++) {
//			System.out.print(i%2 != 0 ? i + "��� \n": "" );
//		}
//		
	}

	public void method4() {
		// ���� �ΰ��� �Է¹޾� �� ���� ���� ���
		/*
		 * ���� �ΰ��� �Է��ϼ���. ��, ù��° ���ڰ� �ι�° ���ں��� �۰� �Է����ּ���. ù��° ���� : 1 �ι�° ���� : 5 1 2 3 4 5
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �ΰ��� �Է��ϼ���");
		System.out.println("(��,ù��° ���ڰ� �ι�° ���ں��� �۰� �Է��ؾ� �մϴ�.)");

		System.out.print("ù��° ���� : ");
		int start = sc.nextInt();
		System.out.print("�ι��� ���� : ");
		int end = sc.nextInt();

		int max = 0;
		int min = 0;

		if (start < end) {
			max = end;
			min = start;
		} else {
			max = start;
			min = end;
		}

//		for(int i = min; i <= max ; i ++) {
//			System.out.print(i+ " ");
//			//System.out.pri1tf("%d ", i);1			
//		}
		for (; min <= max; min++) {
			System.out.print(min + " ");
		}

//		for(;;min++)
//		{
//			if(min > max) {
//				break;
//			}
//			System.out.print(min+ " ");
//		}

	}

	public void method4_1() {
		// ���� �ϳ��� �Է� �޾� �� ���� 1~9������ ���϶��� ������ ���
		// ������ ���� �������� 1~9������ ����� �Է��Ͽ����մϴ�.
		Scanner sc = new Scanner(System.in);

		System.out.print("���� �ϳ��� �Է� �ϼ��� : ");

		int num = sc.nextInt();
		if (num > 0 && num < 10) {
			// ������ 1��~9��;
			for (int j = 1; j < 10; j++) {
				System.out.println("|" + num + " * " + j + " = " + num * j + "|");
//			System.out.printf("| %d * %d = %2d |\n",num,j,num*j);
			}
		} else {
			System.out.println(" 1 ~ 9 ������ ����� �Է� �Ͽ����մϴ�.");
		}

	}

	public void method5() {
		// 1���� 10������ ������ ������ ���� 1���� ���������� ���� �հ�

		// Math Ŭ���� (random ����, max�޼��� :�ִ밪, min �ִ밪)
		// Math.random(); // ������ ����(�Ǽ�)�� ��ȯ�ϴ� �޼ҵ�, (���� : 0<= Math.random() <1 )
		// 0=< Math.random()*10 < 10
		// 0=< Math.random()*10 +1 < 11
		// ������ ����� ���� int����ȯ : 1<= (int)(Math.random()*10 + 1)

		// int random = (int)(Math.random()*10) +1;
		int random = (int) (Math.random() * 10 + 1); // 1~10
		// System.out.println(random);
		
		int sum = 0;
		for (int i = 1; i <= random; i++) {
			sum += i;
		}

		// System.out.println(sum);
		System.out.printf("1���� %d���� ���� �հ� : %d\n", random, sum);
//		System.out.printf("1���� %1$d���� ���� �հ� : %2$d\n", random,sum);

		// int max = Math.max(3, 14);
//		int min = Math.min(3, 14);
//		System.out.println(min);	
//		System.out.println(max);	
//		int max = Math.max(3, Math.max(4 , 15));
//		System.out.println(max);	
	}

	public void method6() {
		/*
		 * for(�ʱⰪ1; ���ǽ�1; ������1){ ����� ����1; for(�ʱⰪ2; ���ǽ�2; ������2){ ����� ����2; } } ����� ����3;
		 * } �ʱⰪ 1 -> ���ǽ�1 true -> ����� ����1 -> �ʱⰪ2 -> ���ǽ�2true -> ����� ����2 -> ������2 -> ���ǽ�
		 * 2true -> ����� ����2 (�ݺ� : ���ǽ� false�϶�����) -> ����� ����3 -> ������1 -> ���ǽ�1true ->
		 * ����ɹ���1 ->
		 * 
		 */

		// 2�� ���� 9�ܱ��� ���
		System.out.println(" ============");
		for (int dan = 2; dan < 10; dan++) {

			for (int su = 1; su < 10; su++) {
//				System.out.println(dan + "*" + su + "=" + dan*su);
				System.out.printf("| %d * %d = %2d |%n", dan, su, dan * su);
			}
			System.out.println(" ============");
		}

	}

	public void method7() {
		// �Ƴ��α� �ð� ��� : 0�� 0�� ~ 23�� 59��

//		int minute;
//		int hour;
		for (int hour = 0; hour < 24; hour++) {
			for (int minute = 0; minute < 60; minute++)

//				System.out.printf("%2s��%2s��%n",hour < ? '0'+ hour : hour ,minute <10 ? '0' + minute : minute);
//			
				System.out.printf("%2d��%2d��%n", hour, minute);
		}

	}

	public void method8() {
		// ���ٿ� ��(*)ǥ�� 5�� ��µǴµ�
		// �� �ٿ� ����ڰ� �Է��� ����ŭ ���
		/*
		 * 
		 * ����� �� �� : 3 ***** ***** *****
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ��� : ");

		int num = sc.nextInt();
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void method9() {
		// ���ٿ� ��ǥ ���ڸ� �Էµ� �� ���� ĭ �� ��ŭ �Է�
		// e��, �� ���� ĭ ���� ��ġ�ϴ� �� ��ȣ�� ���� ������ ���

		Scanner sc = new Scanner(System.in);

		System.out.print("�ټ��� �Է��ϼ��� : ");
		int numRow = sc.nextInt();

		System.out.print("ĭ���� �Է��ϼ��� : ");
		int numColumn = sc.nextInt();

		// int i = 0; ���� �ϰ� ++i �� ����ϸ�
		// for���ȿ��� i ���� �����Ǽ� ���ΰ��� �޴� ������ ����ų� �ؾ��Ѵ�.

		for (int i = 1; i <= numRow; i++) {
			for (int j = 1; j <= numColumn; j++) {
				if (i == j) {
					System.out.print(i);
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}	
	}

	public void fortree() {
//		for(int x=1; x<5; x++) {
		for (int y = 1; y < 10; y++) {
			for (int z = 1; z < 10; z++) {
//					System.out.printf("%2d,%d,%d",x,y,z);
				System.out.printf("%2c--%c--%c", '��', '��', '��');
			}
			System.out.println();
		}
//			System.out.print("��");
//		}
	}
}
