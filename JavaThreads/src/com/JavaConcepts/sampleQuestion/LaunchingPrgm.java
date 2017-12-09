package com.JavaConcepts.sampleQuestion;

public class LaunchingPrgm {

	// launching a program
	public static void main(String[] args) {
		Runtime runtime = Runtime.getRuntime();
		try {
			runtime.exec("C:\\Program Files (x86)\\Notepad++\\notepad++.exe");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
