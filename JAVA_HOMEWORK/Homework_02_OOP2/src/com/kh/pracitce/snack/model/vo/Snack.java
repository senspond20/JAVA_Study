package com.kh.pracitce.snack.model.vo;

public class Snack {
	/*
	- kind : String // 종류
	- name : String // 이름
	- flavor : String // 맛
	- numOf : int // 개수
	- price : int // 가격
	+ Snack()
	+ Snack(kind:String, name:String, flavor:String,
	numOf:int, price:int)
	+ information() : String
	+ setter() / getter()
	*/
	
	private String kind;
	private String name;
	private String flavor;
	private int numOf;
	private int price;
	
	public Snack() {}
	public Snack(String kind, String name, String flavor) {
		this.kind = kind;
		this.name = name;
		this.flavor = flavor;
	}
	
	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getKind() {
		return kind;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}
	public String getFlaver() {
		return flavor;
	}
	public void setNumOf(int numOf) {
		this.numOf = numOf;
	}
	public int getNumOf() {
		return numOf;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	
	public String information() {
		return kind + "," + name + "," + flavor;
	}
	
}
