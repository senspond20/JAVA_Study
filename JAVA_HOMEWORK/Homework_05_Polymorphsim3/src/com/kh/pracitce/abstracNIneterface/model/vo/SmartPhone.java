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
		return maker + "���� ����� ���� ������ ������ ����.";
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
		return "��ȣ�� ������ ��ȭ��ư�� ����";
	}

	@Override
	public String takeCall() {
		// TODO Auto-generated method stub
		return "��ȭ�ޱ� ��ư�� ����";
	}
}
