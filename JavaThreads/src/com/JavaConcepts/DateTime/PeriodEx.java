package com.JavaConcepts.DateTime;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class PeriodEx {

	public static void main(String[] args) {
		Period days = Period.ofDays(10);
		System.out.println(days.getDays());

		Period howmanydays = Period.of(1, 2, 3);
		System.out.println(howmanydays.getYears());
		System.out.println(howmanydays.getMonths());
		System.out.println(howmanydays.getDays());

		LocalDate oldDate = LocalDate.of(1982, Month.AUGUST, 31);
		LocalDate newDate = LocalDate.of(2016, Month.NOVEMBER, 9);

		System.out.println(oldDate);
		System.out.println(newDate);

		Period period = Period.between(oldDate, newDate);

		System.out.print(period.getYears() + " years,");
		System.out.print(period.getMonths() + " months,");
		System.out.print(period.getDays() + " days");
	}
}
