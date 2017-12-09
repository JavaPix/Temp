package com.JavaConcepts.DateTime;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class ElapsedTimeUsingDate {

	public static void main(String[] args) throws InterruptedException {
		long startTime = new Date().getTime();
		TimeUnit.SECONDS.sleep(3);
		long endTime = new Date().getTime();
		System.out.println("Elapsed time: " + (endTime - startTime));
	}
}
