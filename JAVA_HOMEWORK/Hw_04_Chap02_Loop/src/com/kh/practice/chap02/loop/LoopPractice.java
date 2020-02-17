package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice {

	// 완
	public void practice1() {
		/*
		 * 사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 숫자들을 모두 출력하세요. 단, 입력한 수는 1보다 크거나 같아야 합니다. 만일
		 * 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("1 이상인 숫자를 입력하세요 : ");

		int num = sc.nextInt();
//		int sum = 0;

		if (num < 1) {
			System.out.println("1이상의 숫자를 입력해주세요");
			sc.close();
			return;
		}

		for (int i = 1; i <= num; i++) {
			// for문안에 있으면 안된다. 왜 인가.? -> for(int i = 1; i<=0; i++) 에서 for문돌지않기에 if문도 실행이 안됨
//			if (num < 1) {
//				System.out.println("1이상의 숫자를 입력해주세요");
//				sc.close();
//				return;
//			}
			System.out.printf("%d ", i);
		}

//		System.out.printf("1부터 %d까지의 합 : %d", num, sum);
		sc.close();

	}

	public void practice2() {
		/*
		 * 위 문제와 모든 것이 동일하나, 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록
		 * 하세요.
		 */
		Scanner sc = new Scanner(System.in);

		int num = 0;
//		int sum = 0;

		do {
			System.out.print("1 이상인 숫자를 입력하세요 : ");
			num = sc.nextInt();

			if (num < 1) {
				System.out.println("1이상의 숫자를 입력해주세요");
			}

		} while (num < 1);

		for (int i = 1; i <= num; i++) {
			System.out.printf("%d ", i);
		}

		sc.close();
	}

	public void practice3() {
		// 사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요.
		// 단, 입력한 수는 1보다 크거나 같아야 합니다.

		Scanner sc = new Scanner(System.in);

		System.out.print("한개의 숫자입력 (단, 입력한 수는 1보다 크거나 같아야합니다) : ");
		int num = sc.nextInt();

		if (num < 1) {
			System.out.println("1이상의 숫자를 입력하여 주세요");
			return;
		}
		System.out.println(num + "부터 1까지 출력 ");

		for (int i = num; i >= 1; i--) {

			System.out.println(i);
		}
		sc.close();
	}

	// 완
	public void practice4() {
//	위 문제와 모든 것이 동일하나, 1 미만의 숫자가 입력됐다면
//	“1 이상의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요.
		// System.out.println(num + "부터 1까지 출력 ");

		Scanner sc = new Scanner(System.in);
		int num = 0;

		do {
			System.out.print("1이상의 숫자를 입력하세요 : ");
			num = sc.nextInt();
			if (num < 1) {
				System.out.println("1이상의 숫자를 입력해주세요.");
			}
		} while (num < 1);

		// System.out.println(num + "부터 1까지 출력 ");
		for (int i = num; i >= 1; i--) {
			System.out.printf("%d ", i);
		}
		sc.close();
	}

	// 완
	public void practice5() {
		// 1부터 사용자에게 입력 받은 수까지의 정수들의 합을 출력하세요.
		Scanner sc = new Scanner(System.in);
		String str = "";
		// String str = null; //-> 안된다.

		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		int sum = 0;

		for (int i = 2; i <= num; i++) {
			sum += i;
			str = str + '+' + i;
		}

		sum = 1 + sum;
		str = 1 + str;

		System.out.println(str + "=" + sum);
		// System.out.println("1부터 " + num + "까지의 합은 " + sum + "입니다.");
		sc.close();
	}

// 완
	public void practice6() {
//	사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요.
//	만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.

		Scanner sc = new Scanner(System.in);

		System.out.print("정수를 입력1 : ");
		int num1 = sc.nextInt();
		System.out.print("정수를 입력2 : ");
		int num2 = sc.nextInt();

		int min = 0;
		int max = 0;

		if (num1 < 1 || num2 < 1) {
			System.out.println("1이상의 숫자를입력해주세요");
			sc.close();
			return;
		}

		if (num1 > num2) {
			max = num1;
			min = num2;
		} else {
			max = num2;
			min = num1;
		}
		for (int i = min; i <= max; i++) {
			System.out.printf("%d ", i);
		}

		sc.close();

	}

// 완
	public void practice7() {
//	위 문제와 모든 것이 동일하나, 1 미만의 숫자가 입력됐다면
//	“1 이상의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요.
		int num1 = 0;
		int num2 = 0;
		int min = 0;
		int max = 0;

		boolean ck = false;

		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("정수를 입력1 : ");
			num1 = sc.nextInt();
			System.out.print("정수를 입력2 : ");
			num2 = sc.nextInt();

			ck = (num1 < 1) || (num2 < 1);

			if (ck) {
				System.out.println("1이상의 숫자를입력해주세요");
				continue;
			}
			if (num1 > num2) {
				max = num1;
				min = num2;
			} else {
				max = num2;
				min = num1;
			}
			for (int i = min; i <= max; i++) {
				System.out.printf("%d ", i);
			}

		} while (ck);

		sc.close();

	}

	public void parctice7_1() {
		int num1 = 0;
		int num2 = 0;
		int min = 0;
		int max = 0;

		boolean ck = false;
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("정수를 입력1 : ");
			num1 = sc.nextInt();
			System.out.print("정수를 입력2 : ");
			num2 = sc.nextInt();

			if (num1 >= 1 && num2 >= 1) {
				max = Math.max(num1, num2);
				min = Math.min(num1, num2);

				for (int i = min; i <= max; i++) {
					System.out.println(i + " ");
				}
				break;
			} else {
				System.out.println("1이상의 숫자를입력해주세요");
			}
		}
	}

