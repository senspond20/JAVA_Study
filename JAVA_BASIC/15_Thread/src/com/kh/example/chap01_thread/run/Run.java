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
// 한번 종료된 스레드는 다시 호출 불가하다.

		System.out.println("t1 우선 순위 : " + thread1.getPriority());
		System.out.println("t2 우선 순위 : " + thread2.getPriority());
		System.out.println("t3 우선 순위 : " + thread3.getPriority());
		
		thread1.setPriority(3);
		thread2.setPriority(Thread.MAX_PRIORITY); // 10
		thread2.setPriority(Thread.MIN_PRIORITY); // 1
		
		System.out.println("t1 우선 순위 : " + thread1.getPriority());
		System.out.println("t2 우선 순위 : " + thread2.getPriority());
		System.out.println("t3 우선 순위 : " + thread3.getPriority());
		
		
		thread1.start();
		thread2.start();
		thread3.start();
		
		try {
			thread1.join();
			thread2.join();
			thread3.join();
			// 자신(main thread)이 하던 작업을 잠시 멈추고 
			// 다른 스레드(thread1, thread2,thread3) 가 지정된 시간동안 실행되도록 함
			// (내가 실행되고 있는 위치를 보면 된다. )
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
//thread4.setName("마이");
//thread4.start();