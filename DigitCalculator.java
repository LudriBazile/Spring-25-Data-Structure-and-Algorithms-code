package example_One;
import java.util.Scanner;

public class DigitCalculator {
	
	public int Calculate(int input) {
		int sum = 0;
		
		while(input > 0) {
			sum = sum + input % 10;
			input = input / 10;
		}
		
		return sum;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DigitCalculator calc = new DigitCalculator();
		
		System.out.println("Enter a integer");
		
		
		if(scan.hasNextInt()) {
			int input = scan.nextInt();
			int sumInteger = calc.Calculate(input);
			System.out.println("The sum of each digit in " + input + " equals " + sumInteger);
		}
		else {
			System.out.println("Invalid Entry");
		}
		
		scan.close();

	}

}
