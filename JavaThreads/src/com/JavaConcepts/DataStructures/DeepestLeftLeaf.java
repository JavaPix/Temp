package com.JavaConcepts.DataStructures;

public class DeepestLeftLeaf {

	public int deepestLevel = 0;
	public int deepLeftNode;
	
	public int deepLeft(Node root){
		find(root, 0 ,true);
		return deepLeftNode;
	}
	
	public void find(Node root, int level, boolean left){
		if(root!=null){
			find(root.left,++level,true);
			if(left && deepestLevel<level){
				deepLeftNode=root.data;
				deepestLevel = level;
			}
			find(root.right,level, false);
		}
	}
	
	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.left.left.right = new Node(8);
		
		DeepestLeftLeaf dp = new DeepestLeftLeaf();
		System.out.println("Deapest Left child is: " + dp.deepLeft(root));

	}
	
	static class Node{
		int data;
		Node left;
		Node right;

		public Node(int data){
			this.data=data;
			this.left=null;
			this.right=null;
		}
	}
}
