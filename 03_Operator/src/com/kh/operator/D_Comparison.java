package com.kh.operator;

public class D_Comparison {
	public void method1() {
		int a = 10;
		int b = 25;
		
		boolean result1 = (a == b);
		boolean result2 = (a <= b);
		boolean result3 = (a >  b);
		
		System.out.println("result1 : " + result1); // false
		System.out.println("result2 : " + result2); // true
		System.out.println("result3 : " + result3); // false
		
		System.out.println("b°¡ Â¦¼ö ÀÎ°¡? " + (b % 2 == 0));
		System.out.println("b°¡ È¦¼ö ÀÎ°¡? " + (b % 2 != 0));
//		System.out.println("b°¡ È¦¼ö ÀÎ°¡?" + !(b % 2 == 0));
	}
	public void method2() {
		
		System.out.println(1|0);
	}
}


//System.out.println();
//String binaryString = Integer.toBinaryString(0xF1);
//String binaryString2 = Integer.toBinaryString(0x02);
//System.out.println(binaryString);
//System.out.println(binaryString.charAt(0) & binaryString2.charAt(0));
//System.out.println(binaryString.charAt(0));