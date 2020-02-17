package com.kh.operator;
import java.util.Scanner;

public class E_Logical {
	// && : 피연산자가 모두  true일때 true 반환 (그리고, ~면서)
	// || : 피연산자 중에서 하나라도 true일때 반환 (또는, ~거나)

	public void method1() {
   // 입력한 값이 1~100 사이의 숫자인지 확인
		Scanner sc = new Scanner(System.in);	
		System.out.print("정수 하나 입력 : ");
		int num = sc.nextInt();
//		sc.nextLine();

		// 1~100 사이의 숫자
		// 숫자가 1보다 크거나 같고, 100보다 작거나 같다. --> &&
		System.out.println("1~100 사이의 숫자인지 확인 : " + (num >=1 && num <= 100));		
        //sc.close();
	}
	
	public void method2() {
	// 입력한 문자값이 대문자인지 확인
		Scanner sc = new Scanner(System.in);
		System.out.print("문자 하나 입력 :");
		char ch = sc.nextLine().charAt(0);
		System.out.println("영어 대문자가 맞습니까?: " + ( ch >= 'A' && ch <= 'Z'));		
		
		// 계속 하시려면 y혹은 Y를 입력하세요 :
		System.out.print("계속 하시려면 y혹은 Y를 입력하세요 : ");
		char ch2 = sc.nextLine().charAt(0);
				
		// 계속 하겠다고 하셨습니까?
		System.out.println("계속 하겠다고 하셨습니까? " + (ch2 == 'y' || ch2 =='Y'));
		sc.close();	
	}
	
}
