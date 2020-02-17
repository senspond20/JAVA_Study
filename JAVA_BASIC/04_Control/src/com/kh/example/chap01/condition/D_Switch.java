package com.kh.example.chap01.condition;

//import java.io.BufferedReader;
//import java.io.InputStream;
//import java.io.InputStreamReader;
//import java.io.Reader;

import java.util.Scanner;

public class D_Switch {
	// 조건식의 결과값을 case에서 찾아 명령을 수행하는 조건문
	// 해당하는 값이 case에 없을 경우에는 default의 명령문 수행

	// case 와 수행문 사이에는 콜론(;)을 써야하며
	// break 가 없으면 멈추지 않고 계속 수행함
	public void method1() {
		// 정수 두개와 연산 기호 문자 1개를 입력 받아서
		// 연산기호 문자에 해당하는 계산을 수행하고 출력하세요.
		/*
		 * 첫번째 값 : 두번째 값: 연산자(+,-,*,/) :
		 */
		Scanner sc = new Scanner(System.in);
//	BufferedReader rd = new BufferedReader(InputStreamReader(System.in));

		System.out.print("첫번째 값 : ");
		int num1 = sc.nextInt();
//		int num1 = Integer.parseInt(sc.nextLine());
		System.out.print("두번째 값 : ");
		int num2 = sc.nextInt();
		sc.nextLine();

		// 줄바꿈이 있는 상태에서 nextLine으로 줄바꿈을 가져오면 \n이 읽어지기에
//		int num2 = Integer.parseInt(sc.nextLine());
		System.out.print("연산자(+,-,*,/) :");
		char oper = sc.nextLine().charAt(0);

		double result = 0.0; // 연산 결과를 저장해놓는 변수.
		switch (oper) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			result = (double) num1 / num2;
			break;
		default:
			System.out.println("Error! : 잘못된 수식 입력");
		}
		System.out.printf("%.2f", result);

	}

	public void method2() {
		// 과일을 입력하여 사과는 1000, 바나나는 3000, 복숭아는 2000, 키위는 5000
		// 과일가게에 없는 과일을 입력했을때는 " 잘못 입력하셨습니다 " 출력하게 하여라.
		// 과일 이름을 입력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("과일을 입력하세요 : ");
		String fruit = sc.nextLine();

		int price = 0;
		switch (fruit) {
		case "사과":
			price = 1000;
			break;
		case "바나나":
			price = 3000;
			break;
		case "복숭아":
			price = 2000;
			break;
		case "키위":
			price = 5000;
			break;
		default:
			System.out.println("잘못 입력하셧습니다");
			return; // 나를 호출한 메소드에게 돌아가는 기능.
					// 이때 값을 가지고 돌아갈 수 있고, 아무것도 없이 돌아갈 수 있음.
		}
		System.out.println(fruit + " 가격은" + price + "원 입니다.");
	}

	public void method3() {
		// 사용자가 입력한 메뉴 번호에 따라서 메뉴가 출력되게 하시오.
		/*
		 * 1. 회원등록 2. 회원수정 3. 회원삭제 메뉴 번호를 입력하세요 :
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("1. 회원등록 ");
		System.out.println("2. 회원수정  ");
		System.out.println("3. 회원삭제  ");
		System.out.print("메뉴 번호를 입력 하세요 : ");
		int index = sc.nextInt();
		String msg = null;

		switch (index) {
		case 1:
			msg = "회원 등록 메뉴입니다.";
			break;
		case 2:
			msg = "회원 수정 메뉴입니다.";
			break;
		case 3:
			msg = "회원 삭제 메뉴입니다.";
			break;
		default:
			System.out.println("잘못 입력하셨습니다");
			return;
		}
		System.out.println(msg);
	}

	public void method4() {
		// 1월 부터 12월까지 입력 받아 해당하는 달의 마지막 날짜를 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("1~12월 중 하나를 입력하세요 (숫자): ");
		int month = sc.nextInt();
		int result;
		switch (month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			result = 31;
			break;
		
		case 2:
			result = 28;
			break;

		case 4: case 6: case 9: case 11: 
			result = 30;
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
			return;
		}		
		System.out.println("입력하는 월은 마지막 날짜는 " + result + "입니다.");
	}
	
	public void method5() {
		// 1월 부터 12월까지 입력 받아 해당하는 달의 마지막 날짜를 출력하세요.
		int[] monthArray = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("1~12월 중 하나를 입력하세요 (숫자): ");
		int month = sc.nextInt();

		try 
		{
			int result = monthArray[month-1];
			System.out.println("입력하는 월은 마지막 날짜는 " + result + "입니다.");
		}
		catch(Exception e)
		{
			System.out.println("잘못 입력하셨습니다." + e);
		}
	}
}
