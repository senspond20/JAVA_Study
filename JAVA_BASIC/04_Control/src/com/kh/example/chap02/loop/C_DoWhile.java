package com.kh.example.chap02.loop;

import java.util.Scanner;

public class C_DoWhile {
	public void method1() {
		// 키보드로 문자열 값을 입력 받아 출력 반복 수행
		// 단, exit 가 들어오면 반복 종료
		/*
		 * 문자열 입력 : 안녕하세요. str : 안녕하세요
		 * 
		 * 문자열 입력 : apple str : apple
		 * 
		 * 문자열 입력 : exit str : exit
		 */

		Scanner sc = new Scanner(System.in);

//		String str ="";

		// 1. while문
		/*
		 * while(!str.equals("exit"))
		 * 
		 * // java.lang.NullPointerException // null 일 경우 비교할것이 없기때문에 에러가 날 수 있다. //
		 * String str = null -> String str ="";
		 * 
		 * // while(str !="exit") // 문자열을 비교할떄는 참조형이기에 == !=같은 연산자를 쓰면 안된다.
		 * 
		 * { System.out.print("문자열 입력 : "); str = sc.nextLine();
		 * System.out.println("str : " + str); }
		 */

		// 2. do~ while문
		// String str = null; 도 에러가 안난다.
		// (do 로 최소 한번은 실행을 보장하기에 str에 null 이 들어있지 않는다.)

		String str = null;
		do {
			System.out.print("문자열 입력 : ");
			str = sc.nextLine();
			System.out.println("str : " + str);

		} while (!str.equals("exit"));

	}

	public void method2() {
		Scanner sc = new Scanner(System.in);
		int menuNum = 0;
		
		do {
			System.out.println("1. 테스트1 ");
			System.out.println("2. 테스트2 ");
			System.out.println("3. 테스트3 ");
			System.out.println("9. 종료");
	
			System.out.print("메뉴 선택 : ");
	
			menuNum = sc.nextInt();
	
			switch (menuNum) {
			case 1: System.out.println(1);
				break;
			case 2: System.out.println(2);
				break;
			case 3: System.out.println(3);
				break;
			case 9: System.out.println("종료");
				break;
			default: System.out.println("잘못 입력하셨습니다."); 
				break;
				}
		} while(menuNum != 9);
		
	}
	
	public void method3() {
		
	}
}
