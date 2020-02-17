package com.kh.practice.map.view;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeMap;

import com.kh.practice.map.controller.MemberController;
import com.kh.practice.map.model.vo.Member;

public class MemberMenu {

	Scanner sc = null;
	MemberController mc = new MemberController();

	public MemberMenu() {
		sc = new Scanner(System.in);
	}

	private void reTryMessage() {
		System.out.println("�߸� �Է� �Ͽ����ϴ�. �ٽ� �Է����ּ���");
	}

	private void exitProgram() {
		System.out.println("���α׷� ����");
		sc.close();
	}

	public void mainMenu() {
		int menuNum = 0;
		while (true) {
			System.out.println("===== ***** ���� �޴� ***** =====");
			System.out.println("1. ȸ�� ����");
			System.out.println("2. �α���");
			System.out.println("3. ���� �̸� ȸ�� ã��");
			System.out.println("9. ����");

			System.out.print("�޴� ��ȣ �Է� : ");
			menuNum = Integer.parseInt(sc.nextLine());
			switch (menuNum) {

			case 1:
				joinMembership();
				break;
			case 2:
				logIn();
				memberMenu();
				break;
			case 3:
				sameName();
				break;
			case 9:
				exitProgram();
				return;
			default:
				reTryMessage();
				continue;
			}
		}
	}

//1
	public void joinMembership() {
		System.out.print("���̵� : ");
		String id = sc.nextLine();
		System.out.print("��й�ȣ : ");
		String pw = sc.nextLine();
		System.out.print("�̸� : ");
		String name = sc.nextLine();

		if (mc.joinMembership(id, new Member(pw, name))) {
			System.out.println("���������� ȸ������ �Ϸ��Ͽ����ϴ�.");
		} else {
			System.out.println("�ߺ��� ���̵��Դϴ�. �ٽ� �Է����ּ���. ");

		}

	}

//2
	public void logIn() {

		while (true) {
			System.out.print("���̵� : ");
			String id = sc.nextLine();
			System.out.print("��й�ȣ : ");
			String pw = sc.nextLine();

			String loginstr = mc.logIn(id, pw);
			if (loginstr != null) {
				System.out.println(loginstr + "��, ȯ���մϴ�!");
				break;

			} else {
				System.out.println("Ʋ�� ���̵� �Ǵ� ��й�ȣ�Դϴ�. �ٽ� �Է����ּ���.");
				continue;
			}
		}
	}

//3
	private void sameName() {
		System.out.print("�̸� : ");
		String name = sc.nextLine();

		TreeMap<String, Member> r = mc.sameName(name);
		if (r.isEmpty()) {
			System.out.println("�ش� �̸��� ���� ȸ���� �����ϴ�.");
		} else {
			// System.out.println(r.values());
			Iterator<String> it = r.keySet().iterator();
			while (it.hasNext()) {
				String key = it.next();
				System.out.println(r.get(key));
			}

		}

	}

	private void memberMenu() {

		int menuNum = 0;
		while (true) {
			System.out.println("===== ***** ȸ�� �޴� ***** =====");
			System.out.println("1. ��й�ȣ �ٲٱ�");
			System.out.println("2. �̸� �ٲٱ�");
			System.out.println("3. �α׾ƿ�");
			System.out.print("�޴� ��ȣ ���� : ");
			menuNum = Integer.parseInt(sc.nextLine());

			switch (menuNum) {
			case 1:
				changePassword();
				break;
			case 2:
				changeName();
				break;
			case 3:
				System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
				return;
			default:
				reTryMessage();
				continue;

			}
		}
	}

//1
	private void changePassword() {
		while (true) {
			System.out.print("���̵� : ");
			String id = sc.nextLine();
			System.out.print("���� ��й�ȣ : ");
			String oldPw = sc.nextLine();

			System.out.print("���ο� ��й�ȣ : ");
			String newPw = sc.nextLine();

			if (mc.changePassword(id, oldPw, newPw)) {
				System.out.println("��й�ȣ ���濡 �����Ͽ����ϴ�.");
				break;

			} else {
				System.out.println("Ʋ�� ���̵� �Ǵ� ��й�ȣ�Դϴ�. �ٽ� �Է����ּ���.");
				continue;
			}
		}

	}

//2
	private void changeName() {
		// TODO Auto-generated method stub
		while (true) {
			System.out.print("���̵� : ");
			String id = sc.nextLine();
			System.out.print("���� ��й�ȣ : ");
			String pw = sc.nextLine();

			String oldName = mc.logIn(id, pw);

			if (oldName != null) {
				System.out.println("���� ������ �̸� : " + oldName);

				System.out.print("���ο� �̸�: ");
				String newName = sc.nextLine();
				mc.changeName(id, pw, newName);
				System.out.println("�̸� ���濡 �����߽��ϴ�.");
				break;
			} else {
				System.out.println("���̵�/��й�ȣ�� �߸� �Ǿ����ϴ�. �ٽ� �Է����ּ���.");
				continue;
			}
		}
	}

}
