package com.kh.example.chap01_encapsulation;

// Ŭ������ ���鶧�� public ���� ����°� ��Ģ

// defalt Ŭ������ Ŭ���� �ۿ�(���� Ŭ����) 

public class Account { // {}Ŭ���� ����

	// ��� ���� = �޼ҵ� ������ �ִ� ������ �ƴ϶�. Ŭ���� ������ �ִ� ����
	// ��� �ʵ� / �ʵ� / ���� ���� .
	private String name = "�ڽſ�";
	private String phone = "010-9468-8140";
	private String pwd = "1q2w3e4r";
	private int bankCode = 3030;
	private int balance = 0;

	// �޼ҵ� ����
	public void deposit(int money) {
		if (money > 0) {
			balance += money;
			System.out.println(name + "���� ���¿� " + money + "���� �ԱݵǾ����ϴ�.");
		} else {
			System.out.println("�߸��� �ݾ��� �ԱݵǾ����ϴ�.");
		}
	}

	public void withdraw(int money) {
		if (money <= balance) {
			balance -= money;
			System.out.println(name + "���� ���¿���" + money + "���� ��ݵǾ����ϴ�.");
		} else {
			System.out.println("�ܾ��� �����մϴ�. �ܾ��� Ȯ���ϼ���");

		}
	}

	public void displayBalance() {
		System.out.println(name + "�� ���¿� �ܾ��� " + balance + "�Դϴ�.");
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

// �̷��� defalt (�� ���ϳ��� public class�� �ΰ� �̻� ���� �� ����.)
class Test {
	
	
}
