package com.kh.example.chap01_thread.thread;

// 쓰레드 클래스를 상속
public class Thread1 extends Thread {
	private int time;
	public Thread1() {	}
	
	public Thread1(int time) {
		this.time = time;
	}
	@Override
	public void run() {
		setName("귀여운 스레드"); // 스레드 이름 지정
		
		for(int i = 0; i < 10; i++) {
			System.out.println(getName() + " On ...");
			// getName() : 스레드 이름 반환
			
			try {
				Thread.sleep(time);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			// sleep() : 스레드를 지연시키는 메소드 (1000 : 1초)
		}
		
		
	}
	
	
}
