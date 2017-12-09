package com.JavaConcepts.DateTime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ConvertStringToDate {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
		String dateString = "20-11-2017 12:01:54";
		Date date = sdf.parse(dateString);
		System.out.println(date);
	}
}
