package com.kh.variable;

public class B_Constant {
	public void finalConstant() {
		
		// �Ϲ� ���� ����
		int age;
		// ��� ����  
		final int AGE; 
		age = 20;
		AGE = 20;		

		System.out.println("age : " + age);
		System.out.println("AGE : " + AGE);
		
		// ������ ���� ����
		age = 30;
	
//		 AGE = 30;
		// The final local variable AGE may already have been assigned
		// ���̳� ������ �ѹ��� ���� ������ �� �ִµ�,
		// �� ���� �����Ϸ��� �ϴϱ� �̹� �Ҵ�Ǿ� �ִٴ� �����޽����� ����.
		//: AGE �� final�� ���� ����ε�, ����� �ѹ��� ���� ������ ���ְ� �� ������ �Ұ�����
		// �׷��� 16���� �ٿ��� AGE�� 30�̶�� ������ ������ �Ϸ��� �ϴ� ���� ���ؼ� ������ �Ұ����ϸ鼭 ������.;

		System.out.println("�� ���� �� age : " + age);
		System.out.println("�� ���� �� AGE : " + AGE);
				
	}
}
