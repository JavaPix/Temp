package com.nag.designPatterns.StatePattern;

public class StartState implements State{

	@Override
	public void doAction(Context state) {
		state.setState(this);
	}

	public String toString() {
		return "Start state";
	}
}
