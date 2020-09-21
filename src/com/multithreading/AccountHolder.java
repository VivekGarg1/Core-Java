package com.multithreading;

public class AccountHolder implements Runnable {

	private Account account;

	public AccountHolder(Account account) {
		super();
		this.account = account;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 4; i++) {
			makeWithdrawal(2000);
			if(account.getBalance()<0)
				System.out.println("Account is overdrawn!!!");
		}
	}

	private synchronized void makeWithdrawal(int amount) {
		if(account.getBalance()>=amount) {
			System.out.println(Thread.currentThread().getName()+" is going to withdraw $"+amount);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		account.withdraw(amount);
		}
		else
			System.out.println("Not enough in account for "+Thread.currentThread().getName()+" to withdraw $"+amount);
	}

}
