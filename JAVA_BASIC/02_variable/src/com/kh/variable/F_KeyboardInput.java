package com.kh.variable;
import java.util.Scanner;

public class F_KeyboardInput {
	public void inputScanner() {
		Scanner sc = new Scanner(System.in);
		//Resource leak: 'sc' is never closed
		
		System.out.print("�̸��� �Է��ϼ��� : ");  //�ȳ� ���� ����
		String name = sc.nextLine();
			
		System.out.print("���̸� �Է��ϼ��� : ");
		int age = sc.nextInt();
		
		System.out.print("Ű(�Ҽ��� ù° �ڸ����� �Է�) : ");	
		double height = sc.nextDouble();
//		float height = sc.nextFloat();
		
		System.out.println(name + "���� " + age +"�� �̸� , Ű��" + height + "cm �Դϴ�.");	
		
		sc.close();
		// terminate ������ - ������
		// �����Ű�� ������ <terminated> ǥ��
	
		/* ���� : sc.nextInt();
		      �Ǽ� : sc.nextFloat(); �Ǵ� sc.nextDouble();
	            ���ڿ� : sc.next(); �Ǵ� sc.nextLine();
		 */
	}
	
	// ��  ============== �߿� =====================================================
	// ���ۿ� �ٹٲ��� ������ �ʴ´�.				���ۿ� �ٹٲ��� �����.
	// ���ۿ� �����ִ� �ٹٲ޵� �����´�.			���ۿ� �����ִ� �ٹٲ��� �ν����� �ʴ´�.(�������� �ʴ´�.)

	// �ٹٲ��� ������ ���µ�
	// ������ ���� �������� �ٹٲ��� ���ְ� �־��ش�.
	
	// nextLine();      				next();
	//									nextInt();
	//									nextDouble();
	//									nextFloat();
	// boolean �� ������ �� �ִ� ����� ����
	// nextLine ���� ������ �� �Ľ��ϴ¹���ۿ� ����.
	
	// ���� ���� ���۶�� �ӽð����� ���� �Ǵµ�,
	// ���� => �ٹٲ� \n �� ���� �پ ����.
	
	public void inputScanner2()
	{ // ����ڿ��� �̸��� ���̸� �Է¹ޱ�
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸��� �Է��ϼ���  : ");
		String name = sc.nextLine();
		
		System.out.print("���̸� �Է��ϼ���  : ");
		
		// �ذ��ϴ� ��� 
		
//		switch (index){
//		case 1:
//		case 2	
//		}
		// ��� 1. �ٹٲ��� ������ �� �ִ� nextLine() �߰�;
//		int age = sc.nextInt(); // ���ۿ� �ٹٲ��� �������ִ� ����
//		sc.nextLine();          // ���ۿ� �����ִ� �ٹٲ޸� �������ִ� �뵵
//		
//		System.out.print("�ּҸ� �Է��ϼ��� : ");
//		String address = sc.nextLine();

		// ��� 2.age�� ���� ���� nextLine()�� ���� int�� �Ľ��ϱ�
		// �Ľ� : ���ڿ��� �⺻ �ڷ������� �ٲ��ִ� ��
		
		/* ����ex) : "1"��� ���ڿ��� ���ڷ� �ٲ� �� �ִ� ������ "�ڽſ�" ��°��� ���ڷ� �ٲ� ���� ����.
		 		    boolean���� �ٲܷ��� �Ҷ�  "true" "�ڽſ� "  
		*/
	//	String userAge = sc.nextLine();
	//	int age = Integer.parseInt(userAge);		
 	    int age = Integer.parseInt(sc.nextLine());
//		
		System.out.print("�ּҸ� �Է��ϼ��� : ");
		String address = sc.nextLine();
		
		// ���3.next()�� �ּҸ� �ޱ� (�Ѱ谡 �ִ�.)
		// next �޼ҵ�� ���⸦ �����ڷ� �ν��Ѵ�.
		// ����� ���ﵿ�̶�� �Է��ϸ� ����ø� ����Ѵ�.
		
//		int age = sc.nextInt();
//		System.out.print("�ּҸ� �Է��ϼ��� : ");
//		String address = sc.next();
//	--	sc.nextLine();
		
		// +�߰� : char���� �ް� ��������
		System.out.print("������ �Է��ϼ���  : "); // F // M
//		String userGender = sc.nextLine();  
//		char gender = userGender.charAt(0);	
		
		//charAt(int index) ���ڿ����� index ��°�� ���ڸ� ������ �ִ� �޼ҵ�.
		// APPLE ���ڿ�����  A(0) P(1) P(2) L(3) E(4) Zero Index ���.
		// String = char �� ����
		
		char gender = sc.nextLine().charAt(0);

//		int age = sc.nextInt();
//		
//		System.out.print("�ּҸ� �Է��ϼ��� : ");
//		String address = sc.nextLine();
		
		// nextLine(); ���ڿ�
		// nextInt(); ����
		
//		System.out.println(name + "����" + age + "���̸�, ��°��� " +  address +"�Դϴ�.");
//		System.out.println("�̸��� " + name + " ���̴� " + age + "�ּҴ� " + address + "�Դϴ�.");
		System.out.printf("�̸��� %s ���̴� %d �ּҴ� %s�Դϴ�.\n", name, age, address);
		System.out.printf("������ %c�Դϴ�.", gender);
		
		sc.close();		
		//abcdefghijklmnop
	}
}
