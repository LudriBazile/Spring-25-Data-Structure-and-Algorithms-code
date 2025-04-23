package example_Three;
import java.util.Scanner;

public class Location {

	public void Address(String city, String state, int age) {
		String cityState = city + ", " + state;
		
		if(age > 18) {
			System.out.println("You are an adult in " + cityState);
		}
		else {
			System.out.println("You are an minor in " + cityState);
		}
		
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Location person = new Location();
		System.out.println("Enter your city");
		String city = scan.nextLine();
		System.out.println("Enter your state");
		String state = scan.nextLine();
		System.out.println("Enter your age");
		
		if(scan.hasNextInt()){
			int age = scan.nextInt();
			person.Address(city, state, age);
		}
		else {
			System.out.println("Invalid Entry");
		}
		
		scan.close();
		
	}

}
