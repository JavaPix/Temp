package com.JavaConcepts.DataStructures;

public class TreeToSumTree {

	static Node newRoot;
	
	public int SumTree(Node root){
		if(root != null){
			int left = SumTree(root.left);
			int right = SumTree(root.right);
			int retData = root.data+right+left;
			root.data = left+right;
			newRoot = root;
			return retData;
		}
		return 0;
	}
	
	public void display(Node root){
		if(root!=null){
			display(root.left);
			System.out.println(root.data+" ");
			display(root.right);
		}
	}
	
	
	
	public static void main(String[] args) {
		Node root = new Node(5);
		root.left = new Node(-1);
		root.right = new Node(3);
		root.left.left = new Node(-2);
		root.left.right = new Node(4);
		root.right.left = new Node(-6);
		root.right.right = new Node(10	);
		TreeToSumTree t = new TreeToSumTree();
		System.out.print("Original Tree: ");
		t.display(root);
		System.out.print("\nSum tree: ");
		t.SumTree(root);
		//Print the new tree
		t.display(newRoot);
	}
	

	static class Node{
		int data;
		Node left;
		Node right;
		public Node(int data){
			this.data = data;
		}
	}
}

