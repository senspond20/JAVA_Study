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
		
		// 다형성 적용
		Set<Dog> set = new HashSet<Dog>();
		
		set.add(new Dog("샤샤",4.0));
		set.add(new Dog("호두",4.5));
		set.add(new Dog("우유",8.1));
		
		// 순서 유지 안된다.
		System.out.println(set);
		
		
		set.add(new Dog("샤샤",4.0));
	// 주소값으로 저장되기 떄문에 
		System.out.println(set);
		
	//	HashSet s = new HashSet();
		
//		Set<String> test = new HashSet<String>();
//
//		test.add("예시1");
//		test.add("예시2");
//		test.add("예시3");
//		System.out.println(test);
//		
//		// String이라는 클래스 자체에는 hashcode와 equls가 오버라이딩이 되어있으니까
//		test.add("예시2");
//		System.out.println(test);
		System.out.println("=====================");
		Set<Dog> set2 = new LinkedHashSet<Dog>();
		
		set2.add(new Dog("초코",2.1));
		set2.add(new Dog("콩이",8.3));
		set2.add(new Dog("두부",5.0));
		set2.add(new Dog("초코",2.1));
		
		// 순서 유지 되고 중복 저장은 안되는 LinkedHashSet
		System.out.println(set2);
		
		set2.add(new Dog("로이",6.1));
		set2.add(new Dog("공주",5.2));
		set2.add(new Dog("왕자",9.5));
		set2.add(new Dog("조이",12.5));
		set2.add(new Dog("초코",34));
		
		System.out.println(set2);
		
		Set<Dog> set3 = new TreeSet<Dog>(set2);
		System.out.println(set3);
	
		set3.add(new Dog("가희",3.8));
		System.out.println(set3);
		
		System.out.println("=============================");
		Set<Dog> set4 = new TreeSet<Dog>(new DogComparator());
		
		set4.add(new Dog("초코",6.1));
		set4.add(new Dog("콩이",8.3));
		set4.add(new Dog("두부",5.0));
		set4.add(new Dog("초코",2.1));
		set4.add(new Dog("로이",6.1));
		set4.add(new Dog("공주",5.2));
		set4.add(new Dog("왕자",9.5));
		set4.add(new Dog("조이",12.5));
	//	set4.remove(new Dog("조이",12.5));
	//	System.out.println("---------------");
		System.out.println(set4);
		
		System.out.println("가영".compareTo("가영"));
		System.out.println("가영".compareTo("미영"));
		System.out.println("A".compareTo("C")); // -2
		System.out.println("B".compareTo("A")); // 1
		
		System.out.println(Integer.valueOf(3).compareTo(Integer.valueOf(10))); // -1
		System.out.println(Integer.valueOf(3).compareTo(Integer.valueOf(3)));  // 0
		System.out.println(Integer.valueOf(10).compareTo(Integer.valueOf(3)));  // 1
		
		// 요소 뽑아내기
		// 방법 1. Set를 List화 시키기 : addAll()
		
		List<Dog> list = new ArrayList<Dog>();
//		List<Dog> list = new ArrayList<Dog>(set4);
		list.addAll(set4);
		System.out.println(list);
		System.out.println(list.get(3));
		
		// 방법 2. Iterator 활용하기 : iterator()
		Iterator<Dog> it = set4.iterator();
	
		// 단 반향(1회성)
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		while(it.hasNext()) {
			System.out.println("re : " + it.next());
		}
		
		//양방향
		// ListIterator<Dog> it2 = set4.i
		// 앞 뒤 
		
		// E 제네릭을 통해서 타입지정한것
		// T 타입
		// 
		
		// 정렬기준을 몸무게로만 하겠다고 한 상태에
		// 6.1 초코 과 6.1 로이 같은객체네 하고 지워져버린것이다.
//		@Override
//		public int compare(Dog o1, Dog o2) {
//			// 몸무게에 대해서 오름차순
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
		//정렬에 대한 기준이 없다.
		// => Comparable
		// -> Comparator
		
	}
}
