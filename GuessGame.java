import java.util.Random;

public class GuessGame {
	// Guessgame has 3 seperate virables for the 3 players
	Player p1;
	Player p2;
	Player p3;

	// Create 3 Player objects and assign them to the Player instance variables.
	public void startGame() {
		p1 = new Player();
		p2 = new Player();
		p3 = new Player();

		// All players start off with their guess as 0 as they haven't guessed a number yet
		int p1guess = 0;
		int p2guess = 0;
		int p3guess = 0;

		// All players start off with their guess as "false" as noone has guessed yet (this will change to true once they have guessed correct)
		boolean p1isRight = false;
		boolean p2isRight = false;
		boolean p3isRight = false;

		// Picking the "random" number for the players to guess
		int targetNumber = (int) (Math.random() * 10);
		System.out.println("I’m thinking of a number between 0 and 9...");

		while (true) {
			System.out.println("The number the players are currently trying to guess is " + targetNumber);

			p1.guess(); 
			p2.guess(); // calling the guess method for all players
			p3.guess(); 

			// Telling the user what player 1 has guessed
			p1guess = p1.number;
			System.out.println("Player one guessed with number " + p1guess);

			// Telling the user what player 2 has guessed
			p2guess = p2.number;
			System.out.println("Player two guessed with number " + p2guess);

			// Telling the user what player 3 has guessed
			p3guess = p3.number;
			System.out.println("Player three guessed with number " + p3guess);

			// Checking player 1's guess to see if it matchs the number they're trying to guess, if so, change boolean to true
			if (p1guess == targetNumber) {
				p1isRight = true;
			}
			// Checking player 2's guess to see if it matchs the number they're trying to guess, if so, change boolean to true
			if (p2guess == targetNumber) {
				p2isRight = true;
			}
			// Checking player 3's guess to see if it matchs the number they're trying to guess, if so, change boolean to true
			if (p3guess == targetNumber) {
				p3isRight = true;
			}

			// If player 1, 2 or 3 is right then continue with loop
			if (p1isRight || p2isRight || p3isRight) {

				System.out.println("We have a winner!");
				System.out.println("Player one got it right? " + p1isRight);
				System.out.println("Player two got it right? " + p2isRight);
				System.out.println("Player three got it right? " + p3isRight);
				System.out.println("Game is over.");
				break; // Either player 1, 2 or 3 got it right so break out of loop and end game

			} else {
				// if nobody gets it right then we must keep going until someone guesses correct
				System.out.println("Noone got it right, try again.");
			}
		}
	}
}