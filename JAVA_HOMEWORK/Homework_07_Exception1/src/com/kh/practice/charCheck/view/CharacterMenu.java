package com.kh.practice.charCheck.view;

import java.util.Scanner;

import com.kh.practice.charCheck.controller.CharacterController;

public class CharacterMenu {
	Scanner sc = new Scanner(System.in);
	
	public void menu() {
		
		CharacterController cc = new CharacterController();
		
		// ����ڿ��� ���ڿ��� �Է� �޾� CharacterController�� countAlpha()��
		// �Ű������� �Ѱ��־� ��ȯ ���� �����
		// �� �� countAlpha()�޼ҵ带 ȣ���ϴ� �κк��� try~catch�� �̿��Ͽ� ���� ó��
		int count = 0;
		
		System.out.print("���ڿ��� �Է� : ");
		String inputS = sc.nextLine();
		try {
			count = cc.countAlpha(inputS);
			System.out.println("'" + inputS + "'�� ���Ե� ������ ���� : " + count);
			
		}catch(Exception e){
			System.out.println(e.getMessage());
			e.printStackTrace();
			
		}finally {
			
		}
		
	}
}
