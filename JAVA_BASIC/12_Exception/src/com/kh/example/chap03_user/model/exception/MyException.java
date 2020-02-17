package com.kh.example.chap03_user.model.exception;

public class MyException extends Exception{
	// The serializable class MyException does not declare 
	// a static final serialVersionUID field of type long
			
	// private static final long serialVersionUID = 1L;
	// �ڹ��� JVM �� ���� �̸��� ��ü�� �޼��峪 �� ������ �޶�����
	// �ٸ���ü�� �ν��Ѵ�. �̰��� �������� seralVersionUID�� �����Ѵ�.
		
	public MyException() {	}
	public MyException(String msg) {
		super(msg);
	}
	
}
