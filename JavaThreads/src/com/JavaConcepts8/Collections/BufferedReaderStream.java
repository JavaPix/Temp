package com.JavaConcepts8.Collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BufferedReaderStream {

	public static void main(String[] args) {
		String fileName="D:\\Junks\\DOCS\\input.txt";
		List<String> lst = new ArrayList<String>();
		BufferedReader br;
		try {
			br = Files.newBufferedReader(Paths.get(fileName));
			lst = br.lines().collect(Collectors.toList());
		} catch (IOException e) {
			e.printStackTrace();
		}
		lst.forEach(System.out::println);
	}
}
