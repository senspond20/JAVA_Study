package com.kh.practice.charCheck.controller;

import com.kh.practice.charCheck.exception.CharCheckException;

public class CharacterController {
	
	
	public CharacterController() {
		
	}
	
	public int countAlpha(String s) throws CharCheckException {
		// �Ű������� ���� ���� �ִ� �����ڸ� ���� ��ȯ
		// ���ڿ��� ������ �ִٸ� CharCheckException�߻�, ���� �޽����� ��� �� ����
		
		//a 97 z 122
		//A 65 Z 90

		char[] charArr = s.toCharArray();
		int count = 0;
		
		for(char value : charArr) {
			
			
			if( ('A' <= value && value <= 'Z') || ('a'<= value && value <= 'z') ){
				count++;
			}	
			// �����̸�	
			else if(value == ' ') {
		//		System.out.println("rh");
				throw new CharCheckException("���ڿ� : " + s);
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
