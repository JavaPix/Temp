package com.nag.designPatterns.Composite;

public class CompositeMain {

	public static void main(String[] args) {
		Client client = new Client();
		client.setData("The","Date");
		client.printData();
		client.setData("This", "Composite");
		client.printData();
	}
}
