package com.kh.practice.list.library.controller;

import java.util.ArrayList;
import java.util.Collections;

import com.kh.practice.list.library.model.vo.Book;

public class BookController {
	ArrayList<Book> bookList = new ArrayList<Book>();
	
	public BookController() {
		
		// 초기 값 4개 추가;
		bookList.add(new Book("자바의 정석","남궁 성","기타",20000));
		bookList.add(new Book("쉽게 배우는 알고리즘","문병로","기타",15000));
		bookList.add(new Book("대화의 기술","강보람","인문",17500));
		bookList.add(new Book("암 정복기","박신우","의료",21000));
		
	}
	public void insertBook(Book bk) {
		bookList.add(bk);
	}
	
	// 해당 bookList 의 주소값 반환
	public ArrayList<Book> selectlist() {
		return bookList;
	}
	public ArrayList<Book> searchBook(String keyword) {
		ArrayList<Book> searchList = new ArrayList<Book>();
	//	Boolean ck = false;
		
		for(Book bk : bookList) {
			if(bk.toString().contains(keyword)) {
				searchList.add(bk);
			//	ck = true;
			}
		}
//		if(!ck) {
//			return null;
//		}
		return searchList;
	}
	
	public Book deleteBook(String title, String author) {
		//bookList.remove(new Book(title, author, null, 0));
		Book removeBook = null;
		
		// ★ 반복문안에서 삭제후 배열크기가 달라지는것을 유의 
		// 특히 for~each문에서 break;꼭 필요
		
		// 1. for문
//		for(int i = 0; i < bookList.size(); i ++) {
//			if( bookList.get(i).getTitle().equals(title) && 
//				bookList.get(i).getAuthor().equals(author) ) {
//				removeBook = bookList.get(i);
//				bookList.remove(i);
//				break;
//			}
//		}
		
		// 2. for~ each문
		for(Book bk : bookList) {
		
			if( bk.getTitle().equals(title) && bk.getAuthor().equals(author)) {
				removeBook = bk;
				bookList.remove(bk);
				//bookList.remove(new Book(title,author, null, 0));
				break;
			}
		}
		
		return removeBook;
	}

	public int ascBook() {
		
		Collections.sort(bookList);
		
		return 1;
	}
}
