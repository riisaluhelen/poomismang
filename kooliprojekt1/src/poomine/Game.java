package poomine;

import lib.TextIO;

public class Game {

	public static void main(String[] args) {

		boolean gameOn = true; // Game starts.
		while (gameOn) {

			System.out.println("Hello, player! Welcome to a game of Hangman!"); // Introduction.
			System.out.println("The rules are very simple. You need to guess a word.");
			System.out.println("You have equal amount of tries to the characters in a word.");
			System.out.println("Good luck! And remember, don't hate the game, hate the player.");
			System.out.println("Please insert your first guess.");

			Words words = new Words(); // Brings in another class.
			String word = words.getRandom(); // Declares what will 'word' do - get a random word from the array list in Words class.

			char[] listOfWords = word.toCharArray(); // Each letter from the generated random word will be treated individually.

			int amountOfGuesses = word.length(); // Declares that the player has the same amount of guesses as the word is long.
			char[] timesGuessed = new char[amountOfGuesses]; // Separates player's guesses from the guesses (s)he is given.

			for (int i = 0; i < timesGuessed.length; i++) { // Indicates every non-guessed letter remains _.
				timesGuessed[i] = '_';

			}

			boolean gameOver = false;
			int tries = 0;

			while (!gameOver && tries != amountOfGuesses) {
				displayBlanks(timesGuessed);
				System.out.println("Guesses left: " + (amountOfGuesses - tries));
				System.out.println("Please enter a letter!");
				String letter = TextIO.getln().toLowerCase();

				char inserted = letter.charAt(0);

				tries++;
				if (inserted == '.') {
					gameOn = false;
					gameOver = true;

				} else {
					for (int i = 0; i < listOfWords.length; i++) {
						if (listOfWords[i] == inserted) {
							timesGuessed[i] = inserted;
						}
					}

					if (correctWord(timesGuessed)) {

						gameOver = true;
						System.out.println("You won the game!");
					}
				}
			}
			System.out.println("Game over.");
			gameOn = false;
		}

	}

	public static void displayBlanks(char[] array) {

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	public static boolean correctWord(char[] array) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == '_')
				return false;
		}
		return true;

	}
}
