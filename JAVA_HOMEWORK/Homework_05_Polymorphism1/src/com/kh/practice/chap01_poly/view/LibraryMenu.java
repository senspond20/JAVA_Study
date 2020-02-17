package com.kh.practice.chap01_poly.view;

import java.util.Scanner;

import com.kh.practice.chap01_poly.controller.LibaryController;
import com.kh.practice.chap01_poly.model.vo.Book;
import com.kh.practice.chap01_poly.model.vo.Member;

public class LibraryMenu {

	LibaryController lc = new LibaryController();

	Scanner sc = new Scanner(System.in);

	Member mem;
	private static int mmNum;

	public void mainMenu() {

		System.out.print("�̸� : ");
		String name = sc.nextLine();
		System.out.print("���� : ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.print("���� : ");
		char gender = sc.nextLine().charAt(0);

		mem = new Member(name, age, gender);
		lc.insertMember(mem);

		System.out.println("");

		while (mmNum != 9) {

			System.out.println("==== �޴� ==== ");
			System.out.println("1. ���������� ");
			System.out.println("2. ���� ��ü ��ȸ ");
			System.out.println("3. ���� �˻� ");
			System.out.println("4. ���� �뿩�ϱ� ");
			System.out.println("9. ���α׷� �����ϱ� ");
			System.out.print("�޴� ��ȣ : ");
			mmNum = sc.nextInt();
			sc.nextLine();

			switch (mmNum) {
			case 1:
				System.out.println(lc.myInfo().toString());
				break;
			case 2:
				selectAll();
				break;
			case 3:
				searchBook();
				break;
			case 4:
				rentBook();
				break;
			case 9:
				return;

			}

//			if (mmNum == 1) {
//			lc.myInfo();
//		} else if (mmNum == 2) {
//			selectAll();
//		} else if (mmNum == 3) {
//			searchBook();
//		} else if (mmNum == 4) {
//			rentBook();
//		} else if (mmNum == 9) {
//			return;
//		}
		}

	}

	public void selectAll() {

		Book[] bk;

		for (int i = 0; i < lc.SelectAll().length; i++) {
			bk = lc.SelectAll();
			if (bk[i] != null) {
				System.out.print(i + "�� ���� : " + bk[i].toString());
				System.out.println();
			}
		}

	}

	public void searchBook() {
		// ���˻��� ���� Ű���� : ��

		System.out.print("�˻��� ���� Ű���� : ");
		String keyword = sc.nextLine();

		if(lc.SearchBook(keyword) == null){
			System.out.println("�˻��Ͻ� keyword �� �����ϴ�.");

		}else {
			Book[] searchList = lc.SearchBook(keyword);
			for(int i = 0; i < searchList.length; i++) {
				System.out.print(searchList[i].toString());
				System.out.println();
			}
			System.out.println();
		}
	
		
		
		// LibraryController�� searchBook() �� ����
		// �� ��� ���� Book[] �ڷ��� searchList�� ��� �˻� ����� ���� ��� ���
	}

	public void rentBook() {
		
		selectAll();
		
		System.out.print("�뿩�� ���� ��ȣ ���� : ");
		int index = sc.nextInt();
		sc.nextLine();
		
		int result = lc.rentBook(index);
		
		switch(result) {
		case 0  : break;
		case -1 : System.out.println("������������ �뿩 �Ұ�"); break;
		case 1  : System.out.println("���������� �뿩 �Ϸ�");break;
		case -2 : System.out.println("���������� �뿩 �Ϸ�, �丮�п� ���� �̹߱�"); break;
		case 2  : System.out.println("���������� �뿩 �Ϸ�, �丮�п� ���� �߱�");break;
		}
			
		
	}
}
