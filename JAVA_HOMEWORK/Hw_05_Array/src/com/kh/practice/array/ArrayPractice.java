package com.kh.practice.array;

//import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
//import java.util.Arrays;
//import java.util.Queue;
import java.util.Scanner;

public class ArrayPractice {
	public void practice1() {
//	���̰� 10�� �迭�� �����ϰ� 1���� 10������ ���� �ݺ����� �̿��Ͽ�
//	������� �迭 �ε����� ���� �� �� ���� ����ϼ���.

		int[] iArry = new int[10];

		for (int i = 0; i < iArry.length; i++) {
			iArry[i] = i + 1;
		}
		for (int i = 0; i < iArry.length; i++) {
			System.out.print(iArry[i] + " ");
		}

	}

	public void practice2() {
//	���̰� 10�� �迭�� �����ϰ� 1���� 10������ ���� �ݺ����� �̿��Ͽ�
//	�������� �迭 �ε����� ���� �� �� ���� ����ϼ���
		int[] iArry = new int[10];

		for (int i = 0; i < iArry.length; i++) {
			iArry[i] = iArry.length - i;
		}
		for (int i = 0; i < iArry.length; i++) {
			System.out.print(iArry[i] + " ");
		}
	}

	public void practice3() {
//	����ڿ��� �Է� ���� ���� ������ŭ �迭 ũ�⸦ �Ҵ��ϰ�
//	1���� �Է� ���� ������ �迭�� �ʱ�ȭ�� �� ����ϼ���.
		Scanner sc = new Scanner(System.in);

		System.out.print("���� ���� : ");
		int size = sc.nextInt();
		int[] iArry = new int[size];

		for (int i = 0; i < iArry.length; i++) {
			iArry[i] = i + 1;
		}
		for (int i = 0; i < iArry.length; i++) {
			System.out.print(iArry[i] + " ");
		}

		sc.close();
	}

	public void practice4() {
//	���̰� 5�� String�迭�� �����ϰ� �������, ���֡�, ��������, �������ơ�, �����ܡ��� �ʱ�ȭ �� ��
//	�迭 �ε����� Ȱ���ؼ� ���� ����ϼ���.
//	
		String[] strArr = new String[] { "���", "��", "����", "������", "����" };

		System.out.println(strArr[1]);

	}

