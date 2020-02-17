package com.kh.example.practice7.run;

import com.kh.example.practice7.model.vo.Employee;

public class Run {
	public static void main(String[] args) {

			Employee ep = new Employee ();
			
			//100 홍길동 영업부 과장 25 남 2500000 0.05 010-1234-5678 서울시 강남구
			ep.setEmpNo(100);
			ep.setEmpName("홍길동");
			ep.setDept("영영부");
			ep.setJob("과장");
			ep.setAge(25);
			ep.setGender('남');
			ep.setSalary(2500000);
			ep.setBonusPoint(0.05);
			ep.setPhone("010-1234-5678");
			ep.setAddress("서울시 강남구");
			
			System.out.println(
					ep.getEmpNo() + " " + 
					ep.getEmpName() + " " +
					ep.getDept() + " " + 
					ep.getJob() + " " +
					ep.getAge() + " " +
					ep.getGender() + " " +
					ep.getSalary() + " " +
					ep.getBonusPoint() + " " +
					ep.getPhone() + " " +
					ep.getAddress() );
	}
}
