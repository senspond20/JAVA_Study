package com.kh.example.set.model.vo;

public class Dog implements Comparable<Dog>{
	private String name;
	private double weight;
	
	public Dog() {
		
	}
	public Dog(String name, double weight) {
		this.name = name;
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + "(" + weight + "kg)";
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		final int PRIME = 31;
		
		int result = 1;
		result = PRIME * result  + ((name == null)? 0 : name.hashCode());
		result = PRIME * result  + (int) weight;
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		
		if(this == obj) {
			return true;
		}
		if(obj == null) {
			return false;
		}
		if(this.getClass() != obj.getClass()) {
			return false;
		}
		
		Dog other = (Dog) obj;
		if(name == null) {
			if(other.name != null) {
				return false;
			} // name 이 null이면 name.equals가 되지 않기 떄문에
		}
		else if(!name.equals(other.name)) {
			return false;
		}
		if(weight != other.weight) {
			return false;
		}
		
		return true;
	}

	@Override
	public int compareTo(Dog o) {
		// 이름에 대해서 오름차순
		String other = o.getName();
		return name.compareTo(other);
	}
	
//	@Override
//	public int compareTo(Object o) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
}
