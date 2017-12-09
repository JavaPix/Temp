package com.JavaConcepts.General;

public class CliArgs {

	public static void main(String[] args) {
		if(args.length>0) {
			System.out.println("Command line arguments exist. Arguments are:");
			for(String s:args) {
				System.out.println(s);
			}
		}else {
			System.out.println("No command line arguments found");
		}
	}
}
