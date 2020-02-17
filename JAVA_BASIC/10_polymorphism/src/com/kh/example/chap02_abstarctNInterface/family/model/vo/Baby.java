package com.kh.example.chap02_abstarctNInterface.family.model.vo;

public class Baby extends Family implements Basic{
	
	public Baby() {}
	public Baby(String name, double weight, int health) {
		super(name,weight,health);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Baby [" + super.toString() + "]";
	}
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		super.setWeight(super.getWeight() + 3);
		super.setHealth(super.getHealth() + 1);
		
	}
	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		super.setHealth(super.getHealth() + 3);
	}
	
}
