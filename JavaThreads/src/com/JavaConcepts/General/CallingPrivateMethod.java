package com.JavaConcepts.General;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class CallingPrivateMethod {

	public static void main(String[] args) {
		try {
			Class c = A.class;
			Object o = c.newInstance();
			Method m = c.getDeclaredMethod("message",null);
			m.setAccessible(true);
			m.invoke(o, null);
		}  catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		
	}
	
	static class A{
		private void message() {
			System.out.println("Java");
		}
	}
	
}
