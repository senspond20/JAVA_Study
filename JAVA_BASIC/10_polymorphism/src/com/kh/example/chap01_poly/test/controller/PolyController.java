package com.kh.example.chap01_poly.test.controller;

import com.kh.example.chap01_poly.test.model.vo.Child1;
import com.kh.example.chap01_poly.test.model.vo.Child2;
import com.kh.example.chap01_poly.test.model.vo.Parent;

public class PolyController {

	public void method1() {
		// TODO Auto-generated method stub

		System.out.println("1. �θ�Ÿ�� ���۷����� �θ� ��ü�� �ٷ�� ���");

		// �� �θ� ��ü
		Parent p = new Parent();
		// �� �θ�Ÿ�� ���۷���

		p.printParent();

		System.out.println();
		System.out.println("2. �ڽ�Ÿ�� ���۷����� �ڽ� ��ü�� �ٷ�� ���");

		// �� �ڽ� ��ü
		Child1 c1 = new Child1();
		// �� �ڽ�Ÿ�� ���۷���

		c1.printChild1();
		c1.printParent(); // ��Ӷ�����.

		// ������ ���� -> ����� �Ǿ��־���Ѵ�.
		System.out.println();
		System.out.println("3. �θ�Ÿ�� ���۷����� �ڽ� ��ü�� �ٷ�� ���");

		// �� ĳ���� - �ڽİ�ü�� �θ��۷����� ���°�.
		// �θ�Ÿ���� ���������� ��� �ڽİ�ü�� ���� �� �ִ°�.
		Parent p2 = new Child2(); // Parent ��� ���۷����� Child1,Child2 �� �������� �ִ�.(�ڽ��̱� ������)
		Parent p3 = new Child1(); // ������ ����
		p2.printParent();
		p3.printParent(); // -> Child �� �Ⱥ��δ�.

		// ���� heap �޸� �������� Child�� �Ҵ�Ǿ� ������
		// ���� �մ� �ڷ����� Parent�� �Ǿ��ֱ⿡ Parent �ۿ� �Ⱥ��δ�.

		// �ٿ� ĳ����
		((Child2) p2).printChild2(); // ����ȯ�� �Ǿ��� ������, pirntChild�� ���δ�.
		((Child2) p2).printParent();
		// Ŭ���� ���� �� ��ȯ�� �ݵ�� ��� ���迡 �ִ� Ŭ���������� ����

		System.out.println();
		System.out.println("4. �ڽ�ž�� ���۷����� �θ� ��ü�� �ٷ�� ���");

		System.out.println();
		System.out.println("=== ���� ���� ");
		System.out.println();

		Parent[] pArr = new Parent[4];

		pArr[0] = new Child1();
		pArr[1] = new Child2();
		pArr[2] = new Child1();
		pArr[3] = new Child2();

		for (int i = 0; i < pArr.length; i++) {

			// Parent p = pArr[i];

			// ��� 1.
			if (pArr[i] instanceof Child1) {
				((Child1) pArr[i]).printChild1();
			} else if (pArr[i] instanceof Child2) {
				((Child2) pArr[i]).printChild2();
			}
		}

		System.out.println();
		
		// ��� 2.
		for (int i = 0; i < pArr.length; i++) {
			//final Parent pt = pArr[i];
			
			//static Parent pt = pArr[i];
			//=> Illegal modifier for the variable pt; only final is permitted
			Parent pt = pArr[i];
			
			// pt �� Child1 Ÿ���̶� ��ġ�ϴ���
			if (pt instanceof Child1) {
				((Child1) pt).printChild1();

				// pt�� Child2 Ÿ���̶� ��ġ�ϴ���
			} else if (pt instanceof Child2) {
				((Child2) pt).printChild2();
			} 
		}
		
		for(int i = 0; i < pArr.length; i++) {
			
			// ���� ���ε�.
			pArr[i].print();
			//�����Ϸ��� ����ɶ� 
			//ó������ Ÿ���� ���� parent�� print�� ���� 
			//�����ִ� �������̵��� ���� ã�Ƶ���.
			
			// �������ε�
			// -> ������� ���δ�� ���°�
	
//			Parent pt = pArr[i];
//			if
//			(pt instanceof Child1) {
//				((Child1)pt).print();
//			}else if (pt instanceof Child2) {
//				((Child2)pt).print();
//			}
		}
		
		
		// System.out.println(pArr[i]));

		// Child2 c2 = new Parent();

		// Child2 c2 = (Child2) new Parent();
		// ��Ŭ���������� ������ �ȳ����� �����ϸ� ����������.
		//

		// Type mismatch: cannot convert from Parent to
		// Child1
	}
}
