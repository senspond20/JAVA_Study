package com.kh.variable;
import java.util.Scanner;

public class F_KeyboardInput {
	public void inputScanner() {
		Scanner sc = new Scanner(System.in);
		//Resource leak: 'sc' is never closed
		
		System.out.print("이름을 입력하세요 : ");  //안내 문구 역할
		String name = sc.nextLine();
			
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		System.out.print("키(소수점 첫째 자리까지 입력) : ");	
		double height = sc.nextDouble();
//		float height = sc.nextFloat();
		
		System.out.println(name + "님은 " + age +"세 이며 , 키는" + height + "cm 입니다.");	
		
		sc.close();
		// terminate 빨간색 - 실행중
		// 실행시키고 끝나면 <terminated> 표시
	
		/* 정수 : sc.nextInt();
		      실수 : sc.nextFloat(); 또는 sc.nextDouble();
	            문자열 : sc.next(); 또는 sc.nextLine();
		 */
	}
	
	// ★  ============== 중요 =====================================================
	// 버퍼에 줄바꿈을 남기지 않는다.				버퍼에 줄바꿈을 남긴다.
	// 버퍼에 남아있는 줄바꿈도 가져온다.			버퍼에 남아있는 줄바꿈을 인식하지 않는다.(가져오지 않는다.)

	// 줄바꿈을 가져는 가는데
	// 실제로 값을 넣을때는 줄바꿈은 없애고 넣어준다.
	
	// nextLine();      				next();
	//									nextInt();
	//									nextDouble();
	//									nextFloat();
	// boolean 을 가져올 수 있는 방법은 없고
	// nextLine 으로 가져온 후 파싱하는방법밖에 없다.
	
	// 값을 쓰면 버퍼라는 임시공간에 들어가게 되는데,
	// 엔터 => 줄바꿈 \n 이 같이 붙어서 들어간다.
	
	public void inputScanner2()
	{ // 사용자에게 이름과 나이를 입력받기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요  : ");
		String name = sc.nextLine();
		
		System.out.print("나이를 입력하세요  : ");
		
		// 해결하는 방법 
		
//		switch (index){
//		case 1:
//		case 2	
//		}
		// 방법 1. 줄바꿈을 가져갈 수 있는 nextLine() 추가;
//		int age = sc.nextInt(); // 버퍼에 줄바꿈이 남겨져있는 상태
//		sc.nextLine();          // 버퍼에 남아있는 줄바꿈만 가져와주는 용도
//		
//		System.out.print("주소를 입력하세요 : ");
//		String address = sc.nextLine();

		// 방법 2.age를 받을 때도 nextLine()을 쓰되 int로 파싱하기
		// 파싱 : 문자열을 기본 자료형으로 바꿔주는 일
		
		/* 조건ex) : "1"라는 문자열을 숫자로 바꿀 수 있는 것이지 "박신우" 라는것을 숫자로 바꿀 수는 없다.
		 		    boolean으로 바꿀려고 할때  "true" "박신우 "  
		*/
	//	String userAge = sc.nextLine();
	//	int age = Integer.parseInt(userAge);		
 	    int age = Integer.parseInt(sc.nextLine());
//		
		System.out.print("주소를 입력하세요 : ");
		String address = sc.nextLine();
		
		// 방법3.next()로 주소를 받기 (한계가 있다.)
		// next 메소드는 띄어쓰기를 구분자로 인식한다.
		// 서울시 역삼동이라고 입력하면 서울시만 출력한다.
		
//		int age = sc.nextInt();
//		System.out.print("주소를 입력하세요 : ");
//		String address = sc.next();
//	--	sc.nextLine();
		
		// +추가 : char형을 받고 싶을때는
		System.out.print("성별을 입력하세요  : "); // F // M
//		String userGender = sc.nextLine();  
//		char gender = userGender.charAt(0);	
		
		//charAt(int index) 문자열에서 index 번째의 문자를 가져와 주는 메소드.
		// APPLE 문자열에서  A(0) P(1) P(2) L(3) E(4) Zero Index 기반.
		// String = char 의 집합
		
		char gender = sc.nextLine().charAt(0);

//		int age = sc.nextInt();
//		
//		System.out.print("주소를 입력하세요 : ");
//		String address = sc.nextLine();
		
		// nextLine(); 문자열
		// nextInt(); 정수
		
//		System.out.println(name + "님은" + age + "세이며, 사는곳은 " +  address +"입니다.");
//		System.out.println("이름은 " + name + " 나이는 " + age + "주소는 " + address + "입니다.");
		System.out.printf("이름은 %s 나이는 %d 주소는 %s입니다.\n", name, age, address);
		System.out.printf("성별은 %c입니다.", gender);
		
		sc.close();		
		//abcdefghijklmnop
	}
}
