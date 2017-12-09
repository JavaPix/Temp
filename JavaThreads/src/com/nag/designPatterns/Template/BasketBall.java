package com.nag.designPatterns.Template;

public class BasketBall extends Game{

	@Override
	void initialize() {
		System.out.println("BasketBall toss");
	}

	@Override
	void startPlay() {
		System.out.println("Basketball started");
	}

	@Override
	void endPlay() {
		System.out.println("Basketball end");
	}

}
