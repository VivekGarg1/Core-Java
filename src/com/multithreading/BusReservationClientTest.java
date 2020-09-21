package com.multithreading;

public class BusReservationClientTest {

	public static void main(String[] args) {
		BusTicketCounter busTicketCounter=new BusTicketCounter();
		
		BusTicketBookingThread r1=new BusTicketBookingThread(busTicketCounter, "Vivek Garg", 2);
		BusTicketBookingThread r2=new BusTicketBookingThread(busTicketCounter, "Prabhat", 2);
		
		Thread t1=new Thread(r1);
		Thread t2=new Thread(r2);
		
		t1.start();
		t2.start();
	}

}
