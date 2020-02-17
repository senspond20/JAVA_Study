package com.kh.practice.chap01.ControlPractice;
import java.util.Scanner;

public class ControlPractice {

	public void practice1() {
//	아래 예시와 같이 메뉴를 출력하고 메뉴 번호를 누르면 “OO메뉴입니다“를,
//	종료 번호를 누르면 “프로그램이 종료됩니다.”를 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");

		System.out.print("메뉴 번호를 입력하세요 : ");

		int num = sc.nextInt();
		switch (num) {
		case 1:
			System.out.println("입력 메뉴입니다.");
			break;
		case 2:
			System.out.println("수정 메뉴입니다.");
			break;
		case 3:
			System.out.println("조회 메뉴입니다.");
			break;
		case 4:
			System.out.println("삭제 메뉴입니다.");
			break;
		case 7:
			System.out.println("프로그램이 종료됩니다.");
			break;
		default:
		}
		sc.close();
	}

	public void practice2() {
//	키보드로 정수를 입력 받은 정수가 양수이면서 짝수일 때만 “짝수다”를 출력하고
//	짝수가 아니면 “홀수다“를 출력하세요.
//	양수가 아니면 “양수만 입력해주세요.”를 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		if (num > 0) {
			if (num % 2 == 0) {
				System.out.println("짝수다.");
			} else {
				System.out.println("홀수다.");
			}
		} else {
			System.out.println("양수만 입력하세요.");
		}
		sc.close();
	}

	public void practice3() {
//	 국어, 영어, 수학 세 과목의 점수를 키보드로 입력 받고 합계와 평균을 계산하고
//	 합계와 평균을 이용하여 합격 / 불합격 처리하는 기능을 구현하세요.
//	 (합격 조건 : 세 과목의 점수가 각각 40점 이상이면서 평균이 60점 이상일 경우)
//	 합격 했을 경우 과목 별 점수와 합계, 평균, “축하합니다, 합격입니다!”를 출력하고
//	 불합격인 경우에는 “불합격입니다.”를 출력하세요.

		Scanner sc = new Scanner(System.in);
		System.out.print("국어 점수 : ");
		int kor = sc.nextInt();
		System.out.print("영어 점수 : ");
		int eng = sc.nextInt();
		System.out.print("수학 점수 : ");
		int math = sc.nextInt();

		int sum = (kor + eng + math);
		double avg = sum / 3.0;
		boolean pass = (kor >= 40) && (eng >= 40) && (math >= 40) && (avg >= 60);

		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
		System.out.println(pass);

		sc.close();
	}

	public void practice4() {
// 수업자료(7page)에서 if문으로 되어있는 봄, 여름, 가을, 겨울 예제를 switch문으로 바꿔서 출력하세요.
//		if(month == 1 || month == 2 || month == 12) { 
//			season = "겨울"; 
//			} else if(month >= 3 && month <= 5) { 
//			season = "봄"; 
//			} else if(month >= 6 && month <= 8) { 
//			season = "여름"; 
//			} else if(month >= 9 && month <= 11) { 
//			season = "가을"; 
//			} else { 
//			season = "해당하는    계절이    없습니다."; 
//			}
		Scanner sc = new Scanner(System.in);

//		String season = "";
		System.out.print("1~12 사이의 정수 입력 : ");
		int month = sc.nextInt();

//		int month = Integer.parseInt(sc.nextLine());
//		System.out.println(month);
//      문자열 변수 season 으로 받아서는 왜안되지?

		switch (month) {
		case 1:
		case 2:
		case 12:
			System.out.println("겨울");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("봄");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("여름");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("가을");
			break;
		default:
			System.out.println(month + "는 잘못된 달입니다.");

		}
		sc.close();

	}

	public void practice5() {
//	 아이디, 비밀번호를 정해두고 로그인 기능을 작성하세요.
//	 로그인 성공 시 “로그인 성공”,
//	 아이디가 틀렸을 시 “아이디가 틀렸습니다.“,
//	 비밀번호가 틀렸을 시 “비밀번호가 틀렸습니다.”를 출력하세요.
		String id = "myId";
		String pw = "myPassword12";

		Scanner sc = new Scanner(System.in);

		System.out.print("아이디 : ");
		String inid = sc.nextLine();
		System.out.print("비밀번호 : ");
		String inpw = sc.nextLine();

//		 boolean ck = inid.equals(id) && inpw.equals(pw);

		if (inid.equals(id) && inpw.equals(pw)) {
			System.out.println("로그인 성공");
		} else {
			if (inid.equals(id)) {
				System.out.println("비밀번호가 틀렸습니다.");
			}

			if (inpw.equals(pw)) {
				System.out.println("아이디가 틀렸습니다.");
			}
			System.out.println("비번/아이디 모두 틀렸습니다.");
		}

		sc.close();
	}

	public void practice6() {
//	 사용자에게 관리자, 회원, 비회원 중 하나를 입력 받아 각 등급이 행할 수 있는 권한을 출력하세요.
//	 단, 관리자는 회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성이 가능하고
//	 회원은 게시글 작성, 게시글 조회, 댓글 작성이 가능하고
//	 비회원은 게시글 조회만 가능합니다.
		Scanner sc = new Scanner(System.in);

		System.out.print("관리자, 회원, 비회원 중 하나를 입력하세요 : ");
		String str = sc.nextLine();

		if (str.equals("관리자")) {
			System.out.println("회원 관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성");
		} else if (str.equals("회원")) {
			System.out.println("게시글 작성, 게시글 조회, 댓글 작성");
		} else if (str.equals("비회원")) {
			System.out.println("비회원은 게시글 조회만 가능합니다.");
		} else {
			System.out.println("잘못 접근하셨습니다.");
		}
		sc.close();

	}

	public void practice7() {
//	 키, 몸무게를 double로 입력 받고 BMI지수를 계산하여 계산 결과에 따라
//	 저체중/정상체중/과체중/비만을 출력하세요.
//	 BMI = 몸무게 / (키(m) * 키(m))
//	 BMI가 18.5미만일 경우 저체중 / 18.5이상 23미만일 경우 정상체중
//	 BMI가 23이상 25미만일 경우 과체중 / 25이상 30미만일 경우 비만
//	 BMI가 30이상일 경우 고도 비만

		Scanner sc = new Scanner(System.in);

		System.out.print("키(m)를 입력해 주세요 : ");
		double height = sc.nextDouble();
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		double weight = sc.nextDouble();

		double BMI = weight / (height * height);
		String str = null;

		if (BMI < 18.5) {
			str = "저체중";
		} else if (BMI < 23) {
			str = "정상체중";
		} else if (BMI < 25) {
			str = "과체중";
		} else if (BMI < 30) {
			str = "비만";
		} else {
			str = "고도비만";
		}
		System.out.println("BMI 지수 : " + BMI);
		System.out.println(str);

		sc.close();
	}

	public void practice8() {
//	 키보드로 두 개의 정수와 연산 기호를 입력 받아 연산 기호에 맞춰 연산 결과를 출력하세요.
//	 (단, 두 개의 정수 모두 양수일 때만 작동하며 없는 연산 기호를 입력 했을 시
//	 “잘못 입력하셨습니다. 프로그램을 종료합니다.” 출력)
		Scanner sc = new Scanner(System.in);

		double result = 0;
		boolean ck = false;

		System.out.print("피연산자 입력1 : ");
		int num1 = sc.nextInt();

		System.out.print("피연산자 입력2 : ");
		int num2 = sc.nextInt();
		sc.nextLine();

		System.out.print("연산자를 입력 (+,-,*,/,%) : ");
		char oper = sc.nextLine().charAt(0);

		if (num1 > 0 && num2 > 0) {

			switch (oper) {
			case '+':
				result = num1 + num2;
				break;
			case '-':
				result = num1 - num2;
				break;
			case '*':
				result = num1 * num2;
				break;
			case '/':
				result = (double) num1 / num2;
				ck = true;
				break;
			case '%':
				result = num1 % num2;
				break;
			default:
				System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
				sc.close();
				return;
			}
		} else {
			System.out.println("양수만을 입력해주세요.프로그램을 종료하세요.");
		}

		if (ck = true)
			System.out.printf("%.6f", result);
		else {
			System.out.printf("%d", result);
		}
		sc.close();
	}

	public void practice9() {
//	 중간고사, 기말고사, 과제점수, 출석회수를 입력하고 Pass 또는 Fail을 출력하세요.
//	 평가 비율은 중간고사 20%, 기말고사 30%, 과제 30%, 출석 20%로 이루어져 있고
//	 이 때, 출석 비율은 출석 회수의 총 강의 회수 20회 중에서 출석한 날만 따진 값으로 계산하세요.
//	 70점 이상일 경우 Pass, 70점 미만이거나 전체 강의에 30% 이상 결석 시 Fail을 출력하세요
		Scanner sc = new Scanner(System.in);

		System.out.print("중간 고사 점수 : ");
		int score1 = sc.nextInt();

		System.out.print("기말 고사 점수 : ");
		int score2 = sc.nextInt();

		System.out.print("과제 점수 : ");
		int score3 = sc.nextInt();

		System.out.print("출석 회수 : ");
		int score4 = sc.nextInt();

		double sc1 = (double) score1 * 0.2;
		double sc2 = (double) score2 * 0.3;
		double sc3 = (double) score3 * 0.3;

		double sum = sc1 + sc2 + sc3 + score4;

		System.out.println("================= 결과 =================");

		if ((double) score4 < 20 * 0.7) {
			System.out.printf("Fail [출석 회수부족 (%d/20)]\n", score4);
		} else {

			System.out.println("중간 고사 점수(20) :" + sc1);
			System.out.println("기말 고사 점수(30) :" + sc2);
			System.out.println("과제 점수 (30) : " + sc3);
			System.out.println("출석 점수 (20) : " + score4);
			System.out.println("총점 : " + sum);

			if (sum < 70) {
				System.out.println("Fail [점수 미달]");
			} else {
				System.out.println("pass");
			}
		}
		sc.close();
	}

	public void practice10() {
//	 앞에 구현한 실습문제를 선택하여 실행할 수 있는 메뉴화면을 구현하세요.

		Scanner sc = new Scanner(System.in);

		System.out.println("실행할 기능을 선택하세요.");
		System.out.println("1. 메뉴 출력");
		System.out.println("2. 짝수/홀수");
		System.out.println("3. 합격/불합격");
		System.out.println("4. 계절");
		System.out.println("5. 로그인");
		System.out.println("6. 권한 확인");
		System.out.println("7. BMI");
		System.out.println("8. 계산기");
		System.out.println("9. P/F");

		System.out.print("선택 : ");
		int index = sc.nextInt();

		switch (index) {
		case 1:
			practice1();
			break;
		case 2:
			practice2();
			break;
		case 3:
			practice3();
			break;
		case 4:
			practice4();
			break;
		case 5:
			practice5();
			break;
		case 6:
			practice6();
			break;
		case 7:
			practice7();
			break;
		case 8:
			practice8();
			break;
		case 9:
			practice9();
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
			break;
		}
		sc.close();

	}

	public void practice11() {

		// 정수를 이용해서 4자리 비밀번호를 만드려고 하는데
		// 중복 값이 있으면 '중복 값 없음'
		// 자리수가 안 맞으면 ' 자리 수 안 맞음 '
		// 단, 제일 앞자리 수의 값은 1~9사이 정수

		Scanner sc = new Scanner(System.in);

		String password = "";
		boolean check = false;
		
		while (true) {
			
			check = false;
			System.out.print("비밀 번호 입력(1000~9999) : ");
			password = sc.nextLine();

			if (password.length() != 4) {
				System.out.println("자리수 안맞음");
				check = true;
				continue;
			}
			
			for(int i = 0; i < password.length(); i++)
			{
				for(int j = 0; j <i; j++)
				{
					if(password.charAt(i) == password.charAt(j))
					{
						System.out.println("중복 값 있음");
						check = true;
						break;
					}
				}
			}
			
			if(check){
				continue;
			}else {
				System.out.println("성공");
				break;
			}		

		}
	}
}
