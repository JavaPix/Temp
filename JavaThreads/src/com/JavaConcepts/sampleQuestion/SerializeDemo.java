package com.JavaConcepts.sampleQuestion;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeDemo {

	public static void main(String[] args) {
		Dog e = new Dog();
		e.setName("bulldog");
		e.setColor("white");
		e.setWeight(10);
		
		try{
			FileOutputStream fileOut = new FileOutputStream("./dog.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(e);
			out.close();
			fileOut.close();
			System.out.println("Serialized dog is saved in ./dog.ser");
		}catch(IOException i){
			i.printStackTrace();
		}
		
		e = null;
		
		try{
			FileInputStream fileIn = new FileInputStream("./dog.ser");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			e = (Dog) in.readObject();
			in.close();
			fileIn.close();
		}catch(IOException i){
			i.printStackTrace();
			return;
		}catch (Exception e2) {
			System.out.println("Dog class not found");
			e2.printStackTrace();
			return;
		}
		
		System.out.println("\n Deserialized dog...");
		System.out.println("Name: "+e.getName());
		System.out.println("Color: "+e.getColor());
		System.out.println("Weight: "+e.getWeight());
		e.introduce();
	}
}
