package com.nag.designPatterns.ChainOfResponsibility;

public class ConsoleLogger extends AbstractLogger{

	public ConsoleLogger(int level){
		this.level = level;
	}
	
	protected void write(String message){
		System.out.println("Standard console:: Logger: "+message);
	}
	
	
}
