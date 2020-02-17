package com.kh.example.chap01_poly.test.controller;

import com.kh.example.chap01_poly.test.model.vo.Child1;
import com.kh.example.chap01_poly.test.model.vo.Child2;
import com.kh.example.chap01_poly.test.model.vo.Parent;

public class PolyController {

	public void method1() {
		// TODO Auto-generated method stub

		System.out.println("1. 부모타입 레퍼런스로 부모 객체를 다루는 경우");

		// ↓ 부모 객체
		Parent p = new Parent();
		// ↑ 부모타입 레퍼런스

		p.printParent();

		System.out.println();
		System.out.println("2. 자식타입 레퍼런스로 자식 객체를 다루는 경우");

		// ↓ 자식 객체
		Child1 c1 = new Child1();
		// ↑ 자식타입 레퍼런스

		c1.printChild1();
		c1.printParent(); // 상속때문에.

		// 다형성 전제 -> 상속이 되어있어야한다.
		System.out.println();
		System.out.println("3. 부모타입 레퍼런스로 자식 객체를 다루는 경우");

		// 업 캐스팅 - 자식객체가 부모래퍼런스에 담기는것.
		// 부모타입의 참조변수가 모든 자식객체를 담을 수 있는것.
		Parent p2 = new Child2(); // Parent 라는 레퍼런스는 Child1,Child2 도 받을수가 있다.(자식이기 때문에)
		Parent p3 = new Child1(); // 다형성 적용
		p2.printParent();
		p3.printParent(); // -> Child 가 안보인다.

		// 실제 heap 메모리 영역에는 Child가 할당되어 있지만
		// 볼수 잇는 자료형이 Parent로 되어있기에 Parent 밖에 안보인다.

		// 다운 캐스팅
		((Child2) p2).printChild2(); // 형변환이 되었기 때문에, pirntChild가 보인다.
		((Child2) p2).printParent();
		// 클래스 간의 형 변환은 반드시 상속 관계에 있는 클래스끼리만 가능

		System.out.println();
		System.out.println("4. 자식탑입 레퍼런스로 부모 객체를 다루는 경우");

		System.out.println();
		System.out.println("=== 간단 예제 ");
		System.out.println();

		Parent[] pArr = new Parent[4];

		pArr[0] = new Child1();
		pArr[1] = new Child2();
		pArr[2] = new Child1();
		pArr[3] = new Child2();

		for (int i = 0; i < pArr.length; i++) {

			// Parent p = pArr[i];

			// 방법 1.
			if (pArr[i] instanceof Child1) {
				((Child1) pArr[i]).printChild1();
			} else if (pArr[i] instanceof Child2) {
				((Child2) pArr[i]).printChild2();
			}
		}

		System.out.println();
		
		// 방법 2.
		for (int i = 0; i < pArr.length; i++) {
			//final Parent pt = pArr[i];
			
			//static Parent pt = pArr[i];
			//=> Illegal modifier for the variable pt; only final is permitted
			Parent pt = pArr[i];
			
			// pt 가 Child1 타입이랑 일치하는지
			if (pt instanceof Child1) {
				((Child1) pt).printChild1();

				// pt가 Child2 타입이랑 일치하는지
			} else if (pt instanceof Child2) {
				((Child2) pt).printChild2();
			} 
		}
		
		for(int i = 0; i < pArr.length; i++) {
			
			// 동적 바인딩.
			pArr[i].print();
			//컴파일러가 실행될때 
			//처음에는 타입을 보고 parent의 print을 보고 
			//묶여있는 오버라이딩을 보고 찾아들어간다.
			
			// 정적바인딩
			// -> 원래대로 묶인대로 가는것
	
//			Parent pt = pArr[i];
//			if
//			(pt instanceof Child1) {
//				((Child1)pt).print();
//			}else if (pt instanceof Child2) {
//				((Child2)pt).print();
//			}
		}
		
		
		// System.out.println(pArr[i]));

		// Child2 c2 = new Parent();

		// Child2 c2 = (Child2) new Parent();
		// 이클립스에서는 에러가 안나지만 실행하면 에러가난다.
		//

		// Type mismatch: cannot convert from Parent to
		// Child1
	}
}
