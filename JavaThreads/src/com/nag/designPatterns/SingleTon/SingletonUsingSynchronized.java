package com.nag.designPatterns.SingleTon;

public class SingletonUsingSynchronized {

	private static SingletonUsingSynchronized INSTANCE;
	
	private  SingletonUsingSynchronized(){
		
	}
	
	public static synchronized SingletonUsingSynchronized getInstance(){
		if(INSTANCE==null){
			INSTANCE = new SingletonUsingSynchronized();
		}
		return INSTANCE;
	}
}
