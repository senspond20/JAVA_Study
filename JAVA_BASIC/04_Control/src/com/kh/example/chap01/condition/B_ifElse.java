package com.kh.example.chap01.condition;
import java.util.Scanner;
//import java.lang.*;  // <-- String 메소드가 있는곳

public class B_ifElse {
	// if-else문
	// if(조건식){
	//		실행할 문장1;
	// }else{
	//		실행할 문장2;
	//}
	// 둘 중 한개를 선택하는 조건문
	// 조건식 결과 값이 참(true)이면 if문안에 있는 실행할 문장1 수행
	// 조건식 결과 값이 거짓(false)이면 if문을 빠져나와 else문 안에 있는 실행할 문장2 선택

	public void method1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 한개를 입력하세요 : ");
		int num = sc.nextInt();	
		
		if 	(num % 2 == 0) { System.out.println("입력하신 숫자는 짝수 입니다."); }
		else 			   { System.out.println("입력하신 숫자는 홀수 입니다.");	}
		
		System.out.println("프로그램 종료")	;
		sc.close();		
	}
	public void method2() {
		// 사용자에게 국어, 영어, 수학 정수를 입력 받아서 각각  kor, eng, math 변수에 저장
		// 각 과목 점수가 40점 이상이고 세 과목 평균 점수가 60점 이상일때 "시험 통과"
		// 하나라도 기준 미달일때 "시험 불통과" 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 점수  : ");
		int kor = sc.nextInt();
		
		System.out.print("영어 점수  : ");
		int eng = sc.nextInt();
		
		System.out.print("수학 점수  : ");
		int math = sc.nextInt();
		
		double avg = ( kor + eng + math ) / 3.0;  // 형변환을 위해 3이 아니라 3.0으로 나눠준다.
		
		if(kor >= 40 && eng >= 40 && math >= 40 && avg >= 60){
			System.out.println("시험 통과");			
		} else {
			System.out.println("시험 불통과");
		}	
		sc.close();
	}
	public void method3() {
		// 문자열 비교하기 : String 클래스 안에 있는 equals()
		// 사용자에게 이름을 받는데 내가 지정한 이름과 같으면 "본인입니다."
		// 같지 않으면 "본인이 아닙니다."
		// 문자열에서 값을 비교할때는 == 으로 비교할 수가 없다.
		// 대신에  equals 이콜스라는 메스도를 사용한다. 
		
		// boolean java.lang.String.equals(Object object);
				
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요  : ");
		String name = sc.nextLine();
		
		if(name.equals("박신우")){
			System.out.println("본인입니다.");
		}else {
			System.out.println("본인이 아닙니다.");
		}
		sc.close();
		 
	}
}

