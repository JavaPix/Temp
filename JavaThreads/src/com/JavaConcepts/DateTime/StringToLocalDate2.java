package com.JavaConcepts.DateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class StringToLocalDate2 {

	public static void main(String[] args) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		String date = "2017-Nov-21";
		LocalDate localDate = LocalDate.parse(date, formatter);
		System.out.println(localDate);
		System.out.println(formatter.format(localDate));
	}
}
