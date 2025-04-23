package edu.monmouth.oddeven;

public class OddEven {
    private int[] arrayInts;
    private int[] reverseArrayInts;
    private int [] arrayMerged;
    private int numEvens = 0;
    private int numOdds = 0;
    private int numOccurrences = 0;
	private int numDuplicates;
    

    public OddEven(int[] arrayInts) {
    	if(arrayInts == null || arrayInts.length == 0) {
    		this.arrayInts = new int[0];
    		this.reverseArrayInts = new int[arrayInts.length];
    	}
    	
        this.arrayInts = arrayInts.clone(); //doesn't change the original array
        this.reverseArrayInts = new int[arrayInts.length]; // Initialize the reverse array
    }

    public int numberOfEvens() {
        numEvens = 0; // Reset count before counting
        for (int num : arrayInts) {
            if (num % 2 == 0) {
                numEvens++;
            }
        }
        return numEvens;
    }

    public int numberOfOdds() {
        numOdds = 0; // Reset count before counting
        for (int num : arrayInts) {
            if (num % 2 != 0) { // Use != 0 for clarity
                numOdds++;
            }
        }
        return numOdds;
    }

    public int[] reverse() {
        for (int i = 0; i < arrayInts.length; i++) {
            reverseArrayInts[i] = arrayInts[arrayInts.length - 1 - i]; // Copy in reverse order
        }
        return reverseArrayInts;
    }

	public int countOccurrances(int target) {
		for(int i = 0; i <arrayInts.length; i++) {
			if(arrayInts[i] == target) {
				numOccurrences++;
			}
		}
		return numOccurrences;
	
	}

	public int[] mergeArrays(int[] newData) {
		   int[] arrayMerged = new int[arrayInts.length + newData.length];
		    
		    // Copy elements from the original array (arrayInts) to arrayMerged
		    for (int i = 0; i < arrayInts.length; i++) {
		        arrayMerged[i] = arrayInts[i];
		    }
		    
		    // Copy elements from the newData array to arrayMerged
		    for (int i = 0; i < newData.length; i++) {
		        arrayMerged[arrayInts.length + i] = newData[i];
		    }
		    
		    // Return the merged array
		    return arrayMerged;
		}


	public int duplicates() {
		for (int i = 0; i < arrayInts.length; i++) {
	        // Skip already checked elements
	        for (int j = i + 1; j < arrayInts.length; j++) {
	            if (arrayInts[i] == arrayInts[j]) {
					numDuplicates++;
	                break;  // Exit inner loop after finding a duplicate to avoid counting the same element multiple times
	            }
	        }
	    }
		return numDuplicates;
	}

	
	
    
    
}