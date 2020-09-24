package com.interfaces;

public class CheckPayment implements Payment {

	@Override
	public void payment(double amount) {
		System.out.println("Check payment of Rs."+amount);
	}

}
