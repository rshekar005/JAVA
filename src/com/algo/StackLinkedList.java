package com.algo;

import javax.swing.Popup;

public class StackLinkedList {
	Node head;  // Here Linked list linked with other linked list.Here linked list has two parts called value and head.
	//Node = value + head.
	//Head of one node will link other node and it continues.
	
	class Node
	{
		int value;
		Node next;		
	}
	
	public StackLinkedList() {
		head=null;// initial head value is null.
	}
	
	public void push(int value) //Here value which we inserting into stack
	{
		Node extrahead=head;//creating extra node. Ssigning head value to create extranode
		head= new Node();
		head.value=value;//here value is varible for node class and other value is which we are inserting
		head.next=extrahead;// After instering value, next extranode is created with null. Like chaining first node is created with value and has head. 
		//Now this head is trying to link with node which is having null value and null head.	
	}
	
	public int pop()//Removes the top valuei.e head value from stack
	{
		if(head==null)
		{
			System.out.println("Stack is empty");
		}
		int value = head.value; //getting value with the help of head reference value of Node class and assigning to variable value.
		head=head.next; //head moves to check another attached node head. If it is null. It will not print any thing.
		return value;
	}
	
	public static void printLinkedListELements(Node head)
	{
		Node temp=head;//here head is nothing node values and its head.Assigning those values to temp.
		while (temp != null) {
			System.out.println(temp.value);
		    temp=temp.next;
		}
		
	}
	public static void main(String args[])
	{
		StackLinkedList ll = new StackLinkedList();
		ll.push(10);
		ll.push(20);
		ll.push(30);
		ll.push(40);
		ll.push(50);
		ll.push(60);
		System.out.println("Removed value from list "+ll.pop());
		
		printLinkedListELements(ll.head);
	}
	
}
