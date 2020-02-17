package com.kr.practice1.func;

import java.util.Scanner;

public class VariablePractice3 {
	public void variablePractice3() {
		Scanner sc = new Scanner(System.in);
		double result;
		double result2;
		
		System.out.print("가로 : ");
		double width = sc.nextDouble();
		sc.nextLine();
		
		System.out.print("세로 : ");
		double height = sc.nextDouble();
		
//		계산 공식 ) 면적 : 가로 * 세로
//		둘레 : (가로 + 세로) * 2		
		result = width * height;
		result2 = (width + height) * 2;
		System.out.println("면적 : " + result);
		System.out.println("둘레 : " + result2);
		
		sc.close();
	}
}
