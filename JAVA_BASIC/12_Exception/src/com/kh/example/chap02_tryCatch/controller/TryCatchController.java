package com.kh.example.chap02_tryCatch.controller;
import java.io.IOException;

public class TryCatchController {
	
	public void method1() {
		System.out.println("method1() ȣ���...");
		try {
			method2();
			System.out.println("���� �߻� �ÿ� ��� �ɱ�? ���� ��� �ȵǴ��� �� method2���� ���� �߻��ϴϱ� catch�� �Ѿ��");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();		
			System.out.println(e.getMessage());
			
		} catch (Exception e) { // Ȥ�ö� �߻��� �� �ִ� Exception
			//e.printStackTrace();
			System.out.println("Exception ���� ����");
		} finally { // 
			System.out.println("finally : ���� �߻� ���ο� ������� ������ �����");
		}
		System.out.println("method1() �����...");
	}
	
	public void method2() throws IOException {
		System.out.println("method2() ȣ���...");
		method3();
		System.out.println("mehtod3() �����...");
	}
	
	public void method3() throws IOException{
		System.out.println("method3() ȣ��� ...");
		throw new IOException("IOException �� ������ �߻����׽��ϴ�.");
		// �׳� Exception �� ��Ű���� java.lang�� �ֱ⿡ 
		// ������ import�� ���� �ʾƵ� ������
		// IOException�� Java.io �ȿ� �ִ�.
//		System.out.println("method3() ����� ...");	
	}
	
}
