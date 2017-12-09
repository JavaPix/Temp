package com.JavaConcepts.General;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class DeSerializaionEx implements Serializable{

	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		Demo d = null;
		try {
			FileInputStream fis = new FileInputStream("file.ser");
			ObjectInputStream in = new ObjectInputStream(fis);
			 d = (Demo)in.readObject();
			 fis.close();
			 in.close();
			 System.out.println("Desearialize the object");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
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
