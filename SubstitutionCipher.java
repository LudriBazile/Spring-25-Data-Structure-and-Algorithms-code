package edu.monmouth.improvedCipher;

public class SubstitutionCipher {
	
	char [][] cipherKey;
	private StringBuilder messageEncoded;
	private String message;
	private final int LETTERS = 26;
	 private int encodedPosition;
	private char currentChar;
	
	public SubstitutionCipher(String message, String arrangement) {
		cipherKey = new char[LETTERS][2];
		this.messageEncoded = new StringBuilder();
		this.message = message.toLowerCase();
		
		for(int i = 0; i < LETTERS; i++) {
			cipherKey[i][0] = (char)('a' + i);
			cipherKey[i][1] = arrangement.charAt(i);
		}
	}
	
	public String encode() {
		for(int i = 0; i <message.length(); i++) {
			currentChar = message.charAt(i);
			if (currentChar >= 'a' && currentChar <= 'z') {
				encodedPosition = currentChar - 'a';
				messageEncoded.append(cipherKey[encodedPosition][1]);
			}
		}
		return messageEncoded.toString();
		
	}
	
	

}
