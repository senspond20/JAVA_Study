package com.kh.example.practice7.run;

import com.kh.example.practice7.model.vo.Employee;

public class Run {
	public static void main(String[] args) {

			Employee ep = new Employee ();
			
			//100 ȫ�浿 ������ ���� 25 �� 2500000 0.05 010-1234-5678 ����� ������
			ep.setEmpNo(100);
			ep.setEmpName("ȫ�浿");
			ep.setDept("������");
			ep.setJob("����");
			ep.setAge(25);
			ep.setGender('��');
			ep.setSalary(2500000);
			ep.setBonusPoint(0.05);
			ep.setPhone("010-1234-5678");
			ep.setAddress("����� ������");
			
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
