package com.kh.example.chap01.condition;

import java.util.Scanner;

public class A_if {
		/*
		 * 단독 if 문
		 * if(조건식){
		 * 		실행할 문장;
		 * }
		 * 
		 * 조건식의 결고 값이 참(true)이면 {} 안에 있는 코드 실행.
		 * 조건식의 결과 값이 거짓(false)이면 {} 안에 있는 코드는 무시하고 넘어감.
		 */
	public void method1() {
		// 키보드로 입력한 숫자가 양수인지 음수인지 출력하기.
		Scanner sc = new Scanner(System.in);

		System.out.print("정수입력 : ");
		int num = sc.nextInt();
	
		if(num  > 0 )			{ System.out.println("양수입니다.");  }
		if(num == 0 )			{ System.out.println("0입니다.");    }
		if(num  < 0 )			{ System.out.println("음수입니다.");  }
		
		System.out.println("프로그램 종료");
		
//		if(num > 0) {
//			System.out.println("양수입니다.");
//		}else if(num == 0) {
//			System.out.println("0입니다.");
//		}else {
//			System.out.println("음수입니다.");
//		}
		
		sc.close();
	}
	
	public void method2() {
		// 키보드로 입력한 숫자가 짝수인지 홀수인지 출력
		// '숫자 한개를 입력하세요 : ' 안내 문구 출력 후 num변수에 데이터 저장
		// 짝수이면 "입력하신 숫자는 짝수입니다.", 홀수이면 "입력하신 숫자는 홀수입니다." 출력
		// 프로그램이 끝날 때 "프로그램 종료"까지 출력 후 프로그램 종료
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 한개를 입력하세요 : ");
		int num = sc.nextInt();	
		if (num % 2 == 0) {
			System.out.println("입력하신 숫자는 짝수 입니다.");
		}
		
		if (num % 2 == 1) {
			System.out.println("입력하신 숫자는 홀수입니다.");
		}
		System.out.println("프로그램 종료")	;

		
	}
	public void method12() {
		// 키보드로 입력한 숫자가 양수인지 음수인지 출력하기.
		Scanner sc = new Scanner(System.in);

		System.out.print("정수입력 : ");
		int num = sc.nextInt();
	
		if		(num  > 0 )		{ System.out.println("양수입니다.");  }
		else if (num == 0 )		{ System.out.println("0입니다.");    }
		else					{ System.out.println("음수입니다.");  }
		
		System.out.println("프로그램 종료");
		
//		if(num > 0) {
//			System.out.println("양수입니다.");
//		}else if(num == 0) {
//			System.out.println("0입니다.");
//		}else {
//			System.out.println("음수입니다.");
//		}
		
		sc.close();
		
		
	}
}
