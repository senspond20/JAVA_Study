package com.kh.practice.dimension;

import java.io.Console;
import java.util.Scanner;

public class DiemnsionPractice {
//	3행 3열짜리 문자열 배열을 선언 및 할당하고
//	인덱스 0행 0열부터 2행 2열까지 차례대로 접근하여 “(0, 0)”과 같은 형식으로 저장 후 출력하세요.
//	ex.
//	(0, 0)(0, 1)(0, 2)
//	(1, 0)(1, 1)(1, 2)
//	(2, 0)(2, 1)(2, 2)
	public void practice1() {

		String[][] iArr = new String[3][3];

		for (int i = 0; i < iArr.length; i++) {
			for (int j = 0; j < iArr[i].length; j++) {
				// iArr[i][j] = String.format("(%d,%d)",i,j);
				iArr[i][j] = "(" + i + "," + j + ")";
			}
		}

		for (int i = 0; i < iArr.length; i++) {
			for (int j = 0; j < iArr[i].length; j++) {
				System.out.print(iArr[i][j] + " ");
			}
			System.out.println();
		}

	}

	public void practice2() {
//	4행 4열짜리 정수형 배열을 선언 및 할당하고
//	1) 1 ~ 16까지 값을 차례대로 저장하세요.
//	2) 저장된 값들을 차례대로 출력하세요.

		int[][] iArr = new int[4][4];

		int count = 0;
		for (int i = 0; i < iArr.length; i++) {
			for (int j = 0; j < iArr[i].length; j++) {
				iArr[i][j] = ++count;
			}
		}

		for (int i = 0; i < iArr.length; i++) {
			for (int j = 0; j < iArr[i].length; j++) {
				System.out.printf("%2d ", iArr[i][j]);
			}
			System.out.println();
		}

	}

	public void practice3() {
//	4행 4열짜리 정수형 배열을 선언 및 할당하고
//	1) 16 ~ 1과 같이 값을 거꾸로 저장하세요.
//	2) 저장된 값들을 차례대로 출력하세요.

		int[][] iArr = new int[4][4];

		int count = 16;
		for (int i = 0; i < iArr.length; i++) {
			for (int j = 0; j < iArr[i].length; j++) {
				iArr[i][j] = count--;
			}
		}

		for (int i = 0; i < iArr.length; i++) {
			for (int j = 0; j < iArr[i].length; j++) {
				System.out.printf("%2d ", iArr[i][j]);
			}
			System.out.println();
		}
	}

	public void practice4() {
//	4행 4열 2차원 배열을 생성하여 0행 0열부터 2행 2열까지는 1~10까지의 임의의 정수 값 저장 후
//	아래의 내용처럼 처리하세요.

		final int rowSize = 4;
		final int colSize = 4;

		int[][] iArr = new int[rowSize][colSize];

		int random = 0;

		for (int i = 0; i < rowSize - 1; i++) {
			for (int j = 0; j < colSize - 1; j++) {
				iArr[i][j] = (int) (Math.random() * 10 + 1);
			}
		}

		int sum = 0;
		for (int s = 0; s < colSize - 1; s++) {
			sum = iArr[0][s];
			for (int i = 1; i < rowSize - 1; i++) {
				sum += iArr[i][s];
			}
			iArr[rowSize - 1][s] = sum;
		}

		for (int s = 0; s < rowSize - 1; s++) {
			sum = iArr[s][0];
			for (int i = 1; i < colSize - 1; i++) {
				sum += iArr[s][i];
			}
			iArr[s][colSize - 1] = sum;
		}

		int sum1 = 0;
		int sum2 = 0;

		sum1 = iArr[0][colSize - 1];
		for (int s = 1; s < rowSize - 1; s++) {
			sum1 += iArr[s][colSize - 1];
		}

		sum2 = iArr[rowSize - 1][0];
		for (int s = 1; s < colSize - 1; s++) {
			sum2 += iArr[rowSize - 1][s];
		}

		sum = sum1 + sum2;
		iArr[rowSize - 1][colSize - 1] = sum;

		for (int i = 0; i < iArr.length; i++) {
			for (int j = 0; j < iArr[i].length; j++) {
				System.out.printf("%2d ", iArr[i][j]);
			}
			System.out.println();
		}

	}

