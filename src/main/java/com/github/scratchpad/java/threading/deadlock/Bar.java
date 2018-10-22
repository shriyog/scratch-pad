package com.github.scratchpad.java.threading.deadlock;

/**
 * @author Shriyog Ingale 22-Oct-2018
 */
public class Bar implements Runnable {

	public static synchronized void fun() {
		System.out.println("Bar's fun");
		System.out.println("Waiting for foo's fun()");
		Foo.fun();
	}

	@Override
	public void run() {
		fun();
	}
}
