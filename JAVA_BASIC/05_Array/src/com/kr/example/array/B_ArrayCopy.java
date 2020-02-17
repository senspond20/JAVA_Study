package com.kr.example.array;

import java.util.Arrays;

//import java.util.Arrays;

public class B_ArrayCopy {

	// 얇은 복사 : 배열의 주소만 복사

	// 깊은 복사 : 동일한 새로운 배열을 생성하여 실제 내부 값 복사
	// 1) for문을 이용한 1:1 복사
	// 2) System.arraycopy() 이용한 복사
	// 3) Arrays.CopyOf() 이용한 복사
	// 4) clone() 이용한 복사
	// 자바 다큐먼트 문서에 보면 clone 메소드는 왠만하면 손대지 말라는 경고문이 있다.

	public void method1() {

		int[] originArr = { 1, 2, 3, 4, 5 };
		int[] copyArr = originArr; // 얇은 복사

		System.out.println("originArr의 주소값 : " + originArr);
		System.out.println("copyArr의 주소값 : " + copyArr);

		for (int i = 0; i < originArr.length; i++) {
			System.out.print(originArr[i] + " ");
		}
		System.out.println();

		for (int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");
		}
		System.out.println();

		// 원본 배열의 0번째 인덱스를 99로 변경
		originArr[0] = 99;

		for (int i = 0; i < originArr.length; i++) {
			System.out.print(originArr[i] + " ");
		}
		System.out.println();

		for (int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");
		}

		System.out.println();

//		System.out.println(Arrays.toString(originArr));	
	}

	public void method2() {
		// 깊은 복사 1. for문 이용

		int[] originArr = { 1, 2, 3, 4, 5 };
		int[] copyArr = new int[5];

		for (int i = 0; i < originArr.length; i++) {
			copyArr[i] = originArr[i];
		}

//		originArr = null;
		System.out.println(originArr);
		System.out.println(copyArr);
		System.out.println();

		for (int i = 0; i < originArr.length; i++) {
			System.out.print(originArr[i] + " ");
		}
		System.out.println();

		for (int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");
		}
		System.out.println();

		System.out.println("=== originArr의 0번째 인덱스를 99로 변경");
		originArr[0] = 99;

		for (int i = 0; i < originArr.length; i++) {
			System.out.print(originArr[i] + " ");
		}
		System.out.println();

		for (int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");
		}
		System.out.println();

		// 2)

		// 3)

	}
	
	public void method3() {
		// 깊은 복사 2: arrayCop() 이용
		int[] originArr = {1,2,3,4,5};
		int[] copyArr = new int[10];

//							  시작위치                   복사배열시작위치
//		System.arraycopy(src, srcPos, dest, destPos, length);
//					      원본배열 ,        복사배열                   복사 길이
//		originArr 의 배열의 모든 데이터를 copyArr 배열에 복사를 하는데
//		copyArr 의 3 index 부터 붙여넣고 싶음
		
		System.arraycopy(originArr, 0, copyArr, 3, originArr.length);
		// 컨트롤 클릭
		// 컨트롤 쉬프트 t
		
		for (int i = 0; i < originArr.length; i++) {
			System.out.print(originArr[i] + " ");
		}
		System.out.println();

		for (int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");
		}
		System.out.println();
		
//		System.out.println(Arrays.toString(originArr));
//		System.out.println(Arrays.toString(copyArr));
		
	}
	
	public void method4() {
//		 3) Arrays.CopyOf()
		int[] originArr = {1,2,3,4,5};
		int[] copyArr = new int[10];
		
//		double start = System.currentTimeMillis();
		
		System.out.println("====== 처음 =======");
		for(int i = 0; i < originArr.length; i++) {
			System.out.print(originArr[i] + " ");
		}
		System.out.println();
		
		for(int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");
		}
		System.out.println();
		
//		Arrays.copyOf(original, newLength)
//					  원본 배열		복사할 길이
		
		// Arrays 클래스.( 배열을 사용할떄 편리할것 같은 메소드를 모와놓은 클래스)
		System.out.println(originArr);
		System.out.println(copyArr);
		copyArr = Arrays.copyOf(originArr, originArr.length);
		
		System.out.println("====== 처음 =======");
		for(int i = 0; i < originArr.length; i++) {
			System.out.print(originArr[i] + " ");
		}
		System.out.println();
		
		for(int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");
		}
		System.out.println();
				
		System.out.println(copyArr);
		
//		double end = System.currentTimeMillis();
//		System.out.println(end - start + "ms");
		
	}
	public void method5() {
		
		
		
	}
}
