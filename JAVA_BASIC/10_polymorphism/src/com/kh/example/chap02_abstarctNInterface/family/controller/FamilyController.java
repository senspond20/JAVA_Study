package com.kh.example.chap02_abstarctNInterface.family.controller;

import com.kh.example.chap02_abstarctNInterface.family.model.vo.Baby;
import com.kh.example.chap02_abstarctNInterface.family.model.vo.Basic;
import com.kh.example.chap02_abstarctNInterface.family.model.vo.Family;
import com.kh.example.chap02_abstarctNInterface.family.model.vo.Mother;

public class FamilyController {

	public void method() {

		// Family f = new Family();
		// Cannot instantiate the type Family
		// �߻�Ŭ������ ��ü ������ �Ҽ��� ����.

		// �߻�Ŭ������ ���������� ����� �� �ְ� �� �������̱� ������ ��������.
		Family f1 = new Mother("��Ӵ�", 50, 70, "���");
		Family f2 = new Baby("���̺�", 3.5, 70);
		
		System.out.println(f1);
		System.out.println(f2);
		
//		Basic b = new Basic();
		Basic b1 = new Mother("��Ӵ�", 50, 70 ,"���");
		Basic b2 = new Baby("���̺�",3.5,70);
		
		System.out.println(b1);
		System.out.println(b2);
		
		b1.eat();
		b2.eat();
		System.out.println(b1);
		System.out.println(b2);
	}
}
