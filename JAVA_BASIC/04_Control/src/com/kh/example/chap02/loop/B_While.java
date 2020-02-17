package com.kh.example.chap02.loop;

import java.util.Scanner;

public class B_While {
	/*
	 * while (조건식){ 실행문장; [증감식 or 분기문;] // [] 의미는 생략할 수 있다. }
	 * 
	 * 조건식 확인 -> (조건식 true일때 ) 실행문장 수행 -> 조건식 -> (반복) 조건식 결과가 fasle 일때 까지.
	 * 
	 */
	public void method1() {
		// 1부터 5까지 출력
		int num = 1;

		while (num <= 5) {
			System.out.println(num + "번째 반복문 수행");
			num++;
		}

	}

	public void method2() {
		int i = 1;
		while (i <= 5) {
			System.out.println("내 이름은 박신우야");
			i++;
		}
	}

	public void method2_1() {
		int i = 5;
		while (i > 0) {
			System.out.println(i + "출력");
			i--;
		}
	}

	public void method3() {
		// 1에서 10사이의 홀수만 출력
		int i = 1;
		while (i < 10) {
			if (i % 2 != 0) {
				System.out.println(i + "출력");
			}
			i++;
		}
	}

	public void method4() {
		// 정수 두개를 입력 받아 그 사이 숫자 출력
		// 정수 두개를 입력하세요.
		// 단, 첫번쨰 숫자가 두번째 숫자보다 작게 입력하세요
		// 첫번째 숫자 :
		// 두번째 숫자 :
		int max;
		int min;
		Scanner sc = new Scanner(System.in);

		System.out.println("정수 두개를 입력하세요.(단, 첫번째 숫자가 두번째 숫자보다 작게 입력)");

		System.out.print("첫번째 숫자 : ");
		int fNum = sc.nextInt();
		System.out.print("두번째 숫자 : ");
		int sNum = sc.nextInt();

//		max = Math.max(sNum, fNum);
//		min = Math.min(sNum, fNum);

		if (fNum < sNum) {
			max = sNum;
			min = fNum;
		} else {
			max = fNum;
			min = sNum;
		}

		while (min <= max) {
			System.out.println(min);
			min++;
		}
	}

	public void method4_1() {
		// 정수를 하나 입력 받아 그 수가 1~9 사이싀 수 일때만 그 수의 구구단 출력
		// 조건이 맞지 않으면 1~9 사이의 양수를 입력하여야 합니다. 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("1 ~ 9 사이의 정수를 입력하세요  : ");
		int dan = sc.nextInt();
		int su = 1;

		if (0 < dan && dan < 10) {
			while (su <= 9) {
				System.out.printf("%d * %d = %2d\n", dan, su, dan * su);
				su++;
			}
		} else {
			System.out.println("1~9 사이의 양수를 입력하세요");
		}
	}

	public void method5() {
		// 1부터 10사이의 임의의 난수를 정해 1부터 난수까지의 합계 출력

		int random = (int) (Math.random() * 10 + 1);
		int sNum = 1;
		int sum = 0;

		while (sNum <= random) {
			sum += sNum;
			sNum++;
		}
		System.out.println("1부터 " + random + "까지의 합계 : " + sum);
	}

	public void method6() {
		// 사용자에게 문자열을 입력 받아 인덱스 별로 문자 출력
		// 문자열 입력 : apple
		// 0 : a
		// 1 : p
		// 2 : p
		// 3 : l
		// 4 : e

		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();

		// 문자열의 길이를 반환하는 메소드 : length()

		int length = str.length();

		// for
		System.out.println("for문으로");
		for (int index = 0; index < length; index++) {
			System.out.println(index + " : " + str.charAt(index));
		}

		// while
		System.out.println("\nwhile문으로");
		int i = 0;
		while (i < length) {
			System.out.println(i + " : " + str.charAt(i));
			i++;
		}

		sc.close();
	}

	public void method7() {
		// 2단부터 9단까지 출력
		int dan = 2;
		int su = 1;

		System.out.println("- 2 ~ 9단까지 출력 -");
		while (dan <= 9) {
			while (su <= 9) {
				System.out.printf("| %d * %d = %2d |\n", dan, su, dan * su);
				su++;
			}
			System.out.println();
			dan++;
			su = 1;
		}
	}

	public void method7_1() {
		int dan = 2;

		System.out.println("- 2 ~ 9단까지 출력 -");
		while (dan <= 9) {
			int su = 1;
			while (su <= 9) {
				System.out.printf("| %d * %d = %2d |\n", dan, su, dan * su);
				su++;
			}
			System.out.println();
			dan++;

		}
	}

	public void method8() {
		// 아날로그 시계
		int hour = 0;
		int minute = 0;

		while (hour < 24) {
			minute = 0;

			while (minute < 60) {
				System.out.printf("| %02d시:%02d분 |\n", hour, minute);
				minute++;
			}

			hour++;
		}

	}

	public void method9() {

		int menuNum = 0; //@ 
		Scanner sc = new Scanner(System.in);

		//@
		while (menuNum != 9) { // menuNum 을 0으로 했기에. 만약 0번으로 하면 실행이 안된다. 그럴때 -> do while문
	
			System.out.println("1. 1~5 까지 출력");
			System.out.println("2. 5~1 까지 출력");
			System.out.println("3. 1~10사이의 홀수 출력");
			System.out.println("9. 종료");

			System.out.print("메뉴 선택 : ");
			//@
			menuNum = sc.nextInt();
			
			System.out.println();
			
			switch (menuNum) {
			case 1:
				method1();
				break;
			case 2:
				method2();
				break;
			case 3:
				method3();
				break;
			case 9:
				System.out.println("종료합니다.");
				break;
			default:
				System.out.println("잘못 입력하셨습니다.");
				break;
			}
			
		}
		
		sc.close();
	}
}
