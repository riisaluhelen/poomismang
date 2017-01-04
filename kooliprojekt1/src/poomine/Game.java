package poomine;

import lib.TextIO;

public class Game {

	public static void main(String[] args) {

		System.out.println("Hello, player!");

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
			System.out.println("Guesses left: " + amountOfGuesses % tries);
			System.out.println("Please enter a letter!");
			char inserted = letter.charAt(0);
			tries++;

			for (int i = 0; i < listOfWords.length; i++) {
				if (listOfWords[i] == inserted) {
					timesGuessed[i] = inserted;
				}
			}

			if (correctWord(timesGuessed)) {

				gameWon = true;
				System.out.println("You won the game!");
			}
		}

	}

	private static void displayBlanks(char[] array) {

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i] + " ");
		}
		System.out.println();
	}

	
	private static boolean correctWord(char[] array) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == '_') return false;
		}
		return true;
		
		
	}
}
