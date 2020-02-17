package com.kh.variable;

public class D_Cast {
	public void rule1() {
//		boolean flag  = true; 
		
//		boolean flag2 = 100;
//		boolean 자료형은 무조건 true,false만 들어갈 수 있음(형변환 예외)
		
//		유니코드 0~65000 
		int num = 'A';
		System.out.println("num : " + num);
		
		char ch = 97;  // 값, 리터럴 값 자체를 넣을때
		System.out.println("ch : " + ch);
		
//		char ch2 = num; // 변수, 변수로 넣을때는 변수의 크기만 볼 수있다.
		
		//char ch = 97, char ch2 = num;
		// 똑같이 char에 int형을집어넣지만 다르다.	
		
//		Type mismatch: cannot convert from int to char
//		
		// 강제 형변환 필요.
		char ch2 = (char) num;
		System.out.println("ch2 : " + ch2);
		
		int num2 = -97;
		char ch3 = (char)num2;
		System.out.println("ch3 : " + ch3);
		// char은 양수만 저장할 수 있기 때문에
		// 음수는 없는 값(문자)으로 ?로 뜬다.	
	}
	
	public void rule2() {
		int iNum = 10;
		long lNum = 100;
		
		// int result = iNum + lNum;
		// iNum + lNum -> long 이 되는건데 int형에 집어넣겠다 하기때문에 에러가난다.
		
		//t) 연산은 큰 자료형으로 자동 형변환이 된 후 연산처리가 되기 때문에
		//   iNum + lNum 의 결과는 long이 된 상태
		
		// iNum + lNum 을 int result 에 저장 할 수 있는 방법
		// 방법 1. 수행 결과를 int로 강제 형변환
		int result = (int)(iNum + lNum);

		// 방법 2. long형을 int로 강제 형변환
		int result2 = iNum + (int)lNum;
		
		// 번외. 결과값을 저장하는 result를 long형으로 받는 방법
		long result3 = iNum + lNum;
		
		System.out.println("result : " + result);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
	}
	
	public void rule3() {
		int iNum = 290;
	
		// 데이터 손실

		// 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 | 0 1 0 1 0 0 0   =>
		// 										     0 1 0 1 0 0 0 
		
		// => 0 0 1 0 1 0 0 0
		
		byte bNum = (byte)iNum; 
		
		System.out.println("bNum : " + bNum);
	}
	
}
