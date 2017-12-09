package com.JavaConcepts.DateTime;

import java.sql.Timestamp;
import java.time.Instant;

public class ConvertTimeStamptoInstant {

	public static void main(String[] args) {
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		System.out.println(timestamp);
		System.out.println(timestamp.getTime());
		Instant instant = timestamp.toInstant();
		System.out.println(instant.toEpochMilli());
	}
}
