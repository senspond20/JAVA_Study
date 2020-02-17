package com.kh.practice.token.controller;

import java.util.StringTokenizer;

public class TokenController {
	
	public TokenController() {	}
	
	// �Ű������� �޾ƿ� str�� StringTokenizer�� �̿��Ͽ� 
	// ���⸦ ���ְ� ���� ���ڿ� ��ȯ
	public String afterToken(String str) {
		
		StringTokenizer stObj = new StringTokenizer(str, " ");
		StringBuffer sb = new StringBuffer();
		
		//Tokens �� ���� �ִ�?
		while(stObj.hasMoreTokens()) {
			sb.append(stObj.nextToken());
		}
		stObj = null;
		
		return sb.toString();
	}
	
	// �Ű������� �޾ƿ� input�� ù ��° ���ڸ� �빮�ڷ� �ٲ� ���ڿ� ��ȯ
	public String firstCap(String input){
		
		String str = input.substring(0, 1).toUpperCase().concat(input.substring(1));
	
		return str;
	}
	
	// �Ű������� ���ڰ� ���ڿ� �ȿ� �� ���� �� �ִ��� ��ȯ
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
