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
		//1. 서버 포트 번호 정하기
		//2. 서버용 소켓 객체 생성
		//3. 클라이언트 쪽에서 접속 요청이 오길 기다림
		//4. 요청이 오면 accept()를 통해 요청 수락 후 클라이언트용 소켓 생성
		//5. 입출력 스트림 생성
		//6. 보조 스트림으로 성능 개선
		//7. 읽고 쓰기
		//8. 통신 종료
		
		// 1. 서버 포트 번호 정하기
		int port = 8500;
		
		// 2. 서버용 소켓 객체 생성
		try {
			
			ServerSocket server = new ServerSocket(port);
			
			//3. 클라이언트 쪽에서 접속 요청이 오길 기다림
			System.out.println("클라이언트 요청을 기다리는 중 ... ");
			
			//4. 요청이 오면 accept()를 통해 요청 수락 후 클라이언트용 소켓 생성
			Socket client = server.accept();
					
			//5. 입출력 스트림 생성
			//6. 보조 스트림으로 성능 개선
			InputStream is = client.getInputStream();
			//OutputStream output = client.getOutputStream();	
			ObjectInputStream ois = new ObjectInputStream(is);
			
			//7. 읽고 쓰기
			Person message = null;
			while(true) {
				message = (Person)ois.readObject();
				if(message !=null) {
					System.out.println(client.getInetAddress().getHostAddress() + "가 보낸 메시지 : " + message);
				}else {
					break;
				}
			}
			//8. 통신 종료
			ois.close();
			server.close();
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
