package com.kh.pracitce.abstracNIneterface.model.vo;

public abstract class SmartPhone implements CellPhone, TouchDisplay {

	private String maker;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SmartPhone() {

	}

	@Override
	public String picture() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String touch() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String charge() {
		// TODO Auto-generated method stub
		return null;
	}

	public String printInformaition() {
		return maker + "에서 만들어 졌고 제원은 다음과 같다.";
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public String getMaker() {
		return maker;
	}

	@Override
	public String makeCall() {
		// TODO Auto-generated method stub
		return "번호를 누르고 통화버튼을 누름";
	}

	@Override
	public String takeCall() {
		// TODO Auto-generated method stub
		return "전화받기 버튼을 누름";
	}
}
