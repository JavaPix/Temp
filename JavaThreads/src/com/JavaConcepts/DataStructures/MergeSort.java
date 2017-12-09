package com.JavaConcepts.DataStructures;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int array[] = {10, 8, 4, 80, 13, 1, 3, 11};
		System.out.println("Starting array\n");
		printHorzArray(-1, -1, array, 49);
		System.out.println();
		merge_srt(array, 0, array.length-1);
		System.out.println("Final sorted array\n");
		printHorzArray(-1, -1, array, 49);
	}
	
	public static void merge_srt(int array[], int lo, int n){
		int low = lo;
		int high = n;
		
		if(low>=high){
			return;
		}
		
		int middle = (low+high)/2;
		
		merge_srt(array, low, middle);
		
		merge_srt(array, middle+1, high);
		
		int end_low = middle;
		
		int start_high = middle+1;
		
		while((lo <= end_low) && (start_high<=high)){
			System.out.println("\n bottom array");
			printSmallArray(array, lo, middle);
			System.out.println("\nTOP array");
			printSmallArray(array, start_high, high);
			printHorzArray(-1, -1, array, 49);
			
			System.out.println("Is "+array[low]+" < "+array[start_high]+"? "+(array[low]<array[start_high]));
			if(array[low]<array[start_high]){
				low++;
			}else{
				int temp = array[start_high];
				System.out.println("Temp: "+temp);
				for(int k=start_high-1; k>=low;k--){
					System.out.println("array["+k+"] = "+array[k]+"Sorted in array index "+(k+1));
					array[k+1] =array[k];
				}
				System.out.println(temp+" is sorted in index "+low);
				printHorzArray(-1, -1, array, 49);
				array[low] = temp;
				low++;
				end_low++;
				start_high++;
			}
		}
		printHorzArray(-1, -1, array, 49);
	}
	
	
	static void printSmallArray(int theArray[], int lo, int high) {
		        int[] tempArray = Arrays.copyOfRange(theArray, lo, high);
		        int tempArrayDashes = tempArray.length * 6;
		        System.out.println("Array Index Start " + lo + " and End " + high);
		        printHorzArray(-1, -1, tempArray, tempArrayDashes);
		    }
		    static void printHorzArray(int i, int j, int theArray[], int numDashes) {
		        for (int n = 0; n < numDashes; n++)
		            System.out.print("-");
		        System.out.println();
		        for (int n = 0; n < theArray.length; n++) {
		            System.out.format("| %2s " + " ", n);
		        }
		        System.out.println("|");
		        for (int n = 0; n < numDashes; n++)
		            System.out.print("-");
		        System.out.println();
		        for (int n = 0; n < theArray.length; n++) {
		            System.out.print(String.format("| %2s " + " ", theArray[n]));
		        }
		        System.out.println("|");
		        for (int n = 0; n < numDashes; n++)
		            System.out.print("-");
		        System.out.println();
		    }
}
