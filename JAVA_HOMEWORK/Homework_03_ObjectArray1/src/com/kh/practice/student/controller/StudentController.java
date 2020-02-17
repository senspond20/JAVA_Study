package com.kh.practice.student.controller;

import com.kh.practice.student.model.vo.Student;

public class StudentController {

	Student[] stdArr = null;
	private final int STUDENT_SIZE = 5;
	
	public StudentController() {
		stdArr = new Student[STUDENT_SIZE];
		
		stdArr[0] = new Student("��浿", "�ڹ�", 100);
		stdArr[1] = new Student("�ڱ浿", "���", 50);
		stdArr[2] = new Student("�̱浿", "ȭ��", 85);
		stdArr[3] = new Student("���浿", "����", 60);
		stdArr[4] = new Student("ȫ�浿", "�ڹ�", 20);

//		Student[] stdArr =	
//			     { new Student("��浿","�ڹ�",100),
//				   new Student("�ڱ浿","���",50),
//				   new Student("�̱浿","ȭ��",85),
//				   new Student("���浿","����",60),
//				   new Student("ȫ�浿","�ڹ�",20)};
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
