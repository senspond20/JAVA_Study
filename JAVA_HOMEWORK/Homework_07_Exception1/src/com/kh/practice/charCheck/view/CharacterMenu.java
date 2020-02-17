package com.kh.practice.charCheck.view;

import java.util.Scanner;

import com.kh.practice.charCheck.controller.CharacterController;

public class CharacterMenu {
	Scanner sc = new Scanner(System.in);
	
	public void menu() {
		
		CharacterController cc = new CharacterController();
		
		// 사용자에게 문자열을 입력 받아 CharacterController의 countAlpha()에
		// 매개변수로 넘겨주어 반환 값을 출력함
		// 이 때 countAlpha()메소드를 호출하는 부분부터 try~catch를 이용하여 예외 처리
		int count = 0;
		
		System.out.print("문자열을 입력 : ");
		String inputS = sc.nextLine();
		try {
			count = cc.countAlpha(inputS);
			System.out.println("'" + inputS + "'에 포함된 영문자 개수 : " + count);
			
		}catch(Exception e){
			System.out.println(e.getMessage());
			e.printStackTrace();
			
		}finally {
			
		}
		
	}
}
