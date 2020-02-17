package com.kh.variable;

public class C_Overflow {  
	public void overflow(){
	   // 오버플로우
	   byte bNum = 127;
	   bNum = (byte)(bNum + 1);        //bNum+=1;
	   //bNum = bNum + 1 . 에러.   
	   System.out.println("bNum : " + bNum);
		/*   // 언더플로우  
	   byte b = -128;
	   b-=1;  
	   System.out.println(b);*/
	}  
	
	public void calc(){
		int num1 = 1000000;
		int num2 = 700000;
	
		// 곱하기를 하는 경우 오버플로우가 자주일어날 수 있다.
		// int 가 가질 수 있는 범위를 넘어간다.
	    //	int result = num1 * num2;
		long result = (long)num1 * num2; // 형변환
		              // long형 * int => long형
		System.out.println("계산 결과 :" + result);
		//
	}
}
