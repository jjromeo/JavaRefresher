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
}
