package com.kh.example.chap02_abstarctNInterface.family.controller;

import com.kh.example.chap02_abstarctNInterface.family.model.vo.Baby;
import com.kh.example.chap02_abstarctNInterface.family.model.vo.Basic;
import com.kh.example.chap02_abstarctNInterface.family.model.vo.Family;
import com.kh.example.chap02_abstarctNInterface.family.model.vo.Mother;

public class FamilyController {

	public void method() {

		// Family f = new Family();
		// Cannot instantiate the type Family
		// 추상클래스는 객체 생성을 할수가 없다.

		// 추상클래스는 참조변수로 사용할 수 있고 ㅡ 다형성이기 때문에 문제없다.
		Family f1 = new Mother("어머니", 50, 70, "출산");
		Family f2 = new Baby("베이비", 3.5, 70);
		
		System.out.println(f1);
		System.out.println(f2);
		
//		Basic b = new Basic();
		Basic b1 = new Mother("어머니", 50, 70 ,"출산");
		Basic b2 = new Baby("베이비",3.5,70);
		
		System.out.println(b1);
		System.out.println(b2);
		
		b1.eat();
		b2.eat();
		System.out.println(b1);
		System.out.println(b2);
	}
}
