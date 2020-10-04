package com.collection;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

public class ObjectReferenceTest {

	public static void main(String[] args) {
		strongReference();
		weakReference();
		softReference();
		phantomReference();
	}

	private static void phantomReference() {
		Employee employee=new Employee(101, "Vivek Garg", 11000.0);
		ReferenceQueue<Employee> referenceQueue=new ReferenceQueue<Employee>();
		PhantomReference<Employee> phantomReference=new PhantomReference<Employee>(employee, referenceQueue);
		System.out.println("Phantom reference deleted");
		System.out.println(phantomReference.get());
	}

	private static void softReference() {
		Employee employee=new Employee(101, "Vivek Garg", 11000.0);
		SoftReference<Employee> softReference=new SoftReference<Employee>(employee);
		System.out.println(softReference.get());
		employee=null;
		System.gc();
		System.out.println(softReference.get());
	}

	private static void weakReference() {
		Employee employee=new Employee(101, "Vivek Garg", 11000.0);
		WeakReference<Employee> weakReference=new WeakReference<Employee>(employee);
		System.out.println(weakReference.get());
		employee=null;
		System.gc();
		System.out.println(weakReference.get());
	}

	private static void strongReference() {
		Employee employee=new Employee(101, "Vivek Garg", 11000.0);//Strong Reference
		employee=null;//eligible for gc
		System.out.println(employee);
	}

}
