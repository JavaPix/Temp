package com.JavaConcepts.DateTime;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class SetTheDateManually {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd HH:mm:ss");
		Calendar calendar = new GregorianCalendar(2017, 1, 28, 01, 06, 03);
		calendar.set(Calendar.MINUTE, 9);
		calendar.set(Calendar.YEAR, 2018);
		calendar.set(Calendar.SECOND, 20);
		System.out.println(sdf.format(calendar.getTime()));
	}
}
