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
			// ���� ����� ���� �߻���ġ�� �ֿܼ� ������ִ� �޼ҵ�
			
			System.out.println("���� ��Ȳ�� �߻��Ͽ����ϴ�.");
		}finally {
			System.out.println("���̳�");
		}
		
		//Unhandled exception type Exception
		// ���ο����� throws �����⸦ �ϸ� ������ ���ᰡ �ȴ�.
		// _____
		// �ҵ� ���� �� throws ExceptionName���� �߰��Ͽ� ȣ���� ���� �޼ҵ忡�� ó�� ���� / 
		// ��� �����ϸ� main()�޼ҵ���� �����ϰ� �ǰ�
		// �ű⼭�� ó������ �ʴ� ��� ������ ����
		
		
		System.out.println("���������� �����");
		
	}
	

}
