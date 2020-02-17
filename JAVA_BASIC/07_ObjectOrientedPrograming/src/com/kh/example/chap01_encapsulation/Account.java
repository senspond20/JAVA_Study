package com.kh.example.chap01_encapsulation;

// 클래스를 만들때는 public 으로 만드는게 원칙

// defalt 클래스는 클래스 밖에(내부 클래스) 

public class Account { // {}클래스 영역

	// 멤버 변수 = 메소드 영역에 있는 변수가 아니라. 클래스 영역에 있는 변수
	// 멤버 필드 / 필드 / 전역 변수 .
	private String name = "박신우";
	private String phone = "010-9468-8140";
	private String pwd = "1q2w3e4r";
	private int bankCode = 3030;
	private int balance = 0;

	// 메소드 영역
	public void deposit(int money) {
		if (money > 0) {
			balance += money;
			System.out.println(name + "님의 개좌에 " + money + "원이 입금되었습니다.");
		} else {
			System.out.println("잘못된 금액이 입금되었습니다.");
		}
	}

	public void withdraw(int money) {
		if (money <= balance) {
			balance -= money;
			System.out.println(name + "님의 계좌에서" + money + "원이 출금되었습니다.");
		} else {
			System.out.println("잔액이 부족합니다. 잔액을 확인하세요");

		}
	}

	public void displayBalance() {
		System.out.println(name + "의 계좌에 잔액은 " + balance + "입니다.");
	}

	
	public void test(Account dd) {


		System.out.println("true");
		
	
		
	}
	public int[] test2(int[] iArr, int index) {
		int temp = 0;
		if (index < iArr.length-1) {
			temp = iArr[index];
			iArr[index] = iArr[index+1];
			iArr[index+1] = temp;
			return test2(iArr, index + 1);
		} 
			return iArr;
	}

}

// 이럴때 defalt (한 파일내에 public class가 두개 이상 있을 수 없다.)
class Test {
	
	
}
