package com.kh.example.chap01_String.controller;

import java.util.StringTokenizer;

public class StringController {
	public void method() {
		String str = "AA|BB|CC";
		StringTokenizer st = new StringTokenizer(str, "|");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

	public void method1() {
		// 자주 사용하는 String 을 매번 모두 new 로 생성하게 되면
		// 메모리가 부족하게 될 수 있기때문에 .. 자바에서는
		// Heap 영역의 일부에 String pool (=Literal Pool = Constant Pool )
		// 에 넣고 쓰게해준다.

		// 배열은 String Pool에 들어가는것은 아니고
		// 배열의 길이를 계산해서 자동으로 heap 영역에 할당
		// new 연산자를 쓰지않아도 new 연산자를 쓴것과 같다.

		String str1 = "java";
		String str2 = "java";
		String str22 = "java2";
		String str3 = new String("java");
		String str4 = new String("java4");

		System.out.println("str1과 str2 의 주소는 같은가? : " + (str1 == str2));
		System.out.println("str1과 str22의 주소는 같은가? : " + (str1 == str22));
		System.out.println("str1과 str3 의 주소는 같은가? : " + (str1 == str3));

		// Object 클래스 안에 hashCode (주소값을 가지고 연산을 해서 보내주는것이라 실제주소를 알아볼수가 없다.)
		System.out.println("str1의 hashCode : " + str1.hashCode());
		System.out.println("str2의 hashCode : " + str2.hashCode());

		System.out.println("str3의 hashCode : " + str3.hashCode());
		System.out.println("str4의 hashCode : " + str4.hashCode());

		// 진짜 주소는 아니지만.
		System.out.println("str1의 실주소값 : " + System.identityHashCode(str1));
		System.out.println("str2의 실주소값 : " + System.identityHashCode(str2));
		System.out.println("str3의 실주소값 : " + System.identityHashCode(str3));

		System.out.println();
		System.out.printf("str1의 실주소값 : %h\n", System.identityHashCode(str1));
		System.out.printf("str2의 실주소값 : %h\n", System.identityHashCode(str2));
		System.out.printf("str3의 실주소값 : %h\n", System.identityHashCode(str3));

		str2 = "오라클";
		System.out.println();
		System.out.println("str1과 str2 의 주소는 같은가? : " + (str1 == str2));
//		System.out.println("str1과 str2 의 주소는 같은가? : "  + str1.equals(str2));
		System.out.printf("str1의 실주소값 : %h\n", System.identityHashCode(str1));
		System.out.printf("str2의 실주소값 : %h\n", System.identityHashCode(str2));
		System.out.printf("str3의 실주소값 : %h\n", System.identityHashCode(str3));

		
		// 주소는 비교가능
		if (str1 == str4) {

		}
		// 값을 비교할때는 squals 
//		if("abc" == "def") {
//			
//		}
	}

	public void method2() {
		// StringBuffer Test
		// 계속해서 값을 변경해야할 때 String같은 경우 값이 새로 생기고 참조 위치만 바꿔주기 때문에
		// 가비지 컬렉터가 계속 지워야하는 단점이 있음(불변이라는 특징 때문)
		// 변경이 적고 읽기만 하는 경우에는 불변 클래스인 String클래스가 용이하겠지만
		// 변경해야하는 값이 많은 경우 StringBuffer나 StringBuilder로 하는게 더 효율적임

		StringBuffer buffer1 = new StringBuffer();

		System.out.println("초기 buffer1의 수용량 : " + buffer1.capacity());
		System.out.println("buffer1에 들어가는 실제 값의 길이 : " + buffer1.length());

		buffer1.append("333333333141142414");

		System.out.println(buffer1);
		System.out.println("초기 buffer1의 수용량 : " + buffer1.capacity());
		System.out.println("buffer1에 들어가는 실제 값의 길이 : " + buffer1.length());

		buffer1.append(buffer1 + "안녕하세요");
		System.out.println(buffer1);
		System.out.println("초기 buffer1의 수용량 : " + buffer1.capacity());
		System.out.println("buffer1에 들어가는 실제 값의 길이 : " + buffer1.length());

		buffer1.delete(0, 5);
		System.out.println(buffer1);

		// 16보다 클 경우 (100) 만큼의 공간을 차지
		StringBuffer buffer2 = new StringBuffer(100);
		System.out.println("초기 buffer2의 수용량: " + buffer2.capacity());
		System.out.println("buffer2에 들어가는 실제 값의 길이 :" + buffer2.length());
		System.out.println();

		// 16보다 작을 경우 16 + 3 만큼의 공간을 차지
		StringBuffer buffer3 = new StringBuffer("abc");
		System.out.println("초기 buffer3의 수용량: " + buffer3.capacity());
		System.out.println("buffer3에 들어가는 실제 값의 길이 :" + buffer3.length());
		System.out.println();

		// buffer와 같지만 쓰레드 safe를 제공하느냐 하지않느냐의 차이일뿐이다.
		StringBuilder builder = new StringBuilder();
		System.out.println("초기 Builder의 수용량 : " + builder.capacity());
		System.out.println("Builder에 들어가는 실제 값의 길이 : " + builder.length());

//		builder.append("abc");
//		System.out.println("abc 추가후의 builder : " + builder);
//		System.out.println("abc 추가후의 builder 용량: " + builder.capacity());
//		System.out.println("abc 추가후의 builder 길이 : " + builder.length());
//		
//		builder.append("def");
//		System.out.println("def 추가후의 builder : " + builder);
//		System.out.println("def 추가후의 builder 용량: " + builder.capacity());
//		System.out.println("def 추가후의 builder 길이 : " + builder.length());

		/*
		 * public StringBuilder() { super(16); }
		 * 
		 * public StringBuilder(int capacity) { super(capacity); } 
		 * public StringBuilder(CharSequence seq) { this(seq.length() + 16); append(seq); }
		 * 
		 * public StringBuilder append(Object obj) { return append(String.valueOf(obj)); }
		 * 
		 * public StringBuilder append(String str) { super.append(str); return this; }
		 */

		// . append 뒤에 .append 또 붙여나가는것을 메소드 체이닝.
		builder.append("abc").append("def");
		builder.append("abc").toString().equals("abcdefght");
	//  ---------------------
	//   반환값 : StringBuilder
	//  ----------------------------------
	// 	  반환값 : String
    //   
	//   . 해서 어떤 메소드를 쓸 수 있냐는 .앞에까지의 반환값을 보고 알 수가 있다.
		
		
		System.out.println("abc , def 추가후의 builder : " + builder);
		System.out.println("abc , def 추가후의 builder 용량 : " + builder.capacity());

		System.out.println();
		builder.insert(2, "zzz");
		System.out.println("인덱스 2에 zzz추가 후의 builder : " +  builder);
		System.out.println();

		// 자바에서는 범위를 나타내는 것은 <= X < 범위. (DB랑은 다름) 
		builder.delete(2, 5); // 인덱스가  2 <= index < 5
		System.out.println("인덱스 2부터 5까지 삭제후의 buider : "  + builder);
		System.out.println();
		
		builder.deleteCharAt(builder.length() - 1);
		System.out.println("마지막 문자제거 후 : " + builder);
		System.out.println("마지막 문자제거 후 용량: " + builder.capacity());
		System.out.println("마지막 문자제거 후 길이 : " + builder.length());
		
		builder.reverse();
		System.out.println("reverse 후의 builder : " + builder);
		
		System.out.println();
//		StringBuilder sb = new StringBuilder("안녕하세요 반갑습니다.");
//		System.out.println(sb.reverse());
		
		StringBuilder sb = new StringBuilder("abc");
		sb = sb.append("zzz").insert(2, "yy").reverse().delete(1, 3);
			// abc -> abczzz -> abyyczzz -> zzzcyyba -> zcyyba
		
		System.out.println(sb);
	}
	
	public void method3() {
		String str = "Hello World";
		
		// 1. charAt(int index) : char
		// 2. concat(String str) : String
		// 3. equlas() : boolean
		// 4. substring(int beginIndex) : String
		//    substring(int beginIndex, int endIndex) : String
		// 5. replace (char oldChar, char newChar ) : String
		// 6. toUpperCase()/toLowerCase() : String
		// 7. equalsIgnoreCase() : boolean
		// 8. trim() : String
		// 9. split(String str) : String[]
		
		// 1. charAt(ind index) : char
		//		String의 index번째 char 반환
		char ch = str.charAt(4);
		System.out.println(ch);
		
		// 2. concat(String str) : String
		//		매개변수로 들어온 값을 원래 String의 끝에 값(String)을 반환
		String concatStr = str.concat("!!!");
		System.out.println("concatStr : " + concatStr);

		str +="!!!";
		System.out.println(str);

		// 3. boolean() : boolean
		System.out.println("concatStr.equls(str) : " + concatStr.equals(str));
		
		// 4. substring(int beginIndex) : String
		//  beginindex 번째부터 끝까지 반환
		
		System.out.println("str.substring(6) : " + str.substring(6));
		
		// substring(int beginIndex, int endIndex) : String
		// beginIndex 번째부터 endIndex까지 반환
		
		System.out.println("str.substring(0, 5) : " + str.substring(0, 5));
		
		
		// 5. replace(char oldChar, char newChar) : String
		// 저정 char을 새로운 char로 대체하여 반환해준다.
		System.out.println("str.replace('l', 'e') : " + str.replace('l', 'e'));

		// 6. toUpperCase() / toLowerCase(): String
		//	모두 대문자 로 , 소문자로 바꿔 반환
		System.out.println("str.toUpperCase() : " + str.toUpperCase());
		System.out.println("str.toLowerCase() : " + str.toLowerCase());
		
		// 7. equalsIgnoreCase() : boolean
		String str2 = "Wonderful";
		String str3 = "wonderful";
		System.out.println("str2.equals(str3) : " + str2.equals(str3)); // W 대문자. w 소문자. (완벽하게 동일한지 비교)
		System.out.println("str2.equalsIgnore(str3) : " +str2.equalsIgnoreCase(str3)); // (대소문자를 구분하지 않고 비교)
		
		// 8. trim() : String
		// 		앞/뒤 에 있는 공백(빈 공간)을 제거한 문자열 반환
		//		글자 사이에 있는 공백은 안없앤다.
		System.out.println("=================================");
		String str4 = "         java";
		String str5 = "java         ";
		String str6 = "     ja va    ";
		
		System.out.println(str4 + "| str4.trim() : " + str4.trim() );
		System.out.println(str5 + "| str5.trim() : " + str5.trim() );
		System.out.println(str6 + "| str6.trim() : " + str6.trim() );
		
		// 9. split(String str) : String[]
		// 		문자열을 분리하여 배열에 담아 반환하는 매소드
		String splitStr = "java, Oracle, JDBC, Front, Server, Framwork";
		String[] splitArr = splitStr.split(", "); // 쉽표(,)하고 공백까지 있기에
		
		System.out.println("분리된 문자열 개수(splict) : " + splitArr.length);


//		for(int i = 0; i < splitArr.length; i ++) {
//			System.out.println(splitArr[i]);
//		}
		// 향상된 for문(for-each문)
		// for(자료형 A : B)
		// 돌릴 대상 B 안에 있는 A값을 index 0~마지막까지 반복 
		for(String s : splitArr) {
			System.out.println(s);
		}
//		System.out.println(Arrays.toString(splitArr));
		

//		String[] strA;
//		str = "안녕,하세,요";
//		strA = str.split(regex)		
	}
	
	public void method4() {
		String str = "java, Oracle, JDBC, Front, Server, Framwork";
		System.out.println("원본 문자열 : " + str );
		
		StringTokenizer stObj = new StringTokenizer(str, ", ");
		
		System.out.println("분리된 문자열 개수  : " + stObj.countTokens());
		
		//Tokens 더 갖고 있니?
		while(stObj.hasMoreTokens()) {
			System.out.println(stObj.nextToken());
		}
		
		// 다 꺼냇기 때문에 남아있지 않다.
		System.out.println("값을 꺼낸 후의 문자열 개수 : " + stObj.countTokens());
		System.out.println();
		
		String str2 = "Apple, Banna-Cream*Dessert#Egg Fruits";
		
		StringTokenizer stObj2 = new StringTokenizer(str2, ", -*#");
		System.out.println("분리된 문자열 개수  : " + stObj2.countTokens());
		
		//Tokens 더 갖고 있니?
		while(stObj2.hasMoreTokens()) {
			System.out.println(stObj2.nextToken());
		}
		System.out.println("값을 꺼낸 후의 문자열 개수 : " + stObj.countTokens());
		System.out.println();
		
		// split() 과 StringTokenizer 의 차이점
		// 1. 분리한 문자열을 String[]로 처리하고 싶을때 split() 메소드
		// 2. 분리한 문자열을 객체로 처리하고 싶을때 StringTokenizer
		// 3. split() 메소드는 구분자는 1개인데
		//	  StringTokenizer클래스의 구분자는 여러개
		
		
	}
	
	public void method5() {
		
	}

}
