package com.JavaConcepts8.Collections;

public class BetterTypeInterface {

	
	public static class Data<T>{
		public static<T> T defaultValue(){
			return null;
		}
		public T getOrDefault(T value, T defaultValue){
			return (value != null)?value:defaultValue;
		}
	}
	
	public static void main(String[] args) {
		final Data<String> data = new Data<>();
		System.out.println(data.getOrDefault("22", Data.defaultValue()));
	}
}
