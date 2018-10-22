package com.github.scratchpad.java.threading.deadlock;

/**
 * @author Shriyog Ingale 22-Oct-2018
 */
public class DeadlockCreator {

	public static void main(String[] args) {

		Thread foo = new Thread(new Foo());
		Thread bar = new Thread(new Bar());

		foo.start();
		bar.start();

	}
}
