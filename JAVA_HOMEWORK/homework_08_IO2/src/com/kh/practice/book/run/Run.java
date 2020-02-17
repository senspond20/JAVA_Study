package com.kh.practice.book.run;

//import com.kh.practice.book.controller.BookController;
//import com.kh.practice.book.model.dao.BookDAO;
import com.kh.practice.book.view.BookMenu;

public class Run {
	public static void main(String[] args) {
//		 BookController bc = new BookController();
//		 BookDAO bDAO = new BookDAO();
//		 bc.makeFile();
//		 bDAO.sample();

		BookMenu bm = new BookMenu();
		bm.mainMenu();
	}
}
