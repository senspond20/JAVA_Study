package com.kh.pracitce.snack.view;

import java.util.Scanner;

import com.kh.pracitce.snack.controller.SnackController;

public class SnackMenu {

	Scanner sc = new Scanner(System.in);

	public SnackMenu() {}
	public void menu() {
		
		SnackController scll = new SnackController();
		System.out.println("�������� �Է��ϼ���.");

		System.out.print("���� : ");
		String kind = sc.nextLine();
	    
		System.out.print("�̸� : ");
	    String name = sc.nextLine();
	    
		System.out.print("�� : ");
	    String flavor = sc.nextLine();
	    
		System.out.print("���� : ");
	    int numOf = sc.nextInt();
		
	    System.out.print("���� : ");
		int price = sc.nextInt();
	    sc.nextLine();
		
		System.out.println(scll.saveData(kind, name, flavor, numOf, price));
		
	    System.out.print("������ ������ Ȯ���Ͻðڽ��ϱ�?(y/n) :");
	    char chk = sc.nextLine().charAt(0);
	    
	    if(chk =='y' || chk =='Y')
	    {
	    	String confirm = scll.confirmData();
	    	System.out.println(confirm);
	    

	    }else {
	    	
	    }
	    
	}
}
