import java.util.Random;
import java.util.Scanner;
public class Game {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Who is player one?");
		String playerOne = input.next();
		System.out.println("Who is player two?");
		String playerTwo = input.next();
		System.out.println(playerOne + " V.S " + playerTwo);
		
		//variables
		System.out.println("How many rounds would you like to play?");
		int rounds = input.nextInt();
		int playerOneScore = 100;
		int playerTwoScore= 100;
		int n = 1;
		
		
		while (1 <= n && n <= rounds ) {
			System.out.println("Round " + n + "\n ROLL!");
			Random rand = new Random();
			int playerOneRoll = rand.nextInt(6)+1;
			int playerTwoRoll = rand.nextInt(6)+1;
			n++;
			
			if (playerOneRoll < playerTwoRoll) {
			playerOneScore = playerOneScore - playerTwoRoll;
			System.out.println(playerOne + "(" + playerOneScore + ") -- (" + playerTwoScore + ")" + playerTwo);
			System.out.println(playerOneRoll + " V.S " + playerTwoRoll);
			}
			
			
			if (playerOneRoll > playerTwoRoll) {
			playerTwoScore = playerTwoScore - playerOneRoll;
			System.out.println(playerOne + "(" + playerOneScore + ") -- (" + playerTwoScore + ")" + playerTwo);
			System.out.println(playerOneRoll + " V.S " + playerTwoRoll);
			}
		}
			
			while (n == rounds) {
				if (playerOneScore < playerTwoScore) 
					System.out.println(playerTwo + " wins!");
				
				if (playerOneScore > playerTwoScore) 
					System.out.println(playerOne + " wins!");
			
				if (playerOneScore == playerTwoScore) 
					System.out.println("Its a tie!");
	}
}
}

