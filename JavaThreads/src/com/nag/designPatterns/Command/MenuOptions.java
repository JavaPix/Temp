package com.nag.designPatterns.Command;

public class MenuOptions {

	ActionListener open;
	ActionListener save;
	
	public MenuOptions(ActionListener open, ActionListener save) {
		this.open=open;
		this.save=save;
	}
	
	public void menuOpen() {
		System.out.println("Open");
	}
	
	public void menuSave() {
		System.out.println("Save");
	}
}
