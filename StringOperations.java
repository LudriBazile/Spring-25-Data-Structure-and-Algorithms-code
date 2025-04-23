package edu.monmouth.StringOperations;


public class StringOperations {
	private String stringOps;
	
	
	public StringOperations(String stringOps) {
		if(stringOps.isEmpty() || stringOps == null) {
			throw new IllegalArgumentException("Input cannot be null or empty"); 
		}
		else {
			this.stringOps = stringOps;
		}
	}
	
	public String lettersOnly() {
		StringBuilder letterOnly = new StringBuilder();
		
		for(int i = 0; i < stringOps.length(); i++) {
			char currentCharletter = stringOps.charAt(i);
			if(Character.isLetter(currentCharletter)) {
				letterOnly.append(currentCharletter); 
			}
		}
		String letters = letterOnly.toString();
		
		return letters;
	}
	
	public String uppersOnly() {
		StringBuilder uppersOnlyString = new StringBuilder();
		
		for(int i = 0; i < stringOps.length(); i++) {
			char currentCharaupper = stringOps.charAt(i);
			if(Character.isUpperCase(currentCharaupper)) {
				uppersOnlyString.append(currentCharaupper);
			}
		}
		String upper = uppersOnlyString.toString();
		return upper;
	}
	
	public int numberOfVowels() {
		String stringOps_lower = stringOps.toLowerCase();
		int numVowels = 0;
		
		for(int i = 0; i < stringOps.length(); i++) {
			char currentCharnumVowels = stringOps_lower.charAt(i);
			
			 if (currentCharnumVowels == 'a' || currentCharnumVowels == 'e' || currentCharnumVowels == 'i' || currentCharnumVowels == 'o' || currentCharnumVowels == 'u') { 
				 numVowels++;
		        }
		}
		return numVowels;
	}
	
	public int numberOfConsonants() {
		String stringOps_lower = stringOps.toLowerCase();
		int numConsonants = 0;
		for(int i = 0; i < stringOps.length(); i++) {
			char currentCharcons = stringOps_lower.charAt(i);
			 if (Character.isLetter(currentCharcons) && (currentCharcons != 'a' || currentCharcons != 'e' || currentCharcons != 'i' || currentCharcons != 'o' || currentCharcons != 'u')) { 
				 numConsonants++;
		        }
		}
		return numConsonants;
	}
	
	public String reverseString() {
		StringBuilder stringReverse = new StringBuilder();
		for(int i = stringOps.length() - 1; i >= 0; i--) {
			stringReverse.append(stringOps.charAt(i));
		}
		
		String reverse = stringReverse.toString();
		return reverse;	
	}
	
	public String getVowels() {
		StringBuilder vowelsOnly = new StringBuilder();
		String stringOps_lower = stringOps.toLowerCase();
		
		for(int i = 0; i < stringOps.length(); i++) {
			char currentCharvowels= stringOps_lower.charAt(i);
			if (currentCharvowels == 'a' || currentCharvowels == 'e' || currentCharvowels == 'i' || currentCharvowels == 'o' || currentCharvowels == 'u') { 
				vowelsOnly.append(currentCharvowels);
			}
		}
		String vowels = vowelsOnly.toString();
		return vowels;
	
	}
	
	public String getConsonants() {
		StringBuilder consonantsOnly = new StringBuilder();
		String stringOps_lower = stringOps.toLowerCase();
		for(int i = 0; i < stringOps.length(); i++) {
			char currentCharcons = stringOps_lower.charAt(i);
			if (Character.isLetter(currentCharcons) && (currentCharcons != 'a' && currentCharcons != 'e' && currentCharcons != 'i' && currentCharcons != 'o' && currentCharcons != 'u')) { 
				consonantsOnly.append(currentCharcons);
			}
			
		}
		String consonants = consonantsOnly.toString();
		return consonants;
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

