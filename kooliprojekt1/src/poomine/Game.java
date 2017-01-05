package poomine;

import lib.TextIO;

public class Game {

	public static void main(String[] args) {

		boolean gameOn = true;
		while (gameOn) {

			System.out.println("Hello, player! Welcome to a game of Hangman!");
			System.out.println("The rules are very simple. You need to guess a word.");
			System.out.println("You have equal amount of tries to the characters in a word.");
			System.out.println("Good luck! And remember, don't hate the game, hate the player.");
			System.out.println("Please insert your first guess.");

			Words words = new Words();
			String word = words.getRandom();
			String letter = TextIO.getln();
			char[] listOfWords = word.toCharArray();

			int amountOfGuesses = word.length();
			char[] timesGuessed = new char[amountOfGuesses];

			for (int i = 0; i < timesGuessed.length; i++) {
				timesGuessed[i] = '_';

			}

			boolean gameOver = false;
			int tries = 0;

			while (!gameOver && tries != amountOfGuesses) {
				displayBlanks(timesGuessed);
				System.out.println("Guesses left: " + (amountOfGuesses - tries));
				System.out.println("Please enter a letter!");
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
		}

		System.out.println("Game over.");

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
