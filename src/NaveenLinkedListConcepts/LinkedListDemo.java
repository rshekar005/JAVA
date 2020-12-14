package NaveenLinkedListConcepts;
/**
 * 
 * @author Shekhar
 * Underlying data structure of linked list is Double Linked list.
 * LinkedList internally uses a doubly linked list to store the elements.
 * It implements Serialiazable and clonable interface but not RandomAccess interface
 * Manipulation with LinkedList is faster than ArrayList because it uses a doubly linked list, so no bit shifting is required in memory
 * If we want to represent a group of elements as a single entity then we should go for list.
 * It is suitable when operation is insertion or deletion.
 * Duplicates are allowed.
 * Insertion order is preserved and null insertion is allowed.
 * worst choice if operation is retrieval.
 * 
 * Two types of LinkedList
 * 1. Singly linkedlist
 * 2. Doubly linkedlist
 * 
 * 1. Singly linked list -- Continuos memeory location -- for insertion or deletion it takes several shift operations
 *                           It contains data and next pointer. Data and Next pointer called as node. Pointer will point to the next node.
 *
 */
public class LinkedListDemo {
	
	Node head;
	class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
			next=null;
		}
	}
	
	// To print results
	public void printMyLinkedList(){
		//LinkedList starts from the head node
		Node n=head;
		while(n!=null){ // Condition it will check whether head node is null or not. If not will print the data and n refers to next node.
			System.out.println(n.data);
			n=n.next;
		}
	}
	public static void main(String args[]){
		
		LinkedListDemo ll = new LinkedListDemo();
		// In order to access inner class. we need to inner class with the help of parent class reference
		Node first= ll.new Node(10); // Here data = 10 and it is the first node
		ll.head=first; // It is the first head node
		
		Node second= ll.new Node(20); // Data 20 inserted in next node
		first.next= second; // first pointers points to the next node
		// Note: Mapping is necessary
		
		Node third= ll.new Node(30);// Data 30 Stores in third node
		second.next=third;// second node pointer points to the third node
		
		ll.printMyLinkedList();
		
	}

}
