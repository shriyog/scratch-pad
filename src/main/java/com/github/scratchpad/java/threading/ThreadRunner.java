package com.github.scratchpad.java.threading;

/**
 * @author Shriyog Ingale 22-Oct-2018
 */
public class ThreadRunner {

	public static void main(String[] args) {
		System.out.println("Creating a Job to run");
		Runnable job = new GreetingPrinter();
		Thread a = new Thread(job);
		a.setName("a");
		a.start();
		Thread b = new Thread(job);
		b.setName("b");
		b.start();
		System.out.println("Exiting main");
	}
}
