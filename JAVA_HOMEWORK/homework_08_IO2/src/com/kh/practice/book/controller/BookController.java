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
	
		// "book.txt" �� �Ű������� �޴� file ��ü�� ����
		f = new File(Book.FILE_NAME);
		
		// book.txt�� ���ٸ� ���ϻ���
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
