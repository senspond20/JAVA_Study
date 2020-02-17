package com.kh.example.chap03.branch;

public class B_Continue {
	// continue��
	// �ݺ����ȿ����� ����� ����.
	// continue�� ������ �Ʒ������� �������� �ʰ�
	// �ݺ����� �ٽ� ������.
	// for���� ��� ���������� ����, while���� ��� ���ǽ����� ����.

	public void method1() {
		// 1~100 ���� �������� �հ踦 ����ϵ�, 4�� ����� ���� ���

		int sum = 0;

		for (int i = 1; i < 100; i++) {

			if (i % 4 == 0) {
				continue;
			}
			sum += i;
		}
		System.out.println();
		System.out.println("sum = " + sum);
	}

	public void method2() {
		// ������ ���. ¦���� ���� ���, ¦�� �� ���� ���
		// int su = 1;
		String str = "";

		for (int dan = 2; dan <= 9; dan++) {
			if (dan % 2 == 0) {
				continue;
			}
			for (int su = 1; su <= 9; su++) {

				if (su % 2 == 0) {
					continue;
				}

//			System.out.printf("%d * %d = %2d\n", dan, su, dan * su);
				str += String.format("%d * %d = %2d\n", dan, su, dan * su);
			}

			// su =1;
			System.out.println(str);
			str = "";

			// System.out.println();
		}

	}

	public void method3() {
		for (int dan = 2; dan <= 9; dan++) {
			System.out.println("=" + dan + "�� Ȧ����=");
			
			for (int su = 1; su <= 9; su++) {

				if (dan % 2 == 0 || su % 2 == 0) {
					continue;
				}
				System.out.printf("%d * %d = %2d\n", dan, su, dan * su);
			}
			System.out.println();

		}

	}

}
