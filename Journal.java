package edu.monmouth.library;

public class Journal implements LibraryItem{
String title;
String editor;
int volume;
StatusType status;
public Journal(String title, String editor, int volume, StatusType status) throws JournalException {
	super();
	setTitle(title);
	setEditor(editor);
	setVolume(volume);
	setStatus(status);
}
public String getTitle() {
	return title;
}
public void setTitle(String title) throws JournalException {
	if(title == null || title.length() == JournalConstants.ZERO) {
		throw new JournalException("Title can't be null or have a zero length");
	}
	this.title = title;
}
public String getEditor() {
	return editor;
}
public void setEditor(String editor) throws JournalException {
	if(editor == null || editor.length() == JournalConstants.ZERO) {
		throw new JournalException("Editor can't be null or have a length of 0");
	}
	this.editor = editor;
}
public int getVolume() {
	return volume;
}
public void setVolume(int volume) throws JournalException {
	if(volume < JournalConstants.MIN_VOLUME) {
		throw new JournalException("Volumes can't be less than 1");
	}
	this.volume = volume;
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
		System.out.println("Check out is complete: You have borrowed " + getTitle() + " edited by " + getEditor());
	}
	else if(status.equals(StatusType.BORROWED)) {
		System.out.println(getTitle() + " edited by " + getEditor() + " is currently borrowed by someone else");
	}
	else  {
		System.out.println(getTitle() + " edited by " + getEditor() + " is currently missing from the library");
	}
}

@Override
public void returnItem() {
	if(status.equals(StatusType.BORROWED) || status.equals(StatusType.MISSING)) {
		System.out.println("Return is complete: You have returned " + getTitle() + " by " + getEditor());
		setStatus(StatusType.ONSHELF);
	}
	else {
		System.out.println(getTitle() + " by " + getEditor() + " has already been returned");
	}
	
}
@Override
public String toString() {
	return "Journal [title=" + title + ", editor=" + editor + ", volume=" + volume + ", status=" + status + "]";
}


}