//완료
	public void practice8() {
//	사용자로부터 입력 받은 숫자의 단을 출력하세요.
//	ex.
//	숫자 : 4
//	===== 4단 =====
//	4 * 1 = 4
//	4 * 2 = 8
//	4 * 3 = 12
//	4 * 4 = 16
//	4 * 5 = 20
//	4 * 6 = 24
//	4 * 7 = 28
//	4 * 8 = 32
//	4 * 9 = 36

		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 : ");
		int dan = sc.nextInt();

		System.out.println("===== " + dan + " 단=====");
		for (int j = 1; j <= 9; j++) {
			System.out.printf("%d * %d = %2d\n", dan, j, dan * j);
		}

		sc.close();

	}

	public void practice9() {
//	사용자로부터 입력 받은 숫자의 단부터 9단까지 출력하세요.
//	단, 9를 초과하는 숫자가 들어오면 “9 이하의 숫자만 입력해주세요”를 출력하세요.

		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 : ");
		int dan = sc.nextInt();

		if (dan > 9) {
			System.out.println("9이하의 숫자만 입력해주세요");
			sc.close();
			return;
		}

		for (int i = dan; i <= 9; i++) {
			System.out.println("===== " + i + " 단=====");
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d * %d = %2d\n", i, j, i * j);
			}
			System.out.println();
		}
		sc.close();
	}

	public void practice10() {
//		사용자로부터 입력 받은 숫자의 단부터 9단까지 출력하세요.
//		단, 9를 초과하는 숫자가 들어오면 “9 이하의 숫자만 입력해주세요”를 출력하세요.

		Scanner sc = new Scanner(System.in);
		int dan = 0;
		do {
			System.out.print("숫자 : ");
			dan = sc.nextInt();

			if (dan > 9) {
				System.out.println("9이하의 숫자만 입력해주세요");
				continue;
			}

			for (int i = dan; i <= 9; i++) {
				System.out.println("===== " + i + " 단=====");
				for (int j = 1; j <= 9; j++) {
					System.out.printf("%d * %d = %2d\n", i, j, i * j);
				}
				System.out.println();
			}

		} while (dan > 9);
		sc.close();
	}

	public void pracitce10_1() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("숫자 : ");
			int num = sc.nextInt();

			if (num <= 9) {
				for (int i = num; i <= 9; i++) {
					System.out.println("===== " + i + " 단=====");
					for (int j = 1; j <= 9; j++) {
						System.out.printf("%d * %d = %2d\n", i, j, i * j);
					}
					System.out.println();
				}

				break;
			} else {
				System.out.println(" 9 이하의 숫자만 입력해 주세요.");
			}
		}

	}

	public void practice11() {
//	사용자로부터 시작 숫자와 공차를 입력 받아
//	일정한 값으로 숫자가 커지거나 작아지는 프로그램을 구현하세요.
//	단, 출력되는 숫자는 총 10개입니다.
//	* ‘공차’는 숫자들 사이에서 일정한 숫자의 차가 존재하는 것을 말한다.
//	ex) 2, 7, 12, 17, 22 …
//	5 5 5 5 => 여기서 공차는 5
//	ex.
//	시작 숫자 : 4
//	공차 : 3
//	4 7 10 13 16 19 22 25 28 31

		Scanner sc = new Scanner(System.in);

		System.out.print("시작 숫자 : ");
		int num1 = sc.nextInt();

		System.out.print("공차 : ");
		int num2 = sc.nextInt();

		// 방법1.
		int sum = num1;
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d ", sum);
			sum += num2;
		}

		System.out.println();
		// 방법2.
		int count = 0;
		for (int i = num1;; i += num2) {
			System.out.print(i + " ");
			count++;
			if (count == 10) {
				break;
			}
		}
		// 방법3.

		sc.close();
	}

	// 완료
	public void practice12() {
//	연산자(+, -, *, /, %) : +
//	정수1 : 10
//	정수2 : 4
//	10 + 4 = 14
//	연산자(+, -, *, /, %) : / 연산자(+, -, *, /, %) : /
//	정수1 : 10 정수1 : 10
//	정수2 : 4 정수2 : 0
//	10 / 4 = 2 0으로 나눌 수 없습니다. 다시 입력해주세요.
//	연산자(+, -, *, /, %) : ^ 연산자(+, -, *, /, %) : exit
//	정수1 : 10 프로그램을 종료합니다.
//	정수2 : 4
//	없는 연산자입니다. 다시 입력해주세요.

		int result = 0;

		// int oper = sc.nextLine().charAt(0); //
		Scanner sc = new Scanner(System.in);
		String str = null;

		do {
			System.out.print("연산자(+,-,*,/,%) : ");
			str = sc.nextLine();

			if (str.equals("exit")) {
				break;
			}

			char oper = str.charAt(0);
			System.out.print("정수1 : ");
			int num1 = sc.nextInt();

			System.out.print("정수2 : ");
			int num2 = sc.nextInt();
			sc.nextLine();

			if ((oper == '/') && (num2 == 0)) {
				System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요");
				continue;
			}

			switch (oper) {
			case '+':
				result = num1 + num2;
				break;
			case '-':
				result = num1 - num2;
				break;
			case '*':
				result = num1 * num2;
				break;
			case '/':
				result = num1 / num2;
				break;
			case '%':
				result = num1 % num2;
				break;
			default:
				System.out.println("없는 연산자입니다. 다시 입력해주세요");
				str = "";
				continue;
			}
			System.out.printf("%d %c %d = %d\n", num1, oper, num2, result);

		} while (!str.equals("exit"));

		System.out.println(" 프로그램을 종료합니다.");
		sc.close();

	}

	// 완료
	public void practice13() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
		sc.close();
	}

	// 완료
	public void practice14() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		for (int i = num; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
		sc.close();
	}

	public void practice15() {
		// 소수 판별
		// 소수는 1~부터 n까지 나누었을때 나누어지는 수가 1과 n뿐인 수.
		// 단, 입력한 수가 2보다 작은 경우 "잘ㄹ못 입력하셨습니다."; 출력하세요.

		boolean check = false;
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		if (num < 2) {
			System.out.println("잘못 입력하셨습니다. ");
			return;
		}

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				check = true;
			}
		}

		if (check) {
			System.out.println("소수가 아닙니다.");
		} else {
			System.out.println("소수입니다.");
		}

	}

	public void practice16() {

		boolean check = false;
		Scanner sc = new Scanner(System.in);
		int num = 0;

		while (true) {
			System.out.print("정수 입력 : ");
			num = sc.nextInt();

			if (num < 2) {
				System.out.println("잘못 입력하셨습니다. ");
				continue;
			} else {
				break;
			}
		}

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				check = true;
			}
		}

		if (check) {
			System.out.println("소수가 아닙니다.");
		} else {
			System.out.println("소수입니다.");
		}
	}

	public void practice17() {

		int count = 0;

		System.out.print("숫자 : ");

		Scanner sc = new Scanner(System.in);
		int inputNum = sc.nextInt();
		
		boolean check = false;

		if (inputNum < 2) {
			System.out.println("잘못 입력하셨습니다. ");
			return;
		}

		for (int i = 2; i < inputNum; i++) {
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					check = true;
				}
			}
			if (!check) {
				count++;
			}
		}
		System.out.println("2부터 " + inputNum + "까지 소수의 개수는 " + count + "개입니다.");

	}

	public void practice18() {
// 1부터 사용자에게 입력 받은 수까지 중에서
// 1) 2와 3의 배수를 모두 출력하고
// 2) 2와 3의 공배수의 개수를 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("자연수 하나를 입력하세요 : ");
		int num = sc.nextInt();
		int count = 0;
		
		for(int i = 1; i <= num; i++)
		{
			if(i % 2 == 0 && i % 3 == 0)
			{
				count++;	
			}
			
			if(i % 2 == 0)
			{
				System.out.print(i + " ");
			}else if(i % 3 == 0)
			{
				System.out.print(i + " ");
			}
		}
		
		System.out.println();
		System.out.println("count : " + count);
		
		
	}

