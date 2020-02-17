package com.kh.practice.student.model.vo;

public class Student {
	private String name;
	private String subject;
	private int score;

	// 기본 생성자
	public Student() {	}
	
	// 매개변수 생성자 (오버로딩)
	public Student(String name, String subject, int score) {
		this.name = name;
		this.subject = subject;
		this.score = score;
	}
	public String inform() {
		return "이름 : " + name + "/" + "과목 : " + subject + "/" + "점수 :" + score;
	}
	/* setter / getter() */

	// name
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	// subject
	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getSubject() {
		return subject;
	}

	// score
	public void setScore(int score) {
		this.score = score;
	}

	public int getScore() {
		return score;
	}

}
