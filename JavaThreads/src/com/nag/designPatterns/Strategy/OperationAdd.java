package com.nag.designPatterns.Strategy;

public class OperationAdd implements Stratergy{

	@Override
	public int doOperation(int num1, int num2) {
		return num1+num2;
	}

}
