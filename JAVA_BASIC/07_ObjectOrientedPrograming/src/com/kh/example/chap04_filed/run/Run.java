package com.kh.example.chap04_filed.run;
import com.kh.example.chap04_filed.model.vo.Product;
import com.kh.example.chap04_filed_Controller.B_KindsOfVariable2;

public class Run {
	
	public static final int SIZE = 299;
	
	public static void main(String[] args) {
		// 객체 생성
		B_KindsOfVariable2 bkv = new B_KindsOfVariable2();
	    int a = bkv.statictestNum;
	//The static field B_KindsOfVariable2.staticNum should be accessed in a static way
	// 객체를 생성해서 객체로 Stack필드에 접근하는것은 static way가 아니다.
	// stack필드에는 객체를 만들 필요가 없다.
		
		// 프로그램을 실행하면  Static 영역에 다 올려놓고 시작한다.
		
		int a1 = B_KindsOfVariable2.statictestNum;
		
		B_KindsOfVariable2 bkv2 = new B_KindsOfVariable2();
		
		
		
		System.out.println(Run.SIZE);
		System.out.println(a);
		System.out.println(a1);
		
		
		
		
		// 1. JVM 의 기본값으로 초기화
		// 2. 명시적 초기화
		// 3. 인스턴스 블록 초기화
		// 4. 생성자를 통한 초기화
		
		//칸초,롯데,1000,90
		Product p1 = new Product();
		p1.inform();
		
		//칸초,롯데,1000,80
		Product p2 = new Product();
		p2.inform();
		
		// 칸초,롯데,1000,70
		Product p3 = new Product();
		p3.inform();
		
		// 149 -> 149 - 10;
		// 칸초,롯데,1000,139
		// 칸초,롯데,1000,129
		// 칸초,롯데,1000,119
		
		
	}
}