	public void practice5() {
//	���ڿ��� �Է� �޾� ���� �ϳ��ϳ��� �迭�� �ְ� �˻��� ���ڰ� ���ڿ��� �� �� �� �ִ���
//	������ �� ��° �ε����� ��ġ�ϴ��� �ε����� ����ϼ���.

		Scanner sc = new Scanner(System.in);

		System.out.print("���ڿ� : ");
		String str = sc.nextLine();
		System.out.print("����  : ");
		char strin = sc.nextLine().charAt(0);

		char[] cArr = new char[str.length()];

		for (int i = 0; i < cArr.length; i++) {
			cArr[i] = str.charAt(i);
		}

		System.out.print(str + "�� " + strin + "�� �����ϴ� index : ");
		int num = 0;
		for (int i = 0; i < cArr.length; i++) {
			if (strin == cArr[i]) {
				num++;
				System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.println(strin + "�� ���� : " + num);
		sc.close();
	}

	public void practice6() {
//	 ������ ~ ���ϡ����� �ʱ�ȭ�� ���ڿ� �迭�� ����� 0���� 6���� ���ڸ� �Է� �޾�
//	 �Է��� ���ڿ� ���� �ε����� �ִ� ������ ����ϰ�
//	 ������ ���� ���ڸ� �Է� �� ���߸� �Է��ϼ̽��ϴ١��� ����ϼ���.
//	 
		String[] strArr = new String[] { "��", "ȭ", "��", "��", "��", "��", "��" };
		Scanner sc = new Scanner(System.in);

		System.out.print("0 ~ 6 ���� ���� �Է� : ");
		int num = sc.nextInt();

		if (num < 0 || num > 6) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		} else {
			System.out.println(strArr[num] + "����");
		}

		sc.close();

	}

	public void practice7() {
//	 ����ڰ� �迭�� ���̸� ���� �Է��Ͽ� �� ����ŭ ������ �迭�� ���� �� �Ҵ��ϰ�
//	 �迭�� ũ�⸸ŭ ����ڰ� ���� ���� �Է��Ͽ� ������ �ε����� ���� �ʱ�ȭ �ϼ���.
//	 �׸��� �迭 ��ü ���� �����ϰ� �� �ε����� ����� ������ ���� ����ϼ���.
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int size = sc.nextInt();
		int[] iArr = new int[size];

		for (int i = 0; i < iArr.length; i++) {
			System.out.print("�迭 " + i + "��° �ε����� ���� �� : ");
			int data = sc.nextInt();
			iArr[i] = data;
		}

		for (int i = 0; i < iArr.length; i++) {
			System.out.print(iArr[i] + " ");
		}
		sc.close();
	}

	public void practice8() {
//	 3�̻��� Ȧ�� �ڿ����� �Է� �޾� �迭�� �߰������� 1���� 1�� �����Ͽ� ������������ ���� �ְ�,
//	 �߰� ���ĺ��� �������� 1�� �����Ͽ� ������������ ���� �־� ����ϼ���.
//	 ��, �Է��� ������ Ȧ���� �ƴϰų� 3 �̸��� ��� ���ٽ� �Է��ϼ��䡱�� ����ϰ�
//	 �ٽ� ������ �޵��� �ϼ���.

		Scanner sc = new Scanner(System.in);
		int num = 0;

		do {
			if (num < 3 || num % 2 == 0) {
				System.out.println("�ٽ� �Է��ϼ���");
			}

			System.out.print("���� : ");
			num = sc.nextInt();

		} while (num < 3 || num % 2 == 0);

		int[] iArr = new int[num];

		iArr[0] = 1;

		for (int i = 1; i < iArr.length; i++) {

			if (i > (iArr.length + 1) / 2 - 1) {
				iArr[i] = iArr[i - 1] - 1;
			} else {

				iArr[i] = iArr[i - 1] + 1;
			}
		}

		for (int i = 0; i < iArr.length; i++) {
			System.out.print(iArr[i] + " ");
		}
		sc.close();

	}

	public void practice9() {
//	����ڰ� �Է��� ���� �迭�� �ִ��� �˻��Ͽ�
//	������ ��OOO ġŲ ��� ���ɡ�, ������ ��OOO ġŲ�� ���� �޴��Դϴ١��� ����ϼ���.
//	��, ġŲ �޴��� ���ִ� �迭�� ���� ������ ���ϼ���.
		Scanner sc = new Scanner(System.in);

		String[] menu = { "���", "�Ķ��̵�", "���帶��" };

		System.out.print("ġŲ �̸��� �Է��ϼ��� : ");
		String str = sc.nextLine();

		for (int i = 0; i < menu.length; i++) {
			if (str.equals(menu[i])) {
				System.out.println(menu[i] + "ġŲ ��� ����");
				sc.close();
				return;
			}
		}

		System.out.println(str + "ġŲ�� ���� �޴��Դϴ�.");
		sc.close();
	}

	public void practice10() {
//	�ֹε�Ϲ�ȣ �����ڸ� ���ĺ��� *�� ������ ����ϼ���.
//	��, ���� �迭 ���� ���� ���� �迭 ���纻���� �����ϼ���.
		Scanner sc = new Scanner(System.in);

		System.out.print("�ֹε�Ϲ�ȣ(-����) : ");
		String str = sc.nextLine();

		// �����迭
		char[] origin = new char[str.length()];

		for (int i = 0; i < origin.length; i++) {
			origin[i] = str.charAt(i);
		}

		// ����迭
		char[] cArr = new char[origin.length];

		for (int i = 0; i < cArr.length; i++) {

			if (i >= 8) {
				cArr[i] = '*';
			} else {
				cArr[i] = origin[i];
			}
		}

		// ���� ���
//		for(int i = 0; i < cArr.length; i++) {
//			System.out.print(origin[i] + "");
//		}
//		System.out.println();
		// ����迭 ���
		for (int i = 0; i < cArr.length; i++) {
			System.out.print(cArr[i] + "");
		}

		sc.close();

	}

	public void practice11() {
//	 10���� ���� ������ �� �ִ� ������ �迭�� ���� �� �Ҵ��ϰ�
//	 1~10 ������ ������ �߻����� �迭�� �ʱ�ȭ�� �� ����ϼ���.
		int[] iArry = new int[10];

		int random = 0;

		for (int i = 0; i < iArry.length; i++) {
			random = (int) (Math.random() * 10 + 1);
			iArry[i] = random;
		}

		for (int i = 0; i < iArry.length; i++) {
			System.out.print(iArry[i] + " ");
		}

	}

	public void practice12() {
//	10���� ���� ������ �� �ִ� ������ �迭�� ���� �� �Ҵ��ϰ�
//	1~10 ������ ������ �߻����� �迭�� �ʱ�ȭ ��
//	�迭 ��ü ���� �� �� �߿��� �ִ밪�� �ּҰ��� ����ϼ���.
		int[] iArry = new int[10];
		int random = 0;

		for (int i = 0; i < iArry.length; i++) {
			random = (int) (Math.random() * 10 + 1);
			iArry[i] = random;
		}

		for (int i = 0; i < iArry.length; i++) {
			System.out.print(iArry[i] + " ");
		}

		System.out.println();

		/* ��� 1 */

		// ����迭 ����
		int[] copyArr = new int[iArry.length];
		System.arraycopy(iArry, 0, copyArr, 0, iArry.length);

		// ����迭 �������� ����.
		int temp = 0;
		for (int i = 0; i < copyArr.length; i++) {

			for (int j = 0; j < i; j++) {
				if (copyArr[i] < copyArr[j]) {
					temp = copyArr[i];
					copyArr[i] = copyArr[j];
					copyArr[j] = temp;
				}
			
			}
			
		}
		// �ּҰ� �ִ밪 ���ϱ�
		int min = copyArr[0];
		int max = copyArr[copyArr.length - 1];
		copyArr = null; // ����迭 ����

		System.out.println("�ִ밪 : " + max);
		System.out.println("�ּҰ� : " + min);

		/* ��� 2 */

	}

	public void practice13() {
//	10���� ���� ������ �� �ִ� ������ �迭�� ���� �� �Ҵ��ϰ�
//	1~10 ������ ������ �߻����� �ߺ��� ���� ���� �迭�� �ʱ�ȭ�� �� ����ϼ���.
//	ex.
//	4 1 3 6 9 5 8 10 7 2
		int[] iArry = new int[10];

		for (int i = 0; i < iArry.length; i++) {

			iArry[i] = (int) (Math.random() * 10 + 1);

			for (int j = 0; j < i; j++) {
				if (iArry[i] == iArry[j]) {
					i--;
				}
			}
		}

		for (int i = 0; i < iArry.length; i++) {
			System.out.print(iArry[i] + " ");
		}

	}

	// ��������
	public void practice14() {
//�ζ� ��ȣ �ڵ� ������ ���α׷��� �ۼ��ϴµ� �ߺ� �� ���� ������������ �����Ͽ� ����ϼ���.

		// ������ 6�� �迭 �Ҵ�
		int[] iArry = new int[6];

		// �迭�� �ߺ��� ���� 1~45 ������ �������
		int random = 0;
		for (int i = 0; i < iArry.length; i++) {
			random = (int) (Math.random() * 45 + 1);
			iArry[i] = random;
			for (int j = 0; j < i; j++) {
				if (iArry[i] == iArry[j]) {
					i--;
				}
			}
		}

		// (���)
//		System.out.println(Arrays.toString(iArry));

		// �������� ����.
		int temp = 0;
		for (int i = 1; i < iArry.length; i++) {

			for (int j = 0; j < i; j++) {
				if (iArry[i] < iArry[j]) {
					temp = iArry[i];
					iArry[i] = iArry[j];
					iArry[j] = temp;
				}
			}
		}

		// ���.
		for (int i = 0; i < iArry.length; i++) {
			System.out.print(iArry[i] + " ");
		}
	}

	public void practice15() {
//	���ڿ��� �Է� �޾� ���ڿ��� � ���ڰ� ������ �迭�� �����ϰ�
//	������ ������ �Բ� ����ϼ���.

		Scanner sc = new Scanner(System.in);
		System.out.print("���ڿ� : ");

		String str = sc.nextLine();

		char[] cArr = new char[str.length()];

		for (int i = 0; i < str.length(); i++) {
			cArr[i] = str.charAt(i);
		}

		for (int i = 0; i < cArr.length; i++) {
			for (int j = 0; j < i; j++) {
				if (cArr[i] == cArr[j]) {
					cArr[i] = 0;
				}
			}
		}
		int count = 0;
		// �迭
		char[] temp = new char[cArr.length];

		int cc = 0;
		for (int i = 0; i < cArr.length; i++) {

			if (cArr[i] != 0) {
				temp[i] = cArr[i];
				System.out.print(temp[i] + " ");
				count++;
			} else {
				continue;
			}

		}

		System.out.println();
		System.out.println("���� ���� : " + count);

//	
//		System.arraycopy(cArr, 0, copyArr, 0, cArr.length);
//		
////		for (int i = 0; i < copyArr.length; i++) {
////			for (int j = 0; j < i; j++) {
////				if (cArr[i] == cArr[j]) {
////
////				} else {
////					copyArr[i] = cArr[i];
////				}
////			}
////		}
//
//		System.out.print("���ڿ��� �ִ� ���� : ");
//		for (int i = 0; i < copyArr.length; i++) {
//			System.out.print(copyArr[i] + ",");
//		}
//		System.out.println();
//
//		System.out.println("���� ���� : " + (copyArr.length));
		sc.close();
	}

	public void practice16() {
//		����ڰ� �Է��� �迭�� ���̸�ŭ�� ���ڿ� �迭�� ���� �� �Ҵ��ϰ�
//		�迭�� �ε����� ���� �� ���� ����ڰ� �Է��Ͽ� �ʱ�ȭ �ϼ���.
//		��, ����ڿ��� �迭�� ���� �� ������ ����� �� ���� �� �Է��� ����,
//		�ø� ���� � �����͸� ���� ������ ��������.
//		����ڰ� �� �̻� �Է����� �ʰڴٰ� �ϸ� �迭 ��ü ���� ����ϼ���.

		Scanner sc = new Scanner(System.in);
		
		int size = 0;	
		System.out.print("�迭�� ũ�⸦ �Է��ϼ��� : ");

		size = sc.nextInt();
		sc.nextLine();

		String[] strArr = new String[size];
		String[] temp = null;
		
		int i = 0;
		
		while (true) {
			for (; i < size; i++) {
				System.out.print((i + 1) + "��° ���ڿ� : ");
				strArr[i] = sc.nextLine();
			}

			System.out.print("�� ���� �Է��Ͻðڽ��ϱ�?(Y/N) : ");
			char ch = sc.nextLine().charAt(0);

			if (ch == 'N' || ch == 'n') {
				break;

			} else if (ch == 'Y' || ch == 'y') { // equlsslgnoreCase : ��ҹ��� ���� ����

				System.out.print("�� �Է��ϰ� ���� ���� : ");
				int add = sc.nextInt();
				sc.nextLine();

				temp = strArr; // strArr ���� �迭�� �ּҰ��� temp�� �ӽ� ����.(�迭 ���� ����)

				size += add; // �迭 ����� add��ŭ �÷���
				strArr = new String[size]; // ���ο� �迭  �Ҵ�

				// strArr�� temp �ּҿ� �ִ� �迭�� ����(���� ����)
				//strArr = Arrays.copyOf(temp, size); // copyOf(T[] original, int newLength)

				for (int j = 0; j < temp.length; j++) {
					strArr[j] = temp[j];
				}
				
				temp = null;
			}

		} // end while;

		// ���
		System.out.println(Arrays.toString(strArr));
	}

	public void practice16_1() {
//		����ڰ� �Է��� �迭�� ���̸�ŭ�� ���ڿ� �迭�� ���� �� �Ҵ��ϰ�
//		�迭�� �ε����� ���� �� ���� ����ڰ� �Է��Ͽ� �ʱ�ȭ �ϼ���.
//		��, ����ڿ��� �迭�� ���� �� ������ ����� �� ���� �� �Է��� ����,
//		�ø� ���� � �����͸� ���� ������ ��������.
//		����ڰ� �� �̻� �Է����� �ʰڴٰ� �ϸ� �迭 ��ü ���� ����ϼ���.
		Scanner sc = new Scanner(System.in);

		System.out.print("�迭�� ũ�⸦ �Է��ϼ��� : ");
		int size = sc.nextInt();
		sc.nextLine();

		String[] strArr = new String[size];
		String[] temp = null;
		int i = 0;

		while (true) {
			for (; i < size; i++) {
				System.out.print((i + 1) + "��° ���ڿ� : ");
				strArr[i] = sc.nextLine();
			}

			System.out.print("�� ���� �Է��Ͻðڽ��ϱ�?(Y/N) : ");
			char ch = sc.nextLine().charAt(0);

			if (ch == 'N' || ch == 'n') {
				break;

			} else if (ch == 'Y' || ch == 'y') { // equlsslgnoreCase : ��ҹ��� ���� ����

				System.out.print("�� �Է��ϰ� ���� ���� : ");
				int add = sc.nextInt();
				sc.nextLine();

				temp = new String[size];

				for (int k = 0; k < size; k++) {
					temp[k] = strArr[k];
				}

				size += add;
				strArr = temp;
				// strArr = new String[size];
				strArr = Arrays.copyOf(strArr, size);

			}

		} // end while;

		// ���
		// System.out.println(Arrays.toString(strArr));

		System.out.print("[ ");
		for (int s = 0; s < strArr.length; s++) {

			if (s == strArr.length - 1) {
				System.out.print(strArr[s]);
			} else {
				System.out.print(strArr[s] + ", ");
			}
		}
		System.out.print(" ]");
	}

	public void practice16_2() {
//	����ڰ� �Է��� �迭�� ���̸�ŭ�� ���ڿ� �迭�� ���� �� �Ҵ��ϰ�
//	�迭�� �ε����� ���� �� ���� ����ڰ� �Է��Ͽ� �ʱ�ȭ �ϼ���.
//	��, ����ڿ��� �迭�� ���� �� ������ ����� �� ���� �� �Է��� ����,
//	�ø� ���� � �����͸� ���� ������ ��������.
//	����ڰ� �� �̻� �Է����� �ʰڴٰ� �ϸ� �迭 ��ü ���� ����ϼ���.
		Scanner sc = new Scanner(System.in);

		System.out.print("�迭�� ũ�⸦ �Է��ϼ��� : ");
		int size = sc.nextInt();
		sc.nextLine();

		ArrayList<String> arrayList = new ArrayList<>();
//		Queue q = new queue();

		String[] strArr = new String[size];
		for (int i = 0; i < strArr.length; i++) {
			System.out.print((i + 1) + "��° ���ڿ� : ");
			strArr[i] = sc.nextLine();
		}

		int temp = strArr.length;

		for (int i = 0; i < strArr.length; i++) {
			arrayList.add(strArr[i]);
		}

		while (true) {

			System.out.print("�� ���� �Է��Ͻðڽ��ϱ�?(Y/N) : ");
			char ch = sc.nextLine().charAt(0);

			if (ch == 'N' || ch == 'n') {
				break;

			} else if (ch == 'Y' || ch == 'y') {

				System.out.print("�� �Է��ϰ� ���� ���� : ");
				int resize = sc.nextInt();
				sc.nextLine();

				for (int i = 0; i < resize; i++) {
					System.out.print((temp + i + 1) + "��° ���ڿ� : ");
					arrayList.add(sc.nextLine());
				}
			} else {
				System.out.println("�߸� �Է��߽��ϴ�.");
			}
		}

		// ���.
		System.out.println(arrayList);

//		System.out.print("[ ");
//		for (int i = 0; i < arrayList.size(); i++) {
//			
//			if( i == arrayList.size()-1){
//				System.out.print(arrayList.get(i));
//			}else {
//			System.out.print(arrayList.get(i) + ",");
//			}
//		}System.out.print(" ]");
	}

}
