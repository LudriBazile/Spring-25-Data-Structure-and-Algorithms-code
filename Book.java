package edu.monmouth.library;

public class Book implements LibraryItem {
	private String title;
	private String author;
	private int pages;
	private StatusType status;
	
	public Book(String title, String author, int pages, StatusType status) throws BookException {
		setTitle(title);
		setAuthor(author);
		setPages(pages);
		setStatus(status);
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) throws BookException {
		if(title == null || title.length() == BookConstants.ZERO) {
			throw new BookException("Title can't be null or have a zero length");
		}
		this.title = title;	
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) throws BookException {
		if(author == null || author.length() == BookConstants.ZERO) {
			throw new BookException("Author can't be null or have a zero length");
		}
		this.author = author;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) throws BookException {
		if(pages < BookConstants.MIN_PAGES) {
			throw new BookException("Pages can't be less than 1");
		}
		this.pages = pages;
	}
	public StatusType getStatus() {
		return status;
	}
	public void setStatus(StatusType status) {
		this.status = status;
	}
	@Override
	public boolean isAvailable() {
		if(status.equals(StatusType.ONSHELF)) {
			return true;
		}
		else {
			return false;
		}
	}
	@Override
	public void borrowItem() {
		if(StatusType.ONSHELF.equals(status)) {
			System.out.println("Check out is complete: You have borrowed " + getTitle() + " by " + getAuthor());
			setStatus(StatusType.BORROWED);
		}
		else if(status.equals(StatusType.BORROWED)) {
			System.out.println(getTitle() + " by " + getAuthor() + " is currently borrowed by someone else");
		}
		else {
			System.out.println(getTitle() + " by " + getAuthor() + " is currently missing from the library");
		}
		
		
	}
	@Override
	public void returnItem() {
		if(status.equals(StatusType.BORROWED) || status.equals(StatusType.MISSING)) {
			System.out.println("Return is complete: You have returned " + getTitle() + " by " + getAuthor());
			setStatus(StatusType.ONSHELF);
		}
		else {
			System.out.println(getTitle() + " by " + getAuthor() + " has already been returned");
		}
		
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", pages=" + pages + ", status=" + status + "]";
	}
}

	
	
	
	