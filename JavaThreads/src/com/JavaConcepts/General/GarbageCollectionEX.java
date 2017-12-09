package com.JavaConcepts.General;

public class GarbageCollectionEX {

	public static void main(String[] args) {
		GarbageCollectionEX g1 = new GarbageCollectionEX();
		GarbageCollectionEX g2 = new GarbageCollectionEX();
		g1=null;
		System.gc();
		g2=null;
		Runtime.getRuntime().gc();
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Garbage collected");
	}
}
