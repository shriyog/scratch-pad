package com.github.scratchpad.java.threading;

/**
 * @author Shriyog Ingale 22-Oct-2018
 */
public class Account {

	private int balance;

	public Account(int initialBalance) {
		this.balance = initialBalance;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int checkBalance() {
		return getBalance();
	}

	public void withdraw(int amount) {
		balance = balance - amount;
	}
}
