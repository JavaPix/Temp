package com.nag.designPatterns.Command;

public class ActionSave implements ActionListener{

	private Document doc;
	
	public ActionSave(Document doc) {
		this.doc=doc;
	}
	
	@Override
	public void execute() {
		doc.save();
	}

}
