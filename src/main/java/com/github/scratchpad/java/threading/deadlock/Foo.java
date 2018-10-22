package com.github.scratchpad.java.threading.deadlock;

/**
 * @author Shriyog Ingale 22-Oct-2018
 */
public class Foo implements Runnable {

	public static synchronized void fun() {
		System.out.println("Foo's fun");
		System.out.println("Waiting for bar's fun()");
		try {
			// Sleep guarantees deadlock situation here since the other thread -
			// bar is started and acquires lock on it's fun method and awaits
			// unlock on the current fun() method.
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Bar.fun();
	}

	@Override
	public void run() {
		fun();
	}
}
