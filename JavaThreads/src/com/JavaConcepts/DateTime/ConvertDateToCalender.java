package com.JavaConcepts.DateTime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ConvertDateToCalender {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
		String dateInString = "21-11-2017 12:34:45";
		Date date = sdf.parse(dateInString);
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.getTime());
	}
}
