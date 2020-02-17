package com.kh.example.chap01_poly.test.controller;

public class test {

	interface StringFunction {
	    int func(String param);
	}
		 
	public void takingMethod(StringFunction sf) {
		   int i = sf.func("my string");
		   // do whatever ...
		   
		   System.out.println(i);
	}
	
	

//			
}
