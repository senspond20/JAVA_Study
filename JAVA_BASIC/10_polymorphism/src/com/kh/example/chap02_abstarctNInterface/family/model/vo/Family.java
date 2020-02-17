package com.kh.example.chap02_abstarctNInterface.family.model.vo;

public abstract class Family {
	// - name : String
	// - weight : double
	// - heath : int
	
	private String name;
	private double weight;
	private int health;
	
	public Family() {}
	public Family(String name, double weight, int health) {
		this.name = name;
		this.weight = weight;
		this.health = health;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getWeight(){
		return weight;
	}
	
	public void setHealth(int health){
		this.health = health;
	}
	public int getHealth() {
		return health;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "name=" + name + ", weight=" + weight + ", " + "health=" + health;
	}
	
//	public abstract void eat();
//	public abstract void sleep();
	
	// + Family()
	// + Family(String name, double weigth, int health)
	
	// + getter/setter
	// + toString() : String
}
