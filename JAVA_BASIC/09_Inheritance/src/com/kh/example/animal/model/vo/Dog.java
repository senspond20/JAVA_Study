package com.kh.example.animal.model.vo;

public class Dog extends Animal{
	// - name : String
	// - age  : int
	// -weight : double
	// - height : double
	// - hair : String
	
	// + Dog()
	// + Dog(name : String, age : int, weight : double, height : double, hair : String)
	
	// + getter/setter
	// + inform(): String
	//	 반환형식 : 이름 나이 몸무게 키
	
//	private String name;
//	private int age;
//	private double weight;
	private double height;
	private String hair;
	
	public Dog() {
		
	}
	public Dog(String name, int age, double weight, double height, String hair) {
		
		super(name,age,weight);
		
//		this.name = name;
//		this.age = age;
//		this.weight = weight;
//		
		this.height = height;
		this.hair = hair;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " " + height + " " + hair;
	}
	
//	public String inform() {
//		
//		return super.inform(); 
//		
////		return super.getName() + " " + super.getAge() + " " + super.getWeight() + " " + height;
//		
////		return name + " " + age + " " + weight + " " + height;
//	}
//	
//	public void setName(String name) {
//		this.name = name;
//	}
//	public String getName() {
//		return name;
//	}
//	
//	public void setAge(int age) {
//		this.age = age;
//	}
//	public int getAge() {
//		return age;
//	}
//	
//	public void setWeight(double weight) {
//		this.weight = weight;
//	}
//	public double getWeight() {
//		return weight;
//	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	public double getHeight() {
		return height;
	}
	
	public void setHair(String hair) {
		this.hair = hair;
	}
	
	public String getHair() {
		return hair;
	}
	
	
	
	
}
