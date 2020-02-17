package com.kh.example.chap02_char.model.dao;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class charDAO {

	public void fileOpen() {
		// FileReader fr = null;
		try (FileReader fr = new FileReader("b_char.txt")) {

			int value;
			while ((value = fr.read()) != -1) {
				System.out.print((char) value + " ");
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

//		finally {
//			try {
//			fr.close();
//			//fr = null;
//			}catch(IOException e) {
//				e.printStackTrace();
//			}
//		}
	}

	public void fileSave() {
		// try () �ڿ� ; �� �ٿ��� �ǰ� �Ⱥٿ��� ������, �ڿ� �Ǵٸ����� ������ �����ڷ� ; �־��ش�.
		try (FileWriter fw = new FileWriter("b_char.txt");) {
			fw.write("��, IO ���� ��մ� !! ");
			fw.write('A');
			fw.write(' ');
			char[] cArr = { 'a', 'p', 'p', 'l', 'e' };
			fw.write(cArr);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void fileSave2() {

		FileWriter fw = null;
		try {
			fw = new FileWriter("b_char.txt");

			fw.write("��, IO ���� ��մ� !! ");
			fw.write('A');
			fw.write(' ');
			char[] cArr = { 'a', 'p', 'p', 'l', 'e' };
			fw.write(cArr);

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
