package com.kh.example.chap03_assist.part02_object.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import com.kh.example.chap03_assist.part02_object.model.vo.Member;

public class ObjectDAO {

	// 1 .입력인지 출력인지 먼저 정하고
	// 2. 파일인지 보고
	// 3.
	public void fileOpen() {
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d_object_member.txt"));) {

			Member[] mar = new Member[3];
			for (int i = 0; i < mar.length; i++) {
				mar[i] = (Member) ois.readObject();
			}
			for (Member m : mar) {
				System.out.println(m);
			}
		} catch (ClassNotFoundException e) { //java.lang  / 패키지가 다르다. IOException 에서 classNotFOundxx 예외까지 다 처리하지 못한다.
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {		// java.io
			e.printStackTrace();
		}

//		try(Scanner sc = new Scanner(System.in)){
//			
//		}catch(IOException e) {
//			e.printStackTrace();
//		}
	}

	public void fileSave() {
		// Member 객체배열 3개 짜리 만들기
		// user01 pass01 홍길동 hong777@kh.org 25 '남' 1250.7
		// user02 pass02 유관순 you31@kh.org 17 '여' 1221.6
		// user03 pass03 이순신 lee888@kh.org 22 '남' 1234.6
//		Member[] mb = new Member[3];
//		mb[0] = new Member("user01","pass01","홍길동","hong777@kh.org",25,'남',1250.7);
//		mb[1] = new Member("user02","pass02","유관순","you31@kh.org",17,'여',1221.6);
//		mb[2] = new Member("user03","pass03","이순신","lee888@kh.org",22,'남',1234.6);
//		
		Member[] mb = { new Member("user01", "pass01", "홍길동", "hong777@kh.org", 25, '남', 1250.7),
				new Member("user02", "pass02", "유관순", "you31@kh.org", 17, '여', 1221.6),
				new Member("user03", "pass03", "이순신", "lee888@kh.org", 22, '남', 1234.6), };
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d_object_member.txt"));) {

			for (int i = 0; i < mb.length; i++) {
				oos.writeObject(mb[i]);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
