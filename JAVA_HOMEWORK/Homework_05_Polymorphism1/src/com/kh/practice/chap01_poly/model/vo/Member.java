package com.kh.practice.chap01_poly.model.vo;

/**
 * @author sensh
 *
 */
public class Member {
	private String name;
	private int age;
	private char gender;
	private int couponCount;
	
	public Member() {
		
	}
	public Member(String name, int age, char gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getCouponCount() {
		return couponCount;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public void setCouponCount(int couponCount) {
		this.couponCount = couponCount;
	}

	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		//return super.toString();
		return "Member [name=" + name + ", age=" + age + ", gender=" + gender + ", couponCount=" + couponCount + "]";
	}

}
