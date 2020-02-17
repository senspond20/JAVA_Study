package com.kh.practice.array;

//import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
//import java.util.Arrays;
//import java.util.Queue;
import java.util.Scanner;

public class ArrayPractice {
	public void practice1() {
//	길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용하여
//	순서대로 배열 인덱스에 넣은 후 그 값을 출력하세요.

		int[] iArry = new int[10];

		for (int i = 0; i < iArry.length; i++) {
			iArry[i] = i + 1;
		}
		for (int i = 0; i < iArry.length; i++) {
			System.out.print(iArry[i] + " ");
		}

	}

	public void practice2() {
//	길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용하여
//	역순으로 배열 인덱스에 넣은 후 그 값을 출력하세요
		int[] iArry = new int[10];

		for (int i = 0; i < iArry.length; i++) {
			iArry[i] = iArry.length - i;
		}
		for (int i = 0; i < iArry.length; i++) {
			System.out.print(iArry[i] + " ");
		}
	}

	public void practice3() {
//	사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고
//	1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요.
		Scanner sc = new Scanner(System.in);

		System.out.print("양의 정수 : ");
		int size = sc.nextInt();
		int[] iArry = new int[size];

		for (int i = 0; i < iArry.length; i++) {
			iArry[i] = i + 1;
		}
		for (int i = 0; i < iArry.length; i++) {
			System.out.print(iArry[i] + " ");
		}

		sc.close();
	}

	public void practice4() {
//	길이가 5인 String배열을 선언하고 “사과”, “귤“, “포도“, “복숭아”, “참외“로 초기화 한 후
//	배열 인덱스를 활용해서 귤을 출력하세요.
//	
		String[] strArr = new String[] { "사과", "귤", "포도", "복숭아", "참외" };

		System.out.println(strArr[1]);

	}

