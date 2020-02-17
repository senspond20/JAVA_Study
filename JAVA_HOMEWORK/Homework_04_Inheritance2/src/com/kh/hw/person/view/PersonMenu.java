package com.kh.hw.person.view;

import java.util.Scanner;

import com.kh.hw.person.controller.PersonController;
import com.kh.hw.person.model.vo.Employee;
import com.kh.hw.person.model.vo.Student;

public class PersonMenu {

	Scanner sc = new Scanner(System.in);
	PersonController pc = new PersonController();

	public PersonMenu() {
	}

	// ===== 메인메뉴 =====
	public void mainMenu() {
		int mMenuNum;
		while (true) {
			System.out.println("학생은 최대 3명까지 저장할 수 있습니다. ");
			System.out.println("현재 저장된 학생은 " + pc.personCount()[0] + "명입니다.");
			System.out.println("사원은 최대 10명까지 저장할 수 있습니다.");
			System.out.println("현재 저장된 사원은 " + pc.personCount()[1] + "명입니다.");
			System.out.println("---------------------------");

			System.out.println("1. 학생 메뉴 "); //  studentMenu()
			System.out.println("2. 사원 메뉴 "); //  employeeMenu()
			System.out.println("9. 끝내기 "); // “종료합니다.” 출력 후 종료

			System.out.print("메뉴 번호 : ");
			mMenuNum = sc.nextInt();
			sc.nextLine();

			if (mMenuNum == 1) {
				studentMenu();
			} else if (mMenuNum == 2) {
				employeeMenu();
			} else if (mMenuNum == 9) {
				System.out.println("종료 합니다.");
				break;
			} else {

			}
		}
	}

	// 1. ===== 학생 메뉴 ====
	public void studentMenu() {

		while (true) {
			System.out.println("1. 학생 추가"); // insertStudent()
			System.out.println("2. 학생 보기"); // printStudent()
			System.out.println("9. 메인 으로"); // “메인으로 돌아갑니다.” 출력 후 메인으로
			System.out.print("메뉴 번호 : ");

			int sMenu = sc.nextInt();
			sc.nextLine();

			if (sMenu == 1) {
				insertStudent();
			} else if (sMenu == 2) {
				printStudent();
			} else if (sMenu == 9) {
				System.out.println("메인으로 돌아갑니다.");
				return;
			} else {

			}
		}

	}

	// 2. ==== 2. 사원 메뉴 ======
	public void employeeMenu() {

		while (true) {
			System.out.println("1. 사원 추가 "); // insertEmployee()
			System.out.println("2. 사원 보기 "); // printEmployee()
			System.out.println("9. 메인으로 ");
			System.out.print("메뉴 번호 : ");

			int sMenu = sc.nextInt();
			sc.nextLine();

			if (sMenu == 1) {
				insertEmployee();
			} else if (sMenu == 2) {
				printEmployee();
			} else if (sMenu == 9) {
				System.out.println("메인으로 돌아갑니다.");
				return;
			} else {

			}
		}
	}

	// ========= 학생 입력 ============
	public void insertStudent() {

		String name;
		int age;
		double height;
		double weight;
		int grade;
		String major;

		while (true) {

			if (pc.personCount()[0] == pc.STU_SIZE) {
				System.out.println("학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가를 종료하고 학생 메뉴로 돌아갑니다.");
				return;
			}

			System.out.print("학생 이름 : ");
			name = sc.nextLine();

			System.out.print("학생 나이 : ");
			age = sc.nextInt();

			System.out.print("학생 키 : ");
			height = sc.nextInt();

			System.out.print("학생 몸무게 : ");
			weight = sc.nextInt();
			sc.nextLine();

			System.out.print("학생 학년 : ");
			grade = sc.nextInt();
			sc.nextLine();

			System.out.print("학생 전공 : ");
			major = sc.nextLine();

			pc.insertStudent(name, age, height, weight, grade, major);

			if (pc.personCount()[0] != pc.STU_SIZE) {
				System.out.print("그만 하시려면 N(또는 n), 이어서 하시려면 아무키나 누르세요 : ");
				char cse = sc.nextLine().charAt(0);

				if (cse == 'N' || cse == 'n') {
					break;
				} else {
					continue;
				}
			}
		}
	}

	// ========= 사원 입력 ============
	public void insertEmployee() {

		String name;
		int age;
		double height;
		double weight;
		int salary;
		String dept;

		while (true) {

			if (pc.personCount()[1] == pc.EMP_SIZE) {
				System.out.println("사원을 담을 수 있는 공간이 꽉 찼기 때문에 사원 추가를 종료하고 학생 메뉴로 돌아갑니다.");
				return;
			}

			System.out.print("사원 이름 : ");
			name = sc.nextLine();
			System.out.print("사원 나이 : ");
			age = sc.nextInt();
			System.out.print("사원 키 : ");
			height = sc.nextDouble();
			System.out.print("사원 몸무게 : ");
			weight = sc.nextDouble();
			System.out.print("사원 급여: ");
			salary = sc.nextInt();
			sc.nextLine();
			System.out.print("사원 부서 : ");
			dept = sc.nextLine();

			pc.insertEmployee(name, age, height, weight, salary, dept);

			if (pc.personCount()[1] != pc.EMP_SIZE) {
				System.out.print("그만 하시려면 N(또는 n), 이어서 하시려면 아무키나 누르세요 : ");
				char cse = sc.nextLine().charAt(0);

				if (cse == 'N' || cse == 'n') {
					break;
				} else {
					continue;
				}
			}
		}
	}

	// ========= 학생 출력 ============
	public void printStudent() {

		Student[] s = pc.printStudent();

		if (s[0] == null) {
			System.out.println("저장된 정보가 없습니다. ");
		} else {
		
			// pc의 printStudent() 메소드의 반환 값을 이용하여 학생 객체 배열에 저장된
			// 모든 데이터 출력
			for (int i = 0; i < pc.personCount()[0]; i++) {
				System.out.println(s[i].toString());
			}
		}
	}

	// ========= 사원 출력 ============
	public void printEmployee() {

		Employee[] e = pc.printEmployee();

		if (e[0] == null) {
			System.out.println("저장된 정보가 없습니다. ");
		} else {

			// pc의 printEmployee() 메소드의 반환 값을 이용하여 사원 객체 배열에 저장된
			// 모든 데이터 출력
			for (int i = 0; i < pc.personCount()[1]; i++) {
				System.out.println(e[i].toString());
			}
		}

	}

}
