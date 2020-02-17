package com.kh.example.chap02.loop;

import java.util.Scanner;

public class A_For {

	/*
	 * For(초기식; 조건식; 증감식){ 실행 문장; } 초기식 -> 조건식 -> (조건식이 true일때)실행문장 -> 증감식 -> 조건식 ->
	 * (조건식이 true일때)실행문장 -> 증감식 -> 조건식 -> (반복 : 조건식 결과가 false일때 까지)
	 * 
	 * 증감식 - 반복문을 끝내기 위한 장치라고도 볼 수 있다. (증감식이 없으면 조건식이 참이라면 계속 실행되기때문)
	 * 
	 * for문안에 있는 초기식,조건식,증감식 모두 생략이 가능 하지만 모두 생략했을때 반복문이 무한으로 돌기 때문에 for문 안이나 밖에다가
	 * 초기식은 무엇인지 조건은 무엇인지 증감은 얼마나 될것인지를 모두 표기해야함.
	 */
	public void method1() {
		// 1부터 5까지 출력

		// for(int i = 1; i < 6; i++)
		for (int i = 1; i <= 5; i++) {
			System.out.println(i + "번째 반복문 수행");
		}
	}

	public void method1_1() {
		// 자기소개 다섯번 하기 : 내 이름은 박신우야

		for (int i = 0; i < 5; i++) {
			System.out.println("내이름은 박신우야");
		}
	}

