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

		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("나이 : ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.print("성별 : ");
		char gender = sc.nextLine().charAt(0);

		mem = new Member(name, age, gender);
		lc.insertMember(mem);

		System.out.println("");

		while (mmNum != 9) {

			System.out.println("==== 메뉴 ==== ");
			System.out.println("1. 마이페이지 ");
			System.out.println("2. 도서 전체 조회 ");
			System.out.println("3. 도서 검색 ");
			System.out.println("4. 도서 대여하기 ");
			System.out.println("9. 프로그램 종료하기 ");
			System.out.print("메뉴 번호 : ");
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
				System.out.print(i + "번 도서 : " + bk[i].toString());
				System.out.println();
			}
		}

	}

	public void searchBook() {
		// “검색할 제목 키워드 : “

		System.out.print("검색할 제목 키워드 : ");
		String keyword = sc.nextLine();

		if(lc.SearchBook(keyword) == null){
			System.out.println("검색하신 keyword 는 없습니다.");

		}else {
			Book[] searchList = lc.SearchBook(keyword);
			for(int i = 0; i < searchList.length; i++) {
				System.out.print(searchList[i].toString());
				System.out.println();
			}
			System.out.println();
		}
	
		
		
		// LibraryController의 searchBook() 에 전달
		// 그 결과 값을 Book[] 자료형 searchList에 담아 검색 결과인 도서 목록 출력
	}

	public void rentBook() {
		
		selectAll();
		
		System.out.print("대여할 도서 번호 선택 : ");
		int index = sc.nextInt();
		sc.nextLine();
		
		int result = lc.rentBook(index);
		
		switch(result) {
		case 0  : break;
		case -1 : System.out.println("나이제한으로 대여 불가"); break;
		case 1  : System.out.println("성공적으로 대여 완료");break;
		case -2 : System.out.println("성공적으로 대여 완료, 요리학원 쿠폰 미발급"); break;
		case 2  : System.out.println("성공적으로 대여 완료, 요리학원 쿠폰 발급");break;
		}
			
		
	}
}
