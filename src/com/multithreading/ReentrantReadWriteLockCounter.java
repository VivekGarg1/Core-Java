package com.multithreading;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReentrantReadWriteLockCounter {

	private final ReadWriteLock lock = new ReentrantReadWriteLock();
	private int count = 0;

	public void increment() {
		lock.writeLock().lock();
		try {
			count = count + 1;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (lock != null)
				lock.writeLock().unlock();
		}
	}

	public int getCount() {
		lock.readLock().lock();
		try {
			return count;
		} finally {
			if (lock != null)
				lock.readLock().unlock();
		}
	}
}
