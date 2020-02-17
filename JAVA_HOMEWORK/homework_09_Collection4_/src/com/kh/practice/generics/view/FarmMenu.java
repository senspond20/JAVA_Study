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
		System.out.println("�߸� �Է� �Ͽ����ϴ�. �ٽ� �Է����ּ���");
	}

	private void exitProgram() {
		System.out.println("���α׷� ����");
		sc.close();
	}

	public void mainMenu() {
		int menuNum = 0;

		System.out.println("============ KH ��Ʈ ===========");
		while (true) {

			System.out.println("===== ***** ���� �޴� ***** =====");
			System.out.println("1. ���� �޴�");
			System.out.println("2. �մ� �޴�");
			System.out.println("9. ����");
			System.out.print("�޴� ��ȣ ���� : ");
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
			System.out.println("******* ���� �޴� *******");
			System.out.println("1. �� ��깰 �߰�");
			System.out.println("2. ���� ����");
			System.out.println("3. ���� ����");
			System.out.println("4. ��깰 ���");
			System.out.println("9. �������� ���ư���");
			System.out.print("�޴� ��ȣ ���� : ");

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
					System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
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
		System.out.println("1. ���� / 2. ä�� / 3. �߰�");

		Farm fm = null;
		int amount = 0;
		boolean ck = true;

		int number = numbering("�߰��� ���� ��ȣ : ");

		System.out.print("�̸� : ");
		String name = sc.nextLine();

		System.out.print("���� : ");
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
			System.out.println("�� ��깰�� �߰��Ǿ����ϴ�.");
		} else {
			System.out.println("�� ��깰 �߰��� �����Ͽ����ϴ�. �ٽ� �Է����ּ���.");
		}
	}

	// adminMenu -> case 2
	private void removeKind() {

		System.out.println("1. ���� / 2. ä�� / 3. �߰�");
		System.out.print("������ ���� ��ȣ : ");
		int number = Integer.parseInt(sc.nextLine());
		System.out.print("�̸� : ");
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
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			return;
		}

	}

//	��1. ���� / 2. ä�� / 3. �߰����� ���� ��ȣ�� ������ �ް� ���� ��깰�� �̸�, 
//	������ ������ ����. ���� ��ȣ ���� �� ���߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.�� ��� �� �ٽ� ��ȣ�� �ް�, ������ ������ ���� �����Ǵ� ��ü�� �ٸ�. 
//	��ü �ȿ� ������ �̸��� ����. �����͸� ������ ��ü�� ������ fc�� changeAmount()�� �ѱ�� ���� ���� ��ȯ ���� true�� 
//	����깰 ������ �����Ǿ����ϴ�.��, 
//	false�� ����깰 ���� ������ �����Ͽ����ϴ�. �ٽ� �Է����ּ���.�� ���
	// adminMenu -> case 3
	private void changeAmount() {

		System.out.println("1. ���� / 2. ä�� / 3. �߰�");
		int number = numbering("������ ���� ��ȣ : ");

		System.out.print("�̸� : ");
		String name = sc.nextLine();

		System.out.print("���� : ");
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
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			return;
		}
	}

	// adminMenu -> case 4
	private void printFarm() {
		HashMap<Farm, Integer> rmap = fc.printFarm();

		Iterator<Entry<Farm, Integer>> it = rmap.entrySet().iterator();

		while (it.hasNext()) {
			Entry<Farm, Integer> key = it.next();
			System.out.printf("%s(%s��)\n", key.getKey(), key.getValue());

		}
		// System.out.println(rmap);
	}

	// mainMenu -> case 2
	private void customerMenu() {
		int menuNum = 0;
		while (true) {
			System.out.println("******* �� �޴� *******");
			System.out.println("1. ��깰 ���");
			System.out.println("2. ��깰 ����");
			System.out.println("3. ������ ��깰 ����");
			System.out.println("9. �������� ���ư���");
			System.out.print("�޴� ��ȣ ���� : ");
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
		System.out.println("1. ���� / 2. ä�� / 3. �߰�");
		int number = numbering("���� ���� ��ȣ : ");

		System.out.print("������ �� : ");
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
			System.out.println("���ſ� �����Ͽ����ϴ�.");
		} else {
			System.out.println("���ſ� �����Ͽ����ϴ�.");
		}
		
		System.out.println("=���� KH��Ʈ ��깰 ����=");
		printFarm();
	}

	// customerMenu -> case 2
	private void removeFarm() {
		System.out.println("1. ���� / 2. ä�� / 3. �߰�");
		int number = numbering("��� ���� ��ȣ : ");

		System.out.print("���� ��� �� �� : ");
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
			System.out.println("������ҿ� �����Ͽ����ϴ�.");
		} else {
			System.out.println("������ҿ� �����Ͽ����ϴ�.");
		}
		
		System.out.println("=���� KH��Ʈ ��깰 ����=");
		printFarm();
	}

	// ��깰 ���� ������

	// customerMenu -> case 3
	private void printBuyFarm() {
		ArrayList<Farm> list = fc.printBuyFarm();

		for (Farm var : list) {
			System.out.println(var);
		}
	}
}
