package com.kh.practice.numRage.view;

import java.util.Scanner;

import com.kh.practice.numRage.controller.NumRangeController;

public class NumberMenu {
	Scanner sc = new Scanner(System.in);

	public void munu() {
		NumRangeController nc = new NumRangeController();

		//
		boolean isckDouble = false;

		System.out.print("���� 1: ");
		int num1 = sc.nextInt();
		System.out.print("���� 2: ");
		int num2 = sc.nextInt();
		sc.nextLine();
		try {
			isckDouble = nc.checkDouble(num1, num2);
			System.out.println(num1 + "��(��) " + num2 + "�� ����ΰ� ? " + isckDouble);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			
		} finally {
		//	System.out.println(num1 + "��(��) " + num2 + "�� ����ΰ� ? " + isckDouble);
		}

	}
}
