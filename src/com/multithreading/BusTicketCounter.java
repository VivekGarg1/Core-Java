package com.multithreading;

public class BusTicketCounter {

	private int availableSeats=3;
	
	public synchronized void bookTicket(String pName,int noOfSeats) {
		if(availableSeats>=noOfSeats && noOfSeats>0) {
			System.out.println("Hi "+pName+" : "+noOfSeats+" Seats booked succsessfully!!!");
			availableSeats=availableSeats-noOfSeats;
		}
		else
			System.out.println("Hi "+pName+" : Seats not available!!!");
	}
	
}
