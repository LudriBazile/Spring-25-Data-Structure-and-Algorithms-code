package edu.monmouth.CaesarCipher;

public class Cipher {
private String message;
private short offset;
private char encodedChar;
private final int LETTERS = 26;
StringBuilder encodedMessage;
	
	public Cipher(String message, short offset) {
		this.message = message;
		this.offset = offset;
	}

	public String encode() {
		encodedMessage = new StringBuilder(); 
		char [] messageChar = message.toCharArray();
		
		for(int i = 0; i < messageChar.length; i++) {
			if (messageChar[i] == ' ') {
			    encodedMessage.append(messageChar[i]);
			}
			else {
				encodedChar = (char)('a' + ((messageChar[i] - 'a'+ offset)%LETTERS));
				encodedMessage.append(encodedChar);
			}
		}
		
		return encodedMessage.toString();
	}
	
	
	
}
		
		
		
		
		
		
		
		



