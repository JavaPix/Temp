package com.JavaConcepts.FileIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadUsingFiles {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("F:/Hello.txt");
		byte[] bytes = Files.readAllBytes(path);
		System.out.println(new String(bytes));
	}
}