	public void practice4_1() {

		final int Size = 6;

		int[][] iArr = new int[Size][Size];

		int sum1 = 0;
		int sum2 = 0;

		int count = 0;
		int totalSum = 0;

		// 배열  Size-2 * Size-2 영역만큼 난수집어넣고
		for (int i = 0; i < Size - 1; i++) {
			for (int j = 0; j < Size - 1; j++) {
				iArr[i][j] = (int) (Math.random() * 10 + 1);
			}
		}
		
		// 나머지 공간에 합계를 집어넣고
//		while (count < Size - 1) {
//			for (int i = 0; i < Size - 1; i++) {
//
//				sum1 += iArr[i][count];
//				sum2 += iArr[count][i];
//
//				totalSum += iArr[i][count];
//				totalSum += iArr[count][i];
//			}
//
//			iArr[Size - 1][count] = sum1;
//			iArr[count][Size - 1] = sum2;
//			iArr[Size - 1][Size - 1] = totalSum;
//
//			sum1 = 0;
//			sum2 = 0;
//			count++;
//		}
		
		// 출력.
		for (int i = 0; i < Size; i++) {
			for (int j = 0; j < Size; j++) {
				System.out.printf("%2d ", iArr[i][j]);
			}
			System.out.println();
		}

	}

	public void practice5() {
//	2차원 배열의 행과 열의 크기를 사용자에게 직접 입력받되, 1~10사이 숫자가 아니면
//	“반드시 1~10 사이의 정수를 입력해야 합니다.” 출력 후 다시 정수를 받게 하세요.
//	크기가 정해진 이차원 배열 안에는 영어 대문자가 랜덤으로 들어가게 한 뒤 출력하세요.
//	(char형은 숫자를 더해서 문자를 표현할 수 있고 65는 A를 나타냄)
		Scanner sc = new Scanner(System.in);

		int random = 0;
		int row = 0;
		int col = 0;
		while (true) {
			System.out.print("행 크기 : ");
			row = sc.nextInt();

			System.out.print("열 크기 : ");
			col = sc.nextInt();

			if (row < 1 || row > 10 || col < 1 || col > 10) {
				System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
			} else {
				break;
			}
		}

		char[][] cArr = new char[row][col];

		for (int i = 0; i < cArr.length; i++) {
			for (int j = 0; j < cArr[i].length; j++) {

				random = (int) ((Math.random() * 26) + 65);
				cArr[i][j] = (char) random;

			}
		}

		for (int i = 0; i < cArr.length; i++) {
			for (int j = 0; j < cArr[i].length; j++) {
				System.out.printf("%2c ", cArr[i][j]);
			}
			System.out.println();
		}
	}

	public void practice6() {
		String[][] strArr = new String[][] { { "이", "까", "왔", "앞", "힘" }, { "차", "지", "습", "으", "냅" },
				{ "원", "열", "니", "로", "시" }, { "배", "심", "다", "좀", "다" }, { "열", "히", "! ", "더", "!! " } };

		final int row = strArr.length;
		final int col = strArr[0].length;
		// 기본배열
//		for (int i = 0; i < row; i++) {
//			for (int j = 0; j < col; j++) {
//				System.out.printf("%-2s ", strArr[i][j]);
//			}
//			System.out.println();
//		}
//		System.out.println();

		for (int i = 0; i < col; i++) {
			for (int j = 0; j < row; j++) {
				System.out.printf(" %s ", strArr[j][i]);
			}
			System.out.println();
		}
		System.out.println();
	}

