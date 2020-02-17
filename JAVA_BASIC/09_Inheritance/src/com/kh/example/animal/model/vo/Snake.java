package com.kh.example.animal.model.vo;

public class Snake extends Animal {
	// - name : String
	// - age : int
	// - weight : double
	// - pattern : String

	// + Snake()
	// + Snake(name: String, age : int, weight : double, pattern : STring)

	// + getter/setter
	// + inform() : String
	// 반환형식 : 이름 나이 몸무게 무늬

//	private String name;
//	private int age;
//	private double weight;
	private String pattern;

	public Snake() {

	}

	public Snake(String name, int age, double weight, String pattern) {
//		this.name = name;
//		this.age = age;
//		this.weight = weight;
		super(name, age, weight);
		this.pattern = pattern;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " " + pattern;
	}
	
	
//	public String inform() {
//		
//		return super.inform();
//		//return name + " " + age + " " + weight + " " + pattern;
//	}

//	public String getName() {
//		return name;
//	}
//	
//	public void setName(String name) {
//		this.name = name;
//	}
//	
//	public int getAge() {
//		return age;
//	}
//	public void setAge(int age) {
//		this.age = age;
//	}
//	
//	public double getWeight() {
//		return weight;
//	}
//	public void setWeight(double weight) {
//		this.weight = weight;
//	}

	public String getPattern() {
		return pattern;
	}

	public void setPattern(String pattern) {
		this.pattern = pattern;
	}

}
