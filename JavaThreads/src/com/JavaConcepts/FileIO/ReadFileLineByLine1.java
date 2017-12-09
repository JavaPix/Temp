package com.JavaConcepts.FileIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileLineByLine1 {

	public static void main(String[] args) throws IOException {
		File file = new File("F:/Hello.txt");
		readFile2(file);
	}
	
	public static void readFile2(File fn) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(fn));
		String line = null;
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}
	}
}
