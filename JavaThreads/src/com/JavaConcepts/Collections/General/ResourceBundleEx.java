package com.JavaConcepts.Collections.General;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.ResourceBundle.Control;

public class ResourceBundleEx {

	public static void main(String[] args) {
		ResourceBundle.Control rb = ResourceBundle.Control.getControl(Control.FORMAT_DEFAULT);
		System.out.println(rb.getTimeToLive("HI", Locale.US));
		
		//we have a resource file hello_en_US.properties
	}
}
