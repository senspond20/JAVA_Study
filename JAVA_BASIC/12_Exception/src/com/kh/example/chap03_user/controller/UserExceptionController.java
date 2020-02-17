package com.kh.example.chap03_user.controller;

import java.util.Scanner;

import com.kh.example.chap03_user.model.exception.MyException;

public class UserExceptionController {
	
	Scanner sc = null;
	public void inputAge(){
		
		scannerOpen();
		// ���̸� �Է��ϼ��� ��� ������ �߰� ��⿡ ����ڰ� ���̸� �Է��ϸ� age������ �Է¹��� �� ����
		System.out.print("���̸� �Է��ϼ��� : ");
		int age = sc.nextInt();
		
		try {
		checkAge(age);
		System.out.println("�ȳ� 20�� �̻��̱���?"); // if(age < 19) -> throw new �� 19�̸��̸� ������� �ʴ´�.  
		
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	
	// throws ��ġ ����� �ڿ�
	public void checkAge(int age) throws MyException {
		
		if(age < 19) {
			throw new MyException("���� �Ұ�");
		}
	}
	
	public void scannerOpen() {
		sc = new Scanner(System.in);
	}
	
	public void scannerClose() {
		sc = null;
	}

}
