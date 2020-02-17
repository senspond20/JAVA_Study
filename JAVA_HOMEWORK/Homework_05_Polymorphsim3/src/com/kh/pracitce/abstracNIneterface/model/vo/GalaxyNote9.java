package com.kh.pracitce.abstracNIneterface.model.vo;

public class GalaxyNote9 extends SmartPhone implements NotePen{

	private static final long serialVersionUID = 1L;

	public GalaxyNote9() {
		super.setMaker("�Ｚ");
	}
	@Override
	public String picture() {
		return "12�� ��� ī�޶�";
	}
	
	@Override
	public String charge() {
		return "��� ����, ��� ���� ����";
	}
	
	@Override
	public String touch() {
		return "������, ������ ����";
	}
	
	@Override
	public boolean bluetoothPen() {
		// TODO Auto-generated method stub	
		return PEN_BUTTON;
	}
	
	
	@Override
	public String printInformaition() {
		// TODO Auto-generated method stub
		String inform = super.printInformaition() + "\n";
		inform += makeCall()     + "\n";
		inform += takeCall()     + "\n";
		inform += picture()      + "\n";
		inform += charge()       + "\n";		
		inform += touch()        + "\n";	
		inform += "��������� ž�� ���� : ";
		inform += bluetoothPen() + "\n";
		
		return inform;
	}
	
	@Override
	public String makeCall() {
		// TODO Auto-generated method stub
		return super.makeCall();
	}
	@Override
	public String takeCall() {
		// TODO Auto-generated method stub
		return super.takeCall();
	}
}
