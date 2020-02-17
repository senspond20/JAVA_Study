package com.kh.example.chap01_throws.run;

import com.kh.example.chap01_throws.controller.ThrowsController;

public class Run {
	public static void main(String[]args) /*throws Exception*/ {
		ThrowsController tc = new ThrowsController();
		
		try {
			tc.method1();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			// 예외 내용과 예외 발생위치를 콘솔에 출력해주는 메소드
			
			System.out.println("예외 상황이 발생하였습니다.");
		}finally {
			System.out.println("파이날");
		}
		
		//Unhandled exception type Exception
		// 메인에서도 throws 던지기를 하면 비정상 종료가 된다.
		// _____
		// 소드 선언 시 throws ExceptionName문을 추가하여 호출한 상위 메소드에게 처리 위임 / 
		// 계속 위임하면 main()메소드까지 위임하게 되고
		// 거기서도 처리되지 않는 경우 비정상 종료
		
		
		System.out.println("정상적으로 종료됨");
		
	}
	

}
