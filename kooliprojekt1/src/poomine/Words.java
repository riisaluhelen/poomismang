package poomine;

import java.util.ArrayList;
import java.util.Random;

public class Words {

	public static void main(String[] args) {

		ArrayList<String> word = new ArrayList<String>();

		word.add("Atmosfäär");
		word.add("Täieõiguslik");
		word.add("Rahuolematus");
		word.add("Kaminapuud");
		word.add("Kuuseriisikas");
		
		String random = word.get(new Random().nextInt(word.size()));
		
		System.out.println(random);
		
	}

	

	}


