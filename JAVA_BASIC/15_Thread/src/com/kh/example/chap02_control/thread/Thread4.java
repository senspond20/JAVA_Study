package com.kh.example.chap02_control.thread;

public class Thread4 implements Runnable{

	@Override
	public void run() {
		int count = 0;
		
		// count 가 10 미만이면서, 현재 스레드의 Interrupted 가 false인 경우 진행
		while(count < 10 && !Thread.currentThread().isInterrupted()) {
			try {
				Thread.sleep(1000);
				System.out.println((++count) + "초");
			} catch (InterruptedException e) {
				System.out.println(count + "초에 카운트 종료");
				
				// interrupted 가 발생하면, isInterrupted의 값이 true가 되지만
				// InterruptedException 은 isInterrupted의 값을 false 로 초기화한다.
				
				Thread.currentThread().interrupt();
				//break;
				//e.printStackTrace();
			}
		}
		
	}
	
}
