package com.kh.example.chap01_byte.model.run;

import com.kh.example.chap01_byte.model.dao.ByteDAO;

public class Run {
	public static void main(String[] args) {
		ByteDAO bd = new ByteDAO();
	//	bd.fileSave();
		bd.fileOpen();
		
		
	}
}
