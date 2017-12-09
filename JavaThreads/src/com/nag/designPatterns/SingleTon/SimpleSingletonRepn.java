package com.nag.designPatterns.SingleTon;

public class SimpleSingletonRepn {

	private static SimpleSingletonRepn INSTANCE;
	
	private SimpleSingletonRepn(){
		
	}
	
	static SimpleSingletonRepn getInstance(){
		INSTANCE = new SimpleSingletonRepn();
		return INSTANCE;
	}
	
}
