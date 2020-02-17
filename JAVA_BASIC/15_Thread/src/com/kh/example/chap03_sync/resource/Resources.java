package com.kh.example.chap03_sync.resource;

// ���� �ڿ��� �����ϴ� Ŭ����
public class Resources {
	private int data;
	private boolean empty = true; // data�� ���� ���� �� true;
	public Resources() {}
	
	// ��������
	// ����ȭ �� �ȿ��� �ڰ��ִ¾ָ� �ƿ��ִ¾� notify();
	
	public synchronized void getData() {
		while(empty) { // data �ʵ忡 ���� ���ٸ�
			
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// ����ȭ �� �� �ȿ��� �ٸ� �����尡 
			// ���� �����带 ����Ų��.
		}
		
		empty = true;
		System.out.println("�Һ��� : " + data + "�� ��ǰ�� �Һ��Ͽ����ϴ�.");
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
		System.out.println("������ : " + data + "��ǰ�� �����Ͽ����ϴ�.");
		notify();
	}
}
