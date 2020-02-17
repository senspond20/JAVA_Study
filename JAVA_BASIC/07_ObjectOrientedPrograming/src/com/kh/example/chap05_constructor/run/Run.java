package com.kh.example.chap05_constructor.run;

import com.kh.example.chap05_constructor.model.vo.User;

public class Run {
	public static void main(String[] args) {

		//User u1 = new User();	
		// The constructor User() is undefined
		// user라는 생성자가  정의되지 않았다.
		
//	u1.inform();	
		User u2 = new User("id입니다","pw입니다");
		System.out.println(u2);
		u2.inform();
		
		User u3 = new User("id입니다","pw입니다","이름 입니다.");
		u3.inform();
		
		System.out.printf("%d",234);
	
		User uu = u3.TTT(u3);
		System.out.println(uu);
		
		
		
		
	}
}
