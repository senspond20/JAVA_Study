package com.kr.practice.func;

import java.util.Scanner;

public class OperatorPractice {
//	키보드로 입력 받은 하나의 정수가 양수이면 “양수다“, 양수가 아니면 “양수가 아니다“를 출력하세요.
	public void practice1() {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 하나 입력 : ");
		int num = sc.nextInt();
		System.out.printf("%s", num > 0 ? "양수이다." : "양수가 아니다.");
		sc.close();
	}

	public void practice2() {
//	키보드로 입력 받은 하나의 정수가 양수이면 “양수다“,
//	양수가 아닌 경우 중에서 0이면 “0이다“, 0이 아니면 “음수다”를 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나 입력  : ");
		int num = sc.nextInt();

		String result = ((num > 0) ? "양수다." : (num == 0) ? "0이다." : "음수다.");
		System.out.println(result);
		sc.close();
	}

	public void practice3() {
//	키보드로 입력 받은 하나의 정수가 짝수이면 “짝수다“, 짝수가 아니면 “홀수다“를 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나 입력  : ");
		int num = sc.nextInt();
		System.out.println(num % 2 == 0 ? "짝수다." : "홀수다.");
		sc.close();
	}

	public void practice4() {
//	모든 사람이 사탕을 골고루 나눠가지려고 한다. 인원 수와 사탕 개수를 키보드로 입력 받고
//	1인당 동일하게 나눠가진 사탕 개수와 나눠주고 남은 사탕의 개수를 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("인원 수  : ");
		int num1 = Integer.parseInt(sc.nextLine());

		System.out.print("사탕개 수  : ");
		int num2 = sc.nextInt();

		System.out.println("1인당 사탕 개수 : " + num2 / num1);
		System.out.println("남은 사탕 개수 : " + num2 % num1);
		sc.close();
	}

	public void practice5() {
//	키보드로 입력 받은 값들을 변수에 기록하고 저장된 변수 값을 화면에 출력하여 확인하세요.
//	이 때 성별이 ‘M’이면 남학생, ‘M’이 아니면 여학생으로 출력 처리 하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("학년(숫자만) : ");
		int grade = sc.nextInt();
		System.out.print("반(숫자만) : ");
		int ban = sc.nextInt();
		System.out.print("번호(숫자만) : ");
		int id = sc.nextInt();

		sc.nextLine(); // 줄바꿈을 가져와주기위해 (이게 없으면 에러난다.)
		System.out.print("성별(M/F) : ");
		char ch = sc.nextLine().charAt(0);

		System.out.print("성적(소수점아래 둘째자리까지) : ");
		float score = (float) sc.nextDouble();

		String str = "%d학년 %d반 %d번 %s %c학생의 성적은 %.2f이다.";
		System.out.printf(str, grade, ban, id, name, (ch == 'M' ? '남' : '여'), score);
		sc.close();
	}

	public void practice6() {
//		나이를 키보드로 입력 받아 어린이(13세 이하)인지, 청소년(13세 초과 ~ 19세 이하)인지,
//		성인(19세 초과)인지 출력하세요.		
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력 : ");
		int num = sc.nextInt();

		if (num <= 13) {
			System.out.println("어린이");
		} else if (num > 19) {
			System.out.println("성인");
		} else {
			System.out.println("청소년");
		}

		sc.close();
	}

	public void practice7() {
//	국어, 영어, 수학에 대한 점수를 키보드를 이용해 정수로 입력 받고,
//	세 과목에 대한 합계(국어+영어+수학)와 평균(합계/3.0)을 구하세요.
//	세 과목의 점수와 평균을 가지고 합격 여부를 처리하는데
//	세 과목 점수가 각각 40점 이상이면서 평균이 60점 이상일 때 합격, 아니라면 불합격을 출력하세요
		Scanner sc = new Scanner(System.in);

		System.out.print("국어 : ");
		int kor = sc.nextInt();
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		System.out.print("수학 : ");
		int math = sc.nextInt();

		double avg = (kor + eng + math) / 3.0;
		boolean check = (kor >= 40) && (eng >= 40) && (math >= 40) && (avg >= 60);

		System.out.println(check ? "합격" : "불합격");
		sc.close();
	}

