package game;

import java.util.Random;
import java.util.Scanner;

import storage.Guess;
import storage.Player;

public class GameInstance {

	public static void main(String[] args) {
		int counter = 0;
		System.out.print("What is the guess?  ");
		Scanner scan = new Scanner (System.in);
		int playerGuess = scan.nextInt();
		
		Player p = new Player();
		p.setCurrentGuess(playerGuess);
		Random rand = new Random();
		int guessValue = rand.nextInt(15) + 1; // minimum possible value 1 through 15
		Guess game = new Guess (playerGuess, guessValue); // used for game
		while(true)
		{
			if (p.getCurrentGuess() == game.getGuessNumber())
			{
				System.out.println("Correct Guess! \nIt took player: " + counter + " attempts to get the correct answer");
				break;
			} else if (p.getCurrentGuess() > game.getGuessNumber())
			{
				System.out.println("Current Guess is to high");
				guessValue = guessValue - 1;
				System.out.print("What is the guess?  ");
				playerGuess = scan.nextInt();
				p.setCurrentGuess(playerGuess);
				counter++;
				
			} else if (p.getCurrentGuess() < game.getGuessNumber())
			{
				System.out.println("Current guess is to low");
				guessValue = guessValue + 1;
				System.out.print("What is the guess?  ");
				playerGuess = scan.nextInt();
				p.setCurrentGuess(playerGuess);
				counter++;
			}
		}
		scan.close();
	}

}
