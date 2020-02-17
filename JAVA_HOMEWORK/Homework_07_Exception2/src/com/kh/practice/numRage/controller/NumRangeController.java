package com.kh.practice.numRage.controller;

import com.kh.practice.numRage.exception.NumRangeException;

public class NumRangeController {
	public NumRangeController() {
		
	}
	public boolean checkDouble(int num1, int num2) throws NumRangeException{
		
	//	boolean isckDouble = false;
		
		if( !(1 <= num1 && num1< 100) || !(1 <= num2 && num2 < 100) ){
			throw new NumRangeException("1부터 100사이 값이 아닙니다.");
		}
		else if(num1 % num2 == 0) {
			//isckDouble = true;
			return true;
		}
		else {
			return false;
		}
		
		//return isckDouble;
	}
}
