package com.github.scratchpad.java.threading;

/**
 * @author Shriyog Ingale 22-Oct-2018
 */
public class SynchronizationTest {

	public static void main(String[] args) {

		Runnable job = new BankOperations();

		Thread a = new Thread(job);
		a.start();

		Thread b = new Thread(job);
		b.start();
	}

}
