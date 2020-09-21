package com.multithreading;

import java.util.concurrent.CyclicBarrier;

public class CylicBarrierClientTest {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()+" has started..");
		
		CyclicBarrier cyclicBarrier=new CyclicBarrier(4);
		
		CyclicBarrierPassangerThread thread1=new CyclicBarrierPassangerThread(1000, cyclicBarrier, "Vivek Garg");
		CyclicBarrierPassangerThread thread2=new CyclicBarrierPassangerThread(2000, cyclicBarrier, "Prabhat");
		CyclicBarrierPassangerThread thread3=new CyclicBarrierPassangerThread(3000, cyclicBarrier, "Shubham");
		CyclicBarrierPassangerThread thread4=new CyclicBarrierPassangerThread(4000, cyclicBarrier, "Paras");
		
		CyclicBarrierPassangerThread thread5=new CyclicBarrierPassangerThread(1000, cyclicBarrier, "Raja");
		CyclicBarrierPassangerThread thread6=new CyclicBarrierPassangerThread(2000, cyclicBarrier, "Rani");
		CyclicBarrierPassangerThread thread7=new CyclicBarrierPassangerThread(3000, cyclicBarrier, "Raju");
		CyclicBarrierPassangerThread thread8=new CyclicBarrierPassangerThread(4000, cyclicBarrier, "Rahim");
		
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();
		thread6.start();
		thread7.start();
		thread8.start();
	}

}
