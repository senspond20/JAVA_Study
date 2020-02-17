package com.kh.practice.file.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDAO {
	File f = null;

	public boolean checkName(String file) {
		f = new File(file);
		if (f == null) {
			return false;
		} else if (f.getName().equals(file)) {
			return true;
		} else {
			return false;
		}
		
//		try(FileReader fr = new FileReader(file) ){	
//			return true;
//		}catch(IOException e) {
//			return false;
//		}
		
		
	}

	// 파일명 , 데이터
	public void fileSave(String file, String s) {

		
		try (FileWriter bw = new FileWriter(file);) {
			f.createNewFile();
			bw.write(s);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public StringBuilder fileOpen(String file) {
		StringBuilder sb = new StringBuilder();
		try (BufferedReader br = new BufferedReader(new FileReader(file));) {

			String value;
			
			while ((value = br.readLine()) != null) {
				sb.append(value);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) { // java.io
			e.printStackTrace();
		}

		return sb;
	}

	public void fileEdit(String file, String s) {
		fileSave(file, s);
	}
}
