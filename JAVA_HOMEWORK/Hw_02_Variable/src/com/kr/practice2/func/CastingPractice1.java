package com.kr.practice2.func;

import java.util.Scanner;

public class CastingPractice1 {
	public void castingPractice1(){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڸ� �Է��ϼ��� : ");
		
		String str = sc.nextLine();
		char ch = str.charAt(0);
		
		System.out.println(ch + " unicode : " + (int)ch);
		
		sc.close();
	}
}
