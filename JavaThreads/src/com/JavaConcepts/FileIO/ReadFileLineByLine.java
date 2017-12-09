package com.JavaConcepts.FileIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadFileLineByLine {
	public static void main(String[] args) throws IOException {
		File file = new File("F:/Hello.txt");
		readFile1(file);
	}

	public static void readFile1(File fn) throws IOException {
		FileInputStream fis = new FileInputStream(fn);
		BufferedReader br = new BufferedReader(new InputStreamReader(fis));
		String line = null;
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}
	}

	
}
