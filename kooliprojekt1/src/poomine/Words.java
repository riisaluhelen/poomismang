package poomine;

import java.util.ArrayList;
import java.util.Random;

public class Words {

public ArrayList<String> word;
    
    public Words () {
        word = new ArrayList<String>();
        
		word.add("atmosfäär");
		word.add("täieõiguslik");
		word.add("rahuolematus");
		word.add("kaminapuud");
		word.add("kuuseriisikas");
		
    }


	    public String getRandom() {
	        return word.get(new Random().nextInt(word.size()));}
		
	    
}

