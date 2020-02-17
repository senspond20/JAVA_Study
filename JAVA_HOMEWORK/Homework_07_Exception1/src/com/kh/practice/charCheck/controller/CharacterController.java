package com.kh.practice.charCheck.controller;

import com.kh.practice.charCheck.exception.CharCheckException;

public class CharacterController {
	
	
	public CharacterController() {
		
	}
	
	public int countAlpha(String s) throws CharCheckException {
		// 매개변수로 들어온 값에 있는 영문자를 세어 반환
		// 문자열에 공백이 있다면 CharCheckException발생, 에러 메시지는 출력 값 참고
		
		//a 97 z 122
		//A 65 Z 90

		char[] charArr = s.toCharArray();
		int count = 0;
		
		for(char value : charArr) {
			
			
			if( ('A' <= value && value <= 'Z') || ('a'<= value && value <= 'z') ){
				count++;
			}	
			// 공백이면	
			else if(value == ' ') {
		//		System.out.println("rh");
				throw new CharCheckException("문자열 : " + s);
			}
			
//			if( 65 <=((int)value) && ((int)value)<= 90){
//				count++;
//			}else if(97<=((int) value) && ((int)value)<= 122){
//				count++;
//			}else {
//				
//			}
		}
		
		return count;
	}
	
	
}
