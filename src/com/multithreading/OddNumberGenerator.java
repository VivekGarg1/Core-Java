package com.multithreading;

public class OddNumberGenerator implements Runnable {

	private OddAndEvenNumberGenerator oddAndEvenNumberGenerator;
	private int totalNoInSeq;
	
	public OddNumberGenerator(OddAndEvenNumberGenerator oddAndEvenNumberGenerator, int totalNoInSeq) {
		super();
		this.oddAndEvenNumberGenerator = oddAndEvenNumberGenerator;
		this.totalNoInSeq = totalNoInSeq;
	}

	@Override
	public void run() {
		for (int i = 1; i <=totalNoInSeq; i=i+2) {
			oddAndEvenNumberGenerator.printOddNumber(i);
		}
	}

}
