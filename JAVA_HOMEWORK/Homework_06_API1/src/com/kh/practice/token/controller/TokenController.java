package com.kh.practice.token.controller;

import java.util.StringTokenizer;

public class TokenController {
	
	public TokenController() {	}
	
	// 매개변수로 받아온 str을 StringTokenizer를 이용하여 
	// 띄어쓰기를 없애고 없앤 문자열 반환
	public String afterToken(String str) {
		
		StringTokenizer stObj = new StringTokenizer(str, " ");
		StringBuffer sb = new StringBuffer();
		
		//Tokens 더 갖고 있니?
		while(stObj.hasMoreTokens()) {
			sb.append(stObj.nextToken());
		}
		stObj = null;
		
		return sb.toString();
	}
	
	// 매개변수로 받아온 input의 첫 번째 글자만 대문자로 바꾼 문자열 반환
	public String firstCap(String input){
		
		String str = input.substring(0, 1).toUpperCase().concat(input.substring(1));
	
		return str;
	}
	
	// 매개변수의 문자가 문자열 안에 몇 개가 들어가 있는지 반환
	public int findChar(String input, char one) {
		
		int count = 0;
		char[] ch = input.toCharArray();
		for(char value : ch) {
			if(value == one) {
				count++;
			}
			
		}
		return count;
	}
	
}
