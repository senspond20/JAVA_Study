package com.kh.example.chap01_thread.thread;

public class Thread2 implements Runnable{
	
	// ������ ������� 2 : Runnable implements �ϱ�
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
