package com.kh.practice.book.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

import com.kh.practice.book.model.dao.BookDAO;
import com.kh.practice.book.model.vo.Book;

public class BookController {
	BookDAO bd = new BookDAO();
	File f = null;
	
	public void makeFile() {
	
		// "book.txt" 를 매개변수로 받는 file 객체를 생성
		f = new File(Book.FILE_NAME);
		
		// book.txt가 없다면 파일생성
		if (!f.exists()) {		
			try {
				f.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	public void deleteFile() {
		f.delete();
	}
	public void fileSave(Book[] bArr) {
		bd.fileSave(bArr);

	}

	public Book[] fileRead() {
		return bd.fileRead();
	}
}
