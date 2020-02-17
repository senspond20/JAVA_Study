package com.kh.example.chap01.condition;

import java.util.Scanner;

public class C_ifElseif {
	// if- else if문
	// if(조건식1){
	// 		실행할 문장1;
	//}else if(조건식2){
	//		실행할 문장2;
	//}else if(조건식3){
	//		실행할 문장3;
	//}else{
	//		실행할 문장4;
	//}
	
	// 다중 조건을 줄 수 있는 조건문
	// 조건식 1이 참이면 실행할 문장 1 수행
	// 조건식 2가 참이면 실행할 문장 2 수행
	// 조건식 3가 참이면 실행할 문장 3 수행
	// 아무 조건도 참이 아니면 실행할 문장 4 수행.
	Scanner sc = new Scanner(System.in);
	
	public void method1() {
			
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		String result;
		if(num > 0 ) {
			result ="양수다.";
		}else if( num == 0) {
			result ="0이다.";
		}else { 
			result ="음수다.";
		}
		System.out.println(result);
	}
	public void method2() {
		// 나이를 입력 받아 13살 이하면 "어린이", 13초과 19살 이하면 "청소년", 19살 초과 "성인" 출력.

		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		String result;
		if(age <= 13) {
			result = "어린이";
		}else if (age > 19) {
			result = "성인";
		}else {
			result = "청소년";
		}
		System.out.println(result);
	}
	
}
