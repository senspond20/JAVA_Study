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

			// ���� �����ϸ� ���ϰ����� -1 �� ��ȯ�Ѵ�.
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
			fos.write(bArr, 1, 3); // 1 index ���� 3��
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void fileSave2() {
		// try catch �� �Ƚᵵ �Ǳ�� ������
		// �ڹ� doc���� ������ �س���.
		FileOutputStream fos = null;
		//
		try {
			fos = new FileOutputStream("a_byte.txt"); // ���� ������.
			// fos = new FileOutputStream("a_byte.txt",true); // �̾� ������.

			fos.write(97);
			// Unhandled exception type IOException
			// IOException ��
			byte[] bArr = { 98, 99, 100, 101, 102, 103 };
			// b c d e f g
			fos.write(bArr);
			fos.write(bArr, 1, 3); // 1 index ���� 3��
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
			// try�� �ȿ� FileOutPutStream fos = new FileOutputStream("a_byte.txt")��� ������
			// fos cannot be resolved ��� ���� ����. -> FileOutputStream fos = null;
		}

		// } catch (FileNotFoundException e) {
		// Unreachable catch block for FileNotFoundException. It is already handled by
		// the catch block for IOException
		// FileNotFoundException �� �θ�� IOException �̱⿡
		// e.printStackTrace();

		// �ڽĺ��� �θ������ ���������� ���� ������ �ִ� ExceptionŬ����
		//

		// ��Ʈ���� �������� �� ������ �ݾ��־�� �Ѵ�.
		// �ȴݾƵ� ������ ������ ������
		// ��Ʈ���� �������� ������ �� ������ �ִ�.
		// ������ �����ؾߵɰ��̱⿡ finally �ȿ� �ִ´�.
	}

	public void fileClose() {

	}
}
