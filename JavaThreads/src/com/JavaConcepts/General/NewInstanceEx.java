package com.JavaConcepts.General;

public class NewInstanceEx {

	String name = "Ramesh";
	public static void main(String[] args) {
		try {
			Class clas = Class.forName("NewInstanceEx");
			NewInstanceEx obj = (NewInstanceEx) clas.newInstance();
			System.out.println(obj.name);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}
}
