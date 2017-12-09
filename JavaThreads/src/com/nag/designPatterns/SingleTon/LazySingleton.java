package com.nag.designPatterns.SingleTon;

public class LazySingleton {

	private LazySingleton(){
		
	}
	
	private static LazySingleton single;
	
	public static LazySingleton getInstance(){
		
		single = new LazySingleton();
		
		return single;
	}

}
