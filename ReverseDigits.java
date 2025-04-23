package example_Two;
import java.util.Scanner;

public class ReverseDigits {
	
	public int Reverse(int input) {
		int reverseInteger = 0;
		
		while(input != 0) {
			int lastDigit = input % 10;
			reverseInteger = reverseInteger * 10 + lastDigit;
			input = input/10;
		}
		
		return reverseInteger;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ReverseDigits revDigits = new ReverseDigits();
		
		System.out.println("Enter a integer");
		
		if(scan.hasNextInt()) {
			int input = scan.nextInt();
			int reverse = revDigits.Reverse(input);
			System.out.println("The reverse of " + input + " is " + reverse);
		}
		else {
			System.out.println("Invalid Entry");
		}
		scan.close();
	}

}
