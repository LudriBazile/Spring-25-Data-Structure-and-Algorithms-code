package chohan;

public class ChoHanGame {
	public static void main(String [] args) {
		if (args.length != 1) {
            System.err.println("Error: Exactly one argument required either odd or even ");
            System.exit(1);
        }
		String playerBet = args[0];
		
		System.out.println("Player's bet is: " + playerBet);
		
		if (!playerBet.equals("odd") && !playerBet.equals("even")) {
			System.err.println("Error: Argument must be 'odd' or 'even'.");
			System.exit(1);
		}
		
		boolean gameResult = playGame(playerBet);
		if(gameResult == true) {
			System.out.println("Player wins");
		}
		else {
			System.out.println("Player loses");
		}

	}
		  
	public static boolean playGame(String playerBet) {
		String parity;
		int die1 = (int) (Math.random() * 6) + 1;
        int die2 = (int) (Math.random() * 6) + 1;
        
        System.out.println("Die 1 equals: " + die1 + " and Die 2 equals: " + die2);
        
        int sumDice = die1 + die2;
        if(sumDice % 2 == 0) {
        	parity = "even";
        }
        else {
        	parity = "false";
        }
        
        if(playerBet.equals(parity)) {
        	return true;
        }
        else {
        	return false;
        }
		
	}
}

