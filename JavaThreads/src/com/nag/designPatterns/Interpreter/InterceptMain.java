package com.nag.designPatterns.Interpreter;

public class InterceptMain {

	public static Expression getMaleExp() {
		Expression ramesh = new TerminalExpression("Ramesh");
		Expression suresh = new TerminalExpression("Suresh");
		return new OrExpression(ramesh, suresh);
	}
	
	public static Expression getFemaleExp() {
		Expression bhavya = new TerminalExpression("Bhavya");
		Expression ramya = new TerminalExpression("Ramya");
		return new AndExpression(bhavya, ramya);
	}
	
	public static void main(String[] args) {
		Expression isMale = getMaleExp();
		Expression isFemale = getFemaleExp();
		System.out.println(isMale.intercept("Suresh"));
		System.out.println(isFemale.intercept("Bhavya Ramya"));
	}
}
