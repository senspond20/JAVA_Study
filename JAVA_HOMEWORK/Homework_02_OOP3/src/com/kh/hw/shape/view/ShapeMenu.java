package com.kh.hw.shape.view;

import java.util.Scanner;

import com.kh.hw.shape.controller.SquareController;
import com.kh.hw.shape.controller.TriangleController;

public class ShapeMenu {

	Scanner sc = new Scanner(System.in);

	SquareController scr = new SquareController();
	TriangleController tc = new TriangleController();

	private int mainNum = 0;
//	int menuNum = 0;

	// ��� ����
	// ===== ���� ���α׷� =====
	// 3. �ﰢ�� ==> triangleMenu()
	// 4. �簢�� ==> squareMenu()
	// 9. ���α׷� ���� => �����α׷� ���ᡱ ��� �� ���α׷� ����
	// �޴� ��ȣ :
	// �߸� �Է����� �� ���߸��� ��ȣ�Դϴ�. �ٽ� �Է����ּ���.�� ��� �� �ݺ�
	public void inputMenu() {

		while (true) {
			System.out.println("===== ���� ���α׷� ======");
			System.out.println("3. �ﰢ�� ");
			System.out.println("4. �簢�� ");
			System.out.println("9. ���α׷� ����");

			System.out.print("�޴� ��ȣ : ");
			mainNum = sc.nextInt();

			if (mainNum == 3) {
				triangleMenu();
				break;
			} else if (mainNum == 4) {
				squareMenu();
				break;
			} else {
				System.out.println("�߸��� ��ȣ�Դϴ�. �ٽ� �Է����ּ���");
			}

			printInformation(mainNum);
		}
	}

	// ===== �ﰢ�� =====
	// 1. �ﰢ�� ���� ==> inputSize()
	// 2. �ﰢ�� ��ĥ ==> inputSize()
	// 3. �ﰢ�� ���� ==> printInformation()
	// 9. �������� ==> ���������� ���ư��ϴ�.�� ��� �� inputMenu()��
	// �޴� ��ȣ :
	// �߸� �Է����� �� ���߸��� ��ȣ�Դϴ�. �ٽ� �Է����ּ���.�� ��� �� �ݺ�
	public void triangleMenu() {

		boolean ck = true;

		while (ck) {
			System.out.println("===== �ﰢ�� =====");
			System.out.println("1. �ﰢ�� ����");
			System.out.println("2. �ﰢ�� ��ĥ");
			System.out.println("3. �ﰢ�� ����");
			System.out.println("9. ��������");
			System.out.print("�޴� ��ȣ : ");
			int menuNum = sc.nextInt();

			switch (menuNum) {
			case 1:
			case 2:
			case 3:
				inputSize(mainNum, menuNum);
				ck = false;
				break;
			case 9:
				System.out.println("�������� ���ư��ϴ�");
				ck = false;
				inputMenu();
				break;
			default:
				System.out.println("�߸��� ��ȣ�Դϴ�. �ٽ� �Է����ּ���");
				ck = true;
				continue;
			}
		}
	}

	// �Ű������� ���� type�� menuNum�� ���ڿ� ���� ����� �޶���
	public void inputSize(int type, int menuNum) {

		// int type�� ���ﰢ�����̸鼭 menuNum�� 1���� ���
		// ���� :
		// �ʺ� :
		// �ﰢ�� ���� : ==> tc(TriangleController)�� calcArea() ���
		// int type�� ���ﰢ�����̸鼭 menuNum�� 2���� ���
		// ������ �Է��ϼ��� :
		// tc�� paintColor() ȣ�� �� ������ �����Ǿ����ϴ١� ���

		int height = 0;
		int width = 0;

		// color
		if (type == 4 && menuNum == 3 || type == 3 && menuNum == 2) {
			
			System.out.print("������ �Է��ϼ��� : ");

		} else {

			System.out.print("���� : ");
			height = sc.nextInt();
			System.out.print("�ʺ� : ");
			width = sc.nextInt();
			sc.nextLine();

			if (type == 3) {

				switch (menuNum) {
				case 1:
					System.out.println("�簢�� ���� : " + tc.calcArea(height, width));
					break;
				case 3:
					System.out.println(tc.print());
					break;
				default:
					break;
				}
				
				
				
			}

			// int type�� ���簢�����̸鼭 menuNum�� 1���̳� 2���� ���
			// ���� :
			// �ʺ� :
			// menuNum�� 1���� ���
			// �簢�� �ѷ� : ==> scr(SquareController)�� calcPerimeter() ���
			// menuNum�� 2���� ���
			// �簢�� ���� : ==> scr�� calcArea() ���
			// int type�� ���簢�����̸鼭 menuNum�� 3���� ���
			// ������ �Է��ϼ��� :
			// scr�� paintColor() ȣ�� �� ������ �����Ǿ����ϴ١� ���

			else if (type == 4) {

				switch (menuNum) {
				case 1:
					System.out.println("�簢�� �ѷ� : " + scr.calcPerimeter(height, width));
					break;
				case 2:
					System.out.println("�簢�� ���� : " + scr.calcArea(height, width));
					break;
				default:
					break;
				}
			}

		}
		//

	}

	// int type�� ���� print()�޼ҵ带 �ҷ����� controller�� �ٸ�
	// int type�� ���ﰢ������ ��� tc.print() ���
	// int type�� ���簢������ ��� scr.print() ���
	public void printInformation(int type) {

		if (type == 3) {
			System.out.println(tc.print());

		} else if (type == 4) {
			System.out.println(scr.print());
		}

	}

	public void squareMenu() {
		// ===== �簢�� =====
		// 1. �簢�� �ѷ� ==> inputSize()
		// 2. �簢�� ���� ==> inputSize()
		// 3. �簢�� ��ĥ ==> inputSize()
		// 4. �簢�� ���� ==> printInformation()
		// 9. �������� ==> ���������� ���ư��ϴ�.�� ��� �� inputMenu()��
		// �޴� ��ȣ :
		// �߸� �Է����� �� ���߸��� ��ȣ�Դϴ�. �ٽ� �Է����ּ���.�� ��� �� �ݺ�

		boolean ck = true;

		while (ck) {
			System.out.println("===== �ﰢ�� =====");
			System.out.println("1. �簢�� �ѷ�");
			System.out.println("2. �簢�� ����");
			System.out.println("3. �簢�� ��ĥ");
			System.out.println("9. ��������");
			System.out.print("�޴� ��ȣ : ");
			int menuNum = sc.nextInt();

			switch (menuNum) {
			case 1:	case 2:
				inputSize(mainNum, menuNum);
				ck = false;
			case 9:
				System.out.println("�������� ���ư��ϴ�");
				ck = false;
				inputMenu();
				break;
			default:
				System.out.println("�߸��� ��ȣ�Դϴ�. �ٽ� �Է����ּ���");
				ck = true;
				continue;
			}
		}
	}
	// �ﰢ�� �޴�, �簢�� �޴��� ���� �޴����� ��� ���� �޼ҵ�� �̵��ϱ� ������
	// �ﰢ������ �簢������, �� �� �޴����� �����ϱ� ���� �Ű������� �Ѱ���
}
