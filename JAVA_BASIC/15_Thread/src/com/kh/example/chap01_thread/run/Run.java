package com.kh.example.chap01_thread.run;

import com.kh.example.chap01_thread.thread.Thread1;
import com.kh.example.chap01_thread.thread.Thread2;
import com.kh.example.chap01_thread.thread.Thread3;

public class Run {
	public static void main(String[] args) {
// ===========================================
		Thread1 thread1 = new Thread1(500);
	//	thread1.start();
// ===========================================
		Thread2 reference = new Thread2();
		Thread thread2 = new Thread(reference);
	//	thread2.start();
// ===========================================
		Thread3 thread3 = new Thread3();
		


//		thread1.start();
// java.lang.IllegalThreadStateException
// at java.lang.Thread.start(Unknown Source)
// �ѹ� ����� ������� �ٽ� ȣ�� �Ұ��ϴ�.

		System.out.println("t1 �켱 ���� : " + thread1.getPriority());
		System.out.println("t2 �켱 ���� : " + thread2.getPriority());
		System.out.println("t3 �켱 ���� : " + thread3.getPriority());
		
		thread1.setPriority(3);
		thread2.setPriority(Thread.MAX_PRIORITY); // 10
		thread2.setPriority(Thread.MIN_PRIORITY); // 1
		
		System.out.println("t1 �켱 ���� : " + thread1.getPriority());
		System.out.println("t2 �켱 ���� : " + thread2.getPriority());
		System.out.println("t3 �켱 ���� : " + thread3.getPriority());
		
		
		thread1.start();
		thread2.start();
		thread3.start();
		
		try {
			thread1.join();
			thread2.join();
			thread3.join();
			// �ڽ�(main thread)�� �ϴ� �۾��� ��� ���߰� 
			// �ٸ� ������(thread1, thread2,thread3) �� ������ �ð����� ����ǵ��� ��
			// (���� ����ǰ� �ִ� ��ġ�� ���� �ȴ�. )
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("--------------------- main end");

		
	}
}


//Thread thread4 = new Thread( ()->{
//for(int i = 0; i < 10; i++) {
//	System.out.println(Thread.currentThread().getName());	
//	try {
//		Thread.sleep(500);
//	} catch (InterruptedException e) {
//		e.printStackTrace();
//	}
//}});

//Runnable runnable = () -> {
//for (int i = 0; i < 30; i++) {
//    System.out.println(i);
//}
//};
//Thread thread = new Thread(runnable);
//thread.start();

//	thread3.start();
//thread4.setName("����");
//thread4.start();