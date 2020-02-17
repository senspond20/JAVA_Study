package com.kh.example.chap01_byte.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteDAO {

	// try with resource
	public void fileOpen() {
		// FileInputStream fis = null;
		try (FileInputStream fis = new FileInputStream("a_byte.txt");) {
			int value;
			while ((value = fis.read()) != -1) {
				System.out.print((char) value + " ");

			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void fileOpen2() {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("a_byte.txt");

			// 끝에 도달하면 리턴값으로 -1 을 반환한다.
//			while(fis.read() != -1) {
//				System.out.print((char)fis.read());
//			}

			int value;

			while ((value = fis.read()) != -1) {
				System.out.print((char) value + " ");
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void fileSave() {
		try (FileOutputStream fos = new FileOutputStream("a_byte.txt");) {
			fos.write(97);
			byte[] bArr = { 98, 99, 100, 101, 102, 103 };
			// b c d e f g
			fos.write(bArr);
			fos.write(bArr, 1, 3); // 1 index 부터 3개
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void fileSave2() {
		// try catch 를 안써도 되기는 하지만
		// 자바 doc에서 쓰도록 해놨다.
		FileOutputStream fos = null;
		//
		try {
			fos = new FileOutputStream("a_byte.txt"); // 덮어 써진다.
			// fos = new FileOutputStream("a_byte.txt",true); // 이어 써진다.

			fos.write(97);
			// Unhandled exception type IOException
			// IOException 이
			byte[] bArr = { 98, 99, 100, 101, 102, 103 };
			// b c d e f g
			fos.write(bArr);
			fos.write(bArr, 1, 3); // 1 index 부터 3개
			// cde

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();

		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// try문 안에 FileOutPutStream fos = new FileOutputStream("a_byte.txt")라고 넣으면
			// fos cannot be resolved 라는 오류 문구. -> FileOutputStream fos = null;
		}

		// } catch (FileNotFoundException e) {
		// Unreachable catch block for FileNotFoundException. It is already handled by
		// the catch block for IOException
		// FileNotFoundException 의 부모는 IOException 이기에
		// e.printStackTrace();

		// 자식부터 부모순으로 마지막에는 가장 최위에 있는 Exception클래스
		//

		// 스트림을 열였으면 꼭 무조건 닫아주어야 한다.
		// 안닫아도 에러는 나지는 않지만
		// 스트림이 많을때는 문제가 될 여지가 있다.
		// 무조건 수행해야될것이기에 finally 안에 넣는다.
	}

	public void fileClose() {

	}
}
