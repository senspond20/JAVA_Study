package com.kh.practice.file.view;

import java.util.Scanner;

import com.kh.practice.file.controller.FileController;

public class FileMenu {

	Scanner sc = new Scanner(System.in);
	FileController fc = new FileController();

	public void mainMenu() {
			//fc.fileOpen("t3.txt");
		while (true) {

			System.out.println("***** My Note *****");
			System.out.println("1. ��Ʈ ���� �����");
			System.out.println("2. ��Ʈ ����");
			System.out.println("3. ��Ʈ ��� �����ϱ�");
			System.out.println("9. ������");
			System.out.print("�޴� ��ȣ : ");

			int menuNum = Integer.parseInt(sc.nextLine());

			if (menuNum == 1) {
				fileSave();
			} else if (menuNum == 2) {
				fileOpen();
			} else if (menuNum == 3) {
				fileEdit();
			} else if (menuNum == 9) {
				System.out.println("���α׷��� �����մϴ�.");
				return;
			} else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				continue;
			}
		}
	}

	public void fileSave() {

		String str = null;
		StringBuilder sb = new StringBuilder();
		int count = 0;
		while (true) {
			System.out.println("���Ͽ� ������ ������ �Է��ϼ���");
			System.out.println("ex��it �̶�� �Է��ϸ� ����˴ϴ�.");
			System.out.printf("%02d ����  : ", count++);
			str = sc.nextLine();
			if (str.equals("ex��it")) {
				break;
			} else {
				sb.append(str);
			}
		}

		while (true) {
			System.out.print("������ ���ϸ��� �Է����ּ���(ex. myFile.txt) : ");
			String file = sc.nextLine();
			
			if (fc.checkName(file)) {
				System.out.print("�̹� �����ϴ� �����Դϴ�. ���� ���ðھ��ϱ�? (y/n) : ");
				char ch = sc.nextLine().charAt(0);
				if (ch == 'y' || ch == 'Y') {
					fc.fileSave(file, sb.toString());
					break;
				} else if (ch == 'n' || ch == 'N') {
					continue;
				}
			} else {
				fc.fileSave(file, sb.toString());
				break;
			}
		}

	}

	public void fileSave2() {

		String str = null;
		StringBuilder sb = new StringBuilder();

		do {
			System.out.print("���� : ");
			str = sc.nextLine();
			sb.append(str);
		} while (!str.equals("ex��it"));

		System.out.print("������ ���ϸ��� �Է����ּ���(ex. myFile.txt) : ");
		String file = sc.nextLine();

		// fc.fileSave(file, sb.toString()); // ex��it�� �Բ� ����ȴ�.
		fc.fileSave(file, sb.toString().substring(0, sb.lastIndexOf(str)));
	}

	public void fileOpen() {
		System.out.print("�� ���ϸ� : ");
		String file = sc.nextLine();
		if (fc.checkName(file)) {
			StringBuilder sb = fc.fileOpen(file);

			System.out.println(sb);
		} else {
			System.out.println("���� �����Դϴ�.");
		}
	}

	public void fileEdit() {

		String str = null;
		System.out.print("�� ���ϸ� : ");
		String file = sc.nextLine();
		
		if (fc.checkName(file)) {
			
			StringBuilder sb = new StringBuilder();
			
			while (true) {
				System.out.println("���Ͽ� ������ ������ �Է��ϼ���");
				System.out.println("ex��it �̶�� �Է��ϸ� ����˴ϴ�.");
				System.out.print("���� : ");
				str = sc.nextLine();
				
				if (str.equals("ex��it")) {
					fc.fileEdit(file, sb.toString());
					sb = null;
					break;
				} else {
					sb.append(str);
				}
			}
		} else {
			System.out.println("���� �����Դϴ�.");
		}
	}
}
