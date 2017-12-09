package com.JavaConcepts.DataStructures;

import java.util.Scanner;

public class ChessBoard {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int p = s.nextInt();
		
		for(int i=0; i<p; i++){
			int rows = s.nextInt();
			int columns = s.nextInt();
			
			for(int j=0; j<rows; j++){
				String strval = "";
				for(int k=0; k<columns; k++){
					if(j%2==0){
						if(k%2==0){
							strval +="*";
						}else{
							strval +=".";
						}
					}else{
						if(k%2==0){
							strval +=".";
						}else{
							strval +="*";
						}
					}
				}
				System.out.println(strval);
			}
			System.out.println("\n");
		}
	}
}