	public void practice7() {
//	사용자에게 행의 크기를 입력 받고 그 수만큼의 반복을 통해 열의 크기도 받아
//	문자형 가변 배열을 선언 및 할당하세요.
//	그리고 각 인덱스에 ‘a’부터 총 인덱스의 개수만큼 하나씩 늘려 저장하고 출력하세요.

		Scanner sc = new Scanner(System.in);

		System.out.print("행의 크기 : ");
		int rowlengh = sc.nextInt();

		char[][] cArr = new char[rowlengh][];
		int num = 0;

		for (int index = 0; index < rowlengh; index++) {
			System.out.print(index + "행의 열 크기 : ");
			num = sc.nextInt();
			cArr[index] = new char[num];
		}

		int count = 0;
		for (int i = 0; i < cArr.length; i++) {
			for (int j = 0; j < cArr[i].length; j++) {
				cArr[i][j] = (char) ((int) 'a' + count++);
			}
		}

		for (int i = 0; i < cArr.length; i++) {
			for (int j = 0; j < cArr[i].length; j++) {
				System.out.print(cArr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void practice8() {
//	ex.
//	== 1분단 ==
//	강건강 남나나
//	도대담 류라라
//	문미미 박보배
//	== 2분단 ==
//	송성실 윤예의
//	진재주 차천축
//	피풍표 홍하하
		String[] strArr = { "강건강", "남나나", "도대담", "류라라", "문미미", "박보배", "송성실", "윤예의", "진재주", "차천축 ", "피풍표", "홍하하" };

		String[][] strArr1 = new String[3][2];
		String[][] strArr2 = new String[3][2];

		int index = 0;
		for (int i = 0; i < strArr1.length; i++) {
			for (int j = 0; j < strArr1[i].length; j++) {
				strArr1[i][j] = strArr[index++];
			}
		}

		for (int i = 0; i < strArr2.length; i++) {
			for (int j = 0; j < strArr2[i].length; j++) {
				strArr2[i][j] = strArr[index++];
			}
		}
		// 출력
		System.out.println("== 1분단 ==");
		for (int i = 0; i < strArr1.length; i++) {
			for (int j = 0; j < strArr1[i].length; j++) {
				System.out.print(strArr1[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("== 2분단 ==");
		for (int i = 0; i < strArr2.length; i++) {
			for (int j = 0; j < strArr2[i].length; j++) {
				System.out.print(strArr2[i][j] + " ");
			}
			System.out.println();
		}

	}

	public void practice9() {
//	위 문제에서 자리 배리 배치한 것을 가지고 학생 이름을 검색하여
//	해당 학생이 어느 자리에 앉았는지 출력하세요.
		String[] strArr = { "강건강", "남나나", "도대담", "류라라", "문미미", "박보배", "송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하" };

		String[][] strArr1 = new String[3][2];
		String[][] strArr2 = new String[3][2];

		int index = 0;
		for (int i = 0; i < strArr1.length; i++) {
			for (int j = 0; j < strArr1[i].length; j++) {
				strArr1[i][j] = strArr[index++];
			}
		}

		for (int i = 0; i < strArr2.length; i++) {
			for (int j = 0; j < strArr2[i].length; j++) {
				strArr2[i][j] = strArr[index++];
			}
		}
		// 출력
		System.out.println("== 1분단 ==");
		for (int i = 0; i < strArr1.length; i++) {
			for (int j = 0; j < strArr1[i].length; j++) {
				System.out.print(strArr1[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("== 2분단 ==");
		for (int i = 0; i < strArr2.length; i++) {
			for (int j = 0; j < strArr2[i].length; j++) {
				System.out.print(strArr2[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("=======================");

		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 학생 이름을 입력하세요  : ");
		String name = sc.nextLine();

		int bundan = 0;
		int row = 0;
		int col = 0;
		boolean check = false;

		for (int i = 0; i < strArr1.length; i++) {
			for (int j = 0; j < strArr1[i].length; j++) {

				if (name.equals(strArr1[i][j])) {
					bundan = 1;
					row = i;
					col = j;
					check = true;
					break;
				}

			}
		}

		for (int i = 0; i < strArr2.length; i++) {
			for (int j = 0; j < strArr2[i].length; j++) {
				if (name.equals(strArr2[i][j])) {
					bundan = 2;
					row = i;
					col = j;
					check = true;
					break;
				}
			}

		}

		String sRow = "";
		String sCol = "";
		switch (row) {
		case 0:
			sRow = "첫 번째";
			break;
		case 1:
			sRow = "두 번째";
			break;
		case 2:
			sRow = "세 번째";
			break;
		default:
			break;
		}
		switch (col) {
		case 0:
			sCol = "왼쪽";
			break;
		case 1:
			sCol = "오른쪽";
			break;
		default:
			break;
		}

		if (check) {
			System.out.println("검색하신 " + name + " 학생은 " + bundan + " 분단 " + sRow + " 줄 " + sCol + " 에 있습니다.");
		} else {
			System.out.println("검색하신 " + name + " 학생은 존재하지 않습니다.");
		}

	}

	public void practice10() {
		// String 2차원 배열 6행 6열을 만들고 행의 맨 위와 열의 맨앞은 각 인덱스로 저장하세요.
		// 그리고 사용자에게 행과 열을 입력받아 해당 좌표의 값을 'X'로 변환해 2차월 배열을 출력하세요.

		int rowindex = 0;
		int columnIndex = 0;

		String[][] strArr = new String[6][6];

		// Console cs = System.console();

		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("행 인덱스 입력 : ");
			rowindex = sc.nextInt() + 1;

			System.out.print("열 인덱스 입력 : ");
			columnIndex = sc.nextInt() + 1;

			sc.close(); // Scanner:
						// 한번 닫아버리면 프로그램 종료할때까지 system.in 을 두번다시 열수가 없다.

		} catch (Exception ex) {
			System.out.println("잘못 입력했어요  : " + ex);
			return;
		}

		int count = 0;

		// String 배열 값 집어넣기.
		for (int i = 0; i < strArr.length; i++) {
			for (int j = 0; j < strArr[i].length; j++) {

				if (i == 0 && j == 0) {
					strArr[i][j] = " ";
				} else if (i == 0) {
					strArr[i][j] = Integer.toString(count + j - 1);

				} else if (j == 0) {
					strArr[i][j] = Integer.toString(count + i - 1);
				} else if (i == rowindex && j == columnIndex) {
					strArr[i][j] = "X";
				} else {
					strArr[i][j] = " ";
				}
			}
		}

		// 출력.
		for (int i = 0; i < strArr.length; i++) {
			for (int j = 0; j < strArr[i].length; j++) {
				System.out.print(strArr[i][j] + " ");
			}
			System.out.println();
		}

//		for(int k = 0; k < strArr.length; k++)
//		{
//			System.out.println(Arrays.toString(strArr[k]));
//		}

	}

	public void practice11() {
		// 10번과 내용은 같으나 행 입력시 99가 입력되지 않으면 무한 반복이 되게 하세요.

		int rowindex = 0;
		int columnIndex = 0;

		String[][] strArr = new String[6][6];

		// strArr에 초기값 집어넣고
		for (int i = 0; i < strArr.length; i++) {
			for (int j = 0; j < strArr[i].length; j++) {

				if (i == 0 && j == 0) {
					strArr[i][j] = " ";
				} else if (i == 0) {
					strArr[i][j] = Integer.toString(j - 1);

				} else if (j == 0) {
					strArr[i][j] = Integer.toString(i - 1);
				} else {
					strArr[i][j] = " ";
				}
			}
		}

		Scanner sc = new Scanner(System.in);

		while (true) {
			try {
				System.out.print("행 인덱스 입력 : ");
				rowindex = sc.nextInt();

				if (rowindex == 99) {
					break;
				}

				System.out.print("열 인덱스 입력 : ");
				columnIndex = sc.nextInt();

				if (rowindex > strArr.length - 2 || columnIndex > strArr[0].length - 2) {
					System.out.println("다시 입력하세요");
					continue;
				}
			} catch (Exception ex) {
				System.out.println("잘못 입력했어요  : " + ex);
				return;
			}

			// 해당 좌표에 해당하는 실제 배열 인덱스에다가 X찍음
			strArr[rowindex + 1][columnIndex + 1] = "X";

			// 출력.
			for (int i = 0; i < strArr.length; i++) {
				for (int j = 0; j < strArr[i].length; j++) {
					System.out.print(strArr[i][j] + " ");
				}
				System.out.println();
			}

		} // end wihle

		System.out.println("프로그램 종료");

		sc.close(); // Scanner:
					// 한번 닫아버리면 프로그램 종료할때까지 system.in 을 두번다시 열수가 없다.
	}

}
