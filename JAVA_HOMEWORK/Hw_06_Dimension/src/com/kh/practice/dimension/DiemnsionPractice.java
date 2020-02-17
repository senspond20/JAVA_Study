package com.kh.practice.dimension;

import java.io.Console;
import java.util.Scanner;

public class DiemnsionPractice {
//	3�� 3��¥�� ���ڿ� �迭�� ���� �� �Ҵ��ϰ�
//	�ε��� 0�� 0������ 2�� 2������ ���ʴ�� �����Ͽ� ��(0, 0)���� ���� �������� ���� �� ����ϼ���.
//	ex.
//	(0, 0)(0, 1)(0, 2)
//	(1, 0)(1, 1)(1, 2)
//	(2, 0)(2, 1)(2, 2)
	public void practice1() {

		String[][] iArr = new String[3][3];

		for (int i = 0; i < iArr.length; i++) {
			for (int j = 0; j < iArr[i].length; j++) {
				// iArr[i][j] = String.format("(%d,%d)",i,j);
				iArr[i][j] = "(" + i + "," + j + ")";
			}
		}

		for (int i = 0; i < iArr.length; i++) {
			for (int j = 0; j < iArr[i].length; j++) {
				System.out.print(iArr[i][j] + " ");
			}
			System.out.println();
		}

	}

	public void practice2() {
//	4�� 4��¥�� ������ �迭�� ���� �� �Ҵ��ϰ�
//	1) 1 ~ 16���� ���� ���ʴ�� �����ϼ���.
//	2) ����� ������ ���ʴ�� ����ϼ���.

		int[][] iArr = new int[4][4];

		int count = 0;
		for (int i = 0; i < iArr.length; i++) {
			for (int j = 0; j < iArr[i].length; j++) {
				iArr[i][j] = ++count;
			}
		}

		for (int i = 0; i < iArr.length; i++) {
			for (int j = 0; j < iArr[i].length; j++) {
				System.out.printf("%2d ", iArr[i][j]);
			}
			System.out.println();
		}

	}

	public void practice3() {
//	4�� 4��¥�� ������ �迭�� ���� �� �Ҵ��ϰ�
//	1) 16 ~ 1�� ���� ���� �Ųٷ� �����ϼ���.
//	2) ����� ������ ���ʴ�� ����ϼ���.

		int[][] iArr = new int[4][4];

		int count = 16;
		for (int i = 0; i < iArr.length; i++) {
			for (int j = 0; j < iArr[i].length; j++) {
				iArr[i][j] = count--;
			}
		}

		for (int i = 0; i < iArr.length; i++) {
			for (int j = 0; j < iArr[i].length; j++) {
				System.out.printf("%2d ", iArr[i][j]);
			}
			System.out.println();
		}
	}

	public void practice4() {
//	4�� 4�� 2���� �迭�� �����Ͽ� 0�� 0������ 2�� 2�������� 1~10������ ������ ���� �� ���� ��
//	�Ʒ��� ����ó�� ó���ϼ���.

		final int rowSize = 4;
		final int colSize = 4;

		int[][] iArr = new int[rowSize][colSize];

		int random = 0;

		for (int i = 0; i < rowSize - 1; i++) {
			for (int j = 0; j < colSize - 1; j++) {
				iArr[i][j] = (int) (Math.random() * 10 + 1);
			}
		}

		int sum = 0;
		for (int s = 0; s < colSize - 1; s++) {
			sum = iArr[0][s];
			for (int i = 1; i < rowSize - 1; i++) {
				sum += iArr[i][s];
			}
			iArr[rowSize - 1][s] = sum;
		}

		for (int s = 0; s < rowSize - 1; s++) {
			sum = iArr[s][0];
			for (int i = 1; i < colSize - 1; i++) {
				sum += iArr[s][i];
			}
			iArr[s][colSize - 1] = sum;
		}

		int sum1 = 0;
		int sum2 = 0;

		sum1 = iArr[0][colSize - 1];
		for (int s = 1; s < rowSize - 1; s++) {
			sum1 += iArr[s][colSize - 1];
		}

		sum2 = iArr[rowSize - 1][0];
		for (int s = 1; s < colSize - 1; s++) {
			sum2 += iArr[rowSize - 1][s];
		}

		sum = sum1 + sum2;
		iArr[rowSize - 1][colSize - 1] = sum;

		for (int i = 0; i < iArr.length; i++) {
			for (int j = 0; j < iArr[i].length; j++) {
				System.out.printf("%2d ", iArr[i][j]);
			}
			System.out.println();
		}

	}

