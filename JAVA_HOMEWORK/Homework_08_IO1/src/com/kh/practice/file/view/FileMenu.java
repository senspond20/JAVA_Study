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
			System.out.println("1. 노트 새로 만들기");
			System.out.println("2. 노트 열기");
			System.out.println("3. 노트 열어서 수정하기");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");

			int menuNum = Integer.parseInt(sc.nextLine());

			if (menuNum == 1) {
				fileSave();
			} else if (menuNum == 2) {
				fileOpen();
			} else if (menuNum == 3) {
				fileEdit();
			} else if (menuNum == 9) {
				System.out.println("프로그램을 종료합니다.");
				return;
			} else {
				System.out.println("잘못 입력하셨습니다.");
				continue;
			}
		}
	}

	public void fileSave() {

		String str = null;
		StringBuilder sb = new StringBuilder();
		int count = 0;
		while (true) {
			System.out.println("파일에 저장할 내용을 입력하세요");
			System.out.println("ex끝it 이라고 입력하면 종료됩니다.");
			System.out.printf("%02d 내용  : ", count++);
			str = sc.nextLine();
			if (str.equals("ex끝it")) {
				break;
			} else {
				sb.append(str);
			}
		}

		while (true) {
			System.out.print("저장할 파일명을 입력해주세요(ex. myFile.txt) : ");
			String file = sc.nextLine();
			
			if (fc.checkName(file)) {
				System.out.print("이미 존재하는 파일입니다. 덮어 쓰시겠씁니까? (y/n) : ");
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
			System.out.print("내용 : ");
			str = sc.nextLine();
			sb.append(str);
		} while (!str.equals("ex끝it"));

		System.out.print("저장할 파일명을 입력해주세요(ex. myFile.txt) : ");
		String file = sc.nextLine();

		// fc.fileSave(file, sb.toString()); // ex끝it가 함께 저장된다.
		fc.fileSave(file, sb.toString().substring(0, sb.lastIndexOf(str)));
	}

	public void fileOpen() {
		System.out.print("열 파일명 : ");
		String file = sc.nextLine();
		if (fc.checkName(file)) {
			StringBuilder sb = fc.fileOpen(file);

			System.out.println(sb);
		} else {
			System.out.println("없는 파일입니다.");
		}
	}

	public void fileEdit() {

		String str = null;
		System.out.print("열 파일명 : ");
		String file = sc.nextLine();
		
		if (fc.checkName(file)) {
			
			StringBuilder sb = new StringBuilder();
			
			while (true) {
				System.out.println("파일에 저장할 내용을 입력하세요");
				System.out.println("ex끝it 이라고 입력하면 종료됩니다.");
				System.out.print("내용 : ");
				str = sc.nextLine();
				
				if (str.equals("ex끝it")) {
					fc.fileEdit(file, sb.toString());
					sb = null;
					break;
				} else {
					sb.append(str);
				}
			}
		} else {
			System.out.println("없는 파일입니다.");
		}
	}
}
