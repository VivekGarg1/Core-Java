package com.statickeyword;

public class CounterTest {

	private static int counter;
	
	public CounterTest(){
		counter++;
	}
	public static void main(String[] args) {
		new CounterTest();
		System.out.println(CounterTest.counter);
		new CounterTest();
		System.out.println(CounterTest.counter);
		new CounterTest();
		System.out.println(CounterTest.counter);
	}

}
