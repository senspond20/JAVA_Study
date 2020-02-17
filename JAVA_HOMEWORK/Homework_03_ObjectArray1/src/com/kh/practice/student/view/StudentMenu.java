package com.kh.practice.student.view;

import com.kh.practice.student.controller.StudentController;
import com.kh.practice.student.model.vo.Student;

public class StudentMenu {

	StudentController sct = new StudentController();
	private final int CUT_LINE = 60;

	public StudentMenu() {

		System.out.println("========== �л� ���� ��� ==========");
		Student[] sdArr = sct.printStudent();

		for (int i = 0; i < sdArr.length; i++) {
			System.out.println(sdArr[i].inform());
		}

		// StudentController�� printStudent()�� ��ȯ ���� ���� �л� ���� ���
		System.out.println("========== �л� ���� ��� ==========");
		System.out.println("�л� ���� �հ� : " + sct.avgScore()[0]);
		System.out.println("�л� ���� ��� : " + sct.avgScore()[1]);
		sct.avgScore();
		
		// StudentController�� avgScore()�� ���� ���� �հ�� ��� ���
		// �л��� ������ CUT_LINE �̸��̸� ����� ���, �̻��̸� ��� ���
		System.out.println("========== ���� ��� ��� ==========");
		String result = "";
		for (int i = 0; i < sdArr.length; i++) {
			if (sdArr[i].getScore() < CUT_LINE) {
				result = "����Դϴ�.";
			}else {
				result = "����� ����Դϴ�.";
			}
			
			System.out.println(sdArr[i].getName() + "�л��� " + result);
		}
		
	}
}
