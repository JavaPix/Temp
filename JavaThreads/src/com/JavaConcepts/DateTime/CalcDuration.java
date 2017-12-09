package com.JavaConcepts.DateTime;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class CalcDuration {

	public static void main(String[] args) {
		Duration durationHrs1 = Duration.ofHours(1);
		System.out.println(durationHrs1.getSeconds());
		Duration durationHrs2 = Duration.of(1, ChronoUnit.HOURS);
		System.out.println(durationHrs2.getSeconds());
		LocalDateTime oldDate = LocalDateTime.of(2016, Month.AUGUST, 31, 9, 10, 45);
		LocalDateTime newDate = LocalDateTime.of(2016, Month.NOVEMBER, 10, 8, 21, 25);
		Duration duration = Duration.between(oldDate, newDate);
		System.out.println(duration.getSeconds());
	}
}
