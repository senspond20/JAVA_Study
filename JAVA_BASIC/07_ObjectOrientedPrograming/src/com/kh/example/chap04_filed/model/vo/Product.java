package com.kh.example.chap04_filed.model.vo;

public class Product {
//	{
//		name ="dfdfd";
//	}
	private String name = "초코파이";
	private String brand = "오리온";
	private int price = 1500;
	
	private static int num = 100;
	
	/*초기화 블록 */
	
	//instance 블록
	{
		name ="칸초";
		price = 1000;
		brand = "롯데";
		num -= 10;  // < -- 이미 static 하면서 메모리에 올라가있는걸 객체를 생성하면서 가져오기에 문제가 되지 않지만,
	}

	
	// static 블록
	static 
	{
		// Cannot make a static reference to the non-static field name
		// 이 경우 인스턴스 변수는 객체(인스턴스)를 만들떄 생성되기에 
		// 생성되는 시점이 다르기에 넣을 수가 없다.
		
//		name ="홈런볼"; 
//		brand = "헤테";
//		price = 2000;
		num = 150;
		num--;
		
	}
	
	// 생성자를 작성하지 않으면 JVM이 기본 생성자를 생성.
	
	// 상속을 사용시 꼭 기본생성자 작성하기. 오버로딩하여 작성
	
	// 오버로딩.
	// 같은 메소드 이름
	// 다른 매개변수의 개수 또는 다른 매개변수 타입
	// 조건 :매개변수의 갯수가 다르거나...
	 //    매개변수의 타입이 다르거나
	//     매개변수의 순서가 다를때
		
	// 기본 생성자. (만들어 놓고 시작) 
	public Product() {
		
		//new Product();
	}

	// 매개변수 있는 생성자. (매개 변수 있는 생성자 작성시 JVM이 기본 생성자를 자동으로 생성해주지 않음)
	public Product(String name, String brand) {
		
	}
	
	public Product(String name, int num) {
		
	}
	
	
	public void inform() {
		
		// 1. JVM 의 기본값으로 초기화
		// 2. 명시적 초기화
		// 3. 인스턴스 블록 초기화
		// 4. 생성자를 통한 초기화
		
		
		System.out.println(name + "," + brand + "," + price + "," + num);
		
		
		
	}

}
