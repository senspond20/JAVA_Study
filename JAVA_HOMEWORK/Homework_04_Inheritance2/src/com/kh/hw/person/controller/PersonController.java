package com.kh.hw.person.controller;
import com.kh.hw.person.model.vo.Employee;
import com.kh.hw.person.model.vo.Student;

public class PersonController {

	public final int STU_SIZE = 3;
	public final int EMP_SIZE = 10;
	
	Student[] s = new Student[STU_SIZE];
	Employee[] e = new Employee[EMP_SIZE];

	private int stuCount = 0;
	private int empCount = 0;

	public int[] personCount() {
		int[] count = { stuCount, empCount };
		return count;
	}

	public void insertStudent(String name, int age, double height, double weight, int grade, String major) {	
		s[stuCount++] = new Student(name, age, height, weight, grade, major);
	}

	public Student[] printStudent() {
		return s;
	}

	public void insertEmployee(String name, int age, double height, double weight, int salary, String dept) {
		e[empCount++] = new Employee(name, age, height, weight, salary, dept);
	}

	public Employee[] printEmployee() {
		return e;
	}
}
