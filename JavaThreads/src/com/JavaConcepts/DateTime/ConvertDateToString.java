package com.JavaConcepts.DateTime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ConvertDateToString {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String date = sdf.format(new Date());
		System.out.println(date);
	}
}
