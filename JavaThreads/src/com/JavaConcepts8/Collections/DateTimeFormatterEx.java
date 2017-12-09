package com.JavaConcepts8.Collections;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterEx {

	public static void main(String[] args) {
		DateTimeFormatter sdf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate date1 = LocalDate.of(2017, 11, 11);
		LocalDate date2 = LocalDate.of(2017, 11, 15);
		if(date1.isAfter(date2)){
			System.out.println("Date1 is after date2");
		}
		if(date1.isBefore(date2)){
			System.out.println("Date1 is before date2");
		}
		if(date1.isEqual(date2)){
			System.out.println("Date1 is equal to Date2");
		}
		if(date1.compareTo(date2)>0){
			System.out.println("Date1 is after Date2");
		}
		if(date1.compareTo(date2)<0){
			System.out.println("Date1 is before Date2");
		}
	}
}
