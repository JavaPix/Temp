package com.JavaConcepts.DateTime;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CurrentDateGregorian {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd HH:mm:ss");
		Calendar calneder = new GregorianCalendar(2017, 11, 23);
		System.out.println(sdf.format(calneder.getTime()));
	}
}
