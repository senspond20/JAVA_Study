package com.kh.operator;
import java.util.Scanner;

public class E_Logical {
	// && : �ǿ����ڰ� ���  true�϶� true ��ȯ (�׸���, ~�鼭)
	// || : �ǿ����� �߿��� �ϳ��� true�϶� ��ȯ (�Ǵ�, ~�ų�)

	public void method1() {
   // �Է��� ���� 1~100 ������ �������� Ȯ��
		Scanner sc = new Scanner(System.in);	
		System.out.print("���� �ϳ� �Է� : ");
		int num = sc.nextInt();
//		sc.nextLine();

		// 1~100 ������ ����
		// ���ڰ� 1���� ũ�ų� ����, 100���� �۰ų� ����. --> &&
		System.out.println("1~100 ������ �������� Ȯ�� : " + (num >=1 && num <= 100));		
        //sc.close();
	}
	
	public void method2() {
	// �Է��� ���ڰ��� �빮������ Ȯ��
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ϳ� �Է� :");
		char ch = sc.nextLine().charAt(0);
		System.out.println("���� �빮�ڰ� �½��ϱ�?: " + ( ch >= 'A' && ch <= 'Z'));		
		
		// ��� �Ͻ÷��� yȤ�� Y�� �Է��ϼ��� :
		System.out.print("��� �Ͻ÷��� yȤ�� Y�� �Է��ϼ��� : ");
		char ch2 = sc.nextLine().charAt(0);
				
		// ��� �ϰڴٰ� �ϼ̽��ϱ�?
		System.out.println("��� �ϰڴٰ� �ϼ̽��ϱ�? " + (ch2 == 'y' || ch2 =='Y'));
		sc.close();	
	}
	
}
