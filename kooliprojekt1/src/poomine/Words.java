package poomine;


import java.security.SecureRandom;
import java.util.ArrayList;



public class Words {

	public static void main(String[] args) {
		
		ArrayList<String> word = new ArrayList<String>();
		
		word.add("Atmosfäär");
		word.add("Täieõiguslik");
		word.add("Rahuolematus");
		word.add("Kaminapuud");
		word.add("Kuuseriisikas");
		
	}

		public static int randomIzer(int min,int max){
			int inbetween = max - min + 1;
			return min = (int) (Math.random() * inbetween);	
			
		}
		
}
