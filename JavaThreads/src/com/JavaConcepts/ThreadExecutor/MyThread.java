package com.JavaConcepts.ThreadExecutor;

public class MyThread implements Runnable{

	private int i;
	
	MyThread(int i){
		this.i=i;
	}
	
	public void run(){
		System.out.println("I m in the thread");
	}
}
