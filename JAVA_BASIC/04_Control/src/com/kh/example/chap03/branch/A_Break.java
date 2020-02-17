package com.kh.example.chap03.branch;

import java.util.Scanner;

//https://hashcode.co.kr/code_runners

public class A_Break {
	// break문은 자기자신을 포함한 가장 가까운 반복문을 나감

	// continue 문
	public void method1() {
		// 문자열을 입력받아 글자 개수를 출력하는 반복 프로그램
		// 단, end가 입력되면 반복 종료
		// do~while 사용

		String str = null;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("==== 문자열을 입력받아 글자 개수를 출력합니다. ====");
			System.out.print("문자열 입력 : ");		
			
			str = sc.nextLine();
			if(str.equals("end")){
				System.out.println("프로그램을 종료합니다.");
				break;  // break 에 드래그해서 커서를 가져다 대면 어떤 반복문을 빠져나가는지 알려준다.
			}
			System.out.println("[" + str + "]" + " 문자열의 개수 : " + str.length());
			System.out.println();
			
		} while (true);

	}
	public void method2() {
		// 1부터 사용자에게 입력 받은 숫자까지의 합 출력
		// for문 사용

		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int fNum = sc.nextInt();
		
		for(int i = 1 ;/*i <= fNum*/; i++) {
			if(i >= fNum) {
				break;
			}
			sum += i;
		}
		System.out.printf("1부터 %d까지의 합 : %d\n", fNum, sum);
	}
	public void method3() {
		
		
	}
}
