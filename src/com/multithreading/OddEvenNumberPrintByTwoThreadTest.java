package com.multithreading;

public class OddEvenNumberPrintByTwoThreadTest {

	public static void main(String[] args) {
		OddAndEvenNumberGenerator oddAndEvenNumberGenerator=new OddAndEvenNumberGenerator();
		OddNumberGenerator oddNumberGenerator=new OddNumberGenerator(oddAndEvenNumberGenerator, 20);
		EvenNumberGenerator evenNumberGenerator=new EvenNumberGenerator(oddAndEvenNumberGenerator, 20);
		
		Thread t1=new Thread(oddNumberGenerator,"Odd Thread");
		Thread t2=new Thread(evenNumberGenerator,"Even Thread");
		
		t1.start();
		t2.start();
	}

}
