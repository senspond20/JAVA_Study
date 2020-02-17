package com.kh.practice.numRage.view;

import java.util.Scanner;

import com.kh.practice.numRage.controller.NumRangeController;

public class NumberMenu {
	Scanner sc = new Scanner(System.in);

	public void munu() {
		NumRangeController nc = new NumRangeController();

		//
		boolean isckDouble = false;

		System.out.print("정수 1: ");
		int num1 = sc.nextInt();
		System.out.print("정수 2: ");
		int num2 = sc.nextInt();
		sc.nextLine();
		try {
			isckDouble = nc.checkDouble(num1, num2);
			System.out.println(num1 + "은(는) " + num2 + "의 배수인가 ? " + isckDouble);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			
		} finally {
		//	System.out.println(num1 + "은(는) " + num2 + "의 배수인가 ? " + isckDouble);
		}

	}
}
