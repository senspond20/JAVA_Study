package com.kh.example.person.controller;

import com.kh.example.person.model.vo.Person;

public class PersonController {

	public void method1() {

		Person[] pArr = new Person[5];

		System.out.println("pArr : " + pArr);

		for (int i = 0; i < pArr.length; i++) {
			System.out.println("pArr[" + i + "] : " + pArr[i]);
		}
		// �� �ε��� ���� ��ü�� �����Ͽ� �����ϱ�

		pArr[0] = new Person("���ǰ�", 20, '��', 175.8, 66.9);
		pArr[1] = new Person("������", 34, '��', 179.5, 96.1);
		pArr[2] = new Person("�����", 14, '��', 190.0, 77.3);
		pArr[3] = new Person("�����", 27, '��', 161.4, 56.8);
		pArr[4] = new Person("���̹�", 53, '��', 157.9, 58.3);

		//
		for (int i = 0; i < pArr.length; i++) {
			System.out.println("pArr[" + i + "] : " + pArr[i]);
		}
		//
		for (int i = 0; i < pArr.length; i++) {
			System.out.println("pArr[" + i + "] : " + pArr[i].personInfo()); // pArr[i]);
		}
	}

	public void method2() {
		Person[] pArr = { 
				new Person("���ǰ�", 20, '��', 175.8, 66.9), 
				new Person("������", 34, '��', 179.5, 96.1),
				new Person("�����", 14, '��', 190.0, 77.3), 
				new Person("�����", 27, '��', 161.4, 56.8),
				new Person("���̹�", 53, '��', 157.9, 58.3) };

//		System.out.println(pArr[0].personInfo());	
		for (int i = 0; i < pArr.length; i++) {
			System.out.println("pArr[" + i + "] : " + pArr[i].personInfo()); // pArr[i]);
		}
	
	}
}
