package com.kh.variable;

public class E_PrintMethod {

	//	��������
		String str1 = "�ȳ��ϼ���";
		String str2 = "�ݰ����ϴ�";
//		
		
	public void printExample() {		
//		��������
//		String str1 = "�ȳ��ϼ���";
//		String str2 = "�ݰ����ϴ�";
		
		System.out.print(str1);
		System.out.print(str2);
	}
	
	// ln (������ ���Ӹ�) �ٹٲ��� ��Ų��.
	public void printlnExample(){
//		String str1 = "�ȳ��ϼ���";
//		String str2 = "�ݰ����ϴ�";
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println("�ڽſ�");
	}
	
	// f ������ ����	
	// %d : ������, %o: 8����, %x : 16����
	// %f : �Ǽ� (�Ҽ��� �Ʒ� 6�ڸ�), %e : ��������ǥ��, %g : ���� �� �״��
	// %A : 16���� �Ǽ�, %s : ���ڿ�
	// %b : ����
	/*
	 * - %5d : 5ĭ�� Ȯ���ϰ� ������ ����
	   - %-5d : 5ĭ�� Ȯ���ϰ� ���� ����
	   - %.2f : �Ҽ��� �Ʒ� 2�ڸ������� ǥ��

	 */
	public void printfExample() {
		// �ȳ��ϼ���, �ݽſ��Դϴ�. �ݰ����ϴ�.
		// str1                 str2
		
		System.out.printf("%s,�ڽſ��Դϴ�. %s.\n",str1,str2);
		System.out.printf("%14s,�ڽſ��Դϴ�. %15s.\n",str1,str2);
		System.out.printf("%1$s,�ڽſ��Դϴ�. %2$s.\n",str1,str2);
		System.out.printf("%1$14s,�ڽſ��Դϴ�. %2$15s.\n",str1,str2);
		
		// �ݰ����ϴ�. ģ�ϰ� ������.
		System.out.printf("%s, ģ�ϰ� ������.\n", str2);
		
		System.out.printf("%s, ģ�ϰ� ������.", str2);
		System.out.println();	
		
		// �̴Ϲ���
		// �ȳ��ϼ���, ���� 20�� �ڽſ� �����Դϴ�. ������ �ݰ����ϴ�.
		int age = 20;
		String name = "�ڽſ�";
		String job = "����";
		System.out.printf("%s, ���� %d�� %s %s�Դϴ�. ������ %s.", str1, age, name, job, str2);
		
//		System.out.printf("",);
//		System.out.printf
	}
}
