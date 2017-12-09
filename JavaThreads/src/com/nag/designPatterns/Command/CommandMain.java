package com.nag.designPatterns.Command;

public class CommandMain {

	public static void main(String[] args) {
	
		Document doc = new Document();
		ActionListener open = new ActionOpen(doc);
		ActionListener save = new ActionSave(doc);
		
		MenuOptions options = new MenuOptions(open, save);
		
		options.menuOpen();
		options.menuSave();
		
	}
}
