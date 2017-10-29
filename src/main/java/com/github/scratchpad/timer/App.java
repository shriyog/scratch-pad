package com.github.scratchpad.timer;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Before starting timer ...");

		new MyTimer(new Callable() {
			public void callBack() {
				System.out.println("Inside callback ... timer is triggered");
			}
		}).setTimer(3000);

		System.out.println("After starting timer...");
	}
}
