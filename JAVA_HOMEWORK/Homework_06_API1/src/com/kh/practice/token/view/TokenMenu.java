package com.kh.practice.token.view;

import java.util.Scanner;

import com.kh.practice.token.controller.TokenController;

public class TokenMenu {

	Scanner sc = new Scanner(System.in);
	TokenController tc = new TokenController();
	
	public void mainMenu() {
		int menuNum;

		while (true) {
			System.out.println("1. ���� ���ڿ�");
			System.out.println("2. �Է� ���ڿ�");
			System.out.println("3. ���α׷� ������");
			System.out.print("�޴����� :");
			menuNum = Integer.parseInt(sc.nextLine());

			if (menuNum == 1) {
				tokenMenu();
			} else if (menuNum == 2) {
				inputMenu();
			} else if (menuNum == 3) {
				return;
			} else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է��ϼ���");
				continue;
			}
		}
	}

	public void tokenMenu() {
		String str = "J a v a P r o g r a m ";
		
		System.out.println("��� ó���� ���� : " + str.length());
		String afterStr = tc.afterToken(str);
		System.out.println("��� ó���� ���� : " + afterStr);
		System.out.println("��� ó���� ���� : " + afterStr.length());
		System.out.println("��� �빮�ڷ� ��ȯ : " + afterStr.toUpperCase());
		
		// ��ū ó�� �� ����, ��ū ó�� �� ������ ���
		// TokenController(tc)�� afterToken()�� ��ȯ ���� ������
		// ��ū ó�� �� ����, ��ū ó�� �� ����, ��� �빮�ڷ� ��ȯ �� ���� ���
	}

	public void inputMenu() {

		System.out.print("���ڿ��� �Է��ϼ��� : ");
		String input = sc.nextLine();
		// tc�� firstCap()�� �Է� ���� ���ڿ��� �ѱ�� ��ȯ �� ���
		System.out.print("ã�� ���ڸ� �ϳ� �Է��ϼ��� : ");
		char ch = sc.nextLine().charAt(0);
		
		System.out.println("���ڰ� �� ���� : " + tc.findChar(input, ch));
		
		// tc�� findChar()�� ���� �Է� ���� ���ڿ��� ��� ���� ���ڸ� ���ڷ� �Ѱ� // ��ȯ �� ���
	}

}
