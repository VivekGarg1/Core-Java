package com.multithreading;

public class EvenNumberGenerator implements Runnable {

	private OddAndEvenNumberGenerator oddAndEvenNumberGenerator;
	private int totalNoInSeq;
	
	public EvenNumberGenerator(OddAndEvenNumberGenerator oddAndEvenNumberGenerator, int totalNoInSeq) {
		super();
		this.oddAndEvenNumberGenerator = oddAndEvenNumberGenerator;
		this.totalNoInSeq = totalNoInSeq;
	}

	@Override
	public void run() {
		for (int i = 2; i <=totalNoInSeq; i=i+2) {
			oddAndEvenNumberGenerator.printEvenNumber(i);
		}
	}

}
