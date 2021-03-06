package com.JavaConcepts.DataStructures;

public class DeepestNode {

	int deepestlevel;
	int value;
	
	public int Deep(Node root){
		find(root, 0);
		return value;
	}
	
	public void find(Node root, int level){
		if(root!=null){
			find(root.left,++level);
			if(level>deepestlevel){
				value=root.data;
				deepestlevel=level;
			}
			find(root.right, level);
		}
	}
	
	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		root.right.right.right = new Node(8);

		DeepestNode dp = new DeepestNode();
		System.out.println("Deepest child is: " + dp.Deep(root));
	}
	
	static class Node{
		int data;
		Node left;
		Node right;
		public Node(int data){
			this.data= data;
			this.left=null;
			this.right=null;
		}
	}
}
