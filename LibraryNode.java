package edu.monmouth.library;

public class LibraryNode {
	String result;
	private LibraryItem info;
	private LibraryNode next;
	
	public LibraryNode(LibraryItem info) {
		setInfo(info); 
		setNext(null);
	      
	}
	public void setInfo(LibraryItem info) {
        if(info == null) {
        	throw new IllegalArgumentException("LibraryItem can't be null");
        }
        this.info = info;
    }
	public LibraryItem getInfo() {
		return info;
		
	}
	public void setNext(LibraryNode link) {
		this.next = link;
	}
	public LibraryNode getNext() {
		return next;
	}

	@Override
	public String toString() {
	    if (info instanceof Book) {
	        Book bookCast = (Book) info; // Cast only after checking
	        return "Title: " + bookCast.getTitle() +
	               " Available: " + bookCast.isAvailable() +
	               " Author: " + bookCast.getAuthor() +
	               " Pages: " + bookCast.getPages();
	    } 
	    else if (info instanceof Journal) {
	        Journal journalCast = (Journal) info; // Cast only after checking
	        return "Title: " + journalCast.getTitle() +
	               " Available: " + journalCast.isAvailable() +
	               " Editor: " + journalCast.getEditor() +
	               " Volume: " + journalCast.getVolume();
	    }

	    return "Unknown LibraryItem type"; // Ensure every case is handled
	}
	
}