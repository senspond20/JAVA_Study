package com.kh.example.chap04_io.controller;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;

import com.kh.example.chap04_io.model.vo.Person;

public class ClientController {
	public ClientController() {
		// ��ü�� ���Ϸ� ����� ���� Stream ���� ( ���� �̸� : person.txt )

		try (FileOutputStream fos = new FileOutputStream("person.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);) {

			ArrayList<Person> list = new ArrayList<Person>();
			list.add(new Person("�ڽſ�", 20));
			list.add(new Person("���ǳ�", 30));
			list.add(new Person("������", 25));

			for (Person p : list) {
				oos.writeObject(p);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void startClient() {
	
		try {
			//1. ������ IP�ּҿ� ��Ʈ��ȣ�� �Ű������� �Ͽ� ���� ��ü ����
			String server = InetAddress.getLocalHost().getHostAddress();
			Socket socket = new Socket(server, 8500);
			
			if(socket != null) {
				//2. ����� ��Ʈ�� ����
				//3. ������Ʈ������ ���� ����
				ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.txt"));
				ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
				try {
					
					//4. �б� ����
					while(true) {
						Person p = (Person) ois.readObject();
						oos.writeObject(p);
					//	System.out.println(p + "�� ����");
					}
					
					
				}catch(ClassNotFoundException e){
					e.printStackTrace();
				}catch(EOFException e) {
					//5. ��� ���� 
					oos.writeObject(null);
					ois.close();
					oos.close();
					socket.close();
				}
			}
		}catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		
	}

}
