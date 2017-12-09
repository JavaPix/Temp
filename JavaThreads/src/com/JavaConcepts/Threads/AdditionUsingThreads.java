package com.JavaConcepts.Threads;

public class AdditionUsingThreads extends Thread{

	int value;
	public void run(){
		value = 1+2;
	}

}
