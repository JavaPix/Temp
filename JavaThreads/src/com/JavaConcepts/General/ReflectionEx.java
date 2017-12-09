package com.JavaConcepts.General;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionEx {

	private String name;
	
	public ReflectionEx() {
		
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public static void main(String[] args) {
		try {
			Constructor<ReflectionEx> constructor = ReflectionEx.class.getDeclaredConstructor();
			ReflectionEx refl = constructor.newInstance();
			refl.setName("Reflection Constructor");
			System.out.println(refl.name);
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
	}
}
