package com.interfaces;

public class CreditCardPayment implements Payment {

	@Override
	public void payment(double amount) {
		System.out.println("Creditcard payment of Rs."+amount);
	}

}
