package com.kh.practice.generics.view;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;

import com.kh.practice.generics.controller.FarmController;
import com.kh.practice.generics.model.vo.Farm;
import com.kh.practice.generics.model.vo.Fruit;
import com.kh.practice.generics.model.vo.Nut;
import com.kh.practice.generics.model.vo.Vegetable;

public class FarmMenu {

	Scanner sc = new Scanner(System.in);
	FarmController fc = new FarmController();

	private void retryMessage() {
		System.out.println("잘못 입력 하였습니다. 다시 입력해주세요");
	}

	private void exitProgram() {
		System.out.println("프로그램 종료");
		sc.close();
	}

	public void mainMenu() {
		int menuNum = 0;

		System.out.println("============ KH 마트 ===========");
		while (true) {

			System.out.println("===== ***** 메인 메뉴 ***** =====");
			System.out.println("1. 직원 메뉴");
			System.out.println("2. 손님 메뉴");
			System.out.println("9. 종료");
			System.out.print("메뉴 번호 선택 : ");
			menuNum = Integer.parseInt(sc.nextLine());

			switch (menuNum) {
			case 1:
				adminMenu();
				break;
			case 2:
				customerMenu();
				break;
			case 9:
				exitProgram();
				return;
			default:
				retryMessage();
				continue;
			}

		}

	}

	// mainMenu -> case 1
	private void adminMenu() {
		int menuNum = 0;
		while (true) {
			System.out.println("******* 직원 메뉴 *******");
			System.out.println("1. 새 농산물 추가");
			System.out.println("2. 종류 삭제");
			System.out.println("3. 수량 수정");
			System.out.println("4. 농산물 목록");
			System.out.println("9. 메인으로 돌아가기");
			System.out.print("메뉴 번호 선택 : ");

			menuNum = Integer.parseInt(sc.nextLine());

			switch (menuNum) {
			case 1:
				addNewKind();
				break;
			case 2:
				removeKind();
				break;
			case 3:
				changeAmount();
				break;
			case 4:
				printFarm();
				break;
			case 9:
				return;
			default:
				retryMessage();
				continue;
			}

		}
	}

	private int numbering(String str) {
		boolean ck = true;
		int number = 0;

		while (ck) {
			System.out.print(str);
			try {
				number = Integer.parseInt(sc.nextLine());
			} catch (Exception e) {
			} finally {
				if (number != 1 && number != 2 && number != 3) {
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
					continue;
				} else {
					ck = false;
				}
			}
		}
		return number;
	}

	// adminMenu -> case 1
	private void addNewKind() {
		System.out.println("1. 과일 / 2. 채소 / 3. 견과");

		Farm fm = null;
		int amount = 0;
		boolean ck = true;

		int number = numbering("추가할 종류 번호 : ");

		System.out.print("이름 : ");
		String name = sc.nextLine();

		System.out.print("수량 : ");
		amount = Integer.parseInt(sc.nextLine());

		switch (number) {
		case 1:
			fm = new Fruit(name);
			break;
		case 2:
			fm = new Vegetable(name);
			break;
		case 3:
			fm = new Nut(name);
			break;
		}

		if (fc.addNewKind(fm, amount)) {
			System.out.println("새 농산물이 추가되었습니다.");
		} else {
			System.out.println("새 농산물 추가에 실패하였습니다. 다시 입력해주세요.");
		}
	}

