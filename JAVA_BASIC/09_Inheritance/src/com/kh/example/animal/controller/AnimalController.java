package com.kh.example.animal.controller;

import com.kh.example.animal.model.vo.Animal;
import com.kh.example.animal.model.vo.Dog;
import com.kh.example.animal.model.vo.Snake;

public class AnimalController {
	public void method1() {
		
		Animal a = new Animal("강아지",9,6.3);
		//System.out.println(a.inform());
	
		
		//System.out.println(a.toString());
		System.out.println(a);
		System.out.println(Integer.toBinaryString(a.hashCode()));
		System.out.println(Integer.toHexString(a.hashCode()));
		// toString 을 오버라이딩하여 재정의하여 반환값이 		
		
		Dog d = new Dog("태양이", 8, 4.5 , 40, "장모");
//		System.out.println(d.inform());
		System.out.println(d);
		
		Snake s = new Snake("방울이",4,10.2,"빗살");
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
