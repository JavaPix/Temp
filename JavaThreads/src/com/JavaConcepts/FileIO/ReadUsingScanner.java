package com.JavaConcepts.FileIO;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class ReadUsingScanner {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("F:/Hello.txt");
		Scanner scanner = new Scanner(path);
		System.out.println("Read text file using Scanner");
		while(scanner.hasNext()) {
			String line = scanner.nextLine();
			System.out.println(line);
		}
		scanner.close();
	}
}
