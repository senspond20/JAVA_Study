package com.kh.example.chap04_filed_Controller;

public class B_KindsOfVariable2 {
	
	// ����� �ʱ�ȭ -> ������ �Ұ���.
	public static int statictestNum;      // static ����(Ŭ���� ����) -> (���α׷��� ���۽ÿ� static �޸� ������ �ö�)
	public static int statictestNum2;
	public static int statictestSum;
	private int testNum = 10; 			  // instance ���� -> (��ü�� �����Ҷ�  heap �޸� ������ �ö�, ��ü ������ �̷���������� �޸𸮿� �ö󰣴�.)
	
	// static ��(���굵 ����)
	static {
		statictestSum = statictestNum + statictestNum2;
	}
	
	// instanse ��(��ü �����ø��� �ʱ�ȭ)
	{
		 testNum  += 1000;
	}
	
	
	// 
	public B_KindsOfVariable2() { // ������. 
		testNum++;
		System.out.printf("%s : %d\n", "testNum",  testNum);
		
		statictestNum++;
		System.out.printf("%s : %d\n", "staticNum", statictestNum);
	}
	
	
	public void method1() {
	
		
	}
	
}
