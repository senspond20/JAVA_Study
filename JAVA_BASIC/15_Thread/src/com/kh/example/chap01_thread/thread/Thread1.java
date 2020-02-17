package com.kh.example.chap01_thread.thread;

// ������ Ŭ������ ���
public class Thread1 extends Thread {
	private int time;
	public Thread1() {	}
	
	public Thread1(int time) {
		this.time = time;
	}
	@Override
	public void run() {
		setName("�Ϳ��� ������"); // ������ �̸� ����
		
		for(int i = 0; i < 10; i++) {
			System.out.println(getName() + " On ...");
			// getName() : ������ �̸� ��ȯ
			
			try {
				Thread.sleep(time);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			// sleep() : �����带 ������Ű�� �޼ҵ� (1000 : 1��)
		}
		
		
	}
	
	
}
