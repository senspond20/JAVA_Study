package com.kh.example.chap02_char.model.run;
import com.kh.example.chap02_char.model.dao.charDAO;

public class Run {
	public static void main(String[]args) {
		charDAO cd = new charDAO();
//		cd.fileSave();
		cd.fileOpen();
	}
}
