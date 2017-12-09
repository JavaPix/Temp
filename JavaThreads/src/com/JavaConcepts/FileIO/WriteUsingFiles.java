package com.JavaConcepts.FileIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class WriteUsingFiles {

	public static void main(String[] args) {
		String val = "Java IO Concepts";
		try {
			Files.write(Paths.get("F:/Hello.txt"), val.getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
