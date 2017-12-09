package com.JavaConcepts.FileIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadUsingBufferedReader {

	public static void main(String[] args) throws IOException {
		File file = new File("F:/Hello.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String line;
		System.out.println("Reading the file using Buffered Reader");
		while((line=br.readLine())!=null) {
			System.out.println(line);
		}
		br.close();
		fr.close();
	}
}
