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
		System.out.println("잘못 입력 하였습니다. 다시 입력해주세요");
	}

	private void exitProgram() {
		System.out.println("프로그램 종료");
		sc.close();
	}

	public void mainMenu() {
		int menuNum = 0;
		while (true) {
			System.out.println("===== ***** 메인 메뉴 ***** =====");
			System.out.println("1. 회원 가입");
			System.out.println("2. 로그인");
			System.out.println("3. 같은 이름 회원 찾기");
			System.out.println("9. 종료");

			System.out.print("메뉴 번호 입력 : ");
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
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호 : ");
		String pw = sc.nextLine();
		System.out.print("이름 : ");
		String name = sc.nextLine();

		if (mc.joinMembership(id, new Member(pw, name))) {
			System.out.println("성공적으로 회원가입 완료하였습니다.");
		} else {
			System.out.println("중복된 아이디입니다. 다시 입력해주세요. ");

		}

	}

//2
	public void logIn() {

		while (true) {
			System.out.print("아이디 : ");
			String id = sc.nextLine();
			System.out.print("비밀번호 : ");
			String pw = sc.nextLine();

			String loginstr = mc.logIn(id, pw);
			if (loginstr != null) {
				System.out.println(loginstr + "님, 환영합니다!");
				break;

			} else {
				System.out.println("틀린 아이디 또는 비밀번호입니다. 다시 입력해주세요.");
				continue;
			}
		}
	}

//3
	private void sameName() {
		System.out.print("이름 : ");
		String name = sc.nextLine();

		TreeMap<String, Member> r = mc.sameName(name);
		if (r.isEmpty()) {
			System.out.println("해당 이름을 가진 회원은 없습니다.");
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
			System.out.println("===== ***** 회원 메뉴 ***** =====");
			System.out.println("1. 비밀번호 바꾸기");
			System.out.println("2. 이름 바꾸기");
			System.out.println("3. 로그아웃");
			System.out.print("메뉴 번호 선택 : ");
			menuNum = Integer.parseInt(sc.nextLine());

			switch (menuNum) {
			case 1:
				changePassword();
				break;
			case 2:
				changeName();
				break;
			case 3:
				System.out.println("로그아웃 되었습니다.");
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
			System.out.print("아이디 : ");
			String id = sc.nextLine();
			System.out.print("현재 비밀번호 : ");
			String oldPw = sc.nextLine();

			System.out.print("새로운 비밀번호 : ");
			String newPw = sc.nextLine();

			if (mc.changePassword(id, oldPw, newPw)) {
				System.out.println("비밀번호 변경에 성공하였습니다.");
				break;

			} else {
				System.out.println("틀린 아이디 또는 비밀번호입니다. 다시 입력해주세요.");
				continue;
			}
		}

	}

//2
	private void changeName() {
		// TODO Auto-generated method stub
		while (true) {
			System.out.print("아이디 : ");
			String id = sc.nextLine();
			System.out.print("현재 비밀번호 : ");
			String pw = sc.nextLine();

			String oldName = mc.logIn(id, pw);

			if (oldName != null) {
				System.out.println("현재 설정된 이름 : " + oldName);

				System.out.print("새로운 이름: ");
				String newName = sc.nextLine();
				mc.changeName(id, pw, newName);
				System.out.println("이름 변경에 성공했습니다.");
				break;
			} else {
				System.out.println("아이디/비밀번호가 잘못 되었습니다. 다시 입력해주세요.");
				continue;
			}
		}
	}

}
