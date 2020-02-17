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

		// try ~ resource 문
		// 소스 스트림 : 문자 기반 ( 출력 )
		try (FileWriter fw = new FileWriter("c_buffer.txt");
				// 소스 스트림이 문자기반 (출력)이기에 보조스트림도 문자기반(출력) 형이여야 한다.
				BufferedWriter bw = new BufferedWriter(fw);) {

			// 이 자체로도 데이터를 (저장 할 수 있음)
			// 하지만 여기에 성능향상을 시키고 싶어서 보조스트림을 달 예정임
			// 성능향상과 관련된 보조스트림은 BufferedXXXXXX인데
			// 종류가 4개.... => BufferedInputStream
			// BufferedReader
			// BufferedOutputStream
			// BufferedWriter
			// 이중 무엇을 써야하지?
			// BufferedOutputStream bos = new BufferedOutputStream(fw);

			bw.write("안녕하세요\n");
			bw.write("반갑습니다\n");
			bw.write("저리가세요\n");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
