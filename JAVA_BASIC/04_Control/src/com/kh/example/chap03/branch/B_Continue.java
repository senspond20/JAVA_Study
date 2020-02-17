package com.kh.example.chap03.branch;

public class B_Continue {
	// continue문
	// 반복문안에서만 사용이 가능.
	// continue을 만나면 아래문장은 실행하지 않고
	// 반복문을 다시 시작함.
	// for문의 경우 증감식으로 가고, while문의 경우 조건식으로 간다.

	public void method1() {
		// 1~100 까지 정수들의 합계를 출력하되, 4의 배수는 빼고 계산

		int sum = 0;

		for (int i = 1; i < 100; i++) {

			if (i % 4 == 0) {
				continue;
			}
			sum += i;
		}
		System.out.println();
		System.out.println("sum = " + sum);
	}

	public void method2() {
		// 구구단 출력. 짝수단 빼고 출력, 짝수 수 빼고 출력
		// int su = 1;
		String str = "";

		for (int dan = 2; dan <= 9; dan++) {
			if (dan % 2 == 0) {
				continue;
			}
			for (int su = 1; su <= 9; su++) {

				if (su % 2 == 0) {
					continue;
				}

//			System.out.printf("%d * %d = %2d\n", dan, su, dan * su);
				str += String.format("%d * %d = %2d\n", dan, su, dan * su);
			}

			// su =1;
			System.out.println(str);
			str = "";

			// System.out.println();
		}

	}

	public void method3() {
		for (int dan = 2; dan <= 9; dan++) {
			System.out.println("=" + dan + "단 홀수만=");
			
			for (int su = 1; su <= 9; su++) {

				if (dan % 2 == 0 || su % 2 == 0) {
					continue;
				}
				System.out.printf("%d * %d = %2d\n", dan, su, dan * su);
			}
			System.out.println();

		}

	}

}
