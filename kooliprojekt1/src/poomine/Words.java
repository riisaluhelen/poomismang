package poomine;

import java.util.ArrayList;
import java.util.Random;

public class Words {

public ArrayList<String> word;
    
    public Words () { 
        word = new ArrayList<String>(); // Creates a list for the words used in the game.
        
		word.add("ATMOSPHERE"); // Adds words.
		word.add("MAGNIFICENT");
		word.add("BLACKBOARD");
		word.add("PENGUIN");
		word.add("MUSHROOM");
		
    }


	    public String getRandom() { // Takes a random word from the list.
	        return word.get(new Random().nextInt(word.size()));}
		
	    
}

