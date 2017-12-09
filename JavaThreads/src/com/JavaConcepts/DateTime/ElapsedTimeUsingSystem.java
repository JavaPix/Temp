package com.JavaConcepts.DateTime;

import java.util.concurrent.TimeUnit;

public class ElapsedTimeUsingSystem {

	public static void main(String[] args) throws InterruptedException {
		long startTime = System.nanoTime();
		TimeUnit.SECONDS.sleep(10);
		long endTime = System.nanoTime();
		long elapsedTime = endTime - startTime;
		System.out.println("Elapsed time: " + elapsedTime / 1000000);
	}
}
