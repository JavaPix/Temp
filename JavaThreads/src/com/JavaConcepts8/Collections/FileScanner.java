package com.JavaConcepts8.Collections;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileScanner {

	public static void main(String[] args) {
		String fileName="D:\\Junks\\DOCS\\input.txt";
		try {
			Scanner sc = new Scanner(new File(fileName));
			while(sc.hasNext()){
				System.out.println(sc.nextLine());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