	public void practice5() {
//	문자열을 입력 받아 문자 하나하나를 배열에 넣고 검색할 문자가 문자열에 몇 개 들어가 있는지
//	개수와 몇 번째 인덱스에 위치하는지 인덱스를 출력하세요.

		Scanner sc = new Scanner(System.in);

		System.out.print("문자열 : ");
		String str = sc.nextLine();
		System.out.print("문자  : ");
		char strin = sc.nextLine().charAt(0);

		char[] cArr = new char[str.length()];

		for (int i = 0; i < cArr.length; i++) {
			cArr[i] = str.charAt(i);
		}

		System.out.print(str + "에 " + strin + "이 존재하는 index : ");
		int num = 0;
		for (int i = 0; i < cArr.length; i++) {
			if (strin == cArr[i]) {
				num++;
				System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.println(strin + "의 개수 : " + num);
		sc.close();
	}

	public void practice6() {
//	 “월“ ~ “일”까지 초기화된 문자열 배열을 만들고 0부터 6까지 숫자를 입력 받아
//	 입력한 숫자와 같은 인덱스에 있는 요일을 출력하고
//	 범위에 없는 숫자를 입력 시 “잘못 입력하셨습니다“를 출력하세요.
//	 
		String[] strArr = new String[] { "월", "화", "수", "목", "금", "토", "일" };
		Scanner sc = new Scanner(System.in);

		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		int num = sc.nextInt();

		if (num < 0 || num > 6) {
			System.out.println("잘못 입력하셨습니다.");
		} else {
			System.out.println(strArr[num] + "요일");
		}

		sc.close();

	}

	public void practice7() {
//	 사용자가 배열의 길이를 직접 입력하여 그 값만큼 정수형 배열을 선언 및 할당하고
//	 배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화 하세요.
//	 그리고 배열 전체 값을 나열하고 각 인덱스에 저장된 값들의 합을 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int size = sc.nextInt();
		int[] iArr = new int[size];

		for (int i = 0; i < iArr.length; i++) {
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
			int data = sc.nextInt();
			iArr[i] = data;
		}

		for (int i = 0; i < iArr.length; i++) {
			System.out.print(iArr[i] + " ");
		}
		sc.close();
	}

	public void practice8() {
//	 3이상인 홀수 자연수를 입력 받아 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고,
//	 중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력하세요.
//	 단, 입력한 정수가 홀수가 아니거나 3 미만일 경우 “다시 입력하세요”를 출력하고
//	 다시 정수를 받도록 하세요.

		Scanner sc = new Scanner(System.in);
		int num = 0;

		do {
			if (num < 3 || num % 2 == 0) {
				System.out.println("다시 입력하세요");
			}

			System.out.print("정수 : ");
			num = sc.nextInt();

		} while (num < 3 || num % 2 == 0);

		int[] iArr = new int[num];

		iArr[0] = 1;

		for (int i = 1; i < iArr.length; i++) {

			if (i > (iArr.length + 1) / 2 - 1) {
				iArr[i] = iArr[i - 1] - 1;
			} else {

				iArr[i] = iArr[i - 1] + 1;
			}
		}

		for (int i = 0; i < iArr.length; i++) {
			System.out.print(iArr[i] + " ");
		}
		sc.close();

	}

	public void practice9() {
//	사용자가 입력한 값이 배열에 있는지 검색하여
//	있으면 “OOO 치킨 배달 가능“, 없으면 “OOO 치킨은 없는 메뉴입니다“를 출력하세요.
//	단, 치킨 메뉴가 들어가있는 배열은 본인 스스로 정하세요.
		Scanner sc = new Scanner(System.in);

		String[] menu = { "양념", "후라이드", "간장마늘" };

		System.out.print("치킨 이름을 입력하세요 : ");
		String str = sc.nextLine();

		for (int i = 0; i < menu.length; i++) {
			if (str.equals(menu[i])) {
				System.out.println(menu[i] + "치킨 배달 가능");
				sc.close();
				return;
			}
		}

		System.out.println(str + "치킨은 없는 메뉴입니다.");
		sc.close();
	}

	public void practice10() {
//	주민등록번호 성별자리 이후부터 *로 가리고 출력하세요.
//	단, 원본 배열 값은 변경 없이 배열 복사본으로 변경하세요.
		Scanner sc = new Scanner(System.in);

		System.out.print("주민등록번호(-포함) : ");
		String str = sc.nextLine();

		// 원본배열
		char[] origin = new char[str.length()];

		for (int i = 0; i < origin.length; i++) {
			origin[i] = str.charAt(i);
		}

		// 복사배열
		char[] cArr = new char[origin.length];

		for (int i = 0; i < cArr.length; i++) {

			if (i >= 8) {
				cArr[i] = '*';
			} else {
				cArr[i] = origin[i];
			}
		}

		// 원본 출력
//		for(int i = 0; i < cArr.length; i++) {
//			System.out.print(origin[i] + "");
//		}
//		System.out.println();
		// 복사배열 출력
		for (int i = 0; i < cArr.length; i++) {
			System.out.print(cArr[i] + "");
		}

		sc.close();

	}

	public void practice11() {
//	 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
//	 1~10 사이의 난수를 발생시켜 배열에 초기화한 후 출력하세요.
		int[] iArry = new int[10];

		int random = 0;

		for (int i = 0; i < iArry.length; i++) {
			random = (int) (Math.random() * 10 + 1);
			iArry[i] = random;
		}

		for (int i = 0; i < iArry.length; i++) {
			System.out.print(iArry[i] + " ");
		}

	}

	public void practice12() {
//	10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
//	1~10 사이의 난수를 발생시켜 배열에 초기화 후
//	배열 전체 값과 그 값 중에서 최대값과 최소값을 출력하세요.
		int[] iArry = new int[10];
		int random = 0;

		for (int i = 0; i < iArry.length; i++) {
			random = (int) (Math.random() * 10 + 1);
			iArry[i] = random;
		}

		for (int i = 0; i < iArry.length; i++) {
			System.out.print(iArry[i] + " ");
		}

		System.out.println();

		/* 방법 1 */

		// 복사배열 생성
		int[] copyArr = new int[iArry.length];
		System.arraycopy(iArry, 0, copyArr, 0, iArry.length);

		// 복사배열 오름차순 정렬.
		int temp = 0;
		for (int i = 0; i < copyArr.length; i++) {

			for (int j = 0; j < i; j++) {
				if (copyArr[i] < copyArr[j]) {
					temp = copyArr[i];
					copyArr[i] = copyArr[j];
					copyArr[j] = temp;
				}
			
			}
			
		}
		// 최소값 최대값 구하기
		int min = copyArr[0];
		int max = copyArr[copyArr.length - 1];
		copyArr = null; // 복사배열 해제

		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);

		/* 방법 2 */

	}

	public void practice13() {
//	10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
//	1~10 사이의 난수를 발생시켜 중복된 값이 없게 배열에 초기화한 후 출력하세요.
//	ex.
//	4 1 3 6 9 5 8 10 7 2
		int[] iArry = new int[10];

		for (int i = 0; i < iArry.length; i++) {

			iArry[i] = (int) (Math.random() * 10 + 1);

			for (int j = 0; j < i; j++) {
				if (iArry[i] == iArry[j]) {
					i--;
				}
			}
		}

		for (int i = 0; i < iArry.length; i++) {
			System.out.print(iArry[i] + " ");
		}

	}

	// 오름차순
	public void practice14() {
//로또 번호 자동 생성기 프로그램을 작성하는데 중복 값 없이 오름차순으로 정렬하여 출력하세요.

		// 사이즈 6인 배열 할당
		int[] iArry = new int[6];

		// 배열에 중복값 없이 1~45 난수를 집어넣음
		int random = 0;
		for (int i = 0; i < iArry.length; i++) {
			random = (int) (Math.random() * 45 + 1);
			iArry[i] = random;
			for (int j = 0; j < i; j++) {
				if (iArry[i] == iArry[j]) {
					i--;
				}
			}
		}

		// (출력)
//		System.out.println(Arrays.toString(iArry));

		// 오름차순 정렬.
		int temp = 0;
		for (int i = 1; i < iArry.length; i++) {

			for (int j = 0; j < i; j++) {
				if (iArry[i] < iArry[j]) {
					temp = iArry[i];
					iArry[i] = iArry[j];
					iArry[j] = temp;
				}
			}
		}

		// 출력.
		for (int i = 0; i < iArry.length; i++) {
			System.out.print(iArry[i] + " ");
		}
	}

	public void practice15() {
//	문자열을 입력 받아 문자열에 어떤 문자가 들어갔는지 배열에 저장하고
//	문자의 개수와 함께 출력하세요.

		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");

		String str = sc.nextLine();

		char[] cArr = new char[str.length()];

		for (int i = 0; i < str.length(); i++) {
			cArr[i] = str.charAt(i);
		}

		for (int i = 0; i < cArr.length; i++) {
			for (int j = 0; j < i; j++) {
				if (cArr[i] == cArr[j]) {
					cArr[i] = 0;
				}
			}
		}
		int count = 0;
		// 배열
		char[] temp = new char[cArr.length];

		int cc = 0;
		for (int i = 0; i < cArr.length; i++) {

			if (cArr[i] != 0) {
				temp[i] = cArr[i];
				System.out.print(temp[i] + " ");
				count++;
			} else {
				continue;
			}

		}

		System.out.println();
		System.out.println("문자 개수 : " + count);

//	
//		System.arraycopy(cArr, 0, copyArr, 0, cArr.length);
//		
////		for (int i = 0; i < copyArr.length; i++) {
////			for (int j = 0; j < i; j++) {
////				if (cArr[i] == cArr[j]) {
////
////				} else {
////					copyArr[i] = cArr[i];
////				}
////			}
////		}
//
//		System.out.print("문자열에 있는 문자 : ");
//		for (int i = 0; i < copyArr.length; i++) {
//			System.out.print(copyArr[i] + ",");
//		}
//		System.out.println();
//
//		System.out.println("문자 개수 : " + (copyArr.length));
		sc.close();
	}

	public void practice16() {
//		사용자가 입력한 배열의 길이만큼의 문자열 배열을 선언 및 할당하고
//		배열의 인덱스에 넣을 값 역시 사용자가 입력하여 초기화 하세요.
//		단, 사용자에게 배열에 값을 더 넣을지 물어보고 몇 개를 더 입력할 건지,
//		늘린 곳에 어떤 데이터를 넣을 것인지 받으세요.
//		사용자가 더 이상 입력하지 않겠다고 하면 배열 전체 값을 출력하세요.

		Scanner sc = new Scanner(System.in);
		
		int size = 0;	
		System.out.print("배열의 크기를 입력하세요 : ");

		size = sc.nextInt();
		sc.nextLine();

		String[] strArr = new String[size];
		String[] temp = null;
		
		int i = 0;
		
		while (true) {
			for (; i < size; i++) {
				System.out.print((i + 1) + "번째 문자열 : ");
				strArr[i] = sc.nextLine();
			}

			System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
			char ch = sc.nextLine().charAt(0);

			if (ch == 'N' || ch == 'n') {
				break;

			} else if (ch == 'Y' || ch == 'y') { // equlsslgnoreCase : 대소문자 구분 안함

				System.out.print("더 입력하고 싶은 개수 : ");
				int add = sc.nextInt();
				sc.nextLine();

				temp = strArr; // strArr 원본 배열의 주소값을 temp에 임시 저장.(배열 얇은 복사)

				size += add; // 배열 사이즈를 add만큼 늘려서
				strArr = new String[size]; // 새로운 배열  할당

				// strArr에 temp 주소에 있는 배열을 복사(깊은 복사)
				//strArr = Arrays.copyOf(temp, size); // copyOf(T[] original, int newLength)

				for (int j = 0; j < temp.length; j++) {
					strArr[j] = temp[j];
				}
				
				temp = null;
			}

		} // end while;

		// 출력
		System.out.println(Arrays.toString(strArr));
	}

	public void practice16_1() {
//		사용자가 입력한 배열의 길이만큼의 문자열 배열을 선언 및 할당하고
//		배열의 인덱스에 넣을 값 역시 사용자가 입력하여 초기화 하세요.
//		단, 사용자에게 배열에 값을 더 넣을지 물어보고 몇 개를 더 입력할 건지,
//		늘린 곳에 어떤 데이터를 넣을 것인지 받으세요.
//		사용자가 더 이상 입력하지 않겠다고 하면 배열 전체 값을 출력하세요.
		Scanner sc = new Scanner(System.in);

		System.out.print("배열의 크기를 입력하세요 : ");
		int size = sc.nextInt();
		sc.nextLine();

		String[] strArr = new String[size];
		String[] temp = null;
		int i = 0;

		while (true) {
			for (; i < size; i++) {
				System.out.print((i + 1) + "번째 문자열 : ");
				strArr[i] = sc.nextLine();
			}

			System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
			char ch = sc.nextLine().charAt(0);

			if (ch == 'N' || ch == 'n') {
				break;

			} else if (ch == 'Y' || ch == 'y') { // equlsslgnoreCase : 대소문자 구분 안함

				System.out.print("더 입력하고 싶은 개수 : ");
				int add = sc.nextInt();
				sc.nextLine();

				temp = new String[size];

				for (int k = 0; k < size; k++) {
					temp[k] = strArr[k];
				}

				size += add;
				strArr = temp;
				// strArr = new String[size];
				strArr = Arrays.copyOf(strArr, size);

			}

		} // end while;

		// 출력
		// System.out.println(Arrays.toString(strArr));

		System.out.print("[ ");
		for (int s = 0; s < strArr.length; s++) {

			if (s == strArr.length - 1) {
				System.out.print(strArr[s]);
			} else {
				System.out.print(strArr[s] + ", ");
			}
		}
		System.out.print(" ]");
	}

	public void practice16_2() {
//	사용자가 입력한 배열의 길이만큼의 문자열 배열을 선언 및 할당하고
//	배열의 인덱스에 넣을 값 역시 사용자가 입력하여 초기화 하세요.
//	단, 사용자에게 배열에 값을 더 넣을지 물어보고 몇 개를 더 입력할 건지,
//	늘린 곳에 어떤 데이터를 넣을 것인지 받으세요.
//	사용자가 더 이상 입력하지 않겠다고 하면 배열 전체 값을 출력하세요.
		Scanner sc = new Scanner(System.in);

		System.out.print("배열의 크기를 입력하세요 : ");
		int size = sc.nextInt();
		sc.nextLine();

		ArrayList<String> arrayList = new ArrayList<>();
//		Queue q = new queue();

		String[] strArr = new String[size];
		for (int i = 0; i < strArr.length; i++) {
			System.out.print((i + 1) + "번째 문자열 : ");
			strArr[i] = sc.nextLine();
		}

		int temp = strArr.length;

		for (int i = 0; i < strArr.length; i++) {
			arrayList.add(strArr[i]);
		}

		while (true) {

			System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
			char ch = sc.nextLine().charAt(0);

			if (ch == 'N' || ch == 'n') {
				break;

			} else if (ch == 'Y' || ch == 'y') {

				System.out.print("더 입력하고 싶은 개수 : ");
				int resize = sc.nextInt();
				sc.nextLine();

				for (int i = 0; i < resize; i++) {
					System.out.print((temp + i + 1) + "번째 문자열 : ");
					arrayList.add(sc.nextLine());
				}
			} else {
				System.out.println("잘못 입력했습니다.");
			}
		}

		// 출력.
		System.out.println(arrayList);

//		System.out.print("[ ");
//		for (int i = 0; i < arrayList.size(); i++) {
//			
//			if( i == arrayList.size()-1){
//				System.out.print(arrayList.get(i));
//			}else {
//			System.out.print(arrayList.get(i) + ",");
//			}
//		}System.out.print(" ]");
	}

}
