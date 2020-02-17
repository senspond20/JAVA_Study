package com.kh.practice.student.controller;

import com.kh.practice.student.model.vo.Student;

public class StudentController {

	Student[] stdArr = null;
	private final int STUDENT_SIZE = 5;
	
	public StudentController() {
		stdArr = new Student[STUDENT_SIZE];
		
		stdArr[0] = new Student("김길동", "자바", 100);
		stdArr[1] = new Student("박길동", "디비", 50);
		stdArr[2] = new Student("이길동", "화면", 85);
		stdArr[3] = new Student("정길동", "서버", 60);
		stdArr[4] = new Student("홍길동", "자바", 20);

//		Student[] stdArr =	
//			     { new Student("김길동","자바",100),
//				   new Student("박길동","디비",50),
//				   new Student("이길동","화면",85),
//				   new Student("정길동","서버",60),
//				   new Student("홍길동","자바",20)};
	}

	public int sumScore() {
		int sum = 0;
		for(int i = 0; i < stdArr.length; i++){
			sum += stdArr[i].getScore();
		}
		return sum;
	}

	public double[] avgScore() {
		
		int sum = sumScore();
		double avg = (double) ( sum / STUDENT_SIZE) ;
		double[] result = { sum, avg};

		return result;
	}

	public Student[] printStudent() {

		return stdArr;
	}
}
