package com.kh.example.chap05_constructor.model.vo;

import java.util.Date;

public class User {
	// - userId : String
	// - userPwd :String
	// - userName : String
	// - enroIIData : Data(java.util)

	private String userId;
	private String userPwd;
	private String userName;
	private String managerName;
	private String usingName;
	private Date enrollDate;

	// 참고 : 싱글톤 패턴.(생성자를 private로 만들어서 밖에서호출을 안하겠다.)

	// 생성자 사용 목적
	// 1. 객체 생성해주기위한 목적
	// 2. 매개변수 필드 초기화하는 목적

	// 생성자 사용 규칙
	// 1. 생성자 명은 클래스명과 동일해야한다.
	// 2. 반환형(리턴형)이 없다.
	// 3.

	// 기본 생성자. : 매개변수가 없는 생성자 -> JVM이 기본적으로 생성해줌.
	// 그럼에도 불구하고 숨쉬듯이 만들어줘야하는 이유.
	// 매개변수 있는 생성자를 만들 경우.. JVM이 기본생성자를 생성해주지 않기 때문.
//	public User() {} 

	public User() {}
//	Duplicate method User() in type User
//  오버로딩이 적용되지 않아서 에러메시지가 뜬다.
//  같은 이름의 생성자(메소드)가 있을 때 오버로딩이 적용되지 않으면 에러 발생.

// 매개변수 생성자.       ↓ 지역 변수 일종
	public User(String userId, String userPwd) {
		// ↑
//		System.out.println(id);
//		System.out.println(pwd);
//		↓		
		this.userId = userId;
		this.userPwd = userPwd;
//		↑
//		객체가 생성된 순간 this에 객체의 주소값이 들어가있다.
//		System.out.println(this);

	}

	// 매개변수 2개 짜리 만들면.. 변수 4이름 사용
	// 매개변수 3개 짜리 만들면.. 변수 6이름 사용
	// 매개변수 3개 짜리 만들면.. 변수 8이름 사용
	// 매개변수 이름을 필드명이랑 똑같이 만들면.

	public User(String userId, String userPwd, String userName) {

//		this( )		
//	   생성자, 같은 클래스의 다른 생성자를 호출할 때 사용하며 반드시 첫 줄에 선언
		this(userId, userPwd);

//		this.userId = userId;
//		this.userPwd = userPwd;

		this.userName = userName;
		// this(userId, userPwd);

		// Constructor call must be the first statement in a constructor

	}

	// Duplicate method User(String, String) in type User
	// 개수랑 타입이랑 순서가 같아서
	// 매개변수가 다른것과는 상관이 없다.(타입만 봐야한다.)
	// public User(String id, String name)
//	{
//		
//		userId = id;
//		userName = name;
//	}

	public User(String userId, String userPwd, String userName, Date enrollDate) {

		this(userId, userPwd, userName);
		this.enrollDate = enrollDate;
	}

	// public User(String pwd, String id) {
	// }

	// 참조형 변수(레퍼런스 변수) 클래스를 통해서 만들어진 변수
	public void inform() {

		System.out.println(this);
		System.out.println(userId + "," + userPwd + "," + userName + "," + enrollDate);
		return;
	}

	public User test11() {
		User user = new User();
		
		String address = "korea";
		int code = 88;
				
		return user;
	}
	public void test22() {
		User uuu = test11();
	}
	
	public User TTT(User us) {

		User u = us;
	
		return u;
	}
	
	// final 메소드 : 오버라이딩 불가능. 
	public final void test() {
		
	}
	// 공유는 하되 종단. 변경 불가능한 
	public final static void fs() {
		swap();
	}
	
	private final static void swap() {
		
	}
}
