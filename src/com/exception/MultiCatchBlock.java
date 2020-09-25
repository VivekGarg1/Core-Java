package com.exception;

public class MultiCatchBlock {

	public void calculate(int i) {
		int arr[] = { 0 };
		try {
			int b = 7 / arr[i];
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		MultiCatchBlock multiCatchBlock = new MultiCatchBlock();
		multiCatchBlock.calculate(0);
		multiCatchBlock.calculate(2);
	}
}
