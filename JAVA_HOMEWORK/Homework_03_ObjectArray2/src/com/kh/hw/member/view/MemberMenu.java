package com.kh.hw.member.view;

import java.util.Scanner;

import com.kh.hw.member.model.controller.MemberController;
import com.kh.hw.member.model.vo.Member;

public class MemberMenu {

	MemberController mc = new MemberController();
	Scanner sc = new Scanner(System.in);

	public MemberMenu() {

	}

	public void mainMenu() {

		while (true) {

			int exNum = mc.existMemberNum();
			System.out.println("===================================");
			System.out.println("�ִ� ��� ������ ȸ�� ���� 10���Դϴ�.");
			System.out.println("���� ��ϵ� ȸ�� ���� " + exNum + "�� �Դϴ�.");
			System.out.println("===================================");
			
			if (exNum != 10) {
				System.out.println("1. �� ȸ�� ��� ");
			} else {
				System.out.println("<- ȸ������ �� á�� ������ �Ϻ� �޴��� ���µ˴ϴ�. ->");
			}

			System.out.println("2. ȸ�� �˻�");
			System.out.println("3. ȸ�� ���� ����");
			System.out.println("4. ȸ�� ����");
			System.out.println("5. ��� ���");
			System.out.println("9. ������");

			System.out.print("�޴� ��ȣ : ");
//			int menuNum = sc.nextInt();
//			sc.nextLine();
			int menuNum = Integer.parseInt(sc.nextLine());

			if (menuNum == 1 && exNum != 10) {
				insertMember();
				continue;
			} else {
				switch (menuNum) {
				case 2:
					searchMember();
					break;
				case 3:
					updateMember();
					break;
				case 4:
					deleteMember();
					break;
				case 5:
					printAll();
					break;
				case 9:
					System.out.println("���α׷��� �����մϴ�.");
					return;
				default:
					System.out.println("�߸� �Է��ϼ̽��ϴ�.");
					continue;
				}
			}

		}

	}

	public void insertSample() {
		mc.insertMember("aaaaa", "�ڽſ�", "aa", "aaa@aaa.aaa", 'F', 33);
		mc.insertMember("bbbbb", "�ڽſ�", "bb", "bbb@bbb.bbb", 'M', 34);
		mc.insertMember("ccccc", "������", "cc", "ccc@ccc.ccc", 'M', 28);
		mc.insertMember("ddddd", "�����", "dd", "ddd@ddd.ddd", 'M', 35);
		mc.insertMember("eeeee", "�����", "ee", "eee@eee.eee", 'F', 17);
		mc.insertMember("fffff", "���̹�", "ff", "aaa@aaa.aaa", 'F', 20);
		mc.insertMember("ggggg", "�ں���", "gg", "ggg@ggg.ggg", 'M', 26);
		mc.insertMember("hhhhh", "�ۼ���", "hh", "hhh@hhh.hhh", 'M', 41);
		mc.insertMember("iiiii", "������", "ii", "iii@iii.iii", 'F', 28);
		mc.insertMember("jjjjj", "������", "jj", "jjj@jjj.jjj", 'M', 23);
	}

	public void insertMember() {

		System.out.println("�� ȸ���� ����մϴ�.");
		String id = null;

		while (true) {
			System.out.print("���̵�:");
			id = sc.nextLine();

			if (mc.checkld(id)) {
				System.out.println("�ߺ��� ���̵��Դϴ�. �ٽ� �Է��ϼ���.");
				continue;
			} else {
				break;
			}
		}

		System.out.print("�̸�:");
		String name = sc.nextLine();
		System.out.print("��й�ȣ:");
		String password = sc.nextLine();
		System.out.print("�̸���:");
		String email = sc.nextLine();
		System.out.print("����(M/F):");
		char gender = sc.nextLine().charAt(0);
		System.out.print("����:");
		int age = Integer.parseInt(sc.nextLine());
//
		mc.insertMember(id, name, password, email, gender, age);


	}

	// ȸ�� �˻�
	public void searchMember() {
		int smNum = 0;

		while (true) {
			System.out.println("1. ���̵�� �˻��ϱ�");
			System.out.println("2. �̸����� �˻��ϱ�");
			System.out.println("3. �̸��Ϸ� �˻��ϱ�");
			System.out.println("9. �������� ���ư���");
			System.out.print("�޴� ��ȣ  : ");

			smNum = Integer.parseInt(sc.nextLine());
//			smNum = sc.nextInt();
//			sc.nextLine();

			switch (smNum) {
			case 1:
				searchId();
				break;
			case 2:
				searchName();
				break;
			case 3:
				searchEmail();
				break;
			case 9:
				mainMenu();
				System.out.println("�������� ���ư��ϴ�.");
				return;
			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				return;
			}

		}
	}

