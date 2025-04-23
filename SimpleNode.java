package edu.monmouth.simpleList;

public class SimpleNode {
	public int iData; // data item (key)
	   public SimpleNode next; // next node in list

	   public SimpleNode(int id){ // constructor
	      iData = id;
	   }
	   public void setNext(SimpleNode next) {
		   this.next = next;
	   }
}
