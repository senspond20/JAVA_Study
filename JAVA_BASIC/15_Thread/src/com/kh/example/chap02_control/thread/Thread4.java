package com.kh.example.chap02_control.thread;

public class Thread4 implements Runnable{

	@Override
	public void run() {
		int count = 0;
		
		// count �� 10 �̸��̸鼭, ���� �������� Interrupted �� false�� ��� ����
		while(count < 10 && !Thread.currentThread().isInterrupted()) {
			try {
				Thread.sleep(1000);
				System.out.println((++count) + "��");
			} catch (InterruptedException e) {
				System.out.println(count + "�ʿ� ī��Ʈ ����");
				
				// interrupted �� �߻��ϸ�, isInterrupted�� ���� true�� ������
				// InterruptedException �� isInterrupted�� ���� false �� �ʱ�ȭ�Ѵ�.
				
				Thread.currentThread().interrupt();
				//break;
				//e.printStackTrace();
			}
		}
		
	}
	
}
