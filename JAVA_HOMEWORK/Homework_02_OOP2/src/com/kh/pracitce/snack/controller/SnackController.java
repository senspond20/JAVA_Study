package com.kh.pracitce.snack.controller;

import com.kh.pracitce.snack.model.vo.Snack;

public class SnackController {
	
	Snack sk = new Snack();
	
	public SnackController() {

		
	}
	
	
	public String saveData(String kind,String name, String flavor, int numOf, int price)
	{
//		Snack sk = new Snack(kind,name,flavor);
		
		sk.setKind(kind);
		sk.setName(name);
		sk.setFlavor(flavor);
		sk.setNumOf(numOf);
		sk.setPrice(price);		
		
		return "���� �Ϸ�Ǿ����ϴ�.";
	}
		
	public String confirmData() {
		
		String result =
				String.format("%s (%s - %s ) %d�� %d��", sk.getKind(),sk.getName(),sk.getFlaver(),sk.getNumOf(),sk.getPrice());
				
				//sk.getKind() + "," +sk.getName() +"," + sk.getFlaver() +"," + sk.getNumOf() + "," + sk.getPrice() ;

		return result;
	}
	
	
}
