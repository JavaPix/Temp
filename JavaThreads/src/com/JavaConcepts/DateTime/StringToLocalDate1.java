package com.JavaConcepts.DateTime;

import java.time.LocalDate;

public class StringToLocalDate1 {

	public static void main(String[] args) {
		String date = "2017-11-21";
		LocalDate localDate = LocalDate.parse(date);
		System.out.println(localDate);
	}
}
