package com.kh.example.chap05_constructor.run;

import com.kh.example.chap05_constructor.model.vo.User;

public class Run {
	public static void main(String[] args) {

		//User u1 = new User();	
		// The constructor User() is undefined
		// user��� �����ڰ�  ���ǵ��� �ʾҴ�.
		
//	u1.inform();	
		User u2 = new User("id�Դϴ�","pw�Դϴ�");
		System.out.println(u2);
		u2.inform();
		
		User u3 = new User("id�Դϴ�","pw�Դϴ�","�̸� �Դϴ�.");
		u3.inform();
		
		System.out.printf("%d",234);
	
		User uu = u3.TTT(u3);
		System.out.println(uu);
		
		
		
		
	}
}
