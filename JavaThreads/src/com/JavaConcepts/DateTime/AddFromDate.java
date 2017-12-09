package com.JavaConcepts.DateTime;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class AddFromDate {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd");
		Calendar calendar = new GregorianCalendar(2017, 11, 22);
		calendar.add(Calendar.MONTH, 1);
		System.out.println(sdf.format(calendar.getTime()));
	}
}
