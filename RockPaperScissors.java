package rps;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner scan = new Scanner(System.in);
		int computerChoice;
		String userChoice = ""; // user input
		final int options = 3; // rock, paper, scissors
		int userMove; // users move against computer
		String continueGame = "";
		
		while(!continueGame.equals("no")) {
			computerChoice = random.nextInt(options);
			
			
			do { // Loops until user picks rock, paper, or scissors
				System.out.println("Enter rock, paper, or scissors");
				userChoice = scan.nextLine().toLowerCase();
			}
			while(!userChoice.equals("rock") && !userChoice.equals("paper") && !userChoice.equals("scissors"));
	          
			if(userChoice.equals("rock")){ //assigns user to a numeric value rock = 2, paper = 0, scissors = 1
				userMove = 2;
			}
			else if(userChoice.equals("paper")){
				userMove = 0;
			}
			else {
				userMove = 1;
			}    
			
			if(computerChoice == 2){ // Outputs  out computer's choice as a string
				System.out.println("Computer picked rock");
			}
			else if(computerChoice == 0){
				System.out.println("Computer picked paper");
			}
			else {
				System.out.println("Computer picked scissors");
			} 
			
			System.out.println("User picked " + userChoice);
			
			System.out.println();

			
			if( (userMove == 2 && computerChoice == 1) || (userMove == 0 && computerChoice == 2) || userMove == 1 && computerChoice == 0) {
				System.out.println("User Wins!");
			}
			else if((userMove == 2 && computerChoice == 0) || (userMove == 0 && computerChoice == 1) || (userMove == 1 && computerChoice == 2)){
				System.out.println("Computer Wins!");
			}
			else {
				System.out.println("It's a tie");
			}
			
			System.out.println("To exit the game,type no. To continue, press any key");
			continueGame = scan.nextLine().toLowerCase();
		}
		
		
         
		
		
		
	}

}


