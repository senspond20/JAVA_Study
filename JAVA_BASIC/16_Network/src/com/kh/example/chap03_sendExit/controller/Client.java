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
		
		// 1) 서버의 IP주소와 포트변호를 매개변수로 하여 클라이언트용 소켓 객체 생성

		//192.168.10.168
		try {
			int port = 8500;
			String serverIP = InetAddress.getLocalHost().getHostAddress();
			Socket socket = new Socket(serverIP, port);
			
			if(socket !=null) {
				// 2.입출력 스트림 생성
				InputStream input = socket.getInputStream();
				OutputStream output = socket.getOutputStream();
				BufferedReader br = new BufferedReader(new InputStreamReader(input));
				PrintWriter pw = new PrintWriter(output);
				
				Scanner sc = new Scanner(System.in);

				do{
					System.out.print("대화 입력 : ");
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
