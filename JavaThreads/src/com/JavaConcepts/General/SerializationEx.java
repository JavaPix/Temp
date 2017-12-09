package com.JavaConcepts.General;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationEx {


	public static void main(String[] args) {
		Demo d = new Demo(1,"Serialize");
		String str = "file.ser";
		try {
			FileOutputStream fos = new FileOutputStream(str);
			ObjectOutputStream out = new ObjectOutputStream(fos);
			out.writeObject(d);
			out.close();
			fos.close();
			System.out.println("Object serialized");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
	
	static class Demo{
		public int a;
		public String b;
		
		public Demo(int a, String b) {
			this.a=a;
			this.b=b;
		}	
	}
}
