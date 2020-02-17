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
	// 제네릭으로 지정해주지 않으면 기본적으로 오브젝트로 들어간다.
	// 오브젝트는 모든 클래스의 조상이므로 다형성으로 자식클래스를 받을 수 있다.(pdf 3번 장점)
	// 하지만 그렇게 사용하는경우는 별로 없다. 
	// 제네릭(타입을 지정)으로 사용.
		
		List<Student> list = new ArrayList<Student>(3);
		
	//	List<Student> list2 = new ArrayList<>(); 
		// 앞에 있는 제네릭 타입을 보고 뒤에있는 타입을 추정
		// 자바버전에 따라 될수도 있고 안될 수도 있다.
		
		//list2.add(E e) 리스트 끝에 데이터 e 추가
		list.add(new Student("테스트",0));
		list.add(new Student("도대담",60));
		list.add(new Student("남나눔",90));
		list.add(new Student("하현호",85));
		list.add(new Student("문미미",85));
		// 추가/삭제/정령 등의 기능처리 간단.
		
		System.out.println("list 사이즈 : " + list.size());
		System.out.println("list : " + list);
		
		list.add(0, new Student("류라라",100));
		System.out.println("list 사이즈 : " + list.size());
		System.out.println("list : " + list);
		
		list.add(3, new Student("강건강",40));
		System.out.println("list 사이즈 : " + list.size());
		System.out.println("list : " + list);
		
		// remove(int index) : 해당 index번째 객체 삭제
		list.remove(1);
		System.out.println("list : " + list);
		
		// remove(Object o) : 해당 Object 객체 삭제
		list.remove(new Student("강건강",40));
		System.out.println("list : " + list);
		
		
		Collections.sort(list);
		System.out.println("list : " + list);
		// Object에 있는 이퀄스 메소드와
		// haseCode 에 있는 메소르를  오버라이딩으로 재정의를 해야지만
		// 삭제가 가능. 어떻게 재정의를 할꺼냐면
		// 주소값을 서로 비교하는것이 아니라 안에 있어있는 필드값을 비교하게 바꾼다.
		
		// 정렬방법 1. Collections 클래스 이용
		//Collections.sort(list); // 뭘로 정렬할 것인지 기준이 없다.
	
		//Comparable -> 한개의 정렬만 가능 java.lang
		//Comparator -> 여러개의 정렬이 가능 java.util
//		ArrayList<String> strList = new ArrayList<String>();
//		strList.add("저녘시간");
//		strList.add("점심시간");
//		strList.add("퇴근시간");
//		strList.add("기상시간");
//		strList.add("출근시간");
//		strList.add("취침시간");
//		
//		System.out.println(strList);
//		Collections.sort(strList);
//		System.out.println(strList);
		
		// 정렬방법 2. list.sort() 메소드 이용
		list.add(new Student("박보배",85));
		
		list.sort(new StudentComparator());
		
//		
		// set( int index, E e ) : index번째 인덱스에 있는 요소 e로 수정
		
		list.set(2, new Student("도대담",31));
		System.out.println("list : " + list);
		
		//get ( int index ) : index 번째 인덱스에 있는 요소를 가지고 옴
		Student s = list.get(2);
		System.out.println(s);
		System.out.println("list : " + list); // 가지고 오는것이지 뺴오는것은 아니다.
		
		// subList (int index1, int index2) : index1 번째 인덱스부터 index2번째 인덱스까지 리스트 반환
		System.out.println("list 추출 : " + list.subList(2, 5));
		
		// contains(Object o ) : o가 리스트에 존재한다면 true 반환
		// indexOf (Object o) : o가 리스트에 위치하는 인덱스 번호 반환, 없다면 -1 반환
		
		System.out.println("남나눔, 90에 있는가? " + list.contains(new Student("남나눔", 90)));
		System.out.println("남나눔, 90의 인덱스 위치는? " + list.indexOf(new Student("남나눔",90)));
		System.out.println("테스트, 0의 인덱스 위치는? "+ list.indexOf(new Student("테스트",0)));
		System.out.println("=========================");
		
		// clear() : 저장된 모든 객체 삭제
		// isEmpty() : 리스트가 비었을 때 true 반환
		list.clear();
		System.out.println("list : " + list);
		System.out.println("list 가 비었나요?" + list.isEmpty());
	}
	
}
