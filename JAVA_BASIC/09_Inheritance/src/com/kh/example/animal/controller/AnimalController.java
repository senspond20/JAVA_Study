package com.kh.example.animal.controller;

import com.kh.example.animal.model.vo.Animal;
import com.kh.example.animal.model.vo.Dog;
import com.kh.example.animal.model.vo.Snake;

public class AnimalController {
	public void method1() {
		
		Animal a = new Animal("������",9,6.3);
		//System.out.println(a.inform());
	
		
		//System.out.println(a.toString());
		System.out.println(a);
		System.out.println(Integer.toBinaryString(a.hashCode()));
		System.out.println(Integer.toHexString(a.hashCode()));
		// toString �� �������̵��Ͽ� �������Ͽ� ��ȯ���� 		
		
		Dog d = new Dog("�¾���", 8, 4.5 , 40, "���");
//		System.out.println(d.inform());
		System.out.println(d);
		
		Snake s = new Snake("�����",4,10.2,"����");
//		System.out.println(s.inform());
//		System.out.println(s.toString());
		
		System.out.println(s);
	}	

}

final class bb{
//	public void ;
	public void maine3() {
		
	}
}

final class cc{
	
}
