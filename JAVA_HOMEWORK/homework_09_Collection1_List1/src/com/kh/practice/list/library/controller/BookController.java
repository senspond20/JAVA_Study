package com.kh.practice.list.library.controller;

import java.util.ArrayList;
import java.util.Collections;

import com.kh.practice.list.library.model.vo.Book;

public class BookController {
	ArrayList<Book> bookList = new ArrayList<Book>();
	
	public BookController() {
		
		// �ʱ� �� 4�� �߰�;
		bookList.add(new Book("�ڹ��� ����","���� ��","��Ÿ",20000));
		bookList.add(new Book("���� ���� �˰���","������","��Ÿ",15000));
		bookList.add(new Book("��ȭ�� ���","������","�ι�",17500));
		bookList.add(new Book("�� ������","�ڽſ�","�Ƿ�",21000));
		
	}
	public void insertBook(Book bk) {
		bookList.add(bk);
	}
	
	// �ش� bookList �� �ּҰ� ��ȯ
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
		
		// �� �ݺ����ȿ��� ������ �迭ũ�Ⱑ �޶����°��� ���� 
		// Ư�� for~each������ break;�� �ʿ�
		
		// 1. for��
//		for(int i = 0; i < bookList.size(); i ++) {
//			if( bookList.get(i).getTitle().equals(title) && 
//				bookList.get(i).getAuthor().equals(author) ) {
//				removeBook = bookList.get(i);
//				bookList.remove(i);
//				break;
//			}
//		}
		
		// 2. for~ each��
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
