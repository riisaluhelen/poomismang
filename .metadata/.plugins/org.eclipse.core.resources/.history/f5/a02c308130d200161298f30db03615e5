package poomine;

import lib.TextIO;

public class Game {

	public static void main(String[] args) {
		
		System.out.println("Hello, player!");
		
		Words words = new Words();
		String word = words.getRandom();
		String letter = TextIO.getln();
		boolean correctAnswer = word.contains(letter);
		
		int amountOfGuesses = word.length();
		char [] timesGuessed = new char [amountOfGuesses];
		
		for (int i = 0; i < timesGuessed.length; i++){
			timesGuessed [i] = '_';
			
		}
			
		boolean gameOver = false;
		int tries = 0;
		
		while (!gameOver && tries != amountOfGuesses){
			displayBlanks(timesGuessed);
			
			
		}
		
		
		
		

		if (correctAnswer)

			System.out.println("gj");

		else {

			System.out.println("toughluck");

		}


	}

	private static void displayBlanks (char[] array) {
		
		for (int i = 0; i < array.length; i++){
			System.out.println(array[i] + " ");
		}
	System.out.println();
	}
	
		
	}


