package com.JavaConcepts.FileIO;

import java.io.File;

public class Maker {

	public static void main(String[] args) {
		try{
			File dir = new File("dir3");
			dir.mkdir();
			File file = new File(dir,"file3");
			file.createNewFile();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
