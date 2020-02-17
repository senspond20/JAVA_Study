package com.kh.example.chap06_method.model.vo;

public class Trainee {

	// �ʵ� ����
	private String name;
	private final String ACADEMY = "KH";
	private char classRoom;
	private static double score;

	// VO�ȿ� ���� ��ü���� Println �� ����� �Ⱦ���.
	// println�� View��� �������� �����.
	
	// ������
	public Trainee() {
	}

	public Trainee(String name) {
		this.name = name;
	}

	public Trainee(String name, char classRoom, double score) {

		this.name = name;
//		this.ACADEMY = ACADEMY;
		// The final field Trainee.ACADEMY cannot be assigned
		this.classRoom = classRoom;
		// this ��ü �� �ڽ��� ���ؼ�
		// this.score = score;
		// The static field Trainee.score should be accessed in a static way
		Trainee.score = score;
	}

	// getter/ setter �̸�
	// �޼ҵ� �̸��� �����̶� �ٸ��� �ϸ���
	// ���߿� �����ӿ�ũ�� �Ҷ� �������� �������� �״´�.

	public String inform() {
		
//		String str ="�ȳ�Ȱ���";
//		str.split("��");
		
		return name + ", " + ACADEMY + ", " + classRoom + ", " + score;
	}

	// get set
	// get set
	// get set
	
	//setter set �ʵ��(�Ǿ� �빮��)
	public void setName(String name) {
		this.name = name;
	}

	
	public void setClassRoom(char classRoom) {
		this.classRoom = classRoom;
	}
	// ��� ������ ����ƽ�����̱⿡ �޼ҵ嵵 ����ƽ���� �ϴ°��� ����.
	public static void setScore(double score) {
		Trainee.score = score;
	}
	

	//getter �ʵ��� �ִ� name�� ��ȯ�ϴ� getter
	public String getName() {
		return name;
	}
	
	// get~ �� �빮��(���)
	public String getACADEMY() {	
		return ACADEMY;
	}
	
	public char getClassRoom() {
		return classRoom;
	}
	
	public static double getScore() {
		return score;
	}
	
}
