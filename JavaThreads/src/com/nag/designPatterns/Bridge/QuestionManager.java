package com.nag.designPatterns.Bridge;

public class QuestionManager {

	protected Question q;
	public String catalog;
	public QuestionManager(String catalog) {
		this.catalog=catalog;
	}
	public void next() {
		q.nextQuestion();
	}
	public void previous() {
		q.previousQuestion();
	}
	public void newOne(String quest) {
		q.newQuestion(quest);
	}
	public void displayAll() {
		q.displayAllQuestion();
	}
}
