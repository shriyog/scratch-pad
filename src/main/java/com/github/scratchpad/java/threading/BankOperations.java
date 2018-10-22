package com.github.scratchpad.java.threading;

/**
 * @author Shriyog Ingale 22-Oct-2018
 */
public class BankOperations implements Runnable {

	Account account = new Account(100);

	@Override
	public void run() {
		performTransaction();
	}

	public synchronized void performTransaction() {
		while (true) {
			System.out.println("Checking account balance");
			int balance = account.checkBalance();
			System.out.println("Account balance is " + balance);

			if (balance >= 10) {
				try {
					System.out.println("Sleeping");
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Withdrawing 10 from account");
				account.withdraw(10);
				System.out.println("New balance " + account.checkBalance());
			} else {
				System.out.println("Not enough money");
				break;
			}
		}

	}
}
