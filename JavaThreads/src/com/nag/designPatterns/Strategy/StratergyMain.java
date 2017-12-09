package com.nag.designPatterns.Strategy;

public class StratergyMain {

	public static void main(String[] args) {
		
		Context context = new Context(new OperationMultiply());
		System.out.println("10*5= "+context.executeStratergy(10, 5));
		
		context = new Context(new OperationSubtract());
		System.out.println("10-5= "+context.executeStratergy(10, 5));
		
		context = new Context(new OperationAdd());
		System.out.println("10+5= "+context.executeStratergy(10, 5));
	}
}
