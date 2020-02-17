package com.kh.example.chap04_filed.run;
import com.kh.example.chap04_filed.model.vo.Product;
import com.kh.example.chap04_filed_Controller.B_KindsOfVariable2;

public class Run {
	
	public static final int SIZE = 299;
	
	public static void main(String[] args) {
		// ��ü ����
		B_KindsOfVariable2 bkv = new B_KindsOfVariable2();
	    int a = bkv.statictestNum;
	//The static field B_KindsOfVariable2.staticNum should be accessed in a static way
	// ��ü�� �����ؼ� ��ü�� Stack�ʵ忡 �����ϴ°��� static way�� �ƴϴ�.
	// stack�ʵ忡�� ��ü�� ���� �ʿ䰡 ����.
		
		// ���α׷��� �����ϸ�  Static ������ �� �÷����� �����Ѵ�.
		
		int a1 = B_KindsOfVariable2.statictestNum;
		
		B_KindsOfVariable2 bkv2 = new B_KindsOfVariable2();
		
		
		
		System.out.println(Run.SIZE);
		System.out.println(a);
		System.out.println(a1);
		
		
		
		
		// 1. JVM �� �⺻������ �ʱ�ȭ
		// 2. ����� �ʱ�ȭ
		// 3. �ν��Ͻ� ��� �ʱ�ȭ
		// 4. �����ڸ� ���� �ʱ�ȭ
		
		//ĭ��,�Ե�,1000,90
		Product p1 = new Product();
		p1.inform();
		
		//ĭ��,�Ե�,1000,80
		Product p2 = new Product();
		p2.inform();
		
		// ĭ��,�Ե�,1000,70
		Product p3 = new Product();
		p3.inform();
		
		// 149 -> 149 - 10;
		// ĭ��,�Ե�,1000,139
		// ĭ��,�Ե�,1000,129
		// ĭ��,�Ե�,1000,119
		
		
	}
}
