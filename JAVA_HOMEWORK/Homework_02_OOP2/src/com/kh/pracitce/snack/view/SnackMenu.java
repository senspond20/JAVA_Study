package com.kh.pracitce.snack.view;

import java.util.Scanner;

import com.kh.pracitce.snack.controller.SnackController;

public class SnackMenu {

	Scanner sc = new Scanner(System.in);

	public SnackMenu() {}
	public void menu() {
		
		SnackController scll = new SnackController();
		System.out.println("스낵류를 입력하세요.");

		System.out.print("종류 : ");
		String kind = sc.nextLine();
	    
		System.out.print("이름 : ");
	    String name = sc.nextLine();
	    
		System.out.print("맛 : ");
	    String flavor = sc.nextLine();
	    
		System.out.print("개수 : ");
	    int numOf = sc.nextInt();
		
	    System.out.print("가격 : ");
		int price = sc.nextInt();
	    sc.nextLine();
		
		System.out.println(scll.saveData(kind, name, flavor, numOf, price));
		
	    System.out.print("저정한 정보를 확인하시겠습니까?(y/n) :");
	    char chk = sc.nextLine().charAt(0);
	    
	    if(chk =='y' || chk =='Y')
	    {
	    	String confirm = scll.confirmData();
	    	System.out.println(confirm);
	    

	    }else {
	    	
	    }
	    
	}
}
