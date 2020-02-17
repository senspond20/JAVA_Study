package com.kh.example.chap02_abstarctNInterface.family.model.vo;

public class Mother extends Family implements Basic{
	private String babyBirth;
	
	public Mother() {
		
	}
	
	public Mother(String name, double weight, int health, String babyBirth) {
		
		super(name,weight,health);
		this.babyBirth = babyBirth;
	}
	
	public String getBabyBirth() {
		return babyBirth;
	}
	
	public void setBabyBirth(String babyBirth) {
		this.babyBirth = babyBirth;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "¾î¸Ó´Ï  [" + super.toString() + ", babyBirth=" + babyBirth + "]";
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		super.setWeight(super.getWeight() + 10);
		super.setHealth(super.getHealth() - 5);

		System.out.println("");

	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		super.setHealth(super.getHealth()+10);
	}
	
}
