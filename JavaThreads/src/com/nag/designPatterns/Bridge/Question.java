package com.nag.designPatterns.Bridge;

public interface Question {

	public void nextQuestion();
	public void previousQuestion();
	public void newQuestion(String q);
	public void displayAllQuestion();
}
