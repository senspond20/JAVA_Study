package com.kh.example.chap04_filed.model.vo;

public class Product {
//	{
//		name ="dfdfd";
//	}
	private String name = "��������";
	private String brand = "������";
	private int price = 1500;
	
	private static int num = 100;
	
	/*�ʱ�ȭ ��� */
	
	//instance ���
	{
		name ="ĭ��";
		price = 1000;
		brand = "�Ե�";
		num -= 10;  // < -- �̹� static �ϸ鼭 �޸𸮿� �ö��ִ°� ��ü�� �����ϸ鼭 �������⿡ ������ ���� ������,
	}

	
	// static ���
	static 
	{
		// Cannot make a static reference to the non-static field name
		// �� ��� �ν��Ͻ� ������ ��ü(�ν��Ͻ�)�� ���鋚 �����Ǳ⿡ 
		// �����Ǵ� ������ �ٸ��⿡ ���� ���� ����.
		
//		name ="Ȩ����"; 
//		brand = "����";
//		price = 2000;
		num = 150;
		num--;
		
	}
	
	// �����ڸ� �ۼ����� ������ JVM�� �⺻ �����ڸ� ����.
	
	// ����� ���� �� �⺻������ �ۼ��ϱ�. �����ε��Ͽ� �ۼ�
	
	// �����ε�.
	// ���� �޼ҵ� �̸�
	// �ٸ� �Ű������� ���� �Ǵ� �ٸ� �Ű����� Ÿ��
	// ���� :�Ű������� ������ �ٸ��ų�...
	 //    �Ű������� Ÿ���� �ٸ��ų�
	//     �Ű������� ������ �ٸ���
		
	// �⺻ ������. (����� ���� ����) 
	public Product() {
		
		//new Product();
	}

	// �Ű����� �ִ� ������. (�Ű� ���� �ִ� ������ �ۼ��� JVM�� �⺻ �����ڸ� �ڵ����� ���������� ����)
	public Product(String name, String brand) {
		
	}
	
	public Product(String name, int num) {
		
	}
	
	
	public void inform() {
		
		// 1. JVM �� �⺻������ �ʱ�ȭ
		// 2. ����� �ʱ�ȭ
		// 3. �ν��Ͻ� ��� �ʱ�ȭ
		// 4. �����ڸ� ���� �ʱ�ȭ
		
		
		System.out.println(name + "," + brand + "," + price + "," + num);
		
		
		
	}

}
