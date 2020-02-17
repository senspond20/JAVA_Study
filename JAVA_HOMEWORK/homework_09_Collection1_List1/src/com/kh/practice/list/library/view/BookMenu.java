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
			System.out.println("=====***** 메인 메뉴 *****=====");
			System.out.println("1. 새 도서 추가");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색 조회");
			System.out.println("4. 도서 삭제");
			System.out.println("5. 도서 명 오름차순 정렬");
			System.out.println("9 종료");
			System.out.println();
			System.out.print("메뉴 번호 입력 : ");

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
				System.out.println("프로그램 종료");
				return;
			default:
				System.out.println("잘못 입력하셨습니다.");
				continue;

			}
		}
	}

	public void insertBook() {
		System.out.println("===== 새 도서 추가 ======");
		System.out.print("1. 도서명 :");
		String title = sc.nextLine();
		System.out.print("2. 저자명 :");
		String author = sc.nextLine();
		System.out.print("3. 장르(1. 인문 / 2. 과학 / 3. 외국어 / 4. 기타) : ");
		int categoryNum = sc.nextInt();
		System.out.print("4. 가격 :");
		int price = sc.nextInt();
		sc.nextLine();

		String category = null;
		switch (categoryNum) {
		case 1:
			category = "인문";
			break;
		case 2:
			category = "과학";
			break;
		case 3:
			category = "외국어";
			break;
		case 4:
			category = "기타";
			break;
		default:
			category = "기타";
			break;
		}
		
		bc.insertBook(new Book(title,author,category,price));
	}

	public void selectList() {
		System.out.println("===== 도서 전체 조회 ======");
		ArrayList<Book> selectlist = bc.selectlist();
		if (selectlist.isEmpty()) {
			System.out.println("존재하는 도서가 없습니다.");
		} else {
			for (Book bk : selectlist) {
				System.out.println(bk.toString());
			}
		}
	}

	public void searchBook() {
		System.out.println("===== 도서 검색 ======");
		System.out.print("검색 키워드 : ");
		String keyword = sc.nextLine();

		ArrayList<Book> searchBook = bc.searchBook(keyword);
//		if (searchBook == null) {
		if (searchBook.isEmpty()) {
			System.out.println("해당 키워드가 없습니다.");
		} else {
			for (Book bk : searchBook) {
				System.out.println(bk.toString());
			}
		}

	}

	public void deleteBook() {
		System.out.println("===== 도서 삭제 ======");
		System.out.print("삭제할 도서 명 : ");
		String title = sc.nextLine();
		System.out.print("삭제할 저자 명 : ");
		String author = sc.nextLine();

		Book removeBook = bc.deleteBook(title, author);
		if (removeBook == null) {
			System.out.println("삭제할 도서를 찾지 못했습니다.");
		} else {
			System.out.println(removeBook.toString());
			System.out.println("성공적으로 삭제 되었습니다.");
		}

	}

	public void ascBook() {

		if (bc.ascBook() == 1) {
			System.out.println("정렬에 성공하였습니다.");
		} else {
			System.out.println("정렬에 실패하였습니다.");
		}
	}
}