	// adminMenu -> case 2
	private void removeKind() {

		System.out.println("1. 과일 / 2. 채소 / 3. 견과");
		System.out.print("삭제할 종류 번호 : ");
		int number = Integer.parseInt(sc.nextLine());
		System.out.print("이름 : ");
		String name = sc.nextLine();

		switch (number) {
		case 1:
			fc.removeKind(new Fruit(name));
			break;
		case 2:
			fc.removeKind(new Vegetable(name));
			break;
		case 3:
			fc.removeKind(new Nut(name));
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
			return;
		}

	}

//	‘1. 과일 / 2. 채소 / 3. 견과’를 통해 번호로 종류를 받고 수정 농산물의 이름, 
//	수정할 수량도 받음. 없는 번호 선택 시 “잘못 입력하셨습니다. 다시 입력해주세요.” 출력 후 다시 번호를 받고, 선택한 종류에 따라 생성되는 객체가 다름. 
//	객체 안에 종류와 이름을 저장. 데이터를 저장한 객체와 수량을 fc의 changeAmount()로 넘기고 전달 받은 반환 값이 true면 
//	“농산물 수량이 수정되었습니다.”, 
//	false면 “농산물 수량 수정에 실패하였습니다. 다시 입력해주세요.” 출력
	// adminMenu -> case 3
	private void changeAmount() {

		System.out.println("1. 과일 / 2. 채소 / 3. 견과");
		int number = numbering("수정할 종류 번호 : ");

		System.out.print("이름 : ");
		String name = sc.nextLine();

		System.out.print("수량 : ");
		int amount = Integer.parseInt(sc.nextLine());

		switch (number) {
		case 1:
			fc.changeAmount(new Fruit(name), amount);
			break;
		case 2:
			fc.changeAmount(new Vegetable(name), amount);
			break;
		case 3:
			fc.changeAmount(new Nut(name), amount);
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
			return;
		}
	}

	// adminMenu -> case 4
	private void printFarm() {
		HashMap<Farm, Integer> rmap = fc.printFarm();

		Iterator<Entry<Farm, Integer>> it = rmap.entrySet().iterator();

		while (it.hasNext()) {
			Entry<Farm, Integer> key = it.next();
			System.out.printf("%s(%s개)\n", key.getKey(), key.getValue());

		}
		// System.out.println(rmap);
	}

	// mainMenu -> case 2
	private void customerMenu() {
		int menuNum = 0;
		while (true) {
			System.out.println("******* 고객 메뉴 *******");
			System.out.println("1. 농산물 사기");
			System.out.println("2. 농산물 빼기");
			System.out.println("3. 구입한 농산물 보기");
			System.out.println("9. 메인으로 돌아가기");
			System.out.print("메뉴 번호 선택 : ");
			menuNum = Integer.parseInt(sc.nextLine());
			switch (menuNum) {
			case 1:
				buyFarm();
				break;
			case 2:
				removeFarm();
				break;
			case 3:
				printBuyFarm();
				break;
			case 9:
				return;
			default:
				retryMessage();
				continue;
			}
		}

	}

	// customerMenu -> case 1
	private void buyFarm() {
		System.out.println("1. 과일 / 2. 채소 / 3. 견과");
		int number = numbering("구매 종류 번호 : ");

		System.out.print("구매할 것 : ");
		String name = sc.nextLine();

		boolean isTrue = false;

		switch (number) {
		case 1:
			isTrue = fc.buyFarm(new Fruit(name));
			break;
		case 2:
			isTrue = fc.buyFarm(new Vegetable(name));
			break;
		case 3:
			isTrue = fc.buyFarm(new Nut(name));
			break;
		}
		
		if (isTrue) {
			System.out.println("구매에 성공하였습니다.");
		} else {
			System.out.println("구매에 실패하였습니다.");
		}
		
		System.out.println("=현재 KH마트 농산물 수량=");
		printFarm();
	}

	// customerMenu -> case 2
	private void removeFarm() {
		System.out.println("1. 과일 / 2. 채소 / 3. 견과");
		int number = numbering("취소 종류 번호 : ");

		System.out.print("구매 취소 할 것 : ");
		String name = sc.nextLine();

		boolean isTrue = false;

		switch (number) {
		case 1:
			isTrue = fc.removeFarm(new Fruit(name));
			break;
		case 2:
			isTrue = fc.removeFarm(new Vegetable(name));
			break;
		case 3:
			isTrue = fc.removeFarm(new Nut(name));
			break;
		}
		
		if (isTrue) {
			System.out.println("구매취소에 성공하였습니다.");
		} else {
			System.out.println("구매취소에 실패하였습니다.");
		}
		
		System.out.println("=현재 KH마트 농산물 수량=");
		printFarm();
	}

	// 농산물 구매 데이터

	// customerMenu -> case 3
	private void printBuyFarm() {
		ArrayList<Farm> list = fc.printBuyFarm();

		for (Farm var : list) {
			System.out.println(var);
		}
	}
}
