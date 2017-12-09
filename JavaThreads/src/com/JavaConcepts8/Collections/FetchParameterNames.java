package com.JavaConcepts8.Collections;

import java.lang.reflect.Parameter;

public class FetchParameterNames {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		java.lang.reflect.Method method = FetchParameterNames.class.getMethod("main",String[].class);
		for(Parameter parameter: method.getParameters()){
			System.out.println("Parameter: "+parameter.getName());
		}
	}
}
