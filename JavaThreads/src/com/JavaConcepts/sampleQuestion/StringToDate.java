package com.JavaConcepts.sampleQuestion;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDate {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String stringdate = "11/12/2012";
		Date d = sdf.parse(stringdate);
		System.out.println(d);
	}
	
}