// 정수 입력 : 4
//	   *
//	  **
//	 ***
//	****
	public void practice19() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			for (int s = i; s < num - 1; s++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		sc.close();
	}

//	정수 입력 : 3
//	*
//	**
//	***
//	**
//	*

	public void practice20() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		int count = 0;
		int maxLine = num * 2 - 1;

		for (int i = 0; i < maxLine; i++) {
			if (i < num) {

				count++;

				for (int j = 0; j < count; j++) {
					System.out.print('*');
				}
				System.out.println();

			} else {

				count--;

				for (int j = 0; j < count; j++) {
					System.out.print('*');
				}
				System.out.println();
			}
		}

	}

// 정수 입력 : 4
//    *
//   ***
//  *****
// *******
	public void practice21() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		sc.close();
		for (int i = 0; i < num; i++) {
			for (int s = 0; s < num - 1 - i; s++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * i + 1; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}

// 정수 입력 : 4
//  *******
//   *****
//    ***
//     *
	public void practice21_1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			for (int s = 0; s < i; s++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * (num - 1 - i) + 1; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
		sc.close();
	}

//	정수 입력 : 5
//	*****
//	*   *
//	*   *
//	*   *
//	*****
	public void practice22() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if (i == 0 || i == num - 1) {
					System.out.print("*");
				} else if (j == 0 || j == num - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}

			System.out.println();
		}
		sc.close();
	}
}
