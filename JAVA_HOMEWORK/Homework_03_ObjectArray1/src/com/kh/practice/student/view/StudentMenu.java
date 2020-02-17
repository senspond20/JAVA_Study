package com.kh.practice.student.view;

import com.kh.practice.student.controller.StudentController;
import com.kh.practice.student.model.vo.Student;

public class StudentMenu {

	StudentController sct = new StudentController();
	private final int CUT_LINE = 60;

	public StudentMenu() {

		System.out.println("========== 학생 정보 출력 ==========");
		Student[] sdArr = sct.printStudent();

		for (int i = 0; i < sdArr.length; i++) {
			System.out.println(sdArr[i].inform());
		}

		// StudentController에 printStudent()의 반환 값을 통해 학생 정보 출력
		System.out.println("========== 학생 성적 출력 ==========");
		System.out.println("학생 점수 합계 : " + sct.avgScore()[0]);
		System.out.println("학생 점수 평균 : " + sct.avgScore()[1]);
		sct.avgScore();
		
		// StudentController에 avgScore()를 통해 점수 합계와 평균 출력
		// 학생의 점수가 CUT_LINE 미만이면 재시험 대상, 이상이면 통과 출력
		System.out.println("========== 성적 결과 출력 ==========");
		String result = "";
		for (int i = 0; i < sdArr.length; i++) {
			if (sdArr[i].getScore() < CUT_LINE) {
				result = "통과입니다.";
			}else {
				result = "재시험 대상입니다.";
			}
			
			System.out.println(sdArr[i].getName() + "학생은 " + result);
		}
		
	}
}
