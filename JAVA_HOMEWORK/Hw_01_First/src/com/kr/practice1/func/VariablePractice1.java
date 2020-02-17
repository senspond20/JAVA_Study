package com.kr.practice1.func;
import java.util.Scanner;

public class VariablePractice1 {
	
	public void variablePractice1() {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("이름을 입력 하세요 : ");
	String name = sc.nextLine();
	System.out.print("성별을 입력 하세요(남/여) : ");
	char gender = sc.nextLine().charAt(0);
	
	System.out.print("나이를 입력 하세요 : ");
	int age = Integer.parseInt(sc.nextLine());
	
	System.out.print("키를 입력 하세요 : ");
	int height = Integer.parseInt(sc.nextLine());
	
	System.out.printf("키 %dcm인 %d살 %c자 %s님 반갑습니다.\n", height, age, gender, name);
	
	sc.close();
	
	}
}
