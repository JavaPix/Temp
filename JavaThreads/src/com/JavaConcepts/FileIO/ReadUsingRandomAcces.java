package com.JavaConcepts.FileIO;

import java.io.IOException;
import java.io.RandomAccessFile;

public class ReadUsingRandomAcces {

	public static void main(String[] args) throws IOException {
		RandomAccessFile file = new RandomAccessFile("F:/Hello.txt", "r");
		String strVal;
		while((strVal=file.readLine())!=null) {
			System.out.println(strVal);
		}
	}
}
