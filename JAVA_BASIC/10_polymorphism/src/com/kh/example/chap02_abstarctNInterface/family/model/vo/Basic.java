package com.kh.example.chap02_abstarctNInterface.family.model.vo;

import java.io.Serializable;
							// �ƹ��͵� ���� �������̽� : ��Ŀ �������̽� (Marker Interface)
							// �� �������̽��� ������ Ŭ������ �̷��� Ư���� �־��. ��� �����ִ� ��.
// Cloneable    : ��ü ������ �����մϴ�.
// Serializable : ����ȭ�� �����մϴ�.

public interface Basic extends Cloneable, Serializable{
//	public abstract void eat();
//	public abstract void sleep();
	
	/*public abstract*/ void eat();
	/*public abstract*/ void sleep();
	
	
	
}

