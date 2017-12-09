package com.JavaConcepts.Runtime;

import java.io.IOException;

public class RuntimeEx {

	public static void main(String[] args) {
		String notepad = "C:\\Program Files (x86)\\Notepad++\\notepad++.exe";
		System.out.println("Notepad is opening");
		try {
			Process process = Runtime.getRuntime().exec(notepad);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
