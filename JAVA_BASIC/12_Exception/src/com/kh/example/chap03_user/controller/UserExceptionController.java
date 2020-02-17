package com.kh.example.chap03_user.controller;

import java.util.Scanner;

import com.kh.example.chap03_user.model.exception.MyException;

public class UserExceptionController {
	
	Scanner sc = null;
	public void inputAge(){
		
		scannerOpen();
		// 나이를 입력하세요 라는 문구가 뜨고 기기에 사용자가 나이를 입력하면 age변수에 입력받은 값 지정
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		try {
		checkAge(age);
		System.out.println("안녕 20살 이상이구나?"); // if(age < 19) -> throw new 로 19미만이면 실행되지 않는다.  
		
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	
	// throws 위치 선언부 뒤에
	public void checkAge(int age) throws MyException {
		
		if(age < 19) {
			throw new MyException("입장 불가");
		}
	}
	
	public void scannerOpen() {
		sc = new Scanner(System.in);
	}
	
	public void scannerClose() {
		sc = null;
	}

}
