package com.github.scratchpad.java.threading;

/**
 * @author Shriyog Ingale 22-Oct-2018
 */
public class GreetingPrinter implements Runnable {

	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Welcome... thread " + Thread.currentThread().getName());
		}
	}

}
