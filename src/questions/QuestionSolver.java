package questions;

import java.util.ArrayList;
import java.util.Arrays;

public class QuestionSolver {

	public String[] selectElementsStartingWithA(String[] input) {
		
		ArrayList<String> aElements = new ArrayList<String> (); 
		
		for(int i = 0; i < input.length; i++) 
		{
			
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
		
		for(int i = 0; i < input.length; i++) 
		{
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
		
		for(int i = 0; i < input.length; i++) 
		{
			
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
		
		for(int i = 0; i < input.length; i++) 
		{
			
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
		for(int i = 0; i < input.length; i++) 
		{
			
			// Split each word into array of its characters 
			String[] characters = input[i].split("");
			ArrayList<String> charsList = new ArrayList<String> ();
			
			// reverse loop, putting each char into an arraylist backwards
			for(int j = characters.length - 1; j > 0; j--) 
			{
				
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

	public String[][] everyPossiblePairingOfStudents(String[] input) {
		//ArrayList of String Arrays for combinations to go into
		ArrayList<String[]> listOfArrays = new ArrayList<String[]>();
		
		//loop over all students
		for(int i = 0; i < input.length; i++)
		{
			//create array list to contain a combination of students that doesn't include the current one
			ArrayList<String> oneCombination = new ArrayList<String> ();
			
			for(int j = 0; j < input.length; j++)
			{
				// put all string into oneCombination list unless they are the current string being looped 
				if (input[j] != input[i]){
					oneCombination.add(input[j]);	
				}
				
			}
			
			String[] combo = new String[oneCombination.size()];
			combo = oneCombination.toArray(combo);
			listOfArrays.add(combo);
		}
		
		String[][] output = new String[listOfArrays.size()][];
		output = listOfArrays.toArray(output);
		return output;
	}

	public Object[] allElementsExceptFirst3(Integer[] input) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		for(int i = 0; i < input.length; i++)
		{
			if (i > 2) {
				numbers.add(input[i]);
			}
		}
		Integer[] output = new Integer[numbers.size()];
		output = numbers.toArray(output);
		
		return output;
	}
}
