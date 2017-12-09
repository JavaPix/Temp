package com.JavaConcepts.FileIO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteUsingFileWriter {

	public static void main(String[] args) {
		String val = "JavaIO Concepts";
		File file = new File("F:/Hello.txt");
		FileWriter fr = null;
		try {
			fr = new FileWriter(file);
			fr.write(val);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
