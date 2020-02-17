package com.kh.example.chap06_method.model.vo;

public class Trainee {

	// 필드 선언
	private String name;
	private final String ACADEMY = "KH";
	private char classRoom;
	private static double score;

	// VO안에 들어가는 객체들은 Println 은 절대로 안쓴다.
	// println은 View라는 곳에서만 만든다.
	
	// 생성자
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
		// this 객체 나 자신을 통해서
		// this.score = score;
		// The static field Trainee.score should be accessed in a static way
		Trainee.score = score;
	}

	// getter/ setter 이름
	// 메소드 이름을 조금이라도 다르게 하면은
	// 나중에 프레임워크를 할때 에러나고 난리나고 죽는다.

	public String inform() {
		
//		String str ="안녕안가요";
//		str.split("안");
		
		return name + ", " + ACADEMY + ", " + classRoom + ", " + score;
	}

	// get set
	// get set
	// get set
	
	//setter set 필드명(맨앞 대문자)
	public void setName(String name) {
		this.name = name;
	}

	
	public void setClassRoom(char classRoom) {
		this.classRoom = classRoom;
	}
	// 멤버 변수가 스테틱변수이기에 메소드도 스테틱으로 하는것이 좋다.
	public static void setScore(double score) {
		Trainee.score = score;
	}
	

	//getter 필드의 있는 name을 반환하는 getter
	public String getName() {
		return name;
	}
	
	// get~ 다 대문자(상수)
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
