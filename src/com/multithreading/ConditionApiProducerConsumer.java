package com.multithreading;

import java.util.Random;
import java.util.Stack;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ConditionApiProducerConsumer {

	private Stack<Integer> stack=new Stack<>();
	private final int capacity=5;
	private Lock lock=new ReentrantLock();
	private Condition stackEmptyCondition=lock.newCondition();
	private Condition stackFullCondition=lock.newCondition();
	
	public void pushToStack() throws InterruptedException {
		lock.lock();
		try {
			while(stack.size()==capacity)
				stackFullCondition.await();
			Random random=new Random();
			Integer data = random.nextInt(100);
			stack.push(data);
			System.out.println("Produced: "+data);
			Thread.sleep(1000);
			stackEmptyCondition.signalAll();
		} finally {
			lock.unlock();
		}
	}
	
	public void popFromStack()throws InterruptedException {
		try {
			lock.lock();
			while(stack.size()==0)
				stackEmptyCondition.await();
			Integer data = stack.pop();
			System.out.println("Consumed: "+data);
			Thread.sleep(1000);
			stackFullCondition.signalAll();
		} finally {
			lock.unlock();
		}
	}
}
