package com.multithreading;

public class BusTicketBookingThread implements Runnable{

	private BusTicketCounter busTicketCounter;
	private String pName;
	private int noOfSeats;

	public BusTicketBookingThread(BusTicketCounter busTicketCounter, String pName, int noOfSeats) {
		super();
		this.busTicketCounter = busTicketCounter;
		this.pName = pName;
		this.noOfSeats = noOfSeats;
	}

	@Override
	public void run() {
		busTicketCounter.bookTicket(pName, noOfSeats);
	}
}
