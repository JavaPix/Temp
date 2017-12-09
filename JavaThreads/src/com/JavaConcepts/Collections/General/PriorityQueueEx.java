package com.JavaConcepts.Collections.General;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

public class PriorityQueueEx {

	public static void main(String[] args) {
		Queue<Integer> priorityQueue = new PriorityQueue<Integer>(6);
		Random random = new Random();
		for(int i=0;i<6;i++) {
			priorityQueue.add(new Integer(random.nextInt(100)));
		}
		for(int i=0;i<6;i++) {
			int in = priorityQueue.poll();
			System.out.println(in);
		}
		Queue<Integer> customQueue = new PriorityQueue<Integer>(6);
		addToQueue(customQueue);
	}
	
	public static void addToQueue(Queue<Integer> customQueue) {
		Random random = new Random();
		for(int i=0; i<6; i++) {
			int id = random.nextInt(100);
			customQueue.add(id);
		}
	}
	
	public static void pollToQueue(Queue<Integer> customQueue) {
		while(true) {
			int cst = customQueue.poll();
			if(cst==0) {
				break;
			}
			System.out.println(cst);
		}
	}
}
