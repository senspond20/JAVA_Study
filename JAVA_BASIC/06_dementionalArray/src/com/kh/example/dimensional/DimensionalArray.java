package com.kh.example.dimensional;

import java.util.Arrays;

public class DimensionalArray {
	// 2차원 배열의 선언
	// 자료형[][] 배열명;
	// 자료형[] 배열명[];

	public void method1() {

		// 변수 선언. => 스택영역에 생긴다.
		int[][] iArr1;

		int iArr2[][];

		int[] iArr3[];

		// 2차원 배열의 할당.
		// 자료형[][] 배열명 = new 자료형[행크기][열크기];
		// 자료형[] 배열명[] = new 자료형[행크기][열크기];
		// 자료형 배열명[][] = new 자료형[행크기][열크기];

		// 정변 배열 : 행과 열의 크기가 정해져있는 배열
		iArr1 = new int[3][5];
		// iArr2 = new int[3][5];
		// iArr3 = new int[3][4];

		// 가변 배열.
		// 행의 크기는 정해져있지만 열의 크기는 정해져있지 않은 배열
	}

	public void method2() {
		// int형의 iArr 이라는 이름의 3행 5열짜리 배열 생성.
		int[][] iArr = new int[3][5];

		// 값 기록
		// 1. 배열 인덱스에 접근하여 값 기록
		iArr[0][0] = 1;
		iArr[0][1] = 2;
		iArr[0][2] = 3;
		iArr[0][3] = 4;
		iArr[0][4] = 5;

		iArr[1][0] = 6;
		iArr[1][1] = 7;
		iArr[1][2] = 8;
		iArr[1][3] = 9;
		iArr[1][4] = 10;

		iArr[2][0] = 11;
		iArr[2][1] = 12;
		iArr[2][2] = 13;
		iArr[2][3] = 14;
		iArr[2][4] = 15;

		System.out.println("iArr.lengh : " + iArr.length);
		System.out.println("iArr[0].lengh : " + iArr[0].length);

		System.out.println("iArr주소 : " + iArr);
		System.out.println("iArr[0]주소 : " + iArr[0]);
		System.out.println("iArr[1]주소 : " + iArr[1]);
		System.out.println("iArr[2]주소 : " + iArr[2]);

		// 2. 이중 for문을 이용하여 값 기록
		int count = 0;
		for (int i = 0; i < iArr.length; i++) {
			for (int j = 0; j < iArr[i].length; j++) {
				iArr[i][j] = ++count;
			}
		}

		for (int i = 0; i < iArr.length; i++) {
			for (int j = 0; j < iArr[i].length; j++) {
				System.out.printf("%4d", iArr[i][j]);
			}
			System.out.println();
		}

		System.out.println();
		System.out.println(Arrays.toString(iArr));

		for (int i = 0; i < iArr.length; i++) {
			System.out.println(Arrays.toString(iArr[i]));
		}

//
//		System.out.println();
	}

	public void method3() {
		// 가변 배열.
		// 행 크기는 정해져 있으나 각 행에 대한 열 크기가 정해져 있지 않은 상태.
		// 자료형이 같은 1차원 배열 여러 개를 하나로 묶은 것이 2차원 배열이기 떄문에
		// 묶여있는 1차원 배열의 길이가 꼭 같을 필요는 없음

		// 가변 배열 할당.
		int[][] iArr1 = new int[3][];
		iArr1[0] = new int[2];
		iArr1[1] = new int[1];
		iArr1[2] = new int[3];

		int[][] iArr2 = new int[][] { { 2, 1, 3 }, { 3, 4 } };

		for(int i = 0; i < iArr1.length; i++) {
			for(int j = 0; j < iArr1[i].length; j++)
			{
				System.out.printf("%2d", iArr1[i][j]);
			}
			System.out.println();
		}
		// 값 기록
		// 1. 인덱스 이용
		iArr1[0][0] = 1;
		iArr1[0][1] = 2;
		
		iArr1[1][0] = 3;
		
		iArr1[2][0] = 4;
		iArr1[2][1] = 5;
		iArr1[2][2] = 6;
		
		// 2. 이중 for문 이용
		int count = 0;
		for(int i = 0; i < iArr1.length; i++) {
			for(int j = 0; j < iArr1[i].length; j++)
			{
				iArr1[i][j] = ++count;
			}
		}
		
		for (int i = 0; i < iArr1.length; i++) {
			System.out.println("iArr1["+ i +"] : " + Arrays.toString(iArr1[i]));
		}

	}
	public void method4() {
		// 다차원 배열의 할당과 초기화 동시에 가능
		int[][] iArr1 = { {1,2,3,4,5},
						  {6,7,8,9,10},
						  {11,12,13,14,15}};
		
		for(int i = 0; i < iArr1.length; i++) {
			for(int j = 0; j < iArr1[i].length; j++)
			{
				System.out.printf("%2d ", iArr1[i][j]);
			}
			System.out.println();
		}
		
		System.out.println();
		int[][] iArr2 = {{1,2,3},{4,5,6,7,8,9},{10,11,12,13}};
		
		for(int i = 0; i < iArr2.length; i++) {
			for(int j = 0; j < iArr2[i].length; j++)
			{
				System.out.printf("%2d ", iArr2[i][j]);
			}
			System.out.println();
		}
	}
}
