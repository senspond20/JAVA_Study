package com.kh.practice.set.view;

import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

import org.w3c.dom.ls.LSException;

import com.kh.practice.set.controller.LotteryController;
import com.kh.practice.set.model.vo.Lottery;

public class LotteryMenu {

	LotteryController lc = new LotteryController();
	Scanner sc = new Scanner(System.in);


	public void mainMenu() {
		int menuNum = 0;
		System.out.println("========= KH 추첨 프로그램 =========");
		while (true) {
			System.out.println("******* 메인 메뉴 *******");
			System.out.println("1. 추첨 대상 추가");
			System.out.println("2. 추첨 대상 삭제");
			System.out.println("3. 당첨 대상 확인");
			System.out.println("4. 정렬된 당첨 대상 확인");
			System.out.println("5. 당첨 대상 검색");
			System.out.println("9. 종료");
			System.out.print("메뉴 번호 선택 : ");
			menuNum = Integer.parseInt(sc.nextLine());
			switch (menuNum) {
			case 1:
				insertObject();
				break;
			case 2:
				deleteObject();
				break;
			case 3:
				winObject();
				break;
			case 4:
				sortedWinObject();
				break;
			case 5:
				searchWinner();
				break;
			case 9:
				System.out.println("프로그램 종료");
				return;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요");
				continue;
			}
		}
	}

	// 1
	public void insertObject() {

		System.out.print("추가할 추첨 대상 수 : ");
		int count = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < count; i++) {
			System.out.print("이름 : ");
			String name = sc.nextLine();
			System.out.print("핸드폰 번호('-'빼고) : ");
			String phone = sc.nextLine();

			System.out.println();
			lc.insertObject(new Lottery(name, phone));
		}
		System.out.println(count + "명 추가 완료 되었습니다.");

	}

	// 2
	public void deleteObject() {
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("핸드폰 번호('-'빼고) : ");
		String phone = sc.nextLine();

		boolean ck = lc.deleteObject(new Lottery(name, phone));
		if(ck) {
			System.out.println("삭제 성공");
		}else {
			System.out.println("삭제 실패");
		}
	}

	// 3
	public void winObject() {
		HashSet<Lottery> hs = lc.winObject();
		if (hs == null) {
			System.out.println("당첨 대상이 없습니다. (추첨대상은 최소 4명 이상)");
		} else {
			System.out.println(hs);
		}

	}

	// 4
	public void sortedWinObject() {
		TreeSet<Lottery> ls = lc.sortedWinObject();
		if(ls != null) {
		for (Lottery var : ls) {
			System.out.println(var);
		}
		}else {
			System.out.println("당첨자가 없습니다.");
		}
	}

	// 5
	public void searchWinner() {
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("핸드폰 번호('-'빼고) : ");
		String phone = sc.nextLine();
		
		boolean ck = lc.searchWinner(new Lottery(name,phone));
		
		if(ck) {
			System.out.println("축하합니다. 당첨 목록에 존재합니다.");
		}else {
			System.out.println("안타깝지만 당첨 목록에 존재하지 않습니다.");
		}
	}

}
