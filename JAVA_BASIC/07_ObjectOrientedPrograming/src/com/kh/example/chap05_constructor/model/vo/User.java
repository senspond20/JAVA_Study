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

	// ���� : �̱��� ����.(�����ڸ� private�� ���� �ۿ���ȣ���� ���ϰڴ�.)

	// ������ ��� ����
	// 1. ��ü �������ֱ����� ����
	// 2. �Ű����� �ʵ� �ʱ�ȭ�ϴ� ����

	// ������ ��� ��Ģ
	// 1. ������ ���� Ŭ������� �����ؾ��Ѵ�.
	// 2. ��ȯ��(������)�� ����.
	// 3.

	// �⺻ ������. : �Ű������� ���� ������ -> JVM�� �⺻������ ��������.
	// �׷����� �ұ��ϰ� �������� ���������ϴ� ����.
	// �Ű����� �ִ� �����ڸ� ���� ���.. JVM�� �⺻�����ڸ� ���������� �ʱ� ����.
//	public User() {} 

	public User() {}
//	Duplicate method User() in type User
//  �����ε��� ������� �ʾƼ� �����޽����� ���.
//  ���� �̸��� ������(�޼ҵ�)�� ���� �� �����ε��� ������� ������ ���� �߻�.

// �Ű����� ������.       �� ���� ���� ����
	public User(String userId, String userPwd) {
		// ��
//		System.out.println(id);
//		System.out.println(pwd);
//		��		
		this.userId = userId;
		this.userPwd = userPwd;
//		��
//		��ü�� ������ ���� this�� ��ü�� �ּҰ��� ���ִ�.
//		System.out.println(this);

	}

	// �Ű����� 2�� ¥�� �����.. ���� 4�̸� ���
	// �Ű����� 3�� ¥�� �����.. ���� 6�̸� ���
	// �Ű����� 3�� ¥�� �����.. ���� 8�̸� ���
	// �Ű����� �̸��� �ʵ���̶� �Ȱ��� �����.

	public User(String userId, String userPwd, String userName) {

//		this( )		
//	   ������, ���� Ŭ������ �ٸ� �����ڸ� ȣ���� �� ����ϸ� �ݵ�� ù �ٿ� ����
		this(userId, userPwd);

//		this.userId = userId;
//		this.userPwd = userPwd;

		this.userName = userName;
		// this(userId, userPwd);

		// Constructor call must be the first statement in a constructor

	}

	// Duplicate method User(String, String) in type User
	// ������ Ÿ���̶� ������ ���Ƽ�
	// �Ű������� �ٸ��Ͱ��� ����� ����.(Ÿ�Ը� �����Ѵ�.)
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

	// ������ ����(���۷��� ����) Ŭ������ ���ؼ� ������� ����
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
	
	// final �޼ҵ� : �������̵� �Ұ���. 
	public final void test() {
		
	}
	// ������ �ϵ� ����. ���� �Ұ����� 
	public final static void fs() {
		swap();
	}
	
	private final static void swap() {
		
	}
}
