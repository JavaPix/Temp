package com.nag.designPatterns.Template;

public class Cricket extends Game{

	@Override
	void initialize() {
		System.out.println("Cricket Game Toss Time");
	}

	@Override
	void startPlay() {
		System.out.println("Cricket Game started");
	}

	@Override
	void endPlay() {
		System.out.println("Cricket Game end");
	}

	
}
