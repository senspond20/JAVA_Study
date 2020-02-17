package com.kh.practice.book.view;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import com.kh.practice.book.controller.BookController;
import com.kh.practice.book.model.dao.BookDAO;
import com.kh.practice.book.model.vo.Book;
import com.kh.practice.modul.DateConversion;

public class BookMenu {
	Scanner sc = new Scanner(System.in);
//	BufferedReader sc = new BufferedReader((System.in));
	BookController bc = new BookController();
	DateConversion dc = new DateConversion();
	
	public BookMenu() {
		bc.makeFile();
	}

	public void mainMenu() {
		int menuNum = 0;
		while (true) {
			System.out.println("1. ���� �߰� ����");
			System.out.println("2. ���� ���� ���");
			System.out.println("3. ���� �ʱ�ȭ");
			System.out.println("9. ���α׷� ������");
			System.out.print("�޴� ��ȣ : ");
			menuNum = sc.nextInt();
			sc.nextLine();
			if (menuNum == 1) {
				fileSave();
			} else if (menuNum == 2) {
				fileRead();
			} else if (menuNum == 3) {
				fileInit();
			} else if (menuNum == 9) {
				return;
			} else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				continue;
			}
		}

	}

	private void fileInit() {
		// TODO Auto-generated method stub
		bc.deleteFile();
		bc.makeFile();
	}

	public void fileSave() {
		System.out.print("���� �� : ");
		String title = sc.nextLine();
		System.out.print("���� �� : ");
		String author = sc.nextLine();
		System.out.print("���� ���� : ");
		int price = sc.nextInt();
		sc.nextLine();

		Calendar cDate;
		while (true) {
			System.out.print("���� ��¥(yyyy-mm-dd) : ");

			cDate = dc.strToCal(sc.nextLine());
			
			if (cDate == null) {
				System.out.println("�߸��� ��¥�����Դϴ�. �ٽ� �Է����ּ���");
			} else {
				break;
			}
		}
		
		System.out.print("������ : ");
		double dicount = sc.nextDouble();

		BookDAO.bArr[BookDAO.count++] = new Book(title, author, price, cDate, dicount);
		bc.fileSave(BookDAO.bArr);

	}

	public void fileRead() {
		Book[] brA = bc.fileRead();
		if (brA == null) {
			System.out.println("�����Ͱ� �����ϴ�.");
		} else {
			for (int i = 0; i < brA.length; i++) {
				if (brA[i] == null) {
					break;
				} else {
					System.out.println(brA[i].toString());
				}
			}
		}
	}
}
