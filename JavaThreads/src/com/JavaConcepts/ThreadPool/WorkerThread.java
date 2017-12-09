package com.JavaConcepts.ThreadPool;

public class WorkerThread implements Runnable{

	private String command;
	
	public WorkerThread(String s){
		this.command=s;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" Start command "+command);
		processCommand();
		System.out.println(Thread.currentThread().getName()+" End");
		
	}
	
	private void processCommand(){
		try{
			Thread.sleep(1000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
	
}
