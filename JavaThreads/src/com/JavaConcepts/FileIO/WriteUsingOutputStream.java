package com.JavaConcepts.FileIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteUsingOutputStream {

	public static void main(String[] args) throws IOException {
		OutputStream os = null;
		String val = "Java IO Concepts";
		os = new FileOutputStream(new File("F:/Hello.txt"));
		os.write(val.getBytes(), 0, val.length());
	}
}
