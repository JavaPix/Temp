package com.JavaConcepts8.Collections;

public class ImplRunnableInterface {

	public static void main(String[] args) {
		new Thread(() -> System.out.println("Implementing the Runnable!!! ")).start();
	}
}
