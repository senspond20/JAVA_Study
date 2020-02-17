package com.kr.practice2.func;

import java.util.Scanner;


//실수형으로 국어, 영어, 수학 세 과목의 점수를 입력 받아 총점과 평균을 출력하세요.
//이 때 총점과 평균은 정수형으로 처리하세요.

public class CastingPractice2 {
	public void castingPractice2(){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		float kor = sc.nextFloat();
		
		System.out.print("영어 : ");
		float eng = sc.nextFloat();
		
		System.out.print("수학 : ");
		float math = sc.nextFloat();
		
		int sum = (int)(kor + eng + math);
		int avr = (int)(sum/3);
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avr);
		
		sc.close();
		

		
	}
}
