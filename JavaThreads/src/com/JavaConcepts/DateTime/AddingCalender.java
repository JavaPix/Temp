package com.JavaConcepts.DateTime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class AddingCalender {

	public static void main(String[] args) {
		DateFormat df = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date currentDate = new Date();
		System.out.println(df.format(currentDate));
		Calendar c = Calendar.getInstance();
		c.setTime(currentDate);
		c.add(Calendar.YEAR, 2017);
		c.add(Calendar.MONTH, 12);
		c.add(Calendar.DATE, 12);
		c.add(Calendar.HOUR, 12);
		c.add(Calendar.MINUTE, 12);
		c.add(Calendar.SECOND, 12);

		Date currentDateSet = c.getTime();
		System.out.println(df.format(currentDateSet));
	}
}
