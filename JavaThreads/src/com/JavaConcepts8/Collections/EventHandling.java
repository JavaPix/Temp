package com.JavaConcepts8.Collections;

import javax.swing.JButton;

public class EventHandling {

	public static void main(String[] args) {
		JButton show = new JButton("Show");
		show.addActionListener((e) -> {
			System.out.println("Event handling");
		});
	}
}
