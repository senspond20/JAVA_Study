package com.kh.example.chap03_user.model.exception;

public class MyException extends Exception{
	// The serializable class MyException does not declare 
	// a static final serialVersionUID field of type long
			
	// private static final long serialVersionUID = 1L;
	// 자바의 JVM 은 같은 이름의 객체라도 메서드나 그 내용이 달라지면
	// 다른객체로 인식한다. 이것을 막기위해 seralVersionUID를 설정한다.
		
	public MyException() {	}
	public MyException(String msg) {
		super(msg);
	}
	
}
