package edu.monmouth.simpleList;

public class LinkList {
	private SimpleNode head; // reference to head node on list

	   public LinkList() { 
	      head = null;
	   }

	   public SimpleNode find(int key) { // find the node with a given key
	     
	   }

	   public String toString() { 
		   StringBuilder returnValue = new StringBuilder();
		  for(SimpleNode current = head; current != null; current = current.next) {
			  returnValue.append(current.iData + "\n");
		  }
		  return returnValue.toString();
	   }
	   

	   public void insert(int key) {
		  
	   }
}
