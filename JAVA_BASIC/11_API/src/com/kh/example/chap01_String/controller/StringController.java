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
		// ���� ����ϴ� String �� �Ź� ��� new �� �����ϰ� �Ǹ�
		// �޸𸮰� �����ϰ� �� �� �ֱ⶧���� .. �ڹٿ�����
		// Heap ������ �Ϻο� String pool (=Literal Pool = Constant Pool )
		// �� �ְ� �������ش�.

		// �迭�� String Pool�� ���°��� �ƴϰ�
		// �迭�� ���̸� ����ؼ� �ڵ����� heap ������ �Ҵ�
		// new �����ڸ� �����ʾƵ� new �����ڸ� ���Ͱ� ����.

		String str1 = "java";
		String str2 = "java";
		String str22 = "java2";
		String str3 = new String("java");
		String str4 = new String("java4");

		System.out.println("str1�� str2 �� �ּҴ� ������? : " + (str1 == str2));
		System.out.println("str1�� str22�� �ּҴ� ������? : " + (str1 == str22));
		System.out.println("str1�� str3 �� �ּҴ� ������? : " + (str1 == str3));

		// Object Ŭ���� �ȿ� hashCode (�ּҰ��� ������ ������ �ؼ� �����ִ°��̶� �����ּҸ� �˾ƺ����� ����.)
		System.out.println("str1�� hashCode : " + str1.hashCode());
		System.out.println("str2�� hashCode : " + str2.hashCode());

		System.out.println("str3�� hashCode : " + str3.hashCode());
		System.out.println("str4�� hashCode : " + str4.hashCode());

		// ��¥ �ּҴ� �ƴ�����.
		System.out.println("str1�� ���ּҰ� : " + System.identityHashCode(str1));
		System.out.println("str2�� ���ּҰ� : " + System.identityHashCode(str2));
		System.out.println("str3�� ���ּҰ� : " + System.identityHashCode(str3));

		System.out.println();
		System.out.printf("str1�� ���ּҰ� : %h\n", System.identityHashCode(str1));
		System.out.printf("str2�� ���ּҰ� : %h\n", System.identityHashCode(str2));
		System.out.printf("str3�� ���ּҰ� : %h\n", System.identityHashCode(str3));

		str2 = "����Ŭ";
		System.out.println();
		System.out.println("str1�� str2 �� �ּҴ� ������? : " + (str1 == str2));
//		System.out.println("str1�� str2 �� �ּҴ� ������? : "  + str1.equals(str2));
		System.out.printf("str1�� ���ּҰ� : %h\n", System.identityHashCode(str1));
		System.out.printf("str2�� ���ּҰ� : %h\n", System.identityHashCode(str2));
		System.out.printf("str3�� ���ּҰ� : %h\n", System.identityHashCode(str3));

		
		// �ּҴ� �񱳰���
		if (str1 == str4) {

		}
		// ���� ���Ҷ��� squals 
