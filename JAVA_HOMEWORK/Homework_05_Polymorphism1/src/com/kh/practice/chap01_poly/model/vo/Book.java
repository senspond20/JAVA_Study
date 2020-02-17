package com.kh.practice.chap01_poly.model.vo;

public /*abstract*/ class Book {
	private String title;
	private String author;
	private String publisher;

	public Book() {

	}

	public Book(String title, String author,String publisher) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
	}
	
//	public abstract int getAccessAge();
//	public abstract boolean getCoupon();

	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String str = String.format("[title=%s, author=%s, publisher=%s]", title, author, publisher);
		
		return str;
		
//		return super.toString();
	}

}
