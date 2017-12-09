package com.JavaConcepts.sampleQuestion;

public class PairwiseSwapNodesByChangingLinks {

	public static Node swapNodeIterative(Node head){
		Node ptrOne_prev = null;
		Node baseHead = null;
		
		while(head!=null && head.next!=null){
			Node ptrOne = head;
			Node ptrTwo = head.next;
			Node ptrTwoNext = ptrTwo.next;
			ptrOne.next = ptrTwoNext;
			
			if(ptrOne_prev!=null){
				ptrOne_prev.next = ptrTwo;
			}else{
				baseHead = ptrTwo;
			}
			ptrTwo.next = head;
			ptrOne_prev = ptrOne;
			head = ptrTwoNext;
		}
		return baseHead;
	}
	
	public static Node swapNodeRecursive(Node head){
		if(head == null || head.next==null){
			return head;
		}
		Node ptrOne = head;
		Node ptrTwo = head.next;
		Node ptrTwoNext = ptrTwo.next;
		ptrTwo.next=head;
		Node newhead = ptrTwo;
		ptrOne.next = swapNodeRecursive(ptrTwoNext);
		return newhead;
	}
	
	public static void display(Node head){
		Node currNode = head;
		while(currNode!=null){
			System.out.print("->"+currNode.data);
			currNode = currNode.next;
		}
	}
	
	public static void main(String[] args)throws Exception {
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);
		head.next.next.next.next.next = new Node(6);
		head.next.next.next.next.next.next=new Node(7);
		
		Node x = swapNodeIterative(head);
		System.out.println("\n Swapping nodes using iterative method");
		display(x);
		System.out.println("\n Swapping nodes using Recursive method");
		Node n = swapNodeRecursive(head);
		display(n);
	}
}

class Node{
	public int data;
	public Node next;
	public Node(int data){
		this.data = data;
		this.next=null;
	}
}
