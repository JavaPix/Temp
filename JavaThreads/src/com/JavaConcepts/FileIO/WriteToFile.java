package com.JavaConcepts.FileIO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

public class WriteToFile {

	public static void main(String[] args) throws IOException {
		writeFile1();
	}
	
	public static void writeFile1() throws IOException{
		File out = new File("F:/Hello.txt");
		FileOutputStream fos = new FileOutputStream(out);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
			for(int i=0;i<10;i++){
				bw.write("something");
				bw.newLine();
			}
		bw.close();
	}
	
}
