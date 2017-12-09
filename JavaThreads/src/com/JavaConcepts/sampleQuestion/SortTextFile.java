package com.JavaConcepts.sampleQuestion;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class SortTextFile {

	// SORT THE TEXT FILE
	public static void main(String[] args) {
		BufferedReader reader = null;
		BufferedWriter writer = null;
		ArrayList<String> lines = new ArrayList<String>();
		try {
			reader = new BufferedReader(new FileReader("U:\\Junks\\DOCS\\input.txt"));
			String currentLine = reader.readLine();
			while (currentLine != null) {
				lines.add(currentLine);
				currentLine = reader.readLine();
			}
			Collections.sort(lines);
			writer = new BufferedWriter(new FileWriter("U:\\Junks\\DOCS\\input.txt"));
			for (String line : lines) {
				writer.write(line);
				writer.newLine();
			}
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (writer != null) {
				try {
					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