	public void searchId() {

		System.out.print("���̵� : ");
		String id = sc.nextLine();
		String serchIdStirng = mc.serchId(id);

		if (serchIdStirng != null) {
			System.out.println(serchIdStirng);
		} else {
			System.out.println("ã���ô� �˻� ����� �����ϴ�.");
		}

	}

	public void searchName() {
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		Member[] mm = mc.serchName(name);

		if (mm == null) {
			System.out.println("ã���ô� �˻� ����� �����ϴ�.");
		} else {
			for (int i = 0; i < mm.length; i++) {
				System.out.println(mm[i].inform());
			}
		}
	}

	public void searchEmail() {
		System.out.print("�̸��� : ");
		String email = sc.nextLine();
		Member[] mm = mc.serchEmail(email);

		if (mm == null) {
			System.out.println("ã���ô� �˻� ����� �����ϴ�.");
		} else {
			for (int i = 0; i < mm.length; i++) {
				System.out.println(mm[i].inform());
			}
		}
	}

	public void deleteMember() {

		int smNum = 0;

		while (true) {
			System.out.println("1. Ư�� ȸ�� �����ϱ�");
			System.out.println("2. ��� ȸ�� �����ϱ�");
			System.out.println("9. �������� ���ư���");
			System.out.print("�޴� ��ȣ  : ");

			smNum = Integer.parseInt(sc.nextLine());
			switch (smNum) {
			case 1:
				System.out.print("id �Է� : ");
				String id = sc.nextLine();
				deleteOne(id);				
				return;
			case 2:
				deleteAll();
				return;
			case 9:
				mainMenu();
				System.out.println("�������� ���ư��ϴ�.");
				return;
			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				return;
			}

		}

	}

	// �̰� ���� �ȵ�
	public void deleteOne(String id) {
		boolean ck = mc.delete(id);
		if (ck == true) {
			System.out.println("�ش� ���̵� �����Ǿ����ϴ�.");
		} else {
			System.out.println("�׷� ���̵�� �����ϴ�.");
		}
	}

	public void deleteAll() {
	
		System.out.print("���� �����Ͻðڽ��ϱ�?(y/n) : ");
		char yn = sc.nextLine().charAt(0);
		
		if(yn == 'y' || yn == 'Y') {
			mc.delete();
			System.out.println("���������� �����Ͽ����ϴ�.");
		}else {
			System.out.println("������ ����ϼ̽��ϴ�.");
		}
	}

	public void updateMember() {

		int upNum = 0;
		while (true) {
			System.out.println("1. ��й�ȣ �����ϱ�");
			System.out.println("2. �̸� �����ϱ�");
			System.out.println("3. �̸��� �����ϱ�");
			System.out.println("9. �������� ���ư���");
			System.out.print("�޴� ��ȣ : ");
			upNum = sc.nextInt();
			sc.nextLine();

			if (upNum == 1) {
				updatePassword();
			} else if (upNum == 2) {
				updateName();
			} else if (upNum == 3) {
				updateEmail();
			} else if (upNum == 9) {
				System.out.println("�������� ���ư��ϴ�.");
				return;
			} else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				return;
			}
		}
	}

	//
	public void updatePassword() {

		System.out.print("������ ȸ���� ���̵� : ");
		String id = sc.nextLine();

		System.out.print("������ ��й�ȣ  : ");
		String password = sc.nextLine();

		// �˻�
		if (mc.updatePassword(id, password)) {		
			System.out.println("������ ���������� �Ǿ����ϴ�.");
			mainMenu();
			
		} else {
			System.out.println("�������� �ʴ� ���̵��Դϴ�.");
			mainMenu();
		}
	}

	public void updateName() {
		System.out.print("������ ȸ���� ���̵� : ");
		String id = sc.nextLine();

		System.out.print("������ �̸�  : ");
		String name = sc.nextLine();

		// �˻�
		if (mc.updateName(id, name)) {		
			System.out.println("������ ���������� �Ǿ����ϴ�.");
			mainMenu();
			
		} else {
			System.out.println("�������� �ʴ� ���̵��Դϴ�.");
			mainMenu();
		}
	}

	public void updateEmail() {
		System.out.print("������ ȸ���� ���̵� : ");
		String id = sc.nextLine();

		System.out.print("������ �̸���  : ");
		String email = sc.nextLine();

		// �˻�
		if (mc.updateEmail(id, email)) {		
			System.out.println("������ ���������� �Ǿ����ϴ�.");
			mainMenu();
			
		} else {
			System.out.println("�������� �ʴ� ���̵��Դϴ�.");
			mainMenu();
		}
	}

	//
	public void printAll() {
		Member[] mlist = mc.printAll();

		if (mlist == null) {
			System.out.println("== ȸ���� �����ϴ�. ==");
		} else {
			for (int i = 0; i < mc.existMemberNum(); i++) {
				System.out.println(mlist[i].inform());
			}
		}
	}

}
