package com.kh.variable;

public class B_Constant {
	public void finalConstant() {
		
		// 일반 변수 선언
		int age;
		// 상수 선언  
		final int AGE; 
		age = 20;
		AGE = 20;		

		System.out.println("age : " + age);
		System.out.println("AGE : " + AGE);
		
		// 변수의 값을 변경
		age = 30;
	
//		 AGE = 30;
		// The final local variable AGE may already have been assigned
		// 파이널 변수는 한번만 값을 저장할 수 있는데,
		// 또 값을 변경하려고 하니까 이미 할당되어 있다는 에러메시지가 떴다.
		//: AGE 는 final이 붙은 상수인데, 상수는 한번만 값을 저장할 수있고 값 수정은 불가능함
		// 그런데 16번쨰 줄에서 AGE에 30이라는 값으로 수정을 하려고 하니 값에 대해서 수정이 불가능하면서 에러남.;

		System.out.println("값 변경 후 age : " + age);
		System.out.println("값 변경 후 AGE : " + AGE);
				
	}
}