	public void practice8() {
//	주민번호를 이용하여 남자인지 여자인지 구분하여 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("주민번호를 입력하세요 (-포함): ");
		// 970435-124590
		String str = sc.nextLine();
		char check = str.charAt(7);

		System.out.printf("%s\n", check == '1' || check == '3' ? "남자" : "여자");
		
		if(check == '1' || check == '3' ) {
			
			System.out.println("남자");
		}
		else {
			System.out.println("여자");
		}
		sc.close();
	}

	public void practice9() {
//	키보드로 정수 두 개를 입력 받아 각각 변수(num1, num2)에 저장하세요.
//	그리고 또 다른 정수를 입력 받아 그 수가 num1 이하거나 num2 초과이면 true를 출력하고
//	아니면 false를 출력하세요.
//	(단, num1은 num2보다 작아야 함)

		Scanner sc = new Scanner(System.in);
		System.out.print("정수1: ");
		int num1 = sc.nextInt();
		System.out.print("정수2: ");
		int num2 = sc.nextInt();
		System.out.print("입력: ");
		int num = sc.nextInt();

		boolean check = (num <= num1) || (num > num2);
		System.out.println(check);

		sc.close();
	}

	public void practice10() {
//	3개의 수를 키보드로 입력 받아 입력 받은 수가 모두 같으면 true, 아니면 false를 출력하세요.	
		Scanner sc = new Scanner(System.in);
		System.out.print("입력1: ");
		int num1 = sc.nextInt();
		System.out.print("입력2: ");
		int num2 = sc.nextInt();
		System.out.print("입력3: ");
		int num3 = sc.nextInt();

		boolean check = (num1 == num2) && (num2 == num3) && (num1 == num3);
		System.out.println(check);
		sc.close();
	}

	public void practice11() {
//	A, B, C 사원의 연봉을 입력 받고 각 사원의 연봉과 인센티브를 포함한 연봉을 계산하여 출력하고
//	인센티브 포함 급여가 3000만원 이상이면 “3000 이상”, 미만이면 “3000 미만”을 출력하세요.
//	(A 사원의 인센티브는 0.4, B 사원의 인센티브는 없으며, C 사원의 인센티브는 0.15)
		Scanner sc = new Scanner(System.in);

		System.out.print("A사원의 연봉: ");
		int payA = sc.nextInt();
		System.out.print("B사원의 연봉: ");
		int payB = sc.nextInt();
		System.out.print("C사원의 연봉: ");
		int payC = sc.nextInt();

		double totalA = payA * 1.4;
		double totalB = payB;
		
//		double totalC = payC * 1.15;
		double totalC = payC + payC * 1.15;
		
		System.out.println("A사원의 연봉/연봉 +a :" + payA + "/" + totalA);
		System.out.println(totalA >= 3000 ? "3000 이상" : "3000 미만");

		System.out.println("B사원의 연봉/연봉 +a :" + payB + "/" + totalB);
		System.out.println(totalB >= 3000 ? "3000 이상" : "3000 미만");

		System.out.println("C사원의 연봉/연봉 +a :" + payC + "/" + totalC);
		System.out.println(totalC >= 3000 ? "3000 이상" : "3000 미만");

				
		// 소수를 2진수로 바꾸는 부동소수점 계산을 하기 때문에 (
		// *1.15로 계산한 결과와 * 0.15 결과가 차이가 있다.
		// 
		
//		char[] people = {'A','B','C'};
//		int[] pay = {0,0,0};
//		double[] tbonus = {1.4, 1, 1.15};
//		double total;
//		Scanner sc = new Scanner(System.in);
//		
//		for(int index = 0 ; index <3 ; index++) {
//			System.out.print(people[index] + "사원의 연봉: ");
//			pay[index] = sc.nextInt();
//		}
//
//		for(int i = 0 ; i <3 ; i++) {	
//			total = pay[i]*tbonus[i];
//			System.out.println(people[i] + "사원의 연봉/연봉 +a :" + pay[i] +"/" + total);
//			System.out.println(total >= 3000 ? "3000 이상" : "3000 미만");
//		}
//		
		sc.close();
	}
}