	public void method1_2() {

		// 구구단 2단~9단;
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + "*" + j + "=" + i * j);
			}
		}
	}

	public void method2() {
		// 5부터 1까지 출력
		for (int i = 5; i > 0; i--) {
			System.out.println(i + "출력");
		}
	}

	public void method2_1() {
		// 8부터 3까지 출력
		for (int i = 8; i > 2; i--) {
			System.out.println(i + "출력");
		}

	}

	public void method3() {
		// 1에서 10사이의 홀수만 출력.

		// 방법1.
		/*
		 * for(int i = 1; i<10; i++){ if(i%2 !=0) { System.out.println(i +"출력"); } }
		 */
		// 방법2. += 복합대입 연산자.
		for (int i = 1; i < 10; i += 2) {
			System.out.println(i + "출력");
		}

		// 방법3.
//		for(int i = 1; i < 10; i++) {
//			System.out.print(i%2 != 0 ? i + "출력 \n": "" );
//		}
//		
	}

	public void method4() {
		// 정수 두개를 입력받아 그 사이 숫자 출력
		/*
		 * 정수 두개를 입력하세요. 단, 첫번째 숫자가 두번째 숫자보다 작게 입력해주세요. 첫번째 숫자 : 1 두번째 숫자 : 5 1 2 3 4 5
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 두개를 입력하세요");
		System.out.println("(단,첫번째 숫자가 두번째 숫자보다 작게 입력해야 합니다.)");

		System.out.print("첫번째 숫자 : ");
		int start = sc.nextInt();
		System.out.print("두번쨰 숫자 : ");
		int end = sc.nextInt();

		int max = 0;
		int min = 0;

		if (start < end) {
			max = end;
			min = start;
		} else {
			max = start;
			min = end;
		}

//		for(int i = min; i <= max ; i ++) {
//			System.out.print(i+ " ");
//			//System.out.pri1tf("%d ", i);1			
//		}
		for (; min <= max; min++) {
			System.out.print(min + " ");
		}

//		for(;;min++)
//		{
//			if(min > max) {
//				break;
//			}
//			System.out.print(min+ " ");
//		}

	}

	public void method4_1() {
		// 정수 하나를 입력 받아 그 수가 1~9사이의 수일때만 구구단 출력
		// 조건이 맞지 ㅇ낳으면 1~9사이의 양수를 입력하여야합니다.
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 하나를 입력 하세요 : ");

		int num = sc.nextInt();
		if (num > 0 && num < 10) {
			// 구구단 1단~9단;
			for (int j = 1; j < 10; j++) {
				System.out.println("|" + num + " * " + j + " = " + num * j + "|");
//			System.out.printf("| %d * %d = %2d |\n",num,j,num*j);
			}
		} else {
			System.out.println(" 1 ~ 9 사이의 양수를 입력 하여야합니다.");
		}

	}

	public void method5() {
		// 1부터 10사이의 임의의 난수를 정해 1부터 난수까지의 정수 합계

		// Math 클래스 (random 난수, max메서드 :최대값, min 최대값)
		// Math.random(); // 임의의 난수(실수)를 반환하는 메소드, (범위 : 0<= Math.random() <1 )
		// 0=< Math.random()*10 < 10
		// 0=< Math.random()*10 +1 < 11
		// 정수로 만들기 위해 int형변환 : 1<= (int)(Math.random()*10 + 1)

		// int random = (int)(Math.random()*10) +1;
		int random = (int) (Math.random() * 10 + 1); // 1~10
		// System.out.println(random);
		
		int sum = 0;
		for (int i = 1; i <= random; i++) {
			sum += i;
		}

		// System.out.println(sum);
		System.out.printf("1부터 %d까지 정수 합계 : %d\n", random, sum);
//		System.out.printf("1부터 %1$d까지 정수 합계 : %2$d\n", random,sum);

		// int max = Math.max(3, 14);
//		int min = Math.min(3, 14);
//		System.out.println(min);	
//		System.out.println(max);	
//		int max = Math.max(3, Math.max(4 , 15));
//		System.out.println(max);	
	}

	public void method6() {
		/*
		 * for(초기값1; 조건식1; 증감식1){ 수행될 문장1; for(초기값2; 조건식2; 증감식2){ 수행될 문장2; } } 수행될 문장3;
		 * } 초기값 1 -> 조건식1 true -> 수행될 문장1 -> 초기값2 -> 조건식2true -> 수행될 문장2 -> 증감식2 -> 조건식
		 * 2true -> 수행될 문장2 (반복 : 조건식 false일때까지) -> 수행될 문장3 -> 증감식1 -> 조건식1true ->
		 * 수행될문장1 ->
		 * 
		 */

		// 2단 부터 9단까지 출력
		System.out.println(" ============");
		for (int dan = 2; dan < 10; dan++) {

			for (int su = 1; su < 10; su++) {
//				System.out.println(dan + "*" + su + "=" + dan*su);
				System.out.printf("| %d * %d = %2d |%n", dan, su, dan * su);
			}
			System.out.println(" ============");
		}

	}

	public void method7() {
		// 아날로그 시계 출력 : 0시 0분 ~ 23시 59분

//		int minute;
//		int hour;
		for (int hour = 0; hour < 24; hour++) {
			for (int minute = 0; minute < 60; minute++)

//				System.out.printf("%2s시%2s분%n",hour < ? '0'+ hour : hour ,minute <10 ? '0' + minute : minute);
//			
				System.out.printf("%2d시%2d분%n", hour, minute);
		}

	}

	public void method8() {
		// 한줄에 별(*)표가 5번 출력되는데
		// 그 줄에 사용자가 입력한 수만큼 출력
		/*
		 * 
		 * 출력할 줄 수 : 3 ***** ***** *****
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");

		int num = sc.nextInt();
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void method9() {
		// 한줄에 별표 문자를 입력된 줄 수와 칸 수 만큼 입력
		// e단, 줄 수와 칸 수가 일치하는 줄 번호에 대한 정수가 출력

		Scanner sc = new Scanner(System.in);

		System.out.print("줄수를 입력하세요 : ");
		int numRow = sc.nextInt();

		System.out.print("칸수를 입력하세요 : ");
		int numColumn = sc.nextInt();

		// int i = 0; 으로 하고 ++i 로 출력하면
		// for문안에서 i 값이 증가되서 따로값을 받는 변수를 만들거나 해야한다.

		for (int i = 1; i <= numRow; i++) {
			for (int j = 1; j <= numColumn; j++) {
				if (i == j) {
					System.out.print(i);
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}	
	}

	public void fortree() {
//		for(int x=1; x<5; x++) {
		for (int y = 1; y < 10; y++) {
			for (int z = 1; z < 10; z++) {
//					System.out.printf("%2d,%d,%d",x,y,z);
				System.out.printf("%2c--%c--%c", '◀', '●', '▶');
			}
			System.out.println();
		}
//			System.out.print("ㅇ");
//		}
	}
}
