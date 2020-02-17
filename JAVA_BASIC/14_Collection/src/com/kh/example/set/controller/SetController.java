package com.kh.example.set.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;

import com.kh.example.set.model.compare.DogComparator;
import com.kh.example.set.model.vo.Dog;

public class SetController {
	public void doSet() {
		
		// ������ ����
		Set<Dog> set = new HashSet<Dog>();
		
		set.add(new Dog("����",4.0));
		set.add(new Dog("ȣ��",4.5));
		set.add(new Dog("����",8.1));
		
		// ���� ���� �ȵȴ�.
		System.out.println(set);
		
		
		set.add(new Dog("����",4.0));
	// �ּҰ����� ����Ǳ� ������ 
		System.out.println(set);
		
	//	HashSet s = new HashSet();
		
//		Set<String> test = new HashSet<String>();
//
//		test.add("����1");
//		test.add("����2");
//		test.add("����3");
//		System.out.println(test);
//		
//		// String�̶�� Ŭ���� ��ü���� hashcode�� equls�� �������̵��� �Ǿ������ϱ�
//		test.add("����2");
//		System.out.println(test);
		System.out.println("=====================");
		Set<Dog> set2 = new LinkedHashSet<Dog>();
		
		set2.add(new Dog("����",2.1));
		set2.add(new Dog("����",8.3));
		set2.add(new Dog("�κ�",5.0));
		set2.add(new Dog("����",2.1));
		
		// ���� ���� �ǰ� �ߺ� ������ �ȵǴ� LinkedHashSet
		System.out.println(set2);
		
		set2.add(new Dog("����",6.1));
		set2.add(new Dog("����",5.2));
		set2.add(new Dog("����",9.5));
		set2.add(new Dog("����",12.5));
		set2.add(new Dog("����",34));
		
		System.out.println(set2);
		
		Set<Dog> set3 = new TreeSet<Dog>(set2);
		System.out.println(set3);
	
		set3.add(new Dog("����",3.8));
		System.out.println(set3);
		
		System.out.println("=============================");
		Set<Dog> set4 = new TreeSet<Dog>(new DogComparator());
		
		set4.add(new Dog("����",6.1));
		set4.add(new Dog("����",8.3));
		set4.add(new Dog("�κ�",5.0));
		set4.add(new Dog("����",2.1));
		set4.add(new Dog("����",6.1));
		set4.add(new Dog("����",5.2));
		set4.add(new Dog("����",9.5));
		set4.add(new Dog("����",12.5));
	//	set4.remove(new Dog("����",12.5));
	//	System.out.println("---------------");
		System.out.println(set4);
		
		System.out.println("����".compareTo("����"));
		System.out.println("����".compareTo("�̿�"));
		System.out.println("A".compareTo("C")); // -2
		System.out.println("B".compareTo("A")); // 1
		
		System.out.println(Integer.valueOf(3).compareTo(Integer.valueOf(10))); // -1
		System.out.println(Integer.valueOf(3).compareTo(Integer.valueOf(3)));  // 0
		System.out.println(Integer.valueOf(10).compareTo(Integer.valueOf(3)));  // 1
		
		// ��� �̾Ƴ���
		// ��� 1. Set�� Listȭ ��Ű�� : addAll()
		
		List<Dog> list = new ArrayList<Dog>();
//		List<Dog> list = new ArrayList<Dog>(set4);
		list.addAll(set4);
		System.out.println(list);
		System.out.println(list.get(3));
		
		// ��� 2. Iterator Ȱ���ϱ� : iterator()
		Iterator<Dog> it = set4.iterator();
	
		// �� ����(1ȸ��)
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		while(it.hasNext()) {
			System.out.println("re : " + it.next());
		}
		
		//�����
		// ListIterator<Dog> it2 = set4.i
		// �� �� 
		
		// E ���׸��� ���ؼ� Ÿ�������Ѱ�
		// T Ÿ��
		// 
		
		// ���ı����� �����Էθ� �ϰڴٰ� �� ���¿�
		// 6.1 ���� �� 6.1 ���� ������ü�� �ϰ� �������������̴�.
//		@Override
//		public int compare(Dog o1, Dog o2) {
//			// �����Կ� ���ؼ� ��������
//			double standard = o1.getWeight();
//			double object = o2.getWeight();
//			
//			if(standard > object) {
//				return 1;
//			}else if(standard == object) {
//				return 0;
//			}else {
//				return -1;
//			}
//		}
		
		//java.lang.ClassCastException
		//Dog cannot be cast to java.lang.Comparable
		//���Ŀ� ���� ������ ����.
		// => Comparable
		// -> Comparator
		
	}
}
