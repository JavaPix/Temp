package com.nag.designPatterns.Prototype;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrototypeMain {

	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println("Enter the Employee details: ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int id = Integer.parseInt(br.readLine());
		String name = br.readLine();
		int salary = Integer.parseInt(br.readLine());
		Employees e1 = new Employees(id, name, salary);
		e1.showRecord();
		Employees emp = (Employees)e1.getClone();
		emp.showRecord();
	}
}