	public void practice4_1() {

		final int Size = 6;

		int[][] iArr = new int[Size][Size];

		int sum1 = 0;
		int sum2 = 0;

		int count = 0;
		int totalSum = 0;

		// �迭  Size-2 * Size-2 ������ŭ ��������ְ�
		for (int i = 0; i < Size - 1; i++) {
			for (int j = 0; j < Size - 1; j++) {
				iArr[i][j] = (int) (Math.random() * 10 + 1);
			}
		}
		
		// ������ ������ �հ踦 ����ְ�
//		while (count < Size - 1) {
//			for (int i = 0; i < Size - 1; i++) {
//
//				sum1 += iArr[i][count];
//				sum2 += iArr[count][i];
//
//				totalSum += iArr[i][count];
//				totalSum += iArr[count][i];
//			}
//
//			iArr[Size - 1][count] = sum1;
//			iArr[count][Size - 1] = sum2;
//			iArr[Size - 1][Size - 1] = totalSum;
//
//			sum1 = 0;
//			sum2 = 0;
//			count++;
//		}
		
		// ���.
		for (int i = 0; i < Size; i++) {
			for (int j = 0; j < Size; j++) {
				System.out.printf("%2d ", iArr[i][j]);
			}
			System.out.println();
		}

	}

	public void practice5() {
//	2���� �迭�� ��� ���� ũ�⸦ ����ڿ��� ���� �Է¹޵�, 1~10���� ���ڰ� �ƴϸ�
//	���ݵ�� 1~10 ������ ������ �Է��ؾ� �մϴ�.�� ��� �� �ٽ� ������ �ް� �ϼ���.
//	ũ�Ⱑ ������ ������ �迭 �ȿ��� ���� �빮�ڰ� �������� ���� �� �� ����ϼ���.
//	(char���� ���ڸ� ���ؼ� ���ڸ� ǥ���� �� �ְ� 65�� A�� ��Ÿ��)
		Scanner sc = new Scanner(System.in);

		int random = 0;
		int row = 0;
		int col = 0;
		while (true) {
			System.out.print("�� ũ�� : ");
			row = sc.nextInt();

			System.out.print("�� ũ�� : ");
			col = sc.nextInt();

			if (row < 1 || row > 10 || col < 1 || col > 10) {
				System.out.println("�ݵ�� 1~10 ������ ������ �Է��ؾ� �մϴ�.");
			} else {
				break;
			}
		}

		char[][] cArr = new char[row][col];

		for (int i = 0; i < cArr.length; i++) {
			for (int j = 0; j < cArr[i].length; j++) {

				random = (int) ((Math.random() * 26) + 65);
				cArr[i][j] = (char) random;

			}
		}

		for (int i = 0; i < cArr.length; i++) {
			for (int j = 0; j < cArr[i].length; j++) {
				System.out.printf("%2c ", cArr[i][j]);
			}
			System.out.println();
		}
	}

	public void practice6() {
		String[][] strArr = new String[][] { { "��", "��", "��", "��", "��" }, { "��", "��", "��", "��", "��" },
				{ "��", "��", "��", "��", "��" }, { "��", "��", "��", "��", "��" }, { "��", "��", "! ", "��", "!! " } };

		final int row = strArr.length;
		final int col = strArr[0].length;
		// �⺻�迭
//		for (int i = 0; i < row; i++) {
//			for (int j = 0; j < col; j++) {
//				System.out.printf("%-2s ", strArr[i][j]);
//			}
//			System.out.println();
//		}
//		System.out.println();

		for (int i = 0; i < col; i++) {
			for (int j = 0; j < row; j++) {
				System.out.printf(" %s ", strArr[j][i]);
			}
			System.out.println();
		}
		System.out.println();
	}

