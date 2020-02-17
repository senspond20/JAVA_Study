package com.kh.example.chap03_sendExit.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
	public void startClient() {
		
		// 1) ������ IP�ּҿ� ��Ʈ��ȣ�� �Ű������� �Ͽ� Ŭ���̾�Ʈ�� ���� ��ü ����

		//192.168.10.168
		try {
			int port = 8500;
			String serverIP = InetAddress.getLocalHost().getHostAddress();
			Socket socket = new Socket(serverIP, port);
			
			if(socket !=null) {
				// 2.����� ��Ʈ�� ����
				InputStream input = socket.getInputStream();
				OutputStream output = socket.getOutputStream();
				BufferedReader br = new BufferedReader(new InputStreamReader(input));
				PrintWriter pw = new PrintWriter(output);
				
				Scanner sc = new Scanner(System.in);

				do{
					System.out.print("��ȭ �Է� : ");
					String message = sc.nextLine();
					
					pw.println(message);
					pw.flush();
					
					if(message.equals("exit")) {
						break;
					}
					String recieveMessage = br.readLine();
					System.out.println(recieveMessage);
				}while(true);
				
				br.close();
				pw.close();
				socket.close();
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e ) {
			e.printStackTrace();
		}
		
	}
}
