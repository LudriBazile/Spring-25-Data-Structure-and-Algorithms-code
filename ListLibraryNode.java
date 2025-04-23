package edu.monmouth.library;

import edu.monmouth.library.LibraryNode;




public class ListLibraryNode {
	private LibraryNode head;
	private LibraryNode firstNode;
	private LibraryNode newNode;
	private LibraryNode StringNode;
	int count;
	private LibraryNode sizeNode;
	
	public ListLibraryNode() {
	}
	public LibraryNode removeFirst() {
		if(head == null) {
			return null;
		}
		else {
			firstNode = head;
			head = head.getNext();
			firstNode.setNext(null);
			return firstNode;
		}
		
	}
	public LibraryNode first() {
		return head;
	}
  	
  		public LibraryNode last() {
  		    if (head == null) {
  		        return null; // Empty list
  		    }

  		    LibraryNode temp = head; // Use temp pointer
  		    while (temp.getNext() != null) {
  		        temp = temp.getNext();
  		    }
  		    return temp; // Correctly returns the last node
  		}
  	public void insertEnd(LibraryItem item) {
  	    LibraryNode newNode = new LibraryNode(item);

  	    if (head == null) {
  	        head = newNode;
  	        return;
  	    }

  	    LibraryNode temp = head; // Use a temp pointer
  	    while (temp.getNext() != null) {
  	        temp = temp.getNext();
  	    }
  	    temp.setNext(newNode); // Append the new node at the end
  	}
	
	
	public boolean isEmpty() { 
		return head == null;
	}
	public int size() {
	    int count = 0;
	    LibraryNode sizeNode = head;

	    while (sizeNode != null) {
	        count++;
	        sizeNode = sizeNode.getNext(); 
	    }

	    return count;
	}
	public void clear() {
		head = null;
	}
	@Override
	public String toString() {
	    if (head == null) {
	        return "The library list is empty.";  // Handle empty list
	    }

	    StringBuilder stringB = new StringBuilder();  // Use a more descriptive name
	    stringB.append("Library List:\n");

	    LibraryNode currentNode = head;  // Start from the first node

	    while (currentNode != null) {
	        stringB.append(currentNode.toString()).append("\n"); 
	        currentNode = currentNode.getNext();  // Move to the next node
	    }

	    return stringB.toString(); 
	
	
	}
}
