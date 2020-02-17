package com.kh.practice.book.model.vo;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Book implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String title;
	private String author;
	private int price;
	private Calendar date;
	private double discount;

	public final static String FILE_NAME = "book.txt";

	SimpleDateFormat sft = new SimpleDateFormat("yyyy-MM-dd");

	public Book() {

	}

	public Book(String title, String author, int price, Calendar date, double discount) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.date = date;
		this.discount = discount;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	//
	public Calendar getDate() {
		return date;
	}

	public void setDate(Calendar date) {
		this.date = date;
	}

	//
	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public Calendar strToCal(String str) {
		// 문자열 -> Calendar 변환
//				String str = "2020-01-14";
		Date date = null;
		Calendar cal = Calendar.getInstance();
		
		try {
			date = sft.parse(str);			
			cal.setTime(date);
		} catch (ParseException e) {
			
		} catch (NullPointerException e) {
			
		}
	
		return cal;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();

		// Calendar 문자열로 변환
		String strdate = sft.format(new Date(date.getTimeInMillis()));

		sb.append(String.format("%1s", this.title));
		sb.append(String.format("%15s", this.author));
		sb.append(String.format("%15s", this.price));
		sb.append(String.format("%16s", strdate));
		sb.append(String.format("%8s", this.discount));

		String rStr = sb.toString();
		sb = null;

		return rStr;
	}
}
