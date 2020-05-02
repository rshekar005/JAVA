package com.algo;

/**
 * 
 * @author rajasekhar
 * 
 * Data Structure: A data structure is a particular way of storing and organizing data in a computer so that it can be used efficiently. 
 * Data structures provide a means to manage large amounts of data efficiently. 
 * efficient data structures are a key to designing efficient algorithms.

 * Implementing stack using Array 
 * Stack -- LIFO -- Last element which is inserted will removed first
 * 
 * Push -- Enter the data from top to down
 * Pop  -- Popping the element from top
 * peek -- Return top value
 */
public class StackWithArray 
{
	int size;
	static int top;
	static int arr[];
	
	public StackWithArray(int size)
	{
		this.size=size;
		this.top=-1; //Empty array
		this.arr= new int[size];
	}
		
	//Here time complexity is O(1) as there is no for loop
	public void push(int element)// Inserts element into stack
	{
		if(!isFull())
		{
			top++;
			arr[top]=element;
			System.out.println(" Pushed element is "+element);
		}
		else
		{
			System.out.println(" Stack is full ");
		}
		
	}
	
	public void pop()// This method removes top value 
	{
		if(!isEmpty())
		{
			int returnedelemt= top;
			top--;
			System.out.println(" Popped element "+arr[returnedelemt]);
		}
		else
		{
			System.out.println(" stack is empty ");
		}
	}
	public int peek()// This method returns top element
	{
		if(!this.isEmpty())
		{
			return arr[top];
		}
		else
		{
			System.out.println(" Stack is empty ");
			return -1;
		}
	}
	public boolean isEmpty()// This method checks stack is empty
	{
		return (top==-1);
	}
	
	public boolean isFull() // This method checks stack is full
	{
		return (size-1==top);
	}
	
	public static void main(String args[])
	{
		StackWithArray stack = new StackWithArray(2);
		
		stack.isEmpty();
		stack.isFull();
		stack.peek();
		
		System.out.println("*****************");
		stack.pop();
		System.out.println("*****************");
		stack.push(100);
		stack.push(200);
		stack.push(300);
		stack.peek();
		stack.pop();
		System.out.println(arr[top]);
	}
	

}
