package com.interfaces;

public class PaymentInterfaceTest {

	public static void main(String[] args) {
		Payment payment=new CashPayment();
		payment.payment(150.0);
		
		payment=new CheckPayment();
		payment.payment(200.0);
		
		payment=new CreditCardPayment();
		payment.payment(250.0);
	}

}
