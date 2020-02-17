package com.kh.practice.file.controller;

import com.kh.practice.file.dao.FileDAO;

public class FileController {
	FileDAO fd = new FileDAO();
	public boolean checkName(String file) {
		return fd.checkName(file);
	}
	public void fileSave(String file, String s) {
		fd.fileSave(file, s);
	}
	public StringBuilder fileOpen(String file) {
	//	StringBuilder sb = fd.fileOpen(file);
	//	return sb;
		return fd.fileOpen(file);
	}
	public void fileEdit(String file, String s) {
		fd.fileEdit(file, s);
	}
}