	public void practice7() {
//	����ڿ��� ���� ũ�⸦ �Է� �ް� �� ����ŭ�� �ݺ��� ���� ���� ũ�⵵ �޾�
//	������ ���� �迭�� ���� �� �Ҵ��ϼ���.
//	�׸��� �� �ε����� ��a������ �� �ε����� ������ŭ �ϳ��� �÷� �����ϰ� ����ϼ���.

		Scanner sc = new Scanner(System.in);

		System.out.print("���� ũ�� : ");
		int rowlengh = sc.nextInt();

		char[][] cArr = new char[rowlengh][];
		int num = 0;

		for (int index = 0; index < rowlengh; index++) {
			System.out.print(index + "���� �� ũ�� : ");
			num = sc.nextInt();
			cArr[index] = new char[num];
		}

		int count = 0;
		for (int i = 0; i < cArr.length; i++) {
			for (int j = 0; j < cArr[i].length; j++) {
				cArr[i][j] = (char) ((int) 'a' + count++);
			}
		}

		for (int i = 0; i < cArr.length; i++) {
			for (int j = 0; j < cArr[i].length; j++) {
				System.out.print(cArr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void practice8() {
//	ex.
//	== 1�д� ==
//	���ǰ� ������
//	����� �����
//	���̹� �ں���
//	== 2�д� ==
//	�ۼ��� ������
//	������ ��õ��
//	��ǳǥ ȫ����
		String[] strArr = { "���ǰ�", "������", "�����", "�����", "���̹�", "�ں���", "�ۼ���", "������", "������", "��õ�� ", "��ǳǥ", "ȫ����" };

		String[][] strArr1 = new String[3][2];
		String[][] strArr2 = new String[3][2];

		int index = 0;
		for (int i = 0; i < strArr1.length; i++) {
			for (int j = 0; j < strArr1[i].length; j++) {
				strArr1[i][j] = strArr[index++];
			}
		}

		for (int i = 0; i < strArr2.length; i++) {
			for (int j = 0; j < strArr2[i].length; j++) {
				strArr2[i][j] = strArr[index++];
			}
		}
		// ���
		System.out.println("== 1�д� ==");
		for (int i = 0; i < strArr1.length; i++) {
			for (int j = 0; j < strArr1[i].length; j++) {
				System.out.print(strArr1[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("== 2�д� ==");
		for (int i = 0; i < strArr2.length; i++) {
			for (int j = 0; j < strArr2[i].length; j++) {
				System.out.print(strArr2[i][j] + " ");
			}
			System.out.println();
		}

	}

	public void practice9() {
//	�� �������� �ڸ� �踮 ��ġ�� ���� ������ �л� �̸��� �˻��Ͽ�
//	�ش� �л��� ��� �ڸ��� �ɾҴ��� ����ϼ���.
		String[] strArr = { "���ǰ�", "������", "�����", "�����", "���̹�", "�ں���", "�ۼ���", "������", "������", "��õ��", "��ǳǥ", "ȫ����" };

		String[][] strArr1 = new String[3][2];
		String[][] strArr2 = new String[3][2];

		int index = 0;
		for (int i = 0; i < strArr1.length; i++) {
			for (int j = 0; j < strArr1[i].length; j++) {
				strArr1[i][j] = strArr[index++];
			}
		}

		for (int i = 0; i < strArr2.length; i++) {
			for (int j = 0; j < strArr2[i].length; j++) {
				strArr2[i][j] = strArr[index++];
			}
		}
		// ���
		System.out.println("== 1�д� ==");
		for (int i = 0; i < strArr1.length; i++) {
			for (int j = 0; j < strArr1[i].length; j++) {
				System.out.print(strArr1[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("== 2�д� ==");
		for (int i = 0; i < strArr2.length; i++) {
			for (int j = 0; j < strArr2[i].length; j++) {
				System.out.print(strArr2[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("=======================");

		Scanner sc = new Scanner(System.in);
		System.out.print("�˻��� �л� �̸��� �Է��ϼ���  : ");
		String name = sc.nextLine();

		int bundan = 0;
		int row = 0;
		int col = 0;
		boolean check = false;

		for (int i = 0; i < strArr1.length; i++) {
			for (int j = 0; j < strArr1[i].length; j++) {

				if (name.equals(strArr1[i][j])) {
					bundan = 1;
					row = i;
					col = j;
					check = true;
					break;
				}

			}
		}

		for (int i = 0; i < strArr2.length; i++) {
			for (int j = 0; j < strArr2[i].length; j++) {
				if (name.equals(strArr2[i][j])) {
					bundan = 2;
					row = i;
					col = j;
					check = true;
					break;
				}
			}

		}

		String sRow = "";
		String sCol = "";
		switch (row) {
		case 0:
			sRow = "ù ��°";
			break;
		case 1:
			sRow = "�� ��°";
			break;
		case 2:
			sRow = "�� ��°";
			break;
		default:
			break;
		}
		switch (col) {
		case 0:
			sCol = "����";
			break;
		case 1:
			sCol = "������";
			break;
		default:
			break;
		}

		if (check) {
			System.out.println("�˻��Ͻ� " + name + " �л��� " + bundan + " �д� " + sRow + " �� " + sCol + " �� �ֽ��ϴ�.");
		} else {
			System.out.println("�˻��Ͻ� " + name + " �л��� �������� �ʽ��ϴ�.");
		}

	}

	public void practice10() {
		// String 2���� �迭 6�� 6���� ����� ���� �� ���� ���� �Ǿ��� �� �ε����� �����ϼ���.
		// �׸��� ����ڿ��� ��� ���� �Է¹޾� �ش� ��ǥ�� ���� 'X'�� ��ȯ�� 2���� �迭�� ����ϼ���.

		int rowindex = 0;
		int columnIndex = 0;

		String[][] strArr = new String[6][6];

		// Console cs = System.console();

		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("�� �ε��� �Է� : ");
			rowindex = sc.nextInt() + 1;

			System.out.print("�� �ε��� �Է� : ");
			columnIndex = sc.nextInt() + 1;

			sc.close(); // Scanner:
						// �ѹ� �ݾƹ����� ���α׷� �����Ҷ����� system.in �� �ι��ٽ� ������ ����.

		} catch (Exception ex) {
			System.out.println("�߸� �Է��߾��  : " + ex);
			return;
		}

		int count = 0;

		// String �迭 �� ����ֱ�.
		for (int i = 0; i < strArr.length; i++) {
			for (int j = 0; j < strArr[i].length; j++) {

				if (i == 0 && j == 0) {
					strArr[i][j] = " ";
				} else if (i == 0) {
					strArr[i][j] = Integer.toString(count + j - 1);

				} else if (j == 0) {
					strArr[i][j] = Integer.toString(count + i - 1);
				} else if (i == rowindex && j == columnIndex) {
					strArr[i][j] = "X";
				} else {
					strArr[i][j] = " ";
				}
			}
		}

		// ���.
		for (int i = 0; i < strArr.length; i++) {
			for (int j = 0; j < strArr[i].length; j++) {
				System.out.print(strArr[i][j] + " ");
			}
			System.out.println();
		}

//		for(int k = 0; k < strArr.length; k++)
//		{
//			System.out.println(Arrays.toString(strArr[k]));
//		}

	}

	public void practice11() {
		// 10���� ������ ������ �� �Է½� 99�� �Էµ��� ������ ���� �ݺ��� �ǰ� �ϼ���.

		int rowindex = 0;
		int columnIndex = 0;

		String[][] strArr = new String[6][6];

		// strArr�� �ʱⰪ ����ְ�
		for (int i = 0; i < strArr.length; i++) {
			for (int j = 0; j < strArr[i].length; j++) {

				if (i == 0 && j == 0) {
					strArr[i][j] = " ";
				} else if (i == 0) {
					strArr[i][j] = Integer.toString(j - 1);

				} else if (j == 0) {
					strArr[i][j] = Integer.toString(i - 1);
				} else {
					strArr[i][j] = " ";
				}
			}
		}

		Scanner sc = new Scanner(System.in);

		while (true) {
			try {
				System.out.print("�� �ε��� �Է� : ");
				rowindex = sc.nextInt();

				if (rowindex == 99) {
					break;
				}

				System.out.print("�� �ε��� �Է� : ");
				columnIndex = sc.nextInt();

				if (rowindex > strArr.length - 2 || columnIndex > strArr[0].length - 2) {
					System.out.println("�ٽ� �Է��ϼ���");
					continue;
				}
			} catch (Exception ex) {
				System.out.println("�߸� �Է��߾��  : " + ex);
				return;
			}

			// �ش� ��ǥ�� �ش��ϴ� ���� �迭 �ε������ٰ� X����
			strArr[rowindex + 1][columnIndex + 1] = "X";

			// ���.
			for (int i = 0; i < strArr.length; i++) {
				for (int j = 0; j < strArr[i].length; j++) {
					System.out.print(strArr[i][j] + " ");
				}
				System.out.println();
			}

		} // end wihle

		System.out.println("���α׷� ����");

		sc.close(); // Scanner:
					// �ѹ� �ݾƹ����� ���α׷� �����Ҷ����� system.in �� �ι��ٽ� ������ ����.
	}

}
