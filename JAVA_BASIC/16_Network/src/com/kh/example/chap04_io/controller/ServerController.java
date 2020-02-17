package com.kh.example.chap04_io.controller;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
//import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import com.kh.example.chap04_io.model.vo.Person;

public class ServerController {
	public void startServer() {
		//1. ���� ��Ʈ ��ȣ ���ϱ�
		//2. ������ ���� ��ü ����
		//3. Ŭ���̾�Ʈ �ʿ��� ���� ��û�� ���� ��ٸ�
		//4. ��û�� ���� accept()�� ���� ��û ���� �� Ŭ���̾�Ʈ�� ���� ����
		//5. ����� ��Ʈ�� ����
		//6. ���� ��Ʈ������ ���� ����
		//7. �а� ����
		//8. ��� ����
		
		// 1. ���� ��Ʈ ��ȣ ���ϱ�
		int port = 8500;
		
		// 2. ������ ���� ��ü ����
		try {
			
			ServerSocket server = new ServerSocket(port);
			
			//3. Ŭ���̾�Ʈ �ʿ��� ���� ��û�� ���� ��ٸ�
			System.out.println("Ŭ���̾�Ʈ ��û�� ��ٸ��� �� ... ");
			
			//4. ��û�� ���� accept()�� ���� ��û ���� �� Ŭ���̾�Ʈ�� ���� ����
			Socket client = server.accept();
					
			//5. ����� ��Ʈ�� ����
			//6. ���� ��Ʈ������ ���� ����
			InputStream is = client.getInputStream();
			//OutputStream output = client.getOutputStream();	
			ObjectInputStream ois = new ObjectInputStream(is);
			
			//7. �а� ����
			Person message = null;
			while(true) {
				message = (Person)ois.readObject();
				if(message !=null) {
					System.out.println(client.getInetAddress().getHostAddress() + "�� ���� �޽��� : " + message);
				}else {
					break;
				}
			}
			//8. ��� ����
			ois.close();
			server.close();
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
