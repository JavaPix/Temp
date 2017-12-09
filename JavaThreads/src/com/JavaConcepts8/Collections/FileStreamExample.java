package com.JavaConcepts8.Collections;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileStreamExample {

	public static void main(String[] args) {
		String fileName="D:\\Junks\\DOCS\\input.txt";
		List<String> lst = new ArrayList<String>();
		Stream<String> stream;
		try {
			stream = Files.lines(Paths.get(fileName));
			lst = stream.filter(line->!line.startsWith("line1")).map(String::toUpperCase).collect(Collectors.toList());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
