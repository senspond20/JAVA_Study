package com.kh.example.test.controller;
import com.kh.example.test.model.vo.Child1;
import com.kh.example.test.model.vo.Child2;
import com.kh.example.test.model.vo.Parent;

public class InheritanceController {
	
	public void method(){	
		System.out.println("parent Ŭ������ num�ʵ� ����");
			
		Parent p = new Parent();
		p.setNum(9);
		System.out.println("Parent �ȿ� �ִ� num : " + p.getNum());
	
		System.out.println();
		
		System.out.println("Child Ŭ������ str�ʵ� ����");
		
		Child1 c1 = new Child1();
		c1.setStr("hello");
		System.out.println("Child Ŭ������ str : " + c1.getStr());

		
		System.out.println("Child1 �ȿ� �ִ� num �ʵ� ����");
		
		c1.setNum(99);
		System.out.println("Child1 �ȿ� �ִ� num :" + c1.getNum());
		
		
		
		System.out.println("Child2 Ŭ������ str�ʵ� ���� ");
		Child2 c2 = new Child2();
		c2.setStr("dragon");
		System.out.println("Child2 Ŭ������ str : " + c2.getStr());
		
		System.out.println("Child2 Ŭ������ ��ӹ��� Parent�� �ʵ� ���� ");
		c2.setNum(88);
		System.out.println("Child2 Ŭ������ str : " + c2.getNum());
		
		// parent �ȿ� �� ���� �ٲ��� �ʴ´�.
		// �Ѱܹ������� �ƴ϶� �����������̱� ������.
		System.out.println("Child2 Ŭ������ str : " + p.getNum());
		
		/// c2.Num 
		// Parent �� Num�ʵ� ���� �����ڰ� private �̱� ���� 
		
		
	
	}

}
