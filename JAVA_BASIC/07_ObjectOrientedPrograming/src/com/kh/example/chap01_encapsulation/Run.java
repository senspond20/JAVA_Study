package com.kh.example.chap01_encapsulation;

import java.util.Arrays;

public class Run {
	public static void main(String[] args) {
		Account a = new Account();
		
		Account b = new Account();
			
		
		// ���� �ܾ� ��ȸ
		a.displayBalance();
		
		a.deposit(1000000);
		a.displayBalance();
		
		a.deposit(1500000);
		a.displayBalance();
		
		a.withdraw(500000);
		a.displayBalance();
		
		b.deposit(300);
		b.displayBalance();
//		a.balance -= 2000000;
//		The field Account.balance is not visible
//		private�� �� �ڽ�(Account)������ �� �� �ְԲ� �������ֱ� ������
//		�ܺ� Ŭ������ Run������ �� �� ����.
	
		a.withdraw(500000);
		a.displayBalance();
		
		b.deposit(400);
		
		a.test(b);
		
		int[] iArr = {5,4,3,2,1,3,6};
		int[] iArrR = a.test2(iArr, 0);
		System.out.println(Arrays.toString(iArrR));
		
	}
}
