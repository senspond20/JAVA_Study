package com.kh.operator;
import java.util.Scanner;

public class G_Triple {
	public void method1() {
	// 삼항 연산자
	// (조건식 ?) 식1(참) : 식2(거짓)
	// 입력한 정수가 양수인지 아닌지 판별
	// '정수 하나 입력  : ' 이라는 안내문 출력 후 입력한 정수를 num에 저장
	// 양수면 "양수다" 양수가 아니면 "양수가 아니다."
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나 입력  : ");
		int num = sc.nextInt();
		
//		System.out.print("양수인지 확인 : " + ((num >= 0) ? true : false));
//		0은 양수도 음수도 아닌데,
		
//		String result = (num > 0) ? "양수다." : "양수가 아니다.";
//		중첩 삼항 연산자.
		
		String result = ((num > 0) ? "양수다." : (num ==0) ? "0이다." : "음수다.");
		
//		System.out.println(num + " 숫자는 " + result);
		System.out.printf("%d 숫자는 %s",num,result);
		sc.close();
	}
	
	public void method2() {
		// 입력한 정수가 짝수인지 홀수인지 판별;
		// 홀수면 "홀수입니다." 짝수면 "짝수입니다."
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 하나 입력 : ");
		int num = sc.nextInt();
	// 1. 한번에 합치기
//		String result = (num % 2 == 1) ? "홀수입니다." : "짝수입니다.";
//		String result = (num % 2 != 0) ? "홀수입니다." : "짝수입니다.";
	// 2. 조건식만 따로빼기
//		boolean bool = num % 2 == 0;	
//		String result = bool ? "짝수입니다." : "홀수입니다.";

// 3. 계산식만 따로 빼기
		int mod = num %2;
		String result = (mod==0)? "짝수입니다." : "홀수입니다.";
		
		System.out.println(result);
		
		System.out.printf("0x%h",0x01|0x20);
		sc.close();
	}
}
