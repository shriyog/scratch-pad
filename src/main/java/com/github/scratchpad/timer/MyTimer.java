package com.github.scratchpad.timer;

/**
 * @author Shriyog Ingale 29-Oct-2017
 */
public class MyTimer {

	private Callable callable;
	public <T extends Callable> MyTimer(T callable) {
		this.callable = callable;
	}

	public void setTimer(long waitTime) {
		new MyThread(waitTime, callable).start();
	}
}
