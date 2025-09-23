package storage;

public class Guess {
int guessNumber = 0,currentGuess = 0;

	public Guess (int currentGuess, int guessNumber){
		this.guessNumber = guessNumber; 
		this.currentGuess = currentGuess;
	}
	public Guess() {}
// getters
public int getCurrentGuess() {return currentGuess;}
public int getGuessNumber() {return guessNumber;}

// setters
public void setCurrentGuess(int currentGuess) {	this.currentGuess = currentGuess;}
public void setGuessNumber(int guessNumber) {this.guessNumber = guessNumber;}
}