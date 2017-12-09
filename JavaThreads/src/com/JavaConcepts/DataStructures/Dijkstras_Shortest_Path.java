package com.JavaConcepts.DataStructures;

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Dijkstras_Shortest_Path {

	private int distances[];
	private Set<Integer> settled;
	private Set<Integer> unsettled;
	private int number_of_nodes;
	private int adjacenyMatrix[][];
	
	public Dijkstras_Shortest_Path(int number_of_nodes){
		this.number_of_nodes = number_of_nodes;
		distances = new int[number_of_nodes+1];
		settled = new HashSet<Integer>();
		unsettled = new HashSet<Integer>();
		adjacenyMatrix = new int[number_of_nodes+1][number_of_nodes+1];
	}
	
	public void Dijkstras_Algorithm(int adjacency_matrix[][], int source){
		int evaluationNode;
		for(int i=1; i<=number_of_nodes; i++){
			for(int j=1;j<=number_of_nodes;j++){
				adjacency_matrix[i][j] = adjacency_matrix[i][j];
			}
		}
		
		
		for(int i=1;i<=number_of_nodes;i++){
			distances[i] = Integer.MAX_VALUE;
		}
		
		unsettled.add(source);
		distances[source] = 0;
		
		while(!unsettled.isEmpty()){
			evaluationNode = getNodeWithMinimumDistanceFromUnsettled();
			unsettled.remove(evaluationNode);
			settled.add(evaluationNode);
			evaluateNeighbours(evaluationNode);
		}
	}
	
	private int getNodeWithMinimumDistanceFromUnsettled(){
		int min;
		int node=0;
		
		Iterator<Integer> iterator = unsettled.iterator();
		node = iterator.next();
		min = distances[node];
		
		for(int i=1; i<=distances.length; i++){
			if(unsettled.contains(i)){
				if(distances[i]<=min){
					min = distances[i];
					node = i;
				}
			}
		}
		return node;
	}
	
	
	
	private void evaluateNeighbours(int evaluationNode){
		int edgeDistance = -1;
		int newDistance = -1;
		
		for(int destinationNode=1; destinationNode<=number_of_nodes;destinationNode++){
			if(!settled.contains(destinationNode)){
				if(adjacenyMatrix[evaluationNode][destinationNode] != Integer.MAX_VALUE){
					edgeDistance = adjacenyMatrix[evaluationNode][destinationNode];
					newDistance = distances[evaluationNode] + edgeDistance ;
					if(newDistance<distances[destinationNode]){
						distances[destinationNode] = newDistance;
					}
					unsettled.add(destinationNode);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int adjacency_Matrix[][];
		int number_of_vertices;
		int source = 0, destination =0;
		Scanner scan = new Scanner(System.in);
		
		try{
			System.out.println("Enter the number of vertices: ");
			number_of_vertices = scan.nextInt();
			adjacency_Matrix = new int[number_of_vertices+1][number_of_vertices+1];
			
			System.out.println("Enter the weighted matrix for the graph");
			for(int i=1; i<=number_of_vertices; i++){
				for(int j=1; j<=number_of_vertices; j++){
					adjacency_Matrix[i][j]=scan.nextInt();
					
					if(i==j){
						adjacency_Matrix[i][j]=0;
						continue;
					}
					
					if(adjacency_Matrix[i][j]==0){
						adjacency_Matrix[i][j] = Integer.MAX_VALUE;
					}
				}
			}
			
			System.out.println("Enter the source: ");
			source = scan.nextInt();
			
			System.out.println("Enter the destination: ");
			destination = scan.nextInt();
			
			Dijkstras_Shortest_Path dijkstrasAlgorithm = new Dijkstras_Shortest_Path(number_of_vertices);
			dijkstrasAlgorithm.Dijkstras_Algorithm(adjacency_Matrix, source);
			System.out.println("The shortest path from: "+source+" to "+destination+" is: ");
			for(int i=1; i<=dijkstrasAlgorithm.distances.length; i++){
				if(i==destination){
					System.out.println(source+ " to "+i+" is "+dijkstrasAlgorithm.distances[i]);
				}
			}
		}catch(InputMismatchException e){
			e.printStackTrace();
		}
		
	}
}
