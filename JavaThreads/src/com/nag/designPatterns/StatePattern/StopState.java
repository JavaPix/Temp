package com.nag.designPatterns.StatePattern;

public class StopState implements State{

	@Override
	public void doAction(Context context) {
		context.setState(this);
	}

	public String toString() {
		return "stop state";
	}
}
