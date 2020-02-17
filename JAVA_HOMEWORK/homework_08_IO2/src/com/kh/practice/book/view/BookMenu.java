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
			System.out.println("1. 도서 추가 저장");
			System.out.println("2. 저장 도서 출력");
			System.out.println("3. 파일 초기화");
			System.out.println("9. 프로그램 끝내기");
			System.out.print("메뉴 번호 : ");
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
				System.out.println("잘못 입력하셨습니다.");
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
		System.out.print("도서 명 : ");
		String title = sc.nextLine();
		System.out.print("저자 명 : ");
		String author = sc.nextLine();
		System.out.print("도서 가격 : ");
		int price = sc.nextInt();
		sc.nextLine();

		Calendar cDate;
		while (true) {
			System.out.print("출판 날짜(yyyy-mm-dd) : ");

			cDate = dc.strToCal(sc.nextLine());
			
			if (cDate == null) {
				System.out.println("잘못된 날짜형식입니다. 다시 입력해주세요");
			} else {
				break;
			}
		}
		
		System.out.print("할인율 : ");
		double dicount = sc.nextDouble();

		BookDAO.bArr[BookDAO.count++] = new Book(title, author, price, cDate, dicount);
		bc.fileSave(BookDAO.bArr);

	}

	public void fileRead() {
		Book[] brA = bc.fileRead();
		if (brA == null) {
			System.out.println("데이터가 없습니다.");
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