//		if("abc" == "def") {
//			
//		}
	}

	public void method2() {
		// StringBuffer Test
		// ����ؼ� ���� �����ؾ��� �� String���� ��� ���� ���� ����� ���� ��ġ�� �ٲ��ֱ� ������
		// ������ �÷��Ͱ� ��� �������ϴ� ������ ����(�Һ��̶�� Ư¡ ����)
		// ������ ���� �б⸸ �ϴ� ��쿡�� �Һ� Ŭ������ StringŬ������ �����ϰ�����
		// �����ؾ��ϴ� ���� ���� ��� StringBuffer�� StringBuilder�� �ϴ°� �� ȿ������

		StringBuffer buffer1 = new StringBuffer();

		System.out.println("�ʱ� buffer1�� ���뷮 : " + buffer1.capacity());
		System.out.println("buffer1�� ���� ���� ���� ���� : " + buffer1.length());

		buffer1.append("333333333141142414");

		System.out.println(buffer1);
		System.out.println("�ʱ� buffer1�� ���뷮 : " + buffer1.capacity());
		System.out.println("buffer1�� ���� ���� ���� ���� : " + buffer1.length());

		buffer1.append(buffer1 + "�ȳ��ϼ���");
		System.out.println(buffer1);
		System.out.println("�ʱ� buffer1�� ���뷮 : " + buffer1.capacity());
		System.out.println("buffer1�� ���� ���� ���� ���� : " + buffer1.length());

		buffer1.delete(0, 5);
		System.out.println(buffer1);

		// 16���� Ŭ ��� (100) ��ŭ�� ������ ����
		StringBuffer buffer2 = new StringBuffer(100);
		System.out.println("�ʱ� buffer2�� ���뷮: " + buffer2.capacity());
		System.out.println("buffer2�� ���� ���� ���� ���� :" + buffer2.length());
		System.out.println();

		// 16���� ���� ��� 16 + 3 ��ŭ�� ������ ����
		StringBuffer buffer3 = new StringBuffer("abc");
		System.out.println("�ʱ� buffer3�� ���뷮: " + buffer3.capacity());
		System.out.println("buffer3�� ���� ���� ���� ���� :" + buffer3.length());
		System.out.println();

		// buffer�� ������ ������ safe�� �����ϴ��� �����ʴ����� �����ϻ��̴�.
		StringBuilder builder = new StringBuilder();
		System.out.println("�ʱ� Builder�� ���뷮 : " + builder.capacity());
		System.out.println("Builder�� ���� ���� ���� ���� : " + builder.length());

//		builder.append("abc");
//		System.out.println("abc �߰����� builder : " + builder);
//		System.out.println("abc �߰����� builder �뷮: " + builder.capacity());
//		System.out.println("abc �߰����� builder ���� : " + builder.length());
//		
//		builder.append("def");
//		System.out.println("def �߰����� builder : " + builder);
//		System.out.println("def �߰����� builder �뷮: " + builder.capacity());
//		System.out.println("def �߰����� builder ���� : " + builder.length());

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

		// . append �ڿ� .append �� �ٿ������°��� �޼ҵ� ü�̴�.
		builder.append("abc").append("def");
		builder.append("abc").toString().equals("abcdefght");
	//  ---------------------
	//   ��ȯ�� : StringBuilder
	//  ----------------------------------
	// 	  ��ȯ�� : String
    //   
	//   . �ؼ� � �޼ҵ带 �� �� �ֳĴ� .�տ������� ��ȯ���� ���� �� ���� �ִ�.
		
		
		System.out.println("abc , def �߰����� builder : " + builder);
		System.out.println("abc , def �߰����� builder �뷮 : " + builder.capacity());

		System.out.println();
		builder.insert(2, "zzz");
		System.out.println("�ε��� 2�� zzz�߰� ���� builder : " +  builder);
		System.out.println();

		// �ڹٿ����� ������ ��Ÿ���� ���� <= X < ����. (DB���� �ٸ�) 
		builder.delete(2, 5); // �ε�����  2 <= index < 5
		System.out.println("�ε��� 2���� 5���� �������� buider : "  + builder);
		System.out.println();
		
		builder.deleteCharAt(builder.length() - 1);
		System.out.println("������ �������� �� : " + builder);
		System.out.println("������ �������� �� �뷮: " + builder.capacity());
		System.out.println("������ �������� �� ���� : " + builder.length());
		
		builder.reverse();
		System.out.println("reverse ���� builder : " + builder);
		
		System.out.println();
//		StringBuilder sb = new StringBuilder("�ȳ��ϼ��� �ݰ����ϴ�.");
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
		//		String�� index��° char ��ȯ
		char ch = str.charAt(4);
		System.out.println(ch);
		
		// 2. concat(String str) : String
		//		�Ű������� ���� ���� ���� String�� ���� ��(String)�� ��ȯ
		String concatStr = str.concat("!!!");
		System.out.println("concatStr : " + concatStr);

		str +="!!!";
		System.out.println(str);

		// 3. boolean() : boolean
		System.out.println("concatStr.equls(str) : " + concatStr.equals(str));
		
		// 4. substring(int beginIndex) : String
		//  beginindex ��°���� ������ ��ȯ
		
		System.out.println("str.substring(6) : " + str.substring(6));
		
		// substring(int beginIndex, int endIndex) : String
		// beginIndex ��°���� endIndex���� ��ȯ
		
		System.out.println("str.substring(0, 5) : " + str.substring(0, 5));
		
		
		// 5. replace(char oldChar, char newChar) : String
		// ���� char�� ���ο� char�� ��ü�Ͽ� ��ȯ���ش�.
		System.out.println("str.replace('l', 'e') : " + str.replace('l', 'e'));

		// 6. toUpperCase() / toLowerCase(): String
		//	��� �빮�� �� , �ҹ��ڷ� �ٲ� ��ȯ
		System.out.println("str.toUpperCase() : " + str.toUpperCase());
		System.out.println("str.toLowerCase() : " + str.toLowerCase());
		
		// 7. equalsIgnoreCase() : boolean
		String str2 = "Wonderful";
		String str3 = "wonderful";
		System.out.println("str2.equals(str3) : " + str2.equals(str3)); // W �빮��. w �ҹ���. (�Ϻ��ϰ� �������� ��)
		System.out.println("str2.equalsIgnore(str3) : " +str2.equalsIgnoreCase(str3)); // (��ҹ��ڸ� �������� �ʰ� ��)
		
		// 8. trim() : String
		// 		��/�� �� �ִ� ����(�� ����)�� ������ ���ڿ� ��ȯ
		//		���� ���̿� �ִ� ������ �Ⱦ��ش�.
		System.out.println("=================================");
		String str4 = "         java";
		String str5 = "java         ";
		String str6 = "     ja va    ";
		
		System.out.println(str4 + "| str4.trim() : " + str4.trim() );
		System.out.println(str5 + "| str5.trim() : " + str5.trim() );
		System.out.println(str6 + "| str6.trim() : " + str6.trim() );
		
		// 9. split(String str) : String[]
		// 		���ڿ��� �и��Ͽ� �迭�� ��� ��ȯ�ϴ� �żҵ�
		String splitStr = "java, Oracle, JDBC, Front, Server, Framwork";
		String[] splitArr = splitStr.split(", "); // ��ǥ(,)�ϰ� ������� �ֱ⿡
		
		System.out.println("�и��� ���ڿ� ����(splict) : " + splitArr.length);


//		for(int i = 0; i < splitArr.length; i ++) {
//			System.out.println(splitArr[i]);
//		}
		// ���� for��(for-each��)
		// for(�ڷ��� A : B)
		// ���� ��� B �ȿ� �ִ� A���� index 0~���������� �ݺ� 
		for(String s : splitArr) {
			System.out.println(s);
		}
//		System.out.println(Arrays.toString(splitArr));
		

//		String[] strA;
//		str = "�ȳ�,�ϼ�,��";
//		strA = str.split(regex)		
	}
	
	public void method4() {
		String str = "java, Oracle, JDBC, Front, Server, Framwork";
		System.out.println("���� ���ڿ� : " + str );
		
		StringTokenizer stObj = new StringTokenizer(str, ", ");
		
		System.out.println("�и��� ���ڿ� ����  : " + stObj.countTokens());
		
		//Tokens �� ���� �ִ�?
		while(stObj.hasMoreTokens()) {
			System.out.println(stObj.nextToken());
		}
		
		// �� ������ ������ �������� �ʴ�.
		System.out.println("���� ���� ���� ���ڿ� ���� : " + stObj.countTokens());
		System.out.println();
		
		String str2 = "Apple, Banna-Cream*Dessert#Egg Fruits";
		
		StringTokenizer stObj2 = new StringTokenizer(str2, ", -*#");
		System.out.println("�и��� ���ڿ� ����  : " + stObj2.countTokens());
		
		//Tokens �� ���� �ִ�?
		while(stObj2.hasMoreTokens()) {
			System.out.println(stObj2.nextToken());
		}
		System.out.println("���� ���� ���� ���ڿ� ���� : " + stObj.countTokens());
		System.out.println();
		
		// split() �� StringTokenizer �� ������
		// 1. �и��� ���ڿ��� String[]�� ó���ϰ� ������ split() �޼ҵ�
		// 2. �и��� ���ڿ��� ��ü�� ó���ϰ� ������ StringTokenizer
		// 3. split() �޼ҵ�� �����ڴ� 1���ε�
		//	  StringTokenizerŬ������ �����ڴ� ������
		
		
	}
	
	public void method5() {
		
	}

}
