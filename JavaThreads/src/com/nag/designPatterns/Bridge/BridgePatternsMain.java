package com.nag.designPatterns.Bridge;

public class BridgePatternsMain {

	public static void main(String[] args) {
		QuestionFormat questions = new QuestionFormat("java programming");
		questions.q = new JavaQuestions();
		questions.newOne("What is polymorphism");
		questions.displayAll();
	}
}

