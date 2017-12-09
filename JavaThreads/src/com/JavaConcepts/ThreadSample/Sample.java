package com.JavaConcepts.ThreadSample;

public class Sample {

	public static void main(String[] args) {
		final Account account1 = new Account(1000);
		final Account account2 = new Account(2000);
		
		AccountService.transfer(account1, account2, 500);
		
		System.out.println(account1.getBalance());
		System.out.println(account2.getBalance());
		
	}
}
