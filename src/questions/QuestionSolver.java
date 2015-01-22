package questions;

import java.util.ArrayList;
import java.util.Arrays;

public class QuestionSolver {

	public String[] selectElementsStartingWithA(String[] input) {
		
		ArrayList<String> aElements = new ArrayList<String> (); 
		
		for(int i = 0; i < input.length; i++) {
			
			if (input[i].charAt(0) == 'a') {
				
				aElements.add(input[i]);
				
			}
			
		}
		String[] output = new String[aElements.size()];
		
		output = aElements.toArray(output);
		
		return output;
		
	}

	public String[] selectElementsStartingWithVowel(String[] input) {
		
		ArrayList<String> aElements = new ArrayList<String> (); 
		
		for(int i = 0; i < input.length; i++) {
			char[] vowels = {'a', 'e', 'i', 'o', 'u'};
			
			if (new String(vowels).indexOf((input[i].charAt(0))) >= 0) {
				aElements.add(input[i]);
				
			}
			
		}
		String[] output = new String[aElements.size()];
		
		output = aElements.toArray(output);
		
		return output;
		
	}

	public Object[] removeNullsFromArray(Object[] input) {
		
		ArrayList<Object> nonNulls = new ArrayList<Object> ();
		
		for(int i = 0; i < input.length; i++) {
			
			if(input[i] != null) {
				nonNulls.add(input[i]);
			}
			
		}
		Object[] output = new Object[nonNulls.size()];
		
		output = nonNulls.toArray(output);
		
		return output;
	}

	public Character[] removeNullsAndFalseFromArray(Object[] input) {
		
		ArrayList<Object> chars = new ArrayList<Object> ();
		
		for(int i = 0; i < input.length; i++) {
			
			if(input[i] instanceof Character ) {
				
				chars.add(input[i]);
				
			}
			
		}
		
		Character[] output = new Character[chars.size()];
		
		output = chars.toArray(output);
		
		return output;
		
	}

	public Object[] reverseEveryElementInArray(String[] input) {
		
		ArrayList<String> words = new ArrayList<String> ();
		
		// loop over each word in array
		for(int i = 0; i < input.length; i++) {
			
			// Split each word into array of its characters 
			String[] characters = input[i].split("");
			ArrayList<String> charsList = new ArrayList<String> ();
			
			// reverse loop, putting each char into an arraylist backwards
			for(int j = characters.length - 1; j > 0; j--) {
				
				charsList.add(characters[j]);	
			}
			
			String word = "";
			// Concatenating each character into a word
			for(int k = 0; k < charsList.size(); k++){
				word += charsList.get(k);
			}
			// adding each word to words arraylist
			words.add(word);
		}
		// create string array size based on array size
		String[] output = new String[words.size()];
		// Setting output to the words arraylist as an array
		output = words.toArray(output);
		
		return output;
		
	}
}
