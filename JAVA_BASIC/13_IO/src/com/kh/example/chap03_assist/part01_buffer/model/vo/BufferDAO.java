package com.kh.example.chap03_assist.part01_buffer.model.vo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferDAO {
	
	
	public void input() {
		
	//	try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) 
		try(BufferedReader br = new BufferedReader(new FileReader("c_buffer.txt"));) 
		{
		//FileReader fr = new FileReader("c_buffer.txt");
		//BufferedReader br = new BufferedReader(fr);
			String value;
			while((value = br.readLine()) != null) {
				System.out.println(value);
			}
			
		}catch(FileNotFoundException e) {	
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	public void output() {

		// try ~ resource ��
		// �ҽ� ��Ʈ�� : ���� ��� ( ��� )
		try (FileWriter fw = new FileWriter("c_buffer.txt");
				// �ҽ� ��Ʈ���� ���ڱ�� (���)�̱⿡ ������Ʈ���� ���ڱ��(���) ���̿��� �Ѵ�.
				BufferedWriter bw = new BufferedWriter(fw);) {

			// �� ��ü�ε� �����͸� (���� �� �� ����)
			// ������ ���⿡ ��������� ��Ű�� �; ������Ʈ���� �� ������
			// �������� ���õ� ������Ʈ���� BufferedXXXXXX�ε�
			// ������ 4��.... => BufferedInputStream
			// BufferedReader
			// BufferedOutputStream
			// BufferedWriter
			// ���� ������ �������?
			// BufferedOutputStream bos = new BufferedOutputStream(fw);

			bw.write("�ȳ��ϼ���\n");
			bw.write("�ݰ����ϴ�\n");
			bw.write("����������\n");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
