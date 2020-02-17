package com.kh.example.chap03_sync.resource;

// 공유 자원을 제공하는 클래스
public class Resources {
	private int data;
	private boolean empty = true; // data에 값이 없을 때 true;
	public Resources() {}
	
	// 교착상태
	// 동기화 블럭 안에서 자고있는애를 꺠워주는애 notify();
	
	public synchronized void getData() {
		while(empty) { // data 필드에 값이 없다면
			
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// 동기화 된 블럭 안에서 다른 쓰레드가 
			// 현재 쓰레드를 대기시킨다.
		}
		
		empty = true;
		System.out.println("소비자 : " + data + "번 상품을 소비하였습니다.");
		notify();
	}
	public synchronized void setData(int data) {
		while(!empty) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		this.data = data;
		empty = false;
		System.out.println("생산자 : " + data + "상품을 생산하였습니다.");
		notify();
	}
}
