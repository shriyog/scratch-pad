package com.github.scratchpad.timer;

/**
 * @author Shriyog Ingale
 * 29-Oct-2017
 */
public class MyThread extends Thread {

	private long millis;
	private Callable callable;
	
	public <T extends Callable> MyThread(long millis, T callable) {
		this.millis = millis;
		this.callable = callable;
	}

	public void run() {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		callable.callBack();
	}

}
