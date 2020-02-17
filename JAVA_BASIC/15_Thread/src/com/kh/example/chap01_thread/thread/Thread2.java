package com.kh.example.chap01_thread.thread;

public class Thread2 implements Runnable{
	
	// 스레드 생성방법 2 : Runnable implements 하기
	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			// 
			System.out.println(Thread.currentThread().getName());
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
	}

}
