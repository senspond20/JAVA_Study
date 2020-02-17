package com.kh.variable;

public class E_PrintMethod {

	//	전역변수
		String str1 = "안녕하세요";
		String str2 = "반갑습니다";
//		
		
	public void printExample() {		
//		지역변수
//		String str1 = "안녕하세요";
//		String str2 = "반갑습니다";
		
		System.out.print(str1);
		System.out.print(str2);
	}
	
	// ln (라인의 줄임말) 줄바꿈을 시킨다.
	public void printlnExample(){
//		String str1 = "안녕하세요";
//		String str2 = "반갑습니다";
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println("박신우");
	}
	
	// f 포맷의 약자	
	// %d : 정수형, %o: 8진수, %x : 16진수
	// %f : 실수 (소수점 아래 6자리), %e : 지수형태표현, %g : 대입 값 그대로
	// %A : 16진수 실수, %s : 문자열
	// %b : 논리형
	/*
	 * - %5d : 5칸을 확보하고 오른쪽 정렬
	   - %-5d : 5칸을 확보하고 왼쪽 정렬
	   - %.2f : 소수점 아래 2자리까지만 표시

	 */
	public void printfExample() {
		// 안녕하세요, 반신우입니다. 반갑습니다.
		// str1                 str2
		
		System.out.printf("%s,박신우입니다. %s.\n",str1,str2);
		System.out.printf("%14s,박신우입니다. %15s.\n",str1,str2);
		System.out.printf("%1$s,박신우입니다. %2$s.\n",str1,str2);
		System.out.printf("%1$14s,박신우입니다. %2$15s.\n",str1,str2);
		
		// 반갑습니다. 친하게 지내요.
		System.out.printf("%s, 친하게 지내요.\n", str2);
		
		System.out.printf("%s, 친하게 지내요.", str2);
		System.out.println();	
		
		// 미니문제
		// 안녕하세요, 저는 20살 박신우 강사입니다. 만나서 반갑습니다.
		int age = 20;
		String name = "박신우";
		String job = "강사";
		System.out.printf("%s, 저는 %d살 %s %s입니다. 만나서 %s.", str1, age, name, job, str2);
		
//		System.out.printf("",);
//		System.out.printf
	}
}
