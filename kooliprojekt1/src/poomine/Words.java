package poomine;

import java.util.ArrayList;
import java.util.Random;

public class Words {

public ArrayList<String> word;
    
    public Words () {
        word = new ArrayList<String>();

		word.add("Atmosfäär");
		word.add("Täieõiguslik");
		word.add("Rahuolematus");
		word.add("Kaminapuud");
		word.add("Kuuseriisikas");
    }


	    public String getRandom() {
	        return word.get(new Random().nextInt(word.size()));}
		
	    
}

