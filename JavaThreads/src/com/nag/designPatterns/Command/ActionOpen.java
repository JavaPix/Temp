package com.nag.designPatterns.Command;

public class ActionOpen implements ActionListener{

	private Document doc;
	
	public ActionOpen(Document doc) {
		this.doc=doc;
	}

	@Override
	public void execute() {
		doc.open();
	}
	
}
