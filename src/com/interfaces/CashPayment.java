package com.interfaces;

public class CashPayment implements Payment {

	@Override
	public void payment(double amount) {
		System.out.println("Cash payment of Rs."+amount);
	}

}
