package com.nag.designPatterns.Interpreter;

public class TerminalExpression implements Expression{

	private String data;
	
	public TerminalExpression(String data) {
		this.data=data;
	}

	@Override
	public boolean intercept(String context) {
		if(context.contains(data)) {
			return true;
		}
		return false;
	}
	
}
