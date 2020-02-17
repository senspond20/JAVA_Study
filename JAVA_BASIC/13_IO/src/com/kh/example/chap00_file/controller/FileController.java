package com.kh.example.chap00_file.controller;

import java.io.File;
import java.io.IOException;

public class FileController {
	public void method1() {
		// File f1 = new File(); // The constructor File() is undefined
		// 이런 기본생성자는 정의되지 않았다.
		try {
			File f1 = new File("test.txt");
			f1.createNewFile();

			File f2 = new File("c:/test/test.txt");
			f2.createNewFile();

			File f3 = new File("c:\\temp3\\temp2");
			File f4 = new File("c:\\temp3\\temp2\\test.txt");
		//	f4.createNewFile();
			f3.mkdirs();
			f4.createNewFile();
			f4.delete();
			System.out.println(f2.exists()); //true
			System.out.println(f3.exists()); //true
			System.out.println(f3.exists()); //true
			
			// 그외 메소드들
			System.out.println("파일 명 : " + f1.getName());
			System.out.println("저장 절대 경로 : " + f1.getAbsolutePath());
			System.out.println("저장 상대 경로 : " + f1.getPath());
			System.out.println("f1 파일 용량 : " + f1.length());
			System.out.println("f4 파일 용량 : " + f4.length());
			System.out.println("f1 상위 폴더 : " + f1.getParent());
			System.out.println("f4 상위 폴더 : " + f1.getParent());
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
