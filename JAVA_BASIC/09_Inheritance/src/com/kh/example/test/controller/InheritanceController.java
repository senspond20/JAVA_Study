package com.kh.example.test.controller;
import com.kh.example.test.model.vo.Child1;
import com.kh.example.test.model.vo.Child2;
import com.kh.example.test.model.vo.Parent;

public class InheritanceController {
	
	public void method(){	
		System.out.println("parent 클래스의 num필드 접근");
			
		Parent p = new Parent();
		p.setNum(9);
		System.out.println("Parent 안에 있는 num : " + p.getNum());
	
		System.out.println();
		
		System.out.println("Child 클래스의 str필드 접근");
		
		Child1 c1 = new Child1();
		c1.setStr("hello");
		System.out.println("Child 클래스의 str : " + c1.getStr());

		
		System.out.println("Child1 안에 있는 num 필드 접근");
		
		c1.setNum(99);
		System.out.println("Child1 안에 있는 num :" + c1.getNum());
		
		
		
		System.out.println("Child2 클래스의 str필드 접근 ");
		Child2 c2 = new Child2();
		c2.setStr("dragon");
		System.out.println("Child2 클래스의 str : " + c2.getStr());
		
		System.out.println("Child2 클래스가 상속받은 Parent의 필드 접근 ");
		c2.setNum(88);
		System.out.println("Child2 클래스의 str : " + c2.getNum());
		
		// parent 안에 들어간 값은 바뀌지 않는다.
		// 넘겨받은것이 아니라 물려받은것이기 때문에.
		System.out.println("Child2 클래스의 str : " + p.getNum());
		
		/// c2.Num 
		// Parent 의 Num필드 접근 제한자가 private 이기 때문 
		
		
	
	}

}
