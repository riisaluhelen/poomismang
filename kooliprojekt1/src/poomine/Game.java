package poomine;

import lib.TextIO;

public class Game {

	public static void main(String[] args) {
		// Game starts.
		boolean gameOn = true;
		while (gameOn) {
			// Introduction.
			System.out.println("Hello, player! Welcome to a game of Hangman!");
			System.out.println("The rules are very simple. You need to guess a word.");
			System.out.println("You have equal amount of tries to the characters in a word.");
			System.out.println("Good luck! And remember, don't hate the game, hate the player.");
			System.out.println("If you're a quitter, and giving up is for you. Insert '.'");
			System.out.println("Please insert your first guess.");

			// Brings in another class.
			Words words = new Words();
			// Declares what will 'word' do -get a random word from the array
			// list in Words class.
			String word = words.getRandom();
			// Each letter from the generated random word will be treated
			// individually.
			char[] listOfWords = word.toCharArray();
			// Declares that the player has the same amount of guesses as the
			// word is long.
			int amountOfGuesses = word.length();
			// Separates player's guesses from the guesses (s)he is given.
			char[] guess = new char[amountOfGuesses];
			// Indicates every non-guessed letter remains _.
			for (int i = 0; i < guess.length; i++) {
				guess[i] = '_';

			}
			// Player starts playing the game.
			boolean gameOver = false;
			// Tries player starts with.
			int tries = 0;
			// As long as game is not over and amount of guesses is not equal to
			// tries player has left.
			while (!gameOver && tries != amountOfGuesses) {
				// Shows the player the blanks (s)he has to guess.
				displayBlanks(guess);
				// Shows the guesses left, losing one each try.
				System.out.println("Guesses left: " + (amountOfGuesses - tries));
				System.out.println("Please enter a letter!");
				// Player inserts the letter, making sure it's in upper case.
				String letter = TextIO.getln().toUpperCase();
				// Reads the first letter in case the player adds two or more.
				char inserted = letter.charAt(0);
				// Adds one try each time the player has inserted a letter.
				tries++;
				// Whenever a player inserts "."(dot, punctuation mark)..
				if (inserted == '.') {
					// .. game stops working or ends.
					gameOn = false;
					gameOver = true;

				} else {
					for (int i = 0; i < listOfWords.length; i++) {
						// If the inserted word matches with the randomly chosen
						// word's array..
						if (listOfWords[i] == inserted) {
							// .. the inserted letter will be revealed and the
							// blank will be replaced with it.
							guess[i] = inserted;
						}
					}
					// If the word is guessed, the game will be over and the
					// player has won.
					if (correctWord(guess)) {

						gameOver = true;
						System.out.println(word);
						System.out.println("You won the game!");

					}
				}

			}

			System.out.println("Game over. Insert 'y' if you'd like to play once more.");
			String newGame = TextIO.getln();
			// New game starts if the player inserts "y".
			gameOn = newGame.equalsIgnoreCase("y");
		}

	}

	public static void displayBlanks(char[] array) {
		// Puts the word into an order, separating each letter with space.
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	public static boolean correctWord(char[] array) {
		// Returns false until all the letters have been guessed.
		for (int i = 0; i < array.length; i++) {
			if (array[i] == '_')
				return false;
		}
		return true;

	}
}
