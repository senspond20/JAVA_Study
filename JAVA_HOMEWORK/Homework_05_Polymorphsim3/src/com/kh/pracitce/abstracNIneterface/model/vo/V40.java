package com.kh.pracitce.abstracNIneterface.model.vo;

public class V40 extends SmartPhone implements NotePen{
	public V40() {
		super.setMaker("LG");
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
		inform += "블루투스펜 탑재 여부 : ";
		inform += bluetoothPen() + "\n";
		
		return inform;
	}
	
	@Override
	public boolean bluetoothPen() {
		// TODO Auto-generated method stub
		return false;
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
	
	@Override
	public String charge() {
		// TODO Auto-generated method stub
		return "고속 충전, 고속 무선 충전";
	}
	@Override
	public String picture() {
		// TODO Auto-generated method stub
		return "1200,1600만 트리플 카메라";
	}
	@Override
	public String touch() {
		// TODO Auto-generated method stub
		return "정전식";
	}
}
