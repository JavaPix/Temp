package com.JavaConcepts.General;

import java.util.Locale;

public class LocaleExample {

	public static void main(String[] args) {
		Locale locale = Locale.getDefault();
		System.out.println(locale.getCountry());
		System.out.println(locale.getVariant());
		System.out.println(locale.getDisplayCountry());
	}
}
