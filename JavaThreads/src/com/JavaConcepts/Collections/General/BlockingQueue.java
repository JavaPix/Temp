package com.JavaConcepts.Collections.General;

import java.util.concurrent.ArrayBlockingQueue;

public class BlockingQueue {

	static class Message{
		private String msg;
		public Message(String msg) {
			this.msg=msg;
		}
		public String getMsg() {
			return msg;
		}
	}
	
	static class Producer implements Runnable{

		private java.util.concurrent.BlockingQueue<Message> queue;
		
		public Producer(java.util.concurrent.BlockingQueue<Message> queue) {
			this.queue=queue;
		}
		
		@Override
		public void run() {
			for(int i=0; i<100; i++) {
				Message msg = new Message(""+i);
				try {
					Thread.sleep(i);
					queue.put(msg);
					System.out.println("Produced: "+msg.getMsg());
				}catch(InterruptedException ex) {
					ex.printStackTrace();
				}
			}
			Message msg = new Message("exit");
			try {
				queue.put(msg);
			}catch(InterruptedException ex) {
				ex.printStackTrace();
			}
		}
		
	}
	
	public static void main(String[] args) {
		java.util.concurrent.BlockingQueue<Message> queue = new ArrayBlockingQueue<Message>(10);
		Producer producer = new Producer(queue);
		new Thread(producer).start();
		System.out.println("Blocking Queue has started");
	}
}
