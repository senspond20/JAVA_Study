package com.kh.practice.book.model.dao;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.kh.practice.book.model.vo.Book;
import com.kh.practice.modul.DateConversion;

public class BookDAO {

	public static Book[] bArr = new Book[10];
	public static int count = 0;
	DateConversion dc = new DateConversion();
	
	public BookDAO() {
		for (int i = 0; i < bArr.length; i++) {
			bArr[i] = null;
		}
	}

	public void fileSave(Book[] bArr) {
		try (FileOutputStream fos = new FileOutputStream(Book.FILE_NAME);
				ObjectOutputStream oos = new ObjectOutputStream(fos);) {

			for (int i = 0; i < bArr.length; i++) {
				if(bArr[i] != null) {
				oos.writeObject(bArr[i]);
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException ie) {
			ie.printStackTrace();
		}
	}

	public Book[] fileRead() {
		try (FileInputStream fis = new FileInputStream(Book.FILE_NAME);
				ObjectInputStream ois = new ObjectInputStream(fis);) {

			for (int i = 0; i < bArr.length; i++) {
				bArr[i] = (Book) ois.readObject();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (EOFException e) {
			//System.out.println("#더이상 파일 읽을게 없다능");  // 테스트: 주석처리
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return bArr;
	}

	public void sample() {

//		fileSave(bArr);
//		Book[] read = fileRead();
//		for(int i = 0; i < read.length; i++) {
//		System.out.println(read[i].toString());
//		}

		bArr[0] = new Book("여행의이유", "김영하", 13500, dc.strToCal("2019-04-17"), 0.1);
		bArr[1] = new Book("곰돌이 푸", "곰돌이 푸", 12000, dc.strToCal("2018-03-12"), 0.1);
		bArr[2] = new Book("습관의 힘", "제임스 클리어", 16000, dc.strToCal("2019-02-26"), 0.1);

		fileSave(bArr);
		Book[] read = fileRead();
		for (Book data : read) {
			System.out.println(data.toString());
		}
	}
	

}
