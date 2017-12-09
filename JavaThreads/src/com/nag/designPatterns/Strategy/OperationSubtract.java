package com.nag.designPatterns.Strategy;

public class OperationSubtract implements Stratergy{

	@Override
	public int doOperation(int num1, int num2) {
		return num1-num2;
	}
	
}
