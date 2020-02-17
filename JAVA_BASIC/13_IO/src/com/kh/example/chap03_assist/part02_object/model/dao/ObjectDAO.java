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

	// 1 .�Է����� ������� ���� ���ϰ�
	// 2. �������� ����
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
		} catch (ClassNotFoundException e) { //java.lang  / ��Ű���� �ٸ���. IOException ���� classNotFOundxx ���ܱ��� �� ó������ ���Ѵ�.
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
		// Member ��ü�迭 3�� ¥�� �����
		// user01 pass01 ȫ�浿 hong777@kh.org 25 '��' 1250.7
		// user02 pass02 ������ you31@kh.org 17 '��' 1221.6
		// user03 pass03 �̼��� lee888@kh.org 22 '��' 1234.6
//		Member[] mb = new Member[3];
//		mb[0] = new Member("user01","pass01","ȫ�浿","hong777@kh.org",25,'��',1250.7);
//		mb[1] = new Member("user02","pass02","������","you31@kh.org",17,'��',1221.6);
//		mb[2] = new Member("user03","pass03","�̼���","lee888@kh.org",22,'��',1234.6);
//		
		Member[] mb = { new Member("user01", "pass01", "ȫ�浿", "hong777@kh.org", 25, '��', 1250.7),
				new Member("user02", "pass02", "������", "you31@kh.org", 17, '��', 1221.6),
				new Member("user03", "pass03", "�̼���", "lee888@kh.org", 22, '��', 1234.6), };
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
