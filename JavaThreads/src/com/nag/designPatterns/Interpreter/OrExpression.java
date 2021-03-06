package com.nag.designPatterns.Interpreter;

public class OrExpression implements Expression{

	private Expression exp1 = null;
	private Expression exp2 = null;
	
	public OrExpression(Expression exp1, Expression exp2) {
		this.exp1=exp1;
		this.exp2=exp2;
	}
	
	public boolean intercept(String context) {
		return exp1.intercept(context)||exp2.intercept(context);
	}
}
