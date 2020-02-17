package com.kh.pracitce.abstracNIneterface.model.vo;

public class GalaxyNote9 extends SmartPhone implements NotePen{

	private static final long serialVersionUID = 1L;

	public GalaxyNote9() {
		super.setMaker("삼성");
	}
	@Override
	public String picture() {
		return "12만 듀얼 카메라";
	}
	
	@Override
	public String charge() {
		return "고속 충전, 고속 무선 충전";
	}
	
	@Override
	public String touch() {
		return "정전식, 와콤펜 지원";
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
		inform += "블루투스펜 탑재 여부 : ";
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
