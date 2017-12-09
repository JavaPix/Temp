package com.JavaConcepts.DataStructures;

public class Recursion {

	public static void main(String[] args) {
		
		Recursion  recursionTool = new Recursion();
		recursionTool.calculateSquaresToPrint(10);
		System.out.println("\n Triangular Number: "+recursionTool.getTriangularNum(3)+"\n");
		System.out.println("GET TRIANGULAR NUMBER");
		System.out.println("Factorial: "+recursionTool.getFactorial(3));
	}
	
	public int getTriangularNum(int number){
		int triangularNumber = 0;
		while(number>0){
			triangularNumber = triangularNumber+number;
			number--;
		}
		return triangularNumber;
	}
	
	public int getTriangularNumR(int number){
		System.out.println("Method "+number);
		if(number==1){
			System.out.println("Returned 1");
			return 1;
		}else{
			int result = number+getTriangularNumR(number-1);
			System.out.println("Return "+result);
			System.out.println(": "+number+" + getFactorial ("+number+"-1)");
			return result;
		}
	}
	
	public int getFactorial(int number){
		System.out.println("Method "+number);
		if(number==1){
			System.out.println("Returned 1");
			return 1;
		}else{
			int result = number * getFactorial(number-1);
			System.out.println("REturn  "+result);
			System.out.println(": "+number+" getfactorial("+number+"-1");
			return result;
		}
	}
	
	public void drawSquares(int howManySquares){
		       for(int i = 0; i < howManySquares; i++) System.out.print(" --  ");
		       System.out.println();
		       for(int i = 0; i < howManySquares; i++) System.out.print("|" + howManySquares + " | ");
		       System.out.println();
		       for(int i = 0; i < howManySquares; i++) System.out.print(" --  ");
		       System.out.println("\n");
		   }
	
	
	 public void calculateSquaresToPrint(int number){
		             for(int i = 1; i <= number; i++){
		                 for(int j = 1; j < i; j++){
		                     drawSquares(j);
		                 }
		                 System.out.println("Triangular Number: " + calcTriangularNum(i));
		             }
		         }
		         public double calcTriangularNum(int number){
		             return .5 * number * (1 + number);
		         }
}
