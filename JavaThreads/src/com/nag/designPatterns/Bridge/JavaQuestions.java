package com.nag.designPatterns.Bridge;

import java.util.ArrayList;
import java.util.List;

public class JavaQuestions implements Question{

	private List<String> questions = new ArrayList<String>();
	private int current = 0;

	@Override
	public void nextQuestion() {
		questions.add("what is class?");
		questions.add("what is interface?");
		questions.add("what is abstraction?");
	}

	@Override
	public void previousQuestion() {
		if(current>0) {
			current--;
		}
	}

	@Override
	public void newQuestion(String q) {
		if(current<=questions.size()-1) {
			current++;
			System.out.println(current);
		}
	}

	public void displayAllQuestion() {
		for(String q: questions) {
			System.out.println(q);
		}
	}
}
