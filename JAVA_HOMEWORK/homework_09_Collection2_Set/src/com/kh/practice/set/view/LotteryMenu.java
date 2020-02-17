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
		System.out.println("========= KH ��÷ ���α׷� =========");
		while (true) {
			System.out.println("******* ���� �޴� *******");
			System.out.println("1. ��÷ ��� �߰�");
			System.out.println("2. ��÷ ��� ����");
			System.out.println("3. ��÷ ��� Ȯ��");
			System.out.println("4. ���ĵ� ��÷ ��� Ȯ��");
			System.out.println("5. ��÷ ��� �˻�");
			System.out.println("9. ����");
			System.out.print("�޴� ��ȣ ���� : ");
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
				System.out.println("���α׷� ����");
				return;
			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է��� �ּ���");
				continue;
			}
		}
	}

	// 1
	public void insertObject() {

		System.out.print("�߰��� ��÷ ��� �� : ");
		int count = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < count; i++) {
			System.out.print("�̸� : ");
			String name = sc.nextLine();
			System.out.print("�ڵ��� ��ȣ('-'����) : ");
			String phone = sc.nextLine();

			System.out.println();
			lc.insertObject(new Lottery(name, phone));
		}
		System.out.println(count + "�� �߰� �Ϸ� �Ǿ����ϴ�.");

	}

	// 2
	public void deleteObject() {
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		System.out.print("�ڵ��� ��ȣ('-'����) : ");
		String phone = sc.nextLine();

		boolean ck = lc.deleteObject(new Lottery(name, phone));
		if(ck) {
			System.out.println("���� ����");
		}else {
			System.out.println("���� ����");
		}
	}

	// 3
	public void winObject() {
		HashSet<Lottery> hs = lc.winObject();
		if (hs == null) {
			System.out.println("��÷ ����� �����ϴ�. (��÷����� �ּ� 4�� �̻�)");
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
			System.out.println("��÷�ڰ� �����ϴ�.");
		}
	}

	// 5
	public void searchWinner() {
		
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		System.out.print("�ڵ��� ��ȣ('-'����) : ");
		String phone = sc.nextLine();
		
		boolean ck = lc.searchWinner(new Lottery(name,phone));
		
		if(ck) {
			System.out.println("�����մϴ�. ��÷ ��Ͽ� �����մϴ�.");
		}else {
			System.out.println("��Ÿ������ ��÷ ��Ͽ� �������� �ʽ��ϴ�.");
		}
	}

}
