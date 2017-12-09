package com.JavaConcepts.DateTime;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentTimeStamp {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");
		// Via timestamp
		Timestamp timeStamp = new Timestamp(System.currentTimeMillis());
		System.out.println(timeStamp);
		// Via date
		Date date = new Date();
		System.out.println(new Timestamp(date.getTime()));
		System.out.println(timeStamp.getTime());
		System.out.println(sdf.format(timeStamp));
	}
}
