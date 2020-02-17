package com.kh.practice.token.view;

import java.util.Scanner;

import com.kh.practice.token.controller.TokenController;

public class TokenMenu {

	Scanner sc = new Scanner(System.in);
	TokenController tc = new TokenController();
	
	public void mainMenu() {
		int menuNum;

		while (true) {
			System.out.println("1. 지정 문자열");
			System.out.println("2. 입력 문자열");
			System.out.println("3. 프로그램 끝내기");
			System.out.print("메뉴선택 :");
			menuNum = Integer.parseInt(sc.nextLine());

			if (menuNum == 1) {
				tokenMenu();
			} else if (menuNum == 2) {
				inputMenu();
			} else if (menuNum == 3) {
				return;
			} else {
				System.out.println("잘못 입력하셨습니다. 다시 입력하세요");
				continue;
			}
		}
	}

	public void tokenMenu() {
		String str = "J a v a P r o g r a m ";
		
		System.out.println("토근 처리전 개수 : " + str.length());
		String afterStr = tc.afterToken(str);
		System.out.println("토근 처리후 글자 : " + afterStr);
		System.out.println("토근 처리후 개수 : " + afterStr.length());
		System.out.println("모두 대문자로 변환 : " + afterStr.toUpperCase());
		
		// 토큰 처리 전 글자, 토큰 처리 전 개수를 출력
		// TokenController(tc)의 afterToken()의 반환 값을 가지고
		// 토큰 처리 후 글자, 토큰 처리 후 개수, 모두 대문자로 변환 한 것을 출력
	}

	public void inputMenu() {

		System.out.print("문자열을 입력하세요 : ");
		String input = sc.nextLine();
		// tc에 firstCap()로 입력 받은 문자열을 넘기고 반환 값 출력
		System.out.print("찾을 문자를 하나 입력하세요 : ");
		char ch = sc.nextLine().charAt(0);
		
		System.out.println("문자가 들어간 개수 : " + tc.findChar(input, ch));
		
		// tc에 findChar()로 위에 입력 받은 문자열과 방금 받은 문자를 인자로 넘겨 // 반환 값 출력
	}

}
