package com.JavaConcepts.FileIO;

import java.io.File;

public class DeleteFile {

	public static void main(String[] args) {
		File file = new File("/home/Desktop/s1");
		
		if(file.delete()){
			System.out.println(file.getName()+"file is deleted ");
		}else{
			System.out.println("file is not deleted");
		}
			
	}
}
