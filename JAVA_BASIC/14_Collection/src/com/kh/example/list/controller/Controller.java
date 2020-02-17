package com.kh.example.list.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.kh.example.list.model.compare.StudentComparator;
import com.kh.example.list.model.vo.Student;

public class Controller {
	public void doList() {
	// List list1 = new ArrayList();
	// List is a raw type. References to generic type List<E> should be parameterized
	// ���׸����� ���������� ������ �⺻������ ������Ʈ�� ����.
	// ������Ʈ�� ��� Ŭ������ �����̹Ƿ� ���������� �ڽ�Ŭ������ ���� �� �ִ�.(pdf 3�� ����)
	// ������ �׷��� ����ϴ°��� ���� ����. 
	// ���׸�(Ÿ���� ����)���� ���.
		
		List<Student> list = new ArrayList<Student>(3);
		
	//	List<Student> list2 = new ArrayList<>(); 
		// �տ� �ִ� ���׸� Ÿ���� ���� �ڿ��ִ� Ÿ���� ����
		// �ڹٹ����� ���� �ɼ��� �ְ� �ȵ� ���� �ִ�.
		
		//list2.add(E e) ����Ʈ ���� ������ e �߰�
		list.add(new Student("�׽�Ʈ",0));
		list.add(new Student("�����",60));
		list.add(new Student("������",90));
		list.add(new Student("����ȣ",85));
		list.add(new Student("���̹�",85));
		// �߰�/����/���� ���� ���ó�� ����.
		
		System.out.println("list ������ : " + list.size());
		System.out.println("list : " + list);
		
		list.add(0, new Student("�����",100));
		System.out.println("list ������ : " + list.size());
		System.out.println("list : " + list);
		
		list.add(3, new Student("���ǰ�",40));
		System.out.println("list ������ : " + list.size());
		System.out.println("list : " + list);
		
		// remove(int index) : �ش� index��° ��ü ����
		list.remove(1);
		System.out.println("list : " + list);
		
		// remove(Object o) : �ش� Object ��ü ����
		list.remove(new Student("���ǰ�",40));
		System.out.println("list : " + list);
		
		
		Collections.sort(list);
		System.out.println("list : " + list);
		// Object�� �ִ� ������ �޼ҵ��
		// haseCode �� �ִ� �޼Ҹ���  �������̵����� �����Ǹ� �ؾ�����
		// ������ ����. ��� �����Ǹ� �Ҳ��ĸ�
		// �ּҰ��� ���� ���ϴ°��� �ƴ϶� �ȿ� �־��ִ� �ʵ尪�� ���ϰ� �ٲ۴�.
		
		// ���Ĺ�� 1. Collections Ŭ���� �̿�
		//Collections.sort(list); // ���� ������ ������ ������ ����.
	
		//Comparable -> �Ѱ��� ���ĸ� ���� java.lang
		//Comparator -> �������� ������ ���� java.util
//		ArrayList<String> strList = new ArrayList<String>();
//		strList.add("����ð�");
//		strList.add("���ɽð�");
//		strList.add("��ٽð�");
//		strList.add("���ð�");
//		strList.add("��ٽð�");
//		strList.add("��ħ�ð�");
//		
//		System.out.println(strList);
//		Collections.sort(strList);
//		System.out.println(strList);
		
		// ���Ĺ�� 2. list.sort() �޼ҵ� �̿�
		list.add(new Student("�ں���",85));
		
		list.sort(new StudentComparator());
		
//		
		// set( int index, E e ) : index��° �ε����� �ִ� ��� e�� ����
		
		list.set(2, new Student("�����",31));
		System.out.println("list : " + list);
		
		//get ( int index ) : index ��° �ε����� �ִ� ��Ҹ� ������ ��
		Student s = list.get(2);
		System.out.println(s);
		System.out.println("list : " + list); // ������ ���°����� �����°��� �ƴϴ�.
		
		// subList (int index1, int index2) : index1 ��° �ε������� index2��° �ε������� ����Ʈ ��ȯ
		System.out.println("list ���� : " + list.subList(2, 5));
		
		// contains(Object o ) : o�� ����Ʈ�� �����Ѵٸ� true ��ȯ
		// indexOf (Object o) : o�� ����Ʈ�� ��ġ�ϴ� �ε��� ��ȣ ��ȯ, ���ٸ� -1 ��ȯ
		
		System.out.println("������, 90�� �ִ°�? " + list.contains(new Student("������", 90)));
		System.out.println("������, 90�� �ε��� ��ġ��? " + list.indexOf(new Student("������",90)));
		System.out.println("�׽�Ʈ, 0�� �ε��� ��ġ��? "+ list.indexOf(new Student("�׽�Ʈ",0)));
		System.out.println("=========================");
		
		// clear() : ����� ��� ��ü ����
		// isEmpty() : ����Ʈ�� ����� �� true ��ȯ
		list.clear();
		System.out.println("list : " + list);
		System.out.println("list �� �������?" + list.isEmpty());
	}
	
}
