package com.kh.practice.list.library.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.practice.list.library.controller.BookController;
import com.kh.practice.list.library.model.vo.Book;

public class BookMenu {
	// BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
	Scanner sc = new Scanner(System.in);
	BookController bc = new BookController();

	public BookMenu() {

	}

	public void mainMenu() {
		int menuNum = 0;
		System.out.println("===== Welcome KH Library =====");
		while (true) {
			System.out.println("=====***** ���� �޴� *****=====");
			System.out.println("1. �� ���� �߰�");
			System.out.println("2. ���� ��ü ��ȸ");
			System.out.println("3. ���� �˻� ��ȸ");
			System.out.println("4. ���� ����");
			System.out.println("5. ���� �� �������� ����");
			System.out.println("9 ����");
			System.out.println();
			System.out.print("�޴� ��ȣ �Է� : ");

			menuNum = Integer.parseInt(sc.nextLine());

			switch (menuNum) {
			case 1:
				insertBook();
				break;
			case 2:
				selectList();
				break;
			case 3:
				searchBook();
				break;
			case 4:
				deleteBook();
				break;
			case 5:
				ascBook();
				break;
			case 9:
				System.out.println("���α׷� ����");
				return;
			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				continue;

			}
		}
	}

	public void insertBook() {
		System.out.println("===== �� ���� �߰� ======");
		System.out.print("1. ������ :");
		String title = sc.nextLine();
		System.out.print("2. ���ڸ� :");
		String author = sc.nextLine();
		System.out.print("3. �帣(1. �ι� / 2. ���� / 3. �ܱ��� / 4. ��Ÿ) : ");
		int categoryNum = sc.nextInt();
		System.out.print("4. ���� :");
		int price = sc.nextInt();
		sc.nextLine();

		String category = null;
		switch (categoryNum) {
		case 1:
			category = "�ι�";
			break;
		case 2:
			category = "����";
			break;
		case 3:
			category = "�ܱ���";
			break;
		case 4:
			category = "��Ÿ";
			break;
		default:
			category = "��Ÿ";
			break;
		}
		
		bc.insertBook(new Book(title,author,category,price));
	}

	public void selectList() {
		System.out.println("===== ���� ��ü ��ȸ ======");
		ArrayList<Book> selectlist = bc.selectlist();
		if (selectlist.isEmpty()) {
			System.out.println("�����ϴ� ������ �����ϴ�.");
		} else {
			for (Book bk : selectlist) {
				System.out.println(bk.toString());
			}
		}
	}

	public void searchBook() {
		System.out.println("===== ���� �˻� ======");
		System.out.print("�˻� Ű���� : ");
		String keyword = sc.nextLine();

		ArrayList<Book> searchBook = bc.searchBook(keyword);
//		if (searchBook == null) {
		if (searchBook.isEmpty()) {
			System.out.println("�ش� Ű���尡 �����ϴ�.");
		} else {
			for (Book bk : searchBook) {
				System.out.println(bk.toString());
			}
		}

	}

	public void deleteBook() {
		System.out.println("===== ���� ���� ======");
		System.out.print("������ ���� �� : ");
		String title = sc.nextLine();
		System.out.print("������ ���� �� : ");
		String author = sc.nextLine();

		Book removeBook = bc.deleteBook(title, author);
		if (removeBook == null) {
			System.out.println("������ ������ ã�� ���߽��ϴ�.");
		} else {
			System.out.println(removeBook.toString());
			System.out.println("���������� ���� �Ǿ����ϴ�.");
		}

	}

	public void ascBook() {

		if (bc.ascBook() == 1) {
			System.out.println("���Ŀ� �����Ͽ����ϴ�.");
		} else {
			System.out.println("���Ŀ� �����Ͽ����ϴ�.");
		}
	}
}
