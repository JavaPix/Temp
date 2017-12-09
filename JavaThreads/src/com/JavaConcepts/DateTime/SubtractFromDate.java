package com.JavaConcepts.DateTime;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class SubtractFromDate {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd");
		Calendar calendar = new GregorianCalendar(2017, 12, 12);
		calendar.add(Calendar.MONTH, -10);
		System.out.println(sdf.format(calendar.getTime()));
	}
}